package com.example.home.myapplicationx1;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class Main2Activity extends AppCompatActivity {



    Button next_button,gps_button,save_button;







    private DatabaseReference mDatabase;

    private EditText mNameField;
    private EditText mNameField1;
    private EditText mNameField2;
    private EditText mNameField3;
    private EditText mNameField4;
    private EditText mNameField5;


    private EditText mNameField8;
    private EditText mNameField9;
    private EditText mNameField10;
    private EditText mNameField11;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        next_button = (Button)findViewById(R.id.next_button2);
        gps_button = (Button)findViewById(R.id.get_location);
        save_button = (Button)findViewById(R.id.save_button);





        mNameField = (EditText) findViewById(R.id.fir_entry);

        mNameField1 = (EditText) findViewById(R.id.time_entry);
        mNameField2 = (EditText) findViewById(R.id.police_station_entry);
        mNameField3 = (EditText) findViewById(R.id.no_of_non_motor_vehicles);
        mNameField4 = (EditText) findViewById(R.id.no_of_motor_vehicles);
        mNameField5 = (EditText) findViewById(R.id.no_of_pedestrians);



        mNameField8 = (EditText) findViewById(R.id.road_name_entry);
        mNameField9 = (EditText) findViewById(R.id.road_no_entry);
        mNameField10 = (EditText) findViewById(R.id.landmark_entry);
        mNameField11 = (EditText) findViewById(R.id.road_chainage_entry);



        mDatabase = FirebaseDatabase.getInstance().getReference();







        save_button.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {

                        if(TextUtils.isEmpty(mNameField.getText().toString().trim()))
                        mDatabase.push().setValue(mNameField.getText().toString().trim());
                        else mDatabase.push().setValue("NONE");

                        if(TextUtils.isEmpty(mNameField1.getText().toString().trim()))
                            mDatabase.push().setValue(mNameField1.getText().toString().trim());
                        else mDatabase.push().setValue("NONE");

                        if(TextUtils.isEmpty(mNameField2.getText().toString().trim()))
                            mDatabase.push().setValue(mNameField2.getText().toString().trim());
                        else mDatabase.push().setValue("NONE");

                        if(TextUtils.isEmpty(mNameField3.getText().toString().trim()))
                            mDatabase.push().setValue(mNameField3.getText().toString().trim());
                        else mDatabase.push().setValue("NONE");

                        if(TextUtils.isEmpty(mNameField4.getText().toString().trim()))
                            mDatabase.push().setValue(mNameField4.getText().toString().trim());
                        else mDatabase.push().setValue("NONE");

                        if(TextUtils.isEmpty(mNameField5.getText().toString().trim()))
                            mDatabase.push().setValue(mNameField5.getText().toString().trim());
                        else mDatabase.push().setValue("NONE");


                        if(TextUtils.isEmpty(mNameField8.getText().toString().trim()))
                            mDatabase.push().setValue(mNameField8.getText().toString().trim());
                        else mDatabase.push().setValue("NONE");


                        if(TextUtils.isEmpty(mNameField9.getText().toString().trim()))
                            mDatabase.push().setValue(mNameField9.getText().toString().trim());
                        else mDatabase.push().setValue("NONE");


                        if(TextUtils.isEmpty(mNameField10.getText().toString().trim()))
                            mDatabase.push().setValue(mNameField10.getText().toString().trim());
                        else mDatabase.push().setValue("NONE");

                        if(TextUtils.isEmpty(mNameField11.getText().toString().trim()))
                            mDatabase.push().setValue(mNameField11.getText().toString().trim());
                        else mDatabase.push().setValue("NONE");















                    }
                }
        );

            next_button.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(getApplicationContext(), Main3Activity.class));



                    }
                }
        );







    }


}

