package com.example.thegreetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView title;
    Button myBtn;
    EditText myedittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title=findViewById(R.id.mytextview);
        myBtn=findViewById(R.id.mybutton);
        myedittext=findViewById(R.id.myedittext);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome "+myedittext.getText().toString()+" to my Application", Toast.LENGTH_SHORT).show();
            }
        });
    }
}