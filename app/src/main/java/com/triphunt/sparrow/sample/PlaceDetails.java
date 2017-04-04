package com.triphunt.sparrow.sample;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class PlaceDetails extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    TextView place;
    public View v;
    DrawerLayout drawer;
    public Button b_hotel, b_visit_place, b_mall, b_multiplex, b_regional_food;
    String name, name2, id;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


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
        v = inflater.inflate(R.layout.fragment_place_details, container, false);
        place = (TextView) v.findViewById(R.id.textView_place);
        b_hotel = (Button) v.findViewById(R.id.button_hotel);
        b_visit_place = (Button) v.findViewById(R.id.button_visit_place);
        b_mall = (Button) v.findViewById(R.id.button_mall);
        b_multiplex = (Button) v.findViewById(R.id.button_multiplex);
        b_regional_food = (Button) v.findViewById(R.id.button_regional_food);
        // DrawerLayout drawerLayout = (DrawerLayout) v.findViewById(R.id.)
        //drawer = (DrawerLayout) v.findViewById(R.id.drawer_layout);
        //drawer.closeDrawers();
        Bundle bundle = getArguments();
        name = bundle.getString("name");
        name2 = name+" Details";
       /* DatabaseHelper mydb = new DatabaseHelper(getActivity());
        String name4, name3=" ", addr;
        Cursor res = mydb.getMallsData(name);
        while(res.moveToNext()) {
            name4 = res.getString(0);
            addr = res.getString(1);
            name3 = name3+name4;
            //malls_data[i] = "Mall Name : "+name+"\n"+"Address : "+addr+"\n";

           // i++;
            //name = name+"\n"+name1;
        }
        Toast.makeText(getContext(), name3, Toast.LENGTH_LONG).show();*/
        // id = bundle.getString("id");
        place.setText(name2);
        b_hotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Hotels fragment = new Hotels();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);

                Bundle args = new Bundle();
                args.putString("name", name);
                //args.putString("id", id);
                fragment.setArguments(args);
                fragmentTransaction.replace(R.id.frame, fragment);
                fragmentTransaction.commitAllowingStateLoss();

            }
        });
        b_visit_place.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                VisitPlace fragment = new VisitPlace();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);

                Bundle args = new Bundle();
                args.putString("name", name);
                //  args.putString("id", id);
                fragment.setArguments(args);
                fragmentTransaction.replace(R.id.frame, fragment);
                fragmentTransaction.commitAllowingStateLoss();

            }
        });
        b_mall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Malls fragment = new Malls();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);

                Bundle args = new Bundle();
                args.putString("name", name);
                //args.putString("id", id);
                fragment.setArguments(args);
                fragmentTransaction.replace(R.id.frame, fragment);
                fragmentTransaction.commitAllowingStateLoss();

            }
        });
        b_multiplex.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Multiplexes fragment = new Multiplexes();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);

                Bundle args = new Bundle();
                args.putString("name", name);
                //args.putString("id", id);
                fragment.setArguments(args);
                fragmentTransaction.replace(R.id.frame, fragment);
                fragmentTransaction.commitAllowingStateLoss();

            }
        });
        b_regional_food.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RegionalFood fragment = new RegionalFood();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);

                Bundle args = new Bundle();
                args.putString("name", name);
                //args.putString("id", id);
                fragment.setArguments(args);
                fragmentTransaction.replace(R.id.frame, fragment);
                fragmentTransaction.commitAllowingStateLoss();

            }
        });
        // Inflate the layout for this fragment

        return v;
    }

    /*public void hotel()
    {
        //b_hotel.setOnClickListener(new View.OnClickListener() {
           // public void onClick(View v) {


                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                HotelsFragment fragment = new HotelsFragment();
                Bundle args = new Bundle();
                //args.putString("name", button.getText().toString());
                args.putString("id", id);
                fragment.setArguments(args);
                fragmentTransaction.replace(R.id.frame, fragment);
                fragmentTransaction.commitAllowingStateLoss();
               // Intent intent = new Intent(getActivity(), Hotels.class);
               // startActivity(intent);

            //}
        //});
    }*/





}
