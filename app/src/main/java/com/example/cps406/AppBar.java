package com.example.cps406;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;




/*
* The AppCompatActivity class is a part of the Android Support Library and is used as a base class for activities that use the support library action bar feature. The action bar is a common user interface element that provides navigation, menu options, and other features to the user.

The onCreate() method is a lifecycle method of the Activity class that is called when the activity is first created. In this code, the onCreate() method is overridden to perform some initialization tasks for the AppBar activity.

The super.onCreate(savedInstanceState) method call invokes the superclass implementation of the onCreate() method, which performs some important initialization tasks related to the activity lifecycle.

The setContentView(R.layout.activity_app_bar) method call sets the layout for the AppBar activity, which is defined in the activity_app_bar.xml layout file in the res/layout directory. This method call inflates the layout and makes it the content view of the activity.

In summary, this code sets up a new activity with a custom layout file, using the Android Support Library's AppCompatActivity as a base class.
* */

public class AppBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar);
    }
}