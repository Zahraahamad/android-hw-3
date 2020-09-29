package com.example.day;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView j1 = findViewById(R.id.textView3);
        TextView j2 = findViewById(R.id.textView4);
        TextView j3 = findViewById(R.id.textView5);
        TextView j4 = findViewById(R.id.textView6);
        TextView j5 = findViewById(R.id.textView7);


        Bundle airport = getIntent().getExtras();
        String x = airport.getString("name");
        String y = airport.getString("Age");
        String f = airport.getString("your job");
        String k = airport.getString("phone number");
        String t = airport.getString("email");


        j1.setText(x);
        j2.setText(y);
        j3.setText(f);
        j4.setText(k);
        j5.setText(t);


    }
    public void EmailButton(View view){
        startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:abs@gmail.com")));

    }
}