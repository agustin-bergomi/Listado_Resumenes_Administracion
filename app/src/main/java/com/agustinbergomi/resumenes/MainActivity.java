package com.agustinbergomi.resumenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ListViewAdapter adapter;
    String[] Version;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //identifico el layout
        Version = new String[] {"CONCEPTO DE ADMINISTRACION","EVOLUCION DE LA ADMINISTRACION", "MASLOW", ""};

        list = (ListView) findViewById(R.id.listview);
        adapter = new ListViewAdapter(this, Version);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Seleccionaste :" + Version[position], Toast.LENGTH_SHORT).show();

            }
        });




    }

}