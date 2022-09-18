package org.techtown.user;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StsActivity extends AppCompatActivity {
    private RadioGroup sradioGroup1, sradioGroup2, sradioGroup3;
    private EditText improvement;
    private Button sresBtn;

    int sum=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sts);

        sresBtn=findViewById(R.id.sresBtn);

        sradioGroup1 = (RadioGroup) findViewById(R.id.sradioGroup1);
        sradioGroup2 = (RadioGroup) findViewById(R.id.sradioGroup2);
        sradioGroup3 = (RadioGroup) findViewById(R.id.sradioGroup3);

        improvement = findViewById(R.id.improvement);

        sresBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(sradioGroup1.getCheckedRadioButtonId() ==R.id.s1Btn1) {sum+=0;}
                else if(sradioGroup1.getCheckedRadioButtonId() == R.id.s1Btn2){sum+=1;}
                else if(sradioGroup1.getCheckedRadioButtonId() == R.id.s1Btn3){sum+=2;}
                else {sum+=3;}

                if(sradioGroup2.getCheckedRadioButtonId() ==R.id.s2Btn1) {sum+=0;}
                else if(sradioGroup2.getCheckedRadioButtonId() == R.id.s2Btn2){sum+=1;}
                else if(sradioGroup2.getCheckedRadioButtonId() == R.id.s2Btn3){sum+=2;}
                else {sum+=3;}

                if(sradioGroup3.getCheckedRadioButtonId() ==R.id.s3Btn1) {sum+=0;}
                else if(sradioGroup3.getCheckedRadioButtonId() == R.id.s3Btn2){sum+=1;}
                else if(sradioGroup3.getCheckedRadioButtonId() == R.id.s3Btn3){sum+=2;}
                else {sum+=3;}

                //Intent intent = new intent(StsActivity.this, Result)
                Toast.makeText(StsActivity.this, sum + "점, 하고싶은말: "+improvement.getText().toString(),Toast.LENGTH_LONG).show();

            }
        });


    }
}