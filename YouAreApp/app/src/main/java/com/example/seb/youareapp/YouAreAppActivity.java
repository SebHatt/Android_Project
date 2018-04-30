package com.example.seb.youareapp;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.seb.youareapp.R.id.scanButtonId;

public class YouAreAppActivity extends AppCompatActivity {


    private TextView stateTextView;
    private Button scanButton;
    private Vibrator myVib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myVib = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);
        setContentView(R.layout.activity_you_are_app);


        stateTextView = findViewById(R.id.stateTextViewId);
        scanButton = findViewById(R.id.scanButtonId);

        final Animation in = new AlphaAnimation(0.0f, 1.0f);
        in.setDuration(3000);


        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button) {
                stateTextView.setText("Hey! Press Longer!");

            }
        });






        scanButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View button) {
                myVib.vibrate(1000);
                StateProvider stateProvider = new StateProvider();
                YouAreApp youAreApp = new YouAreApp(stateProvider);
                String randomState = youAreApp.randomState();
                stateTextView.setText(randomState);
                stateTextView.startAnimation(in);
                return true;
            }
        });

    }




}





