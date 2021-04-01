package com.example.listviewvip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTraiCay;
    ArrayList<TraiCay> arraytrai;
    traicayadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
        adapter = new traicayadapter(this,R.layout.dong_traicay, arraytrai);
        lvTraiCay.setAdapter(adapter);
    }

    private  void Anhxa()
    {
        lvTraiCay = (ListView) findViewById(R.id.listviewTraiCay);
        arraytrai = new ArrayList<>();
        arraytrai.add(new TraiCay("Chuối","Chuối đà lạt",R.drawable.chuoi));
        arraytrai.add(new TraiCay("Lê","lê tươi mát",R.drawable.le));
        arraytrai.add(new TraiCay("Táo","Táo Campuchia",R.drawable.tao));

    }
}