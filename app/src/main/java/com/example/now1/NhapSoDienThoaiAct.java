package com.example.now1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class NhapSoDienThoaiAct extends AppCompatActivity {

    ImageView backsdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_so_dien_thoai);

        backsdt =findViewById(R.id.backdnsdt);
        backsdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDangNhapChinh();
            }
        });

        final EditText inputMobie=findViewById(R.id.EditText2nsdt);
        Button buttonGetOTP=findViewById(R.id.buttonnsdt);

        final ProgressBar progressBar=findViewById(R.id.progressBar);
        buttonGetOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputMobie.getText().toString().trim().isEmpty()){
                    Toast.makeText(NhapSoDienThoaiAct.this, "Enter Mobile", Toast.LENGTH_SHORT).show();
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);
                buttonGetOTP.setVisibility(View.INVISIBLE);

                PhoneAuthProvider.getInstance().verifyPhoneNumber(
                        "+84"+inputMobie.getText().toString(),
                        60,
                        TimeUnit.SECONDS,
                        NhapSoDienThoaiAct.this,
                        new PhoneAuthProvider.OnVerificationStateChangedCallbacks(){

                            @Override
                            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                                progressBar.setVisibility(View.GONE);
                                buttonGetOTP.setVisibility(View.VISIBLE);
                            }

                            @Override
                            public void onVerificationFailed(@NonNull FirebaseException e) {
                                progressBar.setVisibility(View.GONE);
                                buttonGetOTP.setVisibility(View.VISIBLE);
                                Toast.makeText(NhapSoDienThoaiAct.this,e.getMessage(), Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCodeSent(@NonNull String verificationId, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                                progressBar.setVisibility(View.GONE);
                                buttonGetOTP.setVisibility(View.VISIBLE);
                                Intent intent=new Intent(getApplicationContext(),NhapMaOTPAct.class);
                                intent.putExtra("mobile",inputMobie.getText().toString());
                                intent.putExtra("verificationId",verificationId);
                                startActivity(intent);
                            }
                        }
                );

            }
        });

    }

    public void openDangNhapChinh() {
        Intent intent = new Intent(this, DangNhap.class);
        startActivity(intent);
        finish();
    }
}