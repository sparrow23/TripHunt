package com.triphunt.sparrow.sample;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.Profile;

import java.util.ArrayList;


public class CancelTour extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Profile profile = null;
    //String place_in;
    String select[];
    public static String place_info[];
    String place_in, purpose2, tour_id, purpose1;
    DatabaseHelper mydb;
    String book_id[], book_id2[];
    Spinner t1[];
    int i = 0,k;
    Button t[];
    public int l = 0;
    ArrayAdapter<String> adapter;


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
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_cancel_tour, container, false);
        profile = Profile.getCurrentProfile();
        mydb = new DatabaseHelper(getActivity());
        //String id = profile.getId();


        // mydb.insertData(id, name, date, place);
        Cursor res = mydb.getAllData(profile.getId());
        select = new String[20];
        place_info = new String[20];
        book_id = new String[20];
        book_id2 = new String[20];
        String check = "";
        while(res.moveToNext()) {
            // String hotel_data[];
            // hotel_data = new String[20];
            String book_id1 = res.getString(0);
            String  date1 = res.getString(1);
            String place1 = res.getString(2);
            select[i] = "Tour Id : "+book_id1+"\n"+"Journey Date : "+date1+"\n"+"Place : "+place1+"\n";
            place_info[i] = place1;
            book_id[i] = book_id1;
            check = check+place1;
            i++;
            //name = name+"\n"+name1;
        }
        /*String sum = "";
        for(int a = 0; a < i; a++)
        {
            sum = sum+place_info[a];
        }
        Toast.makeText(getContext(), sum, Toast.LENGTH_LONG).show();*/
        if(check.matches(""))
        {
            Toast.makeText(getContext(), "Sorry You have not any selected place", Toast.LENGTH_LONG).show();
        }
        //LinearLayout root=(LinearLayout) v.findViewById(R.id.linear_layout_cancel_tour);
        book_id2[0] = "Select Tour Id";
        for(int a = 0; a < i; a++)
        {
            book_id2[a+1] = book_id[a];
        }
        TableLayout linear = (TableLayout) v.findViewById(R.id.table_layout_cancel);
        for(int a = 1; a <= 1; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            for(int b = 1; b <= 1; b++)
            {
                final TextView view = new TextView(getActivity());
                view.setText("YOUR SELECTED TOUR PLACES");
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
        for(k = 1; k <= i; k++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            // tour_id = place_info[k-1];
            for(int b = 1; b <= 1; b++)
            {
                final Button button = new Button(getActivity());
                button.setText(select[k-1]);

                // button.setTextSize(22);
                // button.setHeight(80);

               /* button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        PlaceDetails fragment = new PlaceDetails();
                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                        //Toast.makeText(getActivity(), place_info[k-1], Toast.LENGTH_SHORT).show();
                        Bundle args = new Bundle();
                        args.putString("name", tour_id);
                        //l++;
                        // args.putString("id", Integer.toString(id));
                        fragment.setArguments(args);
                        fragmentTransaction.replace(R.id.frame, fragment);
                        fragmentTransaction.commitAllowingStateLoss();
                        //Toast.makeText(getActivity(), button.getText().toString()+Integer.toString(id), Toast.LENGTH_SHORT).show();
                    }
                });*/
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
                final Spinner spinner = new Spinner(getActivity());
                ArrayList<String> spinnerArray = new ArrayList<String>();
                int c;
                for(c = 0; c < i+1; c++)
                {
                    spinnerArray.add(book_id2[c]);
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
        for(int a = 1; a <= 1; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            for(int b = 1; b <= 1; b++)
            {
                final Button button = new Button(getActivity());
                button.setText("CANCEL");
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        if (purpose1.toString().equals("Select Tour Id")) {
                            Toast.makeText(getContext(), "You did not select the any Tour Id", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(getActivity(),purpose1,Toast.LENGTH_LONG).show();
                            Integer check = mydb.deleteData(purpose1);
                            if(check > 0)
                                Toast.makeText(getActivity(),"Data Deleted",Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(getActivity(),"Data not Deleted",Toast.LENGTH_LONG).show();

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

        // Inflate the layout for this fragment
        return v;
    }
    public void pShow(String pur)
    {
        purpose1 = pur;
    }

}
