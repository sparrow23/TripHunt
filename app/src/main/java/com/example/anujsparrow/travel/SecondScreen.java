package com.example.anujsparrow.travel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by ANUJ@SPARROW on 08-06-2016.
 */
public class SecondScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

    }
    public void click_continue(View view) {
        String response = "sorry sir we haven't worked so far!!!";
        Toast.makeText(this, response, Toast.LENGTH_LONG).show();
    }
}
