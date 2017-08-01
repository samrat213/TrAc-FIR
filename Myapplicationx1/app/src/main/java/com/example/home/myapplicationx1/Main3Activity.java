package com.example.home.myapplicationx1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class Main3Activity extends AppCompatActivity {



    Button next_button;


    RadioGroup rg;
    RadioGroup rg1;
    RadioGroup rg2;
    RadioGroup rg3;
    RadioGroup rg4;
    RadioGroup rg5;

    RadioGroup rg6;
    RadioGroup rg7;
    RadioGroup rg8;
    RadioGroup rg9;
    RadioGroup rg10;
    RadioGroup rg11;
    RadioGroup rg12;
    RadioGroup rg13;
    RadioGroup rg14;
    RadioGroup rg15;
    RadioGroup rg16;




    RadioButton rgb;





    private DatabaseReference mDatabase;


    private EditText mNameField6;
    private EditText mNameField7;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        next_button = (Button)findViewById(R.id.next_button2);





        mNameField6 = (EditText) findViewById(R.id.other_type_of_weather_entry);
        mNameField7 = (EditText) findViewById(R.id.other_type_of_collision_entry);






        mDatabase = FirebaseDatabase.getInstance().getReference();


        rg = (RadioGroup) findViewById(R.id.type_of_area);
        rg1 = (RadioGroup) findViewById(R.id.accident_type);
        rg2 = (RadioGroup) findViewById(R.id.property_damage);
        rg3 = (RadioGroup) findViewById(R.id.type_of_weather);
        rg4 = (RadioGroup) findViewById(R.id.type_of_collision);
        rg5 = (RadioGroup) findViewById(R.id.hit_and_run);

        rg6 = (RadioGroup) findViewById(R.id.road_type);
        rg7 = (RadioGroup) findViewById(R.id.lanes);
        rg8 = (RadioGroup) findViewById(R.id.surface_condition);
        rg9 = (RadioGroup) findViewById(R.id.physical_divider);
        rg10 = (RadioGroup) findViewById(R.id.speed_limit);
        rg11 = (RadioGroup) findViewById(R.id.ongoing_construction);
        rg12 = (RadioGroup) findViewById(R.id.visibility);
        rg13 = (RadioGroup) findViewById(R.id.road_features);
        rg14 = (RadioGroup) findViewById(R.id.road_junction);
        rg15 = (RadioGroup) findViewById(R.id.type_of_traffic_control);
        rg16 = (RadioGroup) findViewById(R.id.pedestrian_involved);





        next_button.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {





                        int selectedId = rg.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        String name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);



                        selectedId = rg1.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);



                        selectedId = rg2.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);



                        selectedId = rg3.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        if(name=="other")
                        {
                            mDatabase.push().setValue(mNameField6.getText().toString().trim());
                        }
                        else {
                            mDatabase.push().setValue(name);
                        }




                        selectedId = rg4.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        if(name=="other")
                        {
                            mDatabase.push().setValue(mNameField7.getText().toString().trim());
                        }
                        else {
                            mDatabase.push().setValue(name);
                        }



                        selectedId = rg5.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);



                        selectedId = rg11.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);



                        selectedId = rg6.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);




                        selectedId = rg7.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);



                        selectedId = rg8.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);



                        selectedId = rg9.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);



                        selectedId = rg10.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);



                        selectedId = rg11.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);



                        selectedId = rg12.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);



                        selectedId = rg13.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);



                        selectedId = rg14.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);



                        selectedId = rg15.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);



                        selectedId = rg16.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        mDatabase.push().setValue(name);




                    }
                }
        );




    }


}

