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

public class SearchEmpActivity extends AppCompatActivity {
    Button b1,b2;
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_emp);
        b1=(Button) findViewById(R.id.searchybtn);
        b2=(Button) findViewById(R.id.tomenufromsearch);
        et1=(EditText) findViewById(R.id.searchecode);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o2=new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(o2);
            }
        });
    }
}