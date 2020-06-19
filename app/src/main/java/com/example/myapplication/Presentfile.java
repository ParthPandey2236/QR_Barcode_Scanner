package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.myapplication.HOME.p;

public class Presentfile extends AppCompatActivity {
    //ArrayList<String> p = new ArrayList<String>();
    ListView mylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentfile);
        //ArrayList<String> p = new ArrayList<String>();
         mylist = findViewById(R.id.list);
       // ArrayList<String> p = (ArrayList<String>) getIntent().getSerializableExtra("p");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, p) {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView textView = (TextView) view.findViewById(android.R.id.text1);

                /*YOUR CHOICE OF COLOR*/
                textView.setTextColor(Color.WHITE);

                return view;
            }
        };
        mylist.setAdapter(arrayAdapter);
    }
    public void onclick(View view){
        mylist.setAdapter(null);
        p.clear();
    }
}
