package com.example.lab322;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    EditText edtten, edtcannang, edtchieucao;
    Button btnBMI;
    TextView  txtThongTin, txtChiSo, txtNhanXet;
    double chiSo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtten  = findViewById(R.id.edtten);
        edtchieucao = findViewById(R.id.edtchieucao);
        edtcannang = findViewById(R.id.edtcannang);
        btnBMI = findViewById(R.id.btnBMI);

        txtThongTin = findViewById(R.id.txt_ThongTin);
        txtChiSo = findViewById(R.id.txt_ketqua);
        txtNhanXet = findViewById(R.id.txt_nhanxet);

        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double  = edtten.getText().toString();

                double chieucao = Double.parseDouble(edtchieucao.getText().toString())/100;
                double cannang = Double.parseDouble(edtcannang.getText().toString());
                chiSo = Math.round((cannang/Math.pow(chieucao,2))*10.0)/10.0;

                if(chiSo < 18.5){
                    txtChiSo.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Ban can bo sung dinh duong");
                }
                else if(chiSo >= 18.5 && chiSo <= 24.9){
                    txtChiSo.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Ban can bo sung dinh duong");
                }
                else if(chiSo == 25){
                    txtChiSo.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Ban dang thua can");
                }
                else if(chiSo > 25 && chiSo <= 29.9){
                    txtChiSo.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Ban dang o giai doan beo phi muc do thap");
                }
                else if(chiSo >= 30 && chiSo <= 34.9){
                    txtChiSo.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Ban dang bi beo phi cap do 1");
                }
                else if(chiSo >= 35 && chiSo <= 39.9){
                    txtChiSo.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Ban dang bi beo phi cap do 2");
                }
                else if(chiSo ==40){
                    txtChiSo.setText(String.valueOf(chiSo));
                    txtNhanXet.setText("Ban dang bi beo phi cap do 3");
                }
                else {
                    Toast.makeText(getApplicationContext(), "Vui long dien day du thong tin," ,
                            Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}