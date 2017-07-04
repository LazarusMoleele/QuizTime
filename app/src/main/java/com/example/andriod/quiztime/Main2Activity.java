package com.example.andriod.quiztime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    QuestionLibrary lib = new QuestionLibrary();
    private TextView q1,q2,q3,q4,q5;
    private RadioButton a1,a2,a3,a4,a5;
    private RadioGroup rg1,rg2,rg3,rg4,rg5;
    private Button submit;

    private int score=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        q1=(TextView)findViewById(R.id.question1);
        q2=(TextView)findViewById(R.id.question2);
        q3=(TextView)findViewById(R.id.question3);
        q4=(TextView)findViewById(R.id.question4);
        q5=(TextView)findViewById(R.id.question5);

        q1.setText(lib.getmQuestion(0));
        q2.setText(lib.getmQuestion(1));
        q3.setText(lib.getmQuestion(2));
        q4.setText(lib.getmQuestion(3));
        q5.setText(lib.getmQuestion(4));

        a1=(RadioButton)findViewById(R.id.answer1);
        a2=(RadioButton)findViewById(R.id.answer2);
        a3=(RadioButton)findViewById(R.id.answer3);
        a4=(RadioButton)findViewById(R.id.answer4);
        a5=(RadioButton)findViewById(R.id.answer5);

        a1.setText(lib.getmCorrectAnswers(0));
        a2.setText(lib.getmCorrectAnswers(1));
        a3.setText(lib.getmCorrectAnswers(2));
        a4.setText(lib.getmCorrectAnswers(3));
        a5.setText(lib.getmCorrectAnswers(4));

        rg1=(RadioGroup)findViewById(R.id.rg1);
        rg2=(RadioGroup)findViewById(R.id.rg2);
        rg3=(RadioGroup)findViewById(R.id.rg3);
        rg4=(RadioGroup)findViewById(R.id.rg4);
        rg5=(RadioGroup)findViewById(R.id.rg5);
        submit=(Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int key1=rg1.getCheckedRadioButtonId();


                switch (key1)
                {
                    case R.id.answer1:

                        score++;
                        break;

                }

                int key2=rg2.getCheckedRadioButtonId();
                switch (key2){
                    case R.id.answer2:

                        score++;
                    break;
                }
                 int key3=rg3.getCheckedRadioButtonId();
                switch (key3){
                    case  R.id.answer3:

                        score++;
                        break;
                }

                int key4=rg4.getCheckedRadioButtonId();
                switch (key4){
                    case R.id.answer4:

                        score++;
                        break;
                }

                int key5=rg5.getCheckedRadioButtonId();
                switch (key5){
                    case R.id.answer5:

                        score++;
                        break;
                }

                Toast.makeText(Main2Activity.this,"You Scored "+score,Toast.LENGTH_LONG).show();

            }
        });






    }
}
