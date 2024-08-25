package com.ismailmesutmujde.oopproject;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        User myUser = new User();
        myUser.name = "Mesut";
        myUser.job = "Student";

        User newUser = new User();
        newUser.name = "Kirk";
        newUser.job = "Musician";*/

        User myUser = new User("Mesut", "Student");
        System.out.println(myUser.name);

    }
}