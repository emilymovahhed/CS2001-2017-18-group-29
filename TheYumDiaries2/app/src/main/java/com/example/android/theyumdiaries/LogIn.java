package com.example.android.theyumdiaries;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class LogIn extends AppCompatActivity {



        Button GoToNewActivity;
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.log_in);

            GoToNewActivity = (Button)findViewById(R.id.button1);

            GoToNewActivity.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    // Intent code for open new activity through intent.

                    Intent intent = new Intent(LogIn.this, SignUp.class);
                    startActivity(intent);

                }
            });
        }
            }


