package com.example.otp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class otpget extends AppCompatActivity {
    EditText et_otpNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpget);
        et_otpNumber = findViewById(R.id.et_otpNumber);
        new OTP_Receiver().setEditText(et_otpNumber);
    }
}