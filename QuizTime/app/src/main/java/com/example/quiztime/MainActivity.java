package com.example.quiztime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rb11;
    RadioButton rb22;
    RadioButton rb43;
    RadioButton rb34;
    RadioButton rb15;
    CheckBox rb16;
    CheckBox rb26;
    CheckBox rb36;
    CheckBox rb46;
    Button submit;
    static int score=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.submit);
        rb11=findViewById(R.id.rb11);
        rb22=findViewById(R.id.rb22);
        rb43=findViewById(R.id.rb43);
        rb34=findViewById(R.id.rb34);
        rb15=findViewById(R.id.rb15);
        rb16=findViewById(R.id.rb16);
        rb26=findViewById(R.id.rb26);
        rb36=findViewById(R.id.rb36);
        rb46=findViewById(R.id.rb46);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb11.isChecked()){
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
                if (rb43.isChecked()){
                    //if checked score is added
                    score++;
                }
                else{
                    //the other radiobuttons do nothing
                }
                if (rb34.isChecked()){
                    //if checked score is added
                    score++;
                }
                else{
                    //the other radiobuttons do nothing
                }
                if (rb15.isChecked()){
                    //if checked score is added
                    score++;
                }
                else{
                    //the other radiobuttons do nothing
                }
                if (rb16.isChecked()&&rb26.isChecked()&&rb36.isChecked()&&rb46.isChecked()){
                    //if checked score is added
                    score++;
                }
                else{
                    //the other radiobuttons do nothing
                }
                EditText simpleEditText = (EditText) findViewById(R.id.pt1);
                String strValue = simpleEditText.getText().toString();
                if (strValue.compareTo("YES")==0){
                    //if checked score is added
                    score++;
                }
                else{

                }


                Toast.makeText(MainActivity.this, "Your Score is "+ score + "out of 7", Toast.LENGTH_LONG).show();
                score=0;
            }
        });
    }
}
