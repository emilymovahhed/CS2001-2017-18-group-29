package com.example.android.theyumdiaries;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

        DatabaseHelper helper = new DatabaseHelper(this);


        Button GoToNewActivity;
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.log_in);

            GoToNewActivity = (Button)findViewById(R.id.Bcreateanaccount);


            GoToNewActivity.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    // Intent code for open new activity through intent.

                    if (v.getId() == R.id.Bcreateanaccount)
                    {
                        Intent intent = new Intent(LogIn.this, SignUp.class);
                        startActivity(intent);
                    }

                    if (v.getId() == R.id.Blogin)
                    {
                        EditText a = (EditText)findViewById(R.id.TFusername);
                        String str = a.getText().toString();

                        EditText b = (EditText)findViewById(R.id.TFpassword);
                        String pass = b.getText().toString();

                        String password = helper.searchPass(str);
                        if(pass.equals(password))
                        {
                            Intent i = new Intent(LogIn.this, HomePage.class);
                            startActivity(i);

                        }
                        else
                        {
                            Toast temp = Toast.makeText(LogIn.this, "Username and password don't match!", Toast.LENGTH_SHORT);
                            temp.show();

                        }




                    }

                        }
                    });
                }


}


