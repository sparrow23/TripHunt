package com.triphunt.sparrow.sample;

//import android.content.Context;
//import android.net.Uri;
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
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainContent extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public Spinner spinner;
    EditText budget, no_person, no_day, date, p_journey;
    // String budget2, no_person2, no_day2, date2, p_journey2, purpose3;
    public String purpose1,purpose2;
    Button b_search;
    public View v;
    private TextView show_data;
    //DatabaseHelper mydb;
    ArrayAdapter<CharSequence> adapter;




    public static MainContent newInstance(String param1, String param2) {
        MainContent fragment = new MainContent();
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
        v = inflater.inflate(R.layout.fragment_main_content, container, false);
        // mydb = new DatabaseHelper(getActivity());
        b_search = (Button) v.findViewById(R.id.Submit);
        budget = (EditText) v.findViewById(R.id.budget_id);
        no_person = (EditText) v.findViewById(R.id.no_person_id);
        no_day = (EditText) v.findViewById(R.id.no_day_id);
        date = (EditText) v.findViewById(R.id.date_id);
        p_journey = (EditText) v.findViewById(R.id.p_journey_id);
        spinner = (Spinner) v.findViewById(R.id.spinner2);
        show_data = (TextView) v.findViewById(R.id.textView_show);
        adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.purpose, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        //Toast.makeText(getActivity(), "waris", Toast.LENGTH_LONG).show();
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                purpose1 =  (String) parent.getItemAtPosition(position);
                pShow(purpose1);
                // Toast.makeText(getContext(), purpose1, Toast.LENGTH_LONG).show();

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        // Inflate the layout for this fragment
        onClickButtonListener();
        return v;
    }
    public void pShow(String pur) {
        // show_data.setText(pur);
        purpose2 = pur;
    }
    public void onClickButtonListener() {

       /* String budget2 = budget.getText().toString();
        String no_person2 = no_person.getText().toString();
        String no_day2 =  no_day.getText().toString();
        String date2 = date.getText().toString();
        String p_journey2 = p_journey.getText().toString();
        String purpose3 = purpose2.toString();*/
       /* if(budget2.matches(" ") && no_person2.matches(" ") && no_day2.matches(" ") && date2.matches(" ") && p_journey2.matches(" ") && purpose3.matches(" "))
        {
            Toast.makeText(getContext(), "Please fill the all Text", Toast.LENGTH_LONG).show();
        }*/
        //else if(date2.length() == 8 && date2.charAt(2) == '/' && date2.charAt(5) == '/') {
        b_search.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(budget.getText().toString().matches(""))
                {

                    Toast.makeText(getContext(), "You did not enter a budget", Toast.LENGTH_LONG).show();

                }
                else if(Integer.parseInt(budget.getText().toString()) <= 1600)
                {
                    Toast.makeText(getContext(), "Please enter a budget more than 1600", Toast.LENGTH_LONG).show();
                }
                else if(no_person.getText().toString().matches(""))
                {
                    Toast.makeText(getContext(), "You did not enter the number of person", Toast.LENGTH_LONG).show();
                }
                else if(Integer.parseInt(budget.getText().toString()) <= 1600*(Integer.parseInt(no_person.getText().toString())))
                {
                    int i = 1600*(Integer.parseInt(no_person.getText().toString()));
                    Toast.makeText(getContext(), "Please Enter a budget more than "+i+" for "+no_person.getText().toString(), Toast.LENGTH_LONG).show();
                }
                else if(purpose2.toString().equals("Select Purpose Of Holiday"))
                {
                    Toast.makeText(getContext(), "You did not select the purpose of holiday", Toast.LENGTH_LONG).show();
                }
                else if(no_day.getText().toString().matches(""))
                {
                    Toast.makeText(getContext(), "You did not enter the number of day", Toast.LENGTH_LONG).show();
                }
                else if(Integer.parseInt(budget.getText().toString()) <= 1600*(Integer.parseInt(no_day.getText().toString())))
                {
                    int i = 1600*(Integer.parseInt(no_day.getText().toString()));
                    Toast.makeText(getContext(), "Please Enter a budget more than "+i+" for "+no_day.getText().toString(), Toast.LENGTH_LONG).show();
                }
                else if(date.getText().toString().matches(""))
                {
                    Toast.makeText(getContext(), "You did not enter a date", Toast.LENGTH_LONG).show();
                }
                else if(date.getText().toString().length() != 10 || date.getText().toString().charAt(2) != '/' || date.getText().toString().charAt(5) != '/')
                {
                    Toast.makeText(getContext(), "Please fill the correct format date", Toast.LENGTH_LONG).show();
                }
                else if(Integer.parseInt(String.valueOf(date.getText().toString().charAt(0))+String.valueOf(date.getText().toString().charAt(1))) > 31 || Integer.parseInt(String.valueOf(date.getText().toString().charAt(3))+String.valueOf(date.getText().toString().charAt(4))) > 12 || Integer.parseInt(String.valueOf(date.getText().toString().charAt(6))+String.valueOf(date.getText().toString().charAt(7))+String.valueOf(date.getText().toString().charAt(8))+String.valueOf(date.getText().toString().charAt(9))) < 2017)
                {
                    Toast.makeText(getContext(), "Please fill the correct date", Toast.LENGTH_LONG).show();
                }
                else  if(p_journey.getText().toString().matches(""))
                {
                    Toast.makeText(getContext(), "You did not enter a starting place of journey", Toast.LENGTH_LONG).show();
                }
                else {
                    FragmentTransaction transection = getFragmentManager().beginTransaction();
                    transection.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                    PlaceInfo mfragment = new PlaceInfo();
                    Bundle args = new Bundle();
                    args.putString("budget", budget.getText().toString());
                    args.putString("no_person", no_person.getText().toString());
                    args.putString("no_day", no_day.getText().toString());
                    args.putString("date", date.getText().toString());
                    args.putString("p_journey", p_journey.getText().toString());
                    args.putString("purpose", purpose2.toString());
                    mfragment.setArguments(args);
                    transection.replace(R.id.frame, mfragment);
                    transection.commitAllowingStateLoss();
                }


            }
        });
        //}
    }

    private void search () {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        fragmentTransaction.replace(R.id.frame, new PlaceInfo());
        fragmentTransaction.commit();
    }


}//end of class
