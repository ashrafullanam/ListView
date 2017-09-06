package com.example.ashraf.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

//    private ArrayList<String>nameList;
    ArrayList<ViewClass>viewClasses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView);

        viewClasses=new ArrayList<>();
        viewClasses.add(new ViewClass("Alve1","12355"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alv2e","12535"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alve1","12355"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alv2e","12535"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alve1","12355"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alv2e","12535"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alve1","12355"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alv2e","12535"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alve1","12355"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alv2e","12535"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alve1","12355"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alv2e","12535"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alve1","12355"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alv2e","12535"));
        viewClasses.add(new ViewClass("Alve","1235"));
        viewClasses.add(new ViewClass("Alve","1235"));
        AdapterClass adapterClass = new AdapterClass(this,viewClasses);

       /* nameList = new ArrayList<>();

        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        nameList.add("ALVE");
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, R.layout.list_row,R.id.textView,nameList);*/
//        listView.setAdapter(adapter);
        listView.setAdapter(adapterClass);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+parent.getItemIdAtPosition(position)+" position: "+position, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
