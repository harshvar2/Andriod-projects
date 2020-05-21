package com.example.application.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     static int score=0;
    Button submit;
    RadioButton rb12;
    RadioButton rb22;
    RadioButton rb33;
    RadioButton rb42;
    CheckBox ck1;
    CheckBox ck2;
    CheckBox ck3;
    CheckBox ck4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.submit);
        rb12=findViewById(R.id.rb12);
        rb22=findViewById(R.id.rb22);
        rb33=findViewById(R.id.rb33);
        rb42=findViewById(R.id.rb42);
        ck1=findViewById(R.id.ck1);
        ck2=findViewById(R.id.ck2);
        ck3=findViewById(R.id.ck3);
        ck4=findViewById(R.id.ck4);

        submit.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                if (rb12.isChecked()){
                    //if checked score is added
                    score++;
                }
                else{
                    //the other radiobuttons do nothing
                }
                if (rb22.isChecked()){
                    //if checked score is added
                    score++;
                }
                else{
                    //the other radiobuttons do nothing
                }
                if (rb33.isChecked()){
                    //if checked score is added
                    score++;
                }
                else{
                    //the other radiobuttons do nothing
                }
                if (rb42.isChecked()){
                    //if checked score is added
                    score++;
                }
                else{
                    //the other radiobuttons do nothing
                }


                if (!ck4.isChecked()&&ck1.isChecked()&&ck2.isChecked()&&ck3.isChecked()){
                    //if checked score is added
                    score++;
                }
                else{
                    //the other radiobuttons do nothing
                }
                EditText simpleEditText = (EditText) findViewById(R.id.pt1);
                String strValue = simpleEditText.getText().toString();
                if (strValue.compareTo("yes")==0){
                    //if checked score is added
                    score++;
                }
                else{

                }

                Toast.makeText(MainActivity.this, "Your Score is "+ score + "out of 6", Toast.LENGTH_LONG).show();
                score=0;

            }
        });

    }


}

