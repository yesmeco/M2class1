package com.example.pisa_452.secondclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        /*

        ListView listview = (ListView) findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        for (int i=0; i<100; i++){
            list.add(Integer.toString(i + 1));
        }
        listview.setAdapter(new ArrayAdapter<>(this,R.layout.listviewcomponent,list));*/

        ListView listView;
        View footerWiew= LayoutInflater.from(this).inflate(R.layout.footer_view, null);
        listView.addFooterView(footerWiew);

    }
}
