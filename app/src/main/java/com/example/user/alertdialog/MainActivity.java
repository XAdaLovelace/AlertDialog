package com.example.user.alertdialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.Random;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btnPop,btnIcon,btnClose,btnRnd,btnDefault;
    AlertDialog.Builder adb;
    LinearLayout LY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPop = (Button)findViewById(R.id.button);
        btnIcon = (Button)findViewById(R.id.button2);
        btnClose = (Button)findViewById(R.id.button3);
        btnRnd = (Button)findViewById(R.id.button4);
        btnDefault = (Button)findViewById(R.id.button5);
        LY = (LinearLayout)findViewById(R.id.LY);

    }



    public void PopAlert(View view){
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Alert pop");
        adb.setMessage("This is a message");
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void AlertIcon(View view){
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Alert pop");
        adb.setMessage("This is a message");
        adb.setIcon(R.drawable.droid);

        AlertDialog ad = adb.create();
        ad.show();
    }

    public void AlretIconClose(View view){
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Button pop");
        adb.setIcon(R.drawable.droid);
        adb.setMessage("This is a message");

        adb.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                
                dialog.cancel();

            }
        });
        AlertDialog ad = adb.create();
        ad.show();

    }

    public void ChangeBgRnd(View view){
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Button pop");
        adb.setIcon(R.drawable.droid);
        adb.setMessage("Click Random to set a random background. ");
        adb.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            dialog.cancel();
            }
        });
        adb.setNeutralButton("Random", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                LY.setBackgroundColor(color);

            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void ChangeBgRndDefault(View view){
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Button pop");
        adb.setMessage("Click Random to set a random background. ");
        adb.setPositiveButton("Reset", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
              LY.setBackgroundColor(Color.WHITE);
            }
        });
        adb.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb.setNeutralButton("Random", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                LY.setBackgroundColor(color);

            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }


    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){

        Intent t = new Intent(this,MainActivity.class);
        startActivity(t);
        return true;
    }
}
