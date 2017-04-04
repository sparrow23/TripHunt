package com.triphunt.sparrow.sample;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.Profile;
import java.util.ArrayList;

import static android.content.Intent.getIntent;



public class PlaceInfo extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Profile profile = null;
    String fb_id, fb_name;
    public View v;
    String purp, purpose2,purpose1;
    ArrayAdapter<String> adapter;
    TextView show_data;
    public String budget, no_person, no_day, date, p_journey, purpose;
    public int id;
    DatabaseHelper mydb;
    int i=0, j, k;
    String place_name[], place_name2[];
    Integer place_budget[], place_budget2[];
    //Integer place_id[];
    TableLayout linear;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // mydb = new DatabaseHelper(getActivity());
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
        place_name2 = new String[20];
        place_budget = new Integer[20];
        place_budget2 = new Integer[20];
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
        /*SelectedPlaces selectedPlaces = new SelectedPlaces();
        Bundle args = new Bundle();
        args.putString("place", "shamshad");
        args.putString("date", "waris");
        selectedPlaces.setArguments(args);*/

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
        int budg;
        // name = "Place Name Of June\n";
        while(res.moveToNext()) {
            // name = res.getInt(0);
            name1 = res.getString(0);
            budg = res.getInt(1);
            place_name[i] = name1;
            place_budget[i] = budg;
            place_budget2[i] = budg;

            name = name+name1;
            i++;
            //name = name+"\n"+name1;
        }
        if(name.matches(""))
        {
            Toast.makeText(getContext(), "Sorry no any place for you. Increase the budget otherwise change the purpose of holiday", Toast.LENGTH_LONG).show();
        }
        int temp;
        for(int a = 0; a < i-1; a++)
        {
            for(int b = 0; b < i-a-1; b++)
            {
                if(place_budget[b] > place_budget[b+1])
                {
                    temp = place_budget[b];
                    place_budget[b] = place_budget[b+1];
                    place_budget[b+1] = temp;
                }
            }
        }
        int max = Integer.parseInt(budget);
        int no_person2 = Integer.parseInt(no_person);
        int no_day2 = Integer.parseInt(no_day);
        max = max / no_person2;
        max = (max/no_day2)*5;
        int l = 0, m =0;
        for(int a = 0; a < i; a++)
        {
            if(place_budget[a] <= max)
            {
                l++;
            }
            else
                break;
        }
        int budget3 = place_budget[l-1];
        for( int a = 0; a < i; a++)
        {
            if(place_budget2[a] != budget3)
            {
                m++;
            }
            else
                break;
        }
        String r_place = place_name[m];
        for(int a = m; a < i-1; a++)
        {
            place_name[a] = place_name[a+1];
        }
        i--;
        place_name2[0] = "Select Your Place";
        place_name2[1] = r_place;
        for(int a = 2; a <= i+1; a++)
        {
            place_name2[a] = place_name[a-2];
        }
        // ScrollView scrollView = (ScrollView) v.findViewById(R.id.login_form);
        linear = (TableLayout) v.findViewById(R.id.table_layout2);
        for(int a = 1; a <= 1; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            for(int b = 1; b <= 1; b++)
            {
                final TextView view = new TextView(getActivity());
                view.setText("PLACE RECCOMENDED BY TRIPHUNT");
                view.setTextColor(Color.parseColor("#ffffff"));
                // view.setBackgroundColor(Color.parseColor("#ff0000"));
                view.setTextSize(18);
                view.setHeight(70);
                tableRow.addView(view);
            }
        }
        for(int a = 1; a <= 1; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            for(int b = 1; b <= 1; b++)
            {
                final TextView view = new TextView(getActivity());
                view.setText("");
                tableRow.addView(view);
            }
        }
        for(int a = 1; a <= 1; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            for(int b = 1; b <= 1; b++)
            {
                final Button button = new Button(getActivity());
                button.setText(r_place);
                button.setTextSize(22);
                button.setHeight(80);
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
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
        for(int a = 1; a <= 3; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            for(int b = 1; b <= 1; b++)
            {
                final TextView view = new TextView(getActivity());
                view.setText("");
                tableRow.addView(view);
            }
        }
        for(int a = 1; a <= 1; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            for(int b = 1; b <= 1; b++)
            {
                final TextView view = new TextView(getActivity());
                view.setText("OPTIONAL PLACE");
                view.setTextColor(Color.parseColor("#ffffff"));
                //view.setBackgroundColor(Color.parseColor("#ff0000"));
                view.setTextSize(18);
                view.setHeight(70);
                tableRow.addView(view);
            }
        }
        for(int a = 1; a <= 1; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            for(int b = 1; b <= 1; b++)
            {
                final TextView view = new TextView(getActivity());
                view.setText("");
                tableRow.addView(view);
            }
        }
        // scrollView.addView(linear);
        for (j = 1; j <= i; j++) {
            if(j <= 5)
            {
                TableRow tableRow = new TableRow(getActivity());
                // tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT, 0.5f));
                linear.addView(tableRow);
                for(k = 1; k <= 1; k++);
                {

                    final Button button = new Button(getActivity());
                    button.setText(place_name[j - 1]);
                    //  id = place_id[j-1];
                    button.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
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
        }
        for(int a = 1; a <= 3; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            for(int b = 1; b <= 1; b++)
            {
                final TextView view = new TextView(getActivity());
                view.setText("");
                tableRow.addView(view);
            }
        }
        for(int a = 1; a <= 1; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            for(int b = 1; b <= 1; b++)
            {
                final Spinner spinner = new Spinner(getActivity());
                ArrayList<String> spinnerArray = new ArrayList<String>();
                int c;
                for(c = 0; c < i+2; c++)
                {
                    if(c < 7) {
                        spinnerArray.add(place_name2[c]);
                    }
                }
                adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_dropdown_item, spinnerArray);
                spinner.setAdapter(adapter);
                spinner.setBackgroundColor(Color.parseColor("#00ffff"));
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
                {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        purpose2 =  (String) parent.getItemAtPosition(position);

                        pShow(purpose2);
                        // Toast.makeText(getContext(), purpose1, Toast.LENGTH_LONG).show();

                    }


                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }

                });
                tableRow.addView(spinner);
            }
        }
        for(int a = 1; a <= 3; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            for(int b = 1; b <= 1; b++)
            {
                final TextView view = new TextView(getActivity());
                view.setText("");
                tableRow.addView(view);
            }
        }
        for(int a = 1; a <= 1; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            for(int b = 1; b <= 1; b++)
            {
                final Button button = new Button(getActivity());
                button.setText("SUBMIT");
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        if (purpose1.toString().equals("Select Your Place")) {
                            Toast.makeText(getContext(), "You did not select the any place", Toast.LENGTH_LONG).show();
                        } else {
                            SelectedPlaces fragment = new SelectedPlaces();
                            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                            //SelectedPlaces selectedPlaces = new SelectedPlaces();
                            Bundle args = new Bundle();
                            //args.putString("place", purpose1);
                            //args.putString("date", date);
                            fragment.setArguments(args);
                            fragmentTransaction.replace(R.id.frame, fragment);
                            fragmentTransaction.commitAllowingStateLoss();
                            //Toast.makeText(getActivity(), button.getText().toString()+Integer.toString(id), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                tableRow.addView(button);
            }
        }
        for(int a = 1; a <= 3; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            for(int b = 1; b <= 1; b++)
            {
                final TextView view = new TextView(getActivity());
                view.setText("");
                tableRow.addView(view);
            }
        }

        //show_data.setText(name);
        // buttonPlace();

        // Inflate the layout for this fragment
        return v;
    }
    public void pShow(String pur)
    {
        purpose1 = pur;


    }
    /*public void buttonPlace()
    {
        linear = (TableLayout) v.findViewById(R.id.table_layout);
        for (int j = 1; j <= i; j++) {
            TableRow tableRow = new TableRow(this.getContext());
            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT, 0.5f));
            linear.addView(tableRow);
            for(int k = 1; k <= 1; k++);
            {
                Button button = new Button(this.getContext());
                button.setText(place1[j-1]);
                button.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Toast.makeText(getActivity(), "click Button"+i, Toast.LENGTH_SHORT).show();
                    }
                });
                tableRow.addView(button);
            }
        }
    }*/


}
