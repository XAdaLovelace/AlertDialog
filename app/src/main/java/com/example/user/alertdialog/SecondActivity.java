package com.example.user.alertdialog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {



    Button btnReturn;
    TextView tvCredit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnReturn = (Button)findViewById(R.id.btnReturn);
        tvCredit = (TextView)findViewById(R.id.tvCredit);

        tvCredit.setText("Credits - Albert, me and Stack Overflow ");
    }

    public void goBack(View view){
        Intent t = new Intent(this,MainActivity.class);
        startActivity(t);
    }


}
