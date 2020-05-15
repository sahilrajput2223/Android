package com.example.android.pythonquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // to maintain score, we need score variable
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //to check question 1, python developer name, if name match score increased by one
    public void forPythonDevName() {
        RadioButton pythonDeveloperName = findViewById(R.id.guido_developer);
        if(pythonDeveloperName.isChecked()){
            score++;
        }
        else{
            return;
        }
    }

    //to check question 2, python If-Else logic, if true match score increased by one
    private void forPythonIfElse() {
        RadioButton pythonIfElse = findViewById(R.id.ifElseYes);
        if(pythonIfElse.isChecked()){
            score++;
        }
        else{
            return;
        }
    }

    //to check all keyword of python from checklist
    private void checkBoxForQuestion3(){
        CheckBox question_3_check_1 = findViewById(R.id.break_3);
        CheckBox question_3_check_2 = findViewById(R.id.continue_3);
        CheckBox question_3_check_3 = findViewById(R.id.throws_3);
        CheckBox question_3_check_4 = findViewById(R.id.pass_3);

        if((question_3_check_1.isChecked() && question_3_check_2.isChecked() && question_3_check_4.isChecked() && !question_3_check_3.isChecked())){
            score++;
        }
        else{
            return;
        }
    }

    //to match python version with current latest version "3.8.2"
    private void  checkPythonVersion(){
        EditText pythonVersion = findViewById(R.id.python_version);
        String version = pythonVersion.getText().toString();
        if(version.equalsIgnoreCase("3.8.2")){
            score++;
        }
    }

    //To check Score And display in Toast Message
    public void checkScore(View view) {
        forPythonDevName();
        forPythonIfElse();
        checkBoxForQuestion3();
        checkPythonVersion();

        if( score == 4){
            Toast.makeText(this, "Congratulations, Your All Answer Is Right ", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Your Score Is: " + score + "/4", Toast.LENGTH_SHORT).show();
        }

        score = 0;
    }

    public void resetEverything(View view) {
        RadioButton developer_1 = findViewById(R.id.dennis_developer);
        RadioButton developer_2 = findViewById(R.id.guido_developer);
        RadioButton developer_3 = findViewById(R.id.james_developer);
        developer_1.setChecked(false);
        developer_2.setChecked(false);
        developer_3.setChecked(false);
        RadioButton ifElse_1 = findViewById(R.id.ifElseYes);
        RadioButton ifElse_2 = findViewById(R.id.ifElseNo);
        ifElse_1.setChecked(false);
        ifElse_2.setChecked(false);
        CheckBox breakKeyword = findViewById(R.id.break_3);
        CheckBox continueKeyword = findViewById(R.id.continue_3);
        CheckBox throwsKeyword = findViewById(R.id.throws_3);
        CheckBox passKeyword = findViewById(R.id.pass_3);
        breakKeyword.setChecked(false);
        continueKeyword.setChecked(false);
        throwsKeyword.setChecked(false);
        passKeyword.setChecked(false);
        EditText version = findViewById(R.id.python_version);
        version.setText("");
        Toast.makeText(this, "Python Quiz Reset", Toast.LENGTH_SHORT).show();
    }
}
