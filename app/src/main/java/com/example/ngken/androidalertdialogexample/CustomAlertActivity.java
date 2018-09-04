package com.example.ngken.androidalertdialogexample;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CustomAlertActivity extends AppCompatActivity {

    private Button customAlertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_alert);
        setUpCustomAlertDialog();
    }

    private void setUpCustomAlertDialog() {
        customAlertButton = findViewById(R.id.customAltBtn);
        customAlertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(CustomAlertActivity.this);
                LayoutInflater inflater = LayoutInflater.from(CustomAlertActivity.this);

                View myView = inflater.inflate(R.layout.dialog_custom_example, null);

                dialogBuilder.setView(myView);
                final AlertDialog dialog = dialogBuilder.create();

                Button cancelButton = myView.findViewById(R.id.dce_cancel);
                cancelButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.hide();
                    }
                });

                final EditText editText = myView.findViewById(R.id.dce_name_field);
                Button submitButton = myView.findViewById(R.id.dce_submit);
                submitButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), "The name is " + editText.getText(), Toast.LENGTH_SHORT).show();
                        dialog.hide();
                    }
                });

                dialog.show();
            }
        });
    }
}
