package com.example.day;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private EditText phone;
    private ImageButton call;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phone = findViewById(R.id.editTextPhone);
        call= findViewById(R.id.cal);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String phoneNumber = phone.getText().toString();
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+phoneNumber));
                startActivity(intent);
            }
        });
        button =(Button) findViewById(R.id.button);
        final EditText a = findViewById(R.id.editTextTextPersonName);
        final EditText b = findViewById(R.id.editTextTextPersonName2);
        final EditText c = findViewById(R.id.editText3);
        final EditText d = findViewById(R.id.editTextPhone);
        final EditText e = findViewById(R.id.editTextTextEmailAddress);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String name = a.getText().toString();
               String Age = b.getText().toString();
               String job = c.getText().toString();
               String phone = d.getText().toString();
               String email =e.getText().toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",name);
                intent.putExtra("Age",Age);
                intent.putExtra("your job",job);
                intent.putExtra("phone number",phone);
                intent.putExtra("email",email);






                startActivity(intent);
            }
        });
    }



    }
