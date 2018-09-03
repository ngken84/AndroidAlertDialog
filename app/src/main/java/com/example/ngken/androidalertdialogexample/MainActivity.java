package com.example.ngken.androidalertdialogexample;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpAlertButton();
    }

    private void setUpAlertButton() {
        btnAlert = findViewById(R.id.alertButton);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder myDialog = new AlertDialog.Builder(MainActivity.this);
                myDialog.setTitle("Alert Title");
                myDialog.setMessage("Let's Go Somewhere");
                myDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "OK Let's go!", Toast.LENGTH_SHORT).show();
                    }
                });
                myDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "OK poo-face", Toast.LENGTH_SHORT).show();
                    }
                });
                myDialog.show();
            }
        });
    }
}
