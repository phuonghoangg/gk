package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView txtName, txtNote, txtMoney;
    ImageView imgHinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       txtName =  findViewById(R.id.txt_Name);
       txtNote = findViewById(R.id.txtNote);
       txtMoney = findViewById(R.id.txt_Money);
       imgHinh = findViewById(R.id.img_hinh);

        Intent i = getIntent();
        Bundle b = i.getExtras();
        txtName.setText(b.getString("name"));
        txtNote.setText(b.getString("note"));
        txtMoney.setText(b.getString("money"));
        imgHinh.setImageResource(b.getInt("img"));



    }
}
