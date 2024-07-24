package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class JumpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump);

    }

    // 传返回值
    public void return1(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        setResult(RESULT_OK,intent);
        finish();
    }

    public void back(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        setResult(RESULT_OK,intent);
        finish();
    }
}
