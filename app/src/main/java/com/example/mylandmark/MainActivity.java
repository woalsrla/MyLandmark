package com.example.mylandmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // 멤버 변수 선언
    EditText userid,passwd;
    Button btn_login,btn_info,btn_guide,btn_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findViewById : xml과 java 객체 연결
        userid = findViewById(R.id.userid);
        passwd = findViewById(R.id.passwd);
        btn_login = findViewById(R.id.btn_login);
        btn_info = findViewById(R.id.btn_info);
        btn_guide = findViewById(R.id.btn_guide);
        btn_call = findViewById(R.id.btn_call);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_id = userid.getText().toString();
                String str_pw = passwd.getText().toString();
                Log.d("TEST" ,str_id);
                Log.d("TEST" ,str_pw);

                //아이디가 5자리 비번이 8자리 이상이어야 한다.
                if(str_id.length()<5 || str_pw.length()<8){
                    Toast.makeText(MainActivity.this,
                            "아이디와 비밀번호의 길이를 확인하세요",
                            Toast.LENGTH_SHORT).show();
                }else{ //정상입력
                    //ID:30300 , PW:12345678
                    if(str_id.equals("30300") && str_pw.equals("12345678")) {
                        Toast.makeText(MainActivity.this, "환영합니다.", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(MainActivity.this, "아이디와 비밀번호를 확인하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btn_info.setOnClickListener(this);
        btn_guide.setOnClickListener(this);
        btn_call.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent intent=null;
        switch ( view.getId() ){
            case R.id.btn_info:
                intent = new Intent(MainActivity.this, InfoActivity.class);
                break;
            case R.id.btn_guide:
                intent = new Intent(MainActivity.this , GuideActivity.class);
                break;
            case R.id.btn_call:
                intent = new Intent(MainActivity.this , CallActivity.class);
                break;
        }
        startActivity(intent);
    }
}