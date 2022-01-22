package com.learnandroid.loginsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TheChoice extends AppCompatActivity {
    Button ocr;
    Button qr;
    Button send;
    Button call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choise);
        ocr=(Button) findViewById(R.id.OCR);
        qr=(Button) findViewById(R.id.QR);
        send=(Button)findViewById(R.id.send);
        call=(Button)findViewById(R.id.call);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(getApplicationContext(), AcitivityCall.class);
                startActivity(intent);

            }
        });


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(getApplicationContext(), SendMail.class);
                startActivity(intent);
            }
        });
ocr.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent  = new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(intent);
    }
});
qr.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent  = new Intent(TheChoice.this, QRActivity.class);
        startActivity(intent);

    }
});

        }

    }

