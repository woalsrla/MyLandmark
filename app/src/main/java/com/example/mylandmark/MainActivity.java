package com.example.mylandmark;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //멤버 변수 선언
    EditText userid,passwd;
    Button btn_login,btn_info,btn_guide,btn_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findViewById: xml과 java 객체 연결
        userid = findViewById(R.id.userid);
        passwd = findViewById(R.id.passwd);
        btn_login = findViewById(R.id.btn_login);
        btn_info = findViewById(R.id.btn_info);
        btn_guide = findViewById(R.id.btn_guide);
        btn_call = findViewById(R.id.btn_call);
        
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp  = userid.getText();
                Toast.makeText(MainActivity.this, "로그인 버튼 클릭", Toast.LENGTH_SHORT).show();
            }
        });
    }
}