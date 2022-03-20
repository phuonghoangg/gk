package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvDonut;
    CustomTastyAdapter adt;
    ArrayList<Tasty> arrayList;
    Button btnMove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDonut = findViewById(R.id.lvDonut);
        arrayList = new ArrayList<>();
        arrayList.add(new Tasty("Tasty Donut","Spicy tasty donut family",
                "$10.00",R.drawable.donut_red_1));
        arrayList.add(new Tasty("Pink Donut","Spicy tasty donut family",
                "$20.00",R.drawable.donut_yellow_1));

        adt = new CustomTastyAdapter(this,R.layout.item_listview,arrayList);
        lvDonut.setAdapter(adt);

        lvDonut.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                Bundle b = new Bundle();

                b.putString("name", arrayList.get(position).getNameDonut());
                b.putString("note", arrayList.get(position).getDesDonut());
                b.putString("money", arrayList.get(position).getPrice());
                b.putInt("img", arrayList.get(position).getImgDonut());
                i.putExtras(b);
                startActivity(i);
            }
        });





    }
}
