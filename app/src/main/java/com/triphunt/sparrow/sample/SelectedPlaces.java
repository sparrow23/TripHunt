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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.Profile;



public class SelectedPlaces extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Profile profile = null;
    int j;
    String place_in;

    String select[], place_info[];
    int i = 0,k;
    Button t[];


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //String name = profile.getName();
        //Bundle bundle = getArguments();
        // if(bundle == null)
        //{
        // Toast.makeText(this.getActivity(), "data is coming" , Toast.LENGTH_SHORT).show();
        //}

        //String place = (String)bundle.getString("place");
        //String date = (String) bundle.getString("date");

        //Toast.makeText(this.getActivity(), profile.getName() , Toast.LENGTH_SHORT).show();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_selected_places, container, false);
        //Toast.makeText(getActivity(), profile.getName(), Toast.LENGTH_SHORT).show();

        profile = Profile.getCurrentProfile();
        DatabaseHelper mydb = new DatabaseHelper(getActivity());
        //String id = profile.getId();


        // mydb.insertData(id, name, date, place);
        Cursor res = mydb.getAllData(profile.getId());
        select = new String[20];
        place_info = new String[20];
        String check = "";
        while(res.moveToNext()) {
            // String hotel_data[];
            // hotel_data = new String[20];
            int book_id = res.getInt(0);
            String  date1 = res.getString(1);
            String place1 = res.getString(2);
            select[i] = "Tour Id : "+Integer.toString(book_id)+"\n"+"Journey Date : "+date1+"\n"+"Place : "+place1+"\n";
            place_info[i] = place1;
            check = check+place1;
            i++;
            //name = name+"\n"+name1;
        }
        if(check.matches(""))
        {
            Toast.makeText(getContext(), "Sorry You have not any selected place", Toast.LENGTH_LONG).show();
        }
        TableLayout linear = (TableLayout) v.findViewById(R.id.table_layout_selected_places1);
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
        for(int a = 1; a <= i; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            // tour_id = place_info[-1];
            for(int b = 1; b <= 1; b++)
            {
                final Button button = new Button(getActivity());
                button.setText(select[a-1]);

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
                final TextView view = new TextView(getActivity());
                view.setText("YOUR PLACE TOUR INFORMATION");
                view.setTextColor(Color.parseColor("#ffffff"));
                // view.setBackgroundColor(Color.parseColor("#ff0000"));
                view.setTextSize(18);
                view.setHeight(70);
                tableRow.addView(view);
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
        for(int a = 1; a <= i; a++)
        {
            TableRow tableRow = new TableRow(getActivity());
            linear.addView(tableRow);
            // tour_id = place_info[k-1];
            for(int b = 1; b <= 1; b++)
            {
                final Button button = new Button(getActivity());
                button.setText(place_info[a-1]);

                // button.setTextSize(22);
                // button.setHeight(80);

                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        PlaceDetails fragment = new PlaceDetails();
                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                        //Toast.makeText(getActivity(), place_info[k-1], Toast.LENGTH_SHORT).show();
                        Bundle args = new Bundle();
                        args.putString("name", button.getText().toString());
                        //l++;
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
        // Inflate the layout for this fragment
        return v;
    }


}
