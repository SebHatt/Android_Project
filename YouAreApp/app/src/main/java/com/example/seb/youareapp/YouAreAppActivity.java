package com.example.seb.youareapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.seb.youareapp.R.id.scanButtonId;

public class YouAreAppActivity extends AppCompatActivity {


    private TextView stateTextView;
    private Button scanButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_are_app);


        stateTextView = findViewById(R.id.stateTextViewId);
        scanButton = findViewById(R.id.scanButtonId);



        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button) {
                stateTextView.setText("Hold Scan Button Longer!");

            }
        });






        scanButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View button) {
                StateProvider stateProvider = new StateProvider();
                YouAreApp youAreApp = new YouAreApp(stateProvider);
                String randomState = youAreApp.randomState();
                stateTextView.setText(randomState);
                return true;
            }
        });

    }
}





