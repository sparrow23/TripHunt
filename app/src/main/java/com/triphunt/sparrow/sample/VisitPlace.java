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
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class VisitPlace extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    String id;
    String visit_place_data[];
    TextView t[];
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
        View v = inflater.inflate(R.layout.fragment_visit_place, container, false);
        mydb = new DatabaseHelper(getActivity());
        visit_place_data = new String[20];

        Bundle bundle = getArguments();
        name = bundle.getString("name");
        //id = bundle.getString("id");
        //int id2 = Integer.parseInt(id);
        String check="";
        Cursor res = mydb.getVisitPlaceData(name);
        while(res.moveToNext()) {
            name3 = res.getString(0);
            addr = res.getString(1);
            visit_place_data[i] = "Visit Place Name : "+name3+"\n"+"Address : "+addr+"\n";
            check = check+name3;
            i++;
            //name = name+"\n"+name1;
        }
        if(check.matches(""))
        {
            Toast.makeText(getContext(), "Sorry no any Visit place", Toast.LENGTH_LONG).show();
        }
        /*ListView theListView = (ListView) v.findViewById(R.id.theListView_visit_place);
        ListAdapter theAdapter =  new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, visit_place_data);
        theListView.setAdapter(theAdapter);*/
        LinearLayout root=(LinearLayout) v.findViewById(R.id.linear_layout_visit_places);
        t = new TextView[20];
       // root.setOrientation(1);
        for(int j=0;j<i;j++)
        {
            t[j]=new TextView(getActivity());
            // t[j].setLayoutParams(dim);
            t[j].setText(visit_place_data[j]);
            t[j].setTextColor(Color.parseColor("#FFFFFF"));
            root.addView(t[j]);
        }

        // Inflate the layout for this fragment
        return v;
    }


}
