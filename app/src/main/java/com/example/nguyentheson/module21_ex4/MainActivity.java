package com.example.nguyentheson.module21_ex4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtName,txtCMND;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = (Button) findViewById(R.id.btn_send);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkName()){
                    Toast.makeText(MainActivity.this, "Không hợp lệ", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }
    public boolean checkName(){
        txtName = (EditText) findViewById(R.id.text_name);
        int length = txtName.length();
        if(length<3) return false;
        return true;
    }
}
