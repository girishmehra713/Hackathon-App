package com.example.android.availgovernmentschemes;


import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {


    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.category_activity, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("WOMEN", R.drawable.women));
        words.add(new Word("FARMERS", R.drawable.farmer));
        words.add(new Word("YOUTH", R.drawable.youth));
        words.add(new Word("HEALTH", R.drawable.health));
        words.add(new Word("SENIOR CITIZEN", R.drawable.senior));
        words.add(new Word("FINANCE", R.drawable.bussiness));
        words.add(new Word("RURAL", R.drawable.rural1));


        CategoryAdapter itemsAdapter = new CategoryAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int i, long l) {

                int a = System.identityHashCode(arg0.getItemAtPosition(i)) ;
                switch (a) {
                    case 0:

                        Intent intent = new Intent(CategoryFragment.this.getActivity(),SchemesActivity.class );
                        CategoryFragment.this.getActivity().startActivity(intent);
                        break;
                    case 1:

                        Intent intent1 = new Intent(CategoryFragment.this.getActivity(),SchemesActivity.class );
                        CategoryFragment.this.getActivity().startActivity(intent1);
                        break;
                    case 2:

                        Intent intent2 = new Intent(CategoryFragment.this.getActivity(),SchemesActivity.class );
                        CategoryFragment.this.getActivity().startActivity(intent2);
                        break;
                        default:
                            Intent intent3 = new Intent(CategoryFragment.this.getActivity(),SchemesActivity.class );
                            CategoryFragment.this.getActivity().startActivity(intent3);



                }

            }




        });
        return rootView;
    }
}
