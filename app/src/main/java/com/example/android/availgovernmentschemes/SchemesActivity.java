package com.example.android.availgovernmentschemes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SchemesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schemes);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("BETI PADHAO BETI BACHAO", R.drawable.women));
        words.add(new Word("WOMEN HELPINE SCHEME", R.drawable.farmer));
        words.add(new Word("SWADHAR GREH SCHEME", R.drawable.youth));
        words.add(new Word("INDRA GANDHI MATRIVA SAHYOG YOJNA", R.drawable.health));
        words.add(new Word("MAHILA-E-HATT YOJNA", R.drawable.senior));
        words.add(new Word("NATIONAL MISSION FOR EMPOWERMENT OF WOMEN", R.drawable.bussiness));
        CategoryAdapter itemsAdapter = new CategoryAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }

}
