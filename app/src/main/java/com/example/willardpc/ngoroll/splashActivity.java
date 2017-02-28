package com.example.willardpc.ngoroll;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class splashActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        buttonStart = (Button)findViewById(R.id.buttonStart);

        buttonStart.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view == buttonStart){
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}
