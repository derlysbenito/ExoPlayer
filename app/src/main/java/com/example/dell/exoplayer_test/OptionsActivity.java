package com.example.dell.exoplayer_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class OptionsActivity extends AppCompatActivity {

    private Button button_video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        button_video = (Button)  findViewById(R.id.button_video);
    }

    public void ActivityOptions(View view){
       Intent intent = new Intent(this,PlayerActivity.class);
        startActivity(intent);
    }
}
