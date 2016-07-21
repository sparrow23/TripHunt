package com.example.anujsparrow.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button answerYesButton, answerNoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerYesButton = (Button) findViewById(R.id.login_btn);
        answerNoButton =  (Button) findViewById(R.id.close_btn);

    }
    public void click_exit(View view) {
        String response = "ok you are exiting";

        Toast.makeText(this, response, Toast.LENGTH_SHORT).show();
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

    public void click_continue(View view) {
        String response = "ok you are continueing";
        Toast.makeText(this, response, Toast.LENGTH_SHORT).show();

        Intent getNameScreenIntent = new Intent(this, SecondScreen.class);
        startActivity(getNameScreenIntent);
    }//end of onclick function
}
