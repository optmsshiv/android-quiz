package com.example.x360.androidquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt=(Button)findViewById(R.id.Button);
        bt.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        // Code here execute
        Intent intent = new Intent(MainActivity.this,quiz.class );
        startActivity(intent);
    }
}
