package com.example.ngken.androidalertdialogexample;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnAlert;
    private Button uncancelAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpAlertButton();
        setUpUncancelDialog();
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

    private void setUpUncancelDialog() {
        uncancelAlert = findViewById(R.id.uncancelAlertBtn);
        uncancelAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);


                alert.setTitle("Navigate");
                alert.setMessage("Go to custom alert activity");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), CustomAlertActivity.class));
                    }
                });
                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "OK poo-face", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog created = alert.create();
                created.setCancelable(false);
                created.show();
            }
        });

    }
}
