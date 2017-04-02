package com.triphunt.sparrow.sample;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;


public class PlaceInfo extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public View v;
    String purp;
    TextView show_data;
    public String budget, no_person, no_day, date, p_journey, purpose;
    public int id;
    DatabaseHelper mydb;
    int i=0;
    String place_name[];
    //Integer place_id[];
    TableLayout linear;



    public PlaceInfo() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PlaceInfo.
     */
    // TODO: Rename and change types and number of parameters
    public static PlaceInfo newInstance(String param1, String param2) {
        PlaceInfo fragment = new PlaceInfo();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

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
        v = inflater.inflate(R.layout.fragment_place_info, container, false);
        mydb = new DatabaseHelper(getActivity());
        place_name = new String[20];
        // place_id = new Integer[20];
        //show_data = (TextView) v.findViewById(R.id.show_data);
        Bundle bundle = getArguments();
       /* if(bundle != null)
        {
            Toast.makeText(getActivity(), "bundle empty", Toast.LENGTH_LONG).show();
        }*/
        budget = bundle.getString("budget");
        no_person = bundle.getString("no_person");
        no_day = bundle.getString("no_day");
        date = bundle.getString("date");
        p_journey = bundle.getString("p_journey");

        purpose = bundle.getString("purpose");
        // Toast.makeText(getActivity(), budget, Toast.LENGTH_LONG).show();
        String date2 = String.valueOf(date.charAt(3))+String.valueOf(date.charAt(4));
        if(purpose.equals("Honeymoon"))
        {
            purp = "Honeymoon";
        }
        else if(purpose.equals("Picnic"))
        {
            purp = "Picnic";
        }
        else if(purpose.equals("Summer Vacation"))
        {
            purp = "Summer";
        }
        else if(purpose.equals("Winter Vacation"))
        {
            purp = "Winter";
        }
        else if(purpose.equals("Pilgrimage"))
        {
            purp = "Pilgrimage";
        }
        else
        {
            purp = "Other";
        }
        // show_data.setText(no_person);
        //Toast.makeText(getActivity(), budget, Toast.LENGTH_SHORT).show();
        Cursor res = mydb.getAllData(budget, no_person, date2, purp, no_day);
        String name1;
        String name="";
        // name = "Place Name Of June\n";
        while(res.moveToNext()) {
            // name = res.getInt(0);
            name1 = res.getString(0);
            place_name[i] = name1;
            name = name+name1;
            i++;
            //name = name+"\n"+name1;
        }
        if(name.matches(""))
        {
            Toast.makeText(getContext(), "Sorry no any place for you. Increase the budget otherwise change the purpose of holiday", Toast.LENGTH_LONG).show();
        }
        //Toast.makeText(getActivity(), b+Integer.toString(id), Toast.LENGTH_SHORT).show();
        // ScrollView scrollView = (ScrollView) v.findViewById(R.id.login_form);
        linear = (TableLayout) v.findViewById(R.id.table_layout);
        // scrollView.addView(linear);
        for (int j = 1; j <= i; j++) {
            TableRow tableRow = new TableRow(getActivity());
            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT, 0.5f));
            linear.addView(tableRow);
            TextView v = new TextView(getActivity());
            v.setText("PLACE RECCOMENDED BY TRIPHUNT");
            for(int k = 1; k <= 1; k++);
            {
                final Button button = new Button(getActivity());
                button.setText(place_name[j-1]);
                //  id = place_id[j-1];
                button.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        PlaceDetails fragment = new PlaceDetails();
                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);

                        Bundle args = new Bundle();
                        args.putString("name", button.getText().toString());
                        // args.putString("id", Integer.toString(id));
                        fragment.setArguments(args);
                        fragmentTransaction.replace(R.id.frame, fragment);
                        fragmentTransaction.commitAllowingStateLoss();
                        //Toast.makeText(getActivity(), button.getText().toString()+Integer.toString(id), Toast.LENGTH_SHORT).show();
                    }
                });
                tableRow.addView(button);
            }
        }

        //show_data.setText(name);
        // buttonPlace();

        // Inflate the layout for this fragment
        return v;
    }




}
