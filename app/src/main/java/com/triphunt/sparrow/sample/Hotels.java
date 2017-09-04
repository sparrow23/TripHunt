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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Hotels extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    //String id;
    //String hotel_data[];
    DatabaseHelper mydb;
    //String name, addr, price;
    String name2, name3;
    Button t[];
    //int i = 0;


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
        View v = inflater.inflate(R.layout.fragment_hotels, container, false);
        mydb = new DatabaseHelper(getActivity());
        //hotel_data = new String[20];

        Bundle bundle = getArguments();
        name2 = bundle.getString("name");
        String id = bundle.getString("id");
        //int id2 = Integer.parseInt(id);
        String hotel_data[];
        hotel_data = new String[20];
        Cursor res = mydb.getHotelData(name2);
        int i = 0;
        String check = "";
        while(res.moveToNext()) {
            // String hotel_data[];
            // hotel_data = new String[20];
            String name = res.getString(0);
            String addr = res.getString(1);
            String price = res.getString(2);
            hotel_data[i] = "Hotel Name : "+name+"\n"+"Price : "+price+"\n"+"Address : "+addr+"\n";
            check = check+name;
            i++;
            //name = name+"\n"+name1;
        }
        if(check.matches(""))
        {
            Toast.makeText(getContext(), "Sorry no any hotels", Toast.LENGTH_LONG).show();
        }
        /*ListView theListView = (ListView) v.findViewById(R.id.theListView_hotels);
        ListAdapter theAdapter =  new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, hotel_data);
        theListView.setAdapter(theAdapter);*/
        LinearLayout root=(LinearLayout) v.findViewById(R.id.linear_layout_hotels);
        t = new Button[20];
        root.setOrientation(1);
        for(int j=0;j<i;j++)
        {
            t[j]=new Button(getActivity());
            // t[j].setLayoutParams(dim);
            t[j].setText(hotel_data[j]);
            //t[j].setTextColor(Color.parseColor("#FFFFFF"));
            root.addView(t[j]);
        }

       /* for(int j = 0; j < i; j++)
        {
            theListView.set
        }*/
        // Inflate the layout for this fragment
        return v;
    }


}
