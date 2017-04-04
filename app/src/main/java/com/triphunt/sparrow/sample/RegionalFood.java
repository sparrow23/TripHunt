package com.triphunt.sparrow.sample;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class RegionalFood extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    String id;
    String regional_food_data[];
    DatabaseHelper mydb;
    String name, addr, name3;
    int i = 0;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_regional_food, container, false);
        mydb = new DatabaseHelper(getActivity());
        regional_food_data = new String[20];
        TextView t[];

        Bundle bundle = getArguments();
        name = bundle.getString("name");
        // id = bundle.getString("id");
        //int id2 = Integer.parseInt(id);
        String check="";
        Cursor res = mydb.getRegionalFoodData(name);
        while(res.moveToNext()) {
            name3 = res.getString(0);
            //name3 = name3+name;
            regional_food_data[i] = "Regional Food : "+name3+"\n";
            check = check+name3;
            i++;
            //name = name+"\n"+name1;
        }
        if(check.matches(""))
        {
            Toast.makeText(getContext(), "Sorry no any Malls", Toast.LENGTH_LONG).show();
        }
        LinearLayout root=(LinearLayout) v.findViewById(R.id.linear_layout_regional_food);
        t = new TextView[20];
        root.setOrientation(1);
        for(int j=0;j<i;j++)
        {
            t[j]=new TextView(getActivity());
            // t[j].setLayoutParams(dim);
            t[j].setText(regional_food_data[j]);
            t[j].setTextColor(Color.parseColor("#FFFFFF"));
            root.addView(t[j]);
        }
        // Inflate the layout for this fragment
        return v;
    }
}