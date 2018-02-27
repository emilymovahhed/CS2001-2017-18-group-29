package com.example.android.theyumdiaries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SignUp extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
    }

    public void onSignupClick(View v)
    {
            if (v.getId() == R.id.buttonSignup)
            {
                EditText firstname = (EditText) findViewById (R.id.ptFName);
                EditText surname = (EditText) findViewById (R.id.ptSurname);
                EditText email = (EditText) findViewById (R.id.ptEmail);
                EditText password = (EditText) findViewById (R.id.signupPassword);
                EditText confirmpassword = (EditText) findViewById (R.id.signupConfirmPW);

                String firstnamestr = firstname.getText().toString();
                String surnamestr = surname.getText().toString();
                String emailstr = email.getText().toString();
                String passwordstr = password.getText().toString();
                String confirmpasswordstr = confirmpassword.getText().toString();

                if (!passwordstr.equals(confirmpasswordstr))
                {
                    //pop up message
                    Toast pass = Toast.makeText(SignUp.this, "Passwords don't match!", Toast.LENGTH_SHORT);
                    pass.show();
                }
                else
                {
                    //insert in database
                    Contact c = new Contact();
                    c.setfName(firstnamestr);
                    c.setsName(surnamestr);
                    c.setEmail(emailstr);
                    c.setPass(passwordstr);

                    helper.insertContact(c);


                }








            }
    }
}
