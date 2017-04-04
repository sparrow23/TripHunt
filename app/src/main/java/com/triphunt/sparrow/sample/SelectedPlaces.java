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

import com.facebook.Profile;



public class SelectedPlaces extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Profile profile = null;


    String select[], place_info[];
    int i = 0;
    TextView t[];


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        profile = Profile.getCurrentProfile();
        //String name = profile.getName();
        Bundle bundle = getArguments();
        if(bundle == null)
        {
            Toast.makeText(this.getActivity(), "data is coming" , Toast.LENGTH_SHORT).show();
        }

        //String place = (String)bundle.getString("place");
        //String date = (String) bundle.getString("date");

        //Toast.makeText(this.getActivity(), profile.getName() , Toast.LENGTH_SHORT).show();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_selected_places, container, false);
        //Toast.makeText(getActivity(), profile.getName(), Toast.LENGTH_SHORT).show();


        // DatabaseHelper mydb = new DatabaseHelper(getActivity());
        //String id = profile.getId();


       /* mydb.insertData(id, name, date, place);
        Cursor res = mydb.getHotelData(id);
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
        LinearLayout root=(LinearLayout) v.findViewById(R.id.linear_layout_selected_places1);
        t = new TextView[20];
        root.setOrientation(1);
        for(int j=0;j<i;j++)
        {
            t[j]=new TextView(getActivity());
            // t[j].setLayoutParams(dim);
            t[j].setText(select[j]);
            t[j].setTextColor(Color.parseColor("#FFFFFF"));
            root.addView(t[j]);
        }*/
        // Inflate the layout for this fragment
        return v;
    }


}
