package com.example.employeelogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddEmpActivity extends AppCompatActivity {
    Button b1,b2;
    EditText et1,et2,et3,et4,et5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_emp);
       b1=(Button) findViewById(R.id.submitbtn);
       b2=(Button) findViewById(R.id.tomenufromadd);
       et1=(EditText) findViewById(R.id.ecode);
       et2=(EditText) findViewById(R.id.ename);
       et3=(EditText) findViewById(R.id.design);
       et4=(EditText) findViewById(R.id.email);
       et5=(EditText) findViewById(R.id.sal);
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent o1=new Intent(getApplicationContext(), MenuActivity.class);
               startActivity(o1);
           }
       });
    }
}