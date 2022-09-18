package org.techtown.user;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {
    private RadioGroup radioGroup1,radioGroup2,radioGroup3,radioGroup4,radioGroup5,radioGroup6,
            radioGroup7,radioGroup8,radioGroup9,radioGroup10,radioGroup11,radioGroup12, radioGroup13,
            radioGroup14,radioGroup15,radioGroup16,radioGroup17,radioGroup18, radioGroup19,radioGroup20;

    int sum=0;
    Button resBtn;

    //라디오 그룹 클릭 리스너
    RadioGroup.OnCheckedChangeListener radioGroupButtonChangeListener = new RadioGroup.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
            // 라디오 그룹의 체크된 아이디가 뭔지를 확인 후 해당 변수 값 증가
            //Toast.makeText(SearchActivity.this, "눌렸습니다.", Toast.LENGTH_LONG).show();

            //Toast.makeText(SearchActivity.this, "점수는 " + sum + "점입니다.", Toast.LENGTH_LONG).show();

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        resBtn=findViewById(R.id.resBtn);

        //라디오 그룹 설정
        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup1.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup2.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
        radioGroup3.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup4 = (RadioGroup) findViewById(R.id.radioGroup4);
        radioGroup4.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup5 = (RadioGroup) findViewById(R.id.radioGroup5);
        radioGroup5.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup6 = (RadioGroup) findViewById(R.id.radioGroup6);
        radioGroup6.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup7 = (RadioGroup) findViewById(R.id.radioGroup7);
        radioGroup7.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup8 = (RadioGroup) findViewById(R.id.radioGroup8);
        radioGroup8.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup9 = (RadioGroup) findViewById(R.id.radioGroup9);
        radioGroup9.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup10 = (RadioGroup) findViewById(R.id.radioGroup10);
        radioGroup10.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup11 = (RadioGroup) findViewById(R.id.radioGroup11);
        radioGroup11.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup12 = (RadioGroup) findViewById(R.id.radioGroup12);
        radioGroup12.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup13 = (RadioGroup) findViewById(R.id.radioGroup13);
        radioGroup13.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup14 = (RadioGroup) findViewById(R.id.radioGroup14);
        radioGroup14.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup15 = (RadioGroup) findViewById(R.id.radioGroup15);
        radioGroup15.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup16 = (RadioGroup) findViewById(R.id.radioGroup16);
        radioGroup16.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup17 = (RadioGroup) findViewById(R.id.radioGroup17);
        radioGroup17.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup18 = (RadioGroup) findViewById(R.id.radioGroup18);
        radioGroup18.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup19 = (RadioGroup) findViewById(R.id.radioGroup19);
        radioGroup19.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup20 = (RadioGroup) findViewById(R.id.radioGroup20);
        radioGroup20.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        resBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(radioGroup1.getCheckedRadioButtonId() ==R.id.q1Btn1) {sum+=0;}
                else if(radioGroup1.getCheckedRadioButtonId() == R.id.q1Btn2){sum+=1;}
                else if(radioGroup1.getCheckedRadioButtonId() == R.id.q1Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup2.getCheckedRadioButtonId() ==R.id.q2Btn1) {sum+=0;}
                else if(radioGroup2.getCheckedRadioButtonId() == R.id.q2Btn2){sum+=1;}
                else if(radioGroup2.getCheckedRadioButtonId() == R.id.q2Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup3.getCheckedRadioButtonId() ==R.id.q3Btn1) {sum+=0;}
                else if(radioGroup3.getCheckedRadioButtonId() == R.id.q3Btn2){sum+=1;}
                else if(radioGroup3.getCheckedRadioButtonId() == R.id.q3Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup4.getCheckedRadioButtonId() ==R.id.q4Btn1) {sum+=0;}
                else if(radioGroup4.getCheckedRadioButtonId() == R.id.q4Btn2){sum+=1;}
                else if(radioGroup4.getCheckedRadioButtonId() == R.id.q4Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup5.getCheckedRadioButtonId() ==R.id.q5Btn1) {sum+=0;}
                else if(radioGroup5.getCheckedRadioButtonId() == R.id.q5Btn2){sum+=1;}
                else if(radioGroup5.getCheckedRadioButtonId() == R.id.q5Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup6.getCheckedRadioButtonId() ==R.id.q6Btn1) {sum+=0;}
                else if(radioGroup6.getCheckedRadioButtonId() == R.id.q6Btn2){sum+=1;}
                else if(radioGroup6.getCheckedRadioButtonId() == R.id.q6Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup7.getCheckedRadioButtonId() == R.id.q7Btn1) {sum+=0;}
                else if(radioGroup7.getCheckedRadioButtonId() == R.id.q7Btn2){sum+=1;}
                else if(radioGroup7.getCheckedRadioButtonId() == R.id.q7Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup8.getCheckedRadioButtonId() ==R.id.q8Btn1) {sum+=0;}
                else if(radioGroup8.getCheckedRadioButtonId() == R.id.q8Btn2){sum+=1;}
                else if(radioGroup8.getCheckedRadioButtonId() == R.id.q8Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup9.getCheckedRadioButtonId() ==R.id.q9Btn1) {sum+=0;}
                else if(radioGroup9.getCheckedRadioButtonId() == R.id.q9Btn2){sum+=1;}
                else if(radioGroup9.getCheckedRadioButtonId() == R.id.q9Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup10.getCheckedRadioButtonId() ==R.id.q10Btn1) {sum+=0;}
                else if(radioGroup10.getCheckedRadioButtonId() == R.id.q10Btn2){sum+=1;}
                else if(radioGroup10.getCheckedRadioButtonId() == R.id.q10Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup11.getCheckedRadioButtonId() ==R.id.q11Btn1) {sum+=0;}
                else if(radioGroup11.getCheckedRadioButtonId() == R.id.q11Btn2){sum+=1;}
                else if(radioGroup11.getCheckedRadioButtonId() == R.id.q11Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup12.getCheckedRadioButtonId() ==R.id.q12Btn1) {sum+=0;}
                else if(radioGroup12.getCheckedRadioButtonId() == R.id.q12Btn2){sum+=1;}
                else if(radioGroup12.getCheckedRadioButtonId() == R.id.q12Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup13.getCheckedRadioButtonId() ==R.id.q13Btn1) {sum+=0;}
                else if(radioGroup13.getCheckedRadioButtonId() == R.id.q13Btn2){sum+=1;}
                else if(radioGroup13.getCheckedRadioButtonId() == R.id.q13Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup14.getCheckedRadioButtonId() ==R.id.q14Btn1) {sum+=0;}
                else if(radioGroup14.getCheckedRadioButtonId() == R.id.q14Btn2){sum+=1;}
                else if(radioGroup14.getCheckedRadioButtonId() == R.id.q14Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup15.getCheckedRadioButtonId() ==R.id.q15Btn1) {sum+=0;}
                else if(radioGroup15.getCheckedRadioButtonId() == R.id.q15Btn2){sum+=1;}
                else if(radioGroup15.getCheckedRadioButtonId() == R.id.q15Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup16.getCheckedRadioButtonId() ==R.id.q16Btn1) {sum+=0;}
                else if(radioGroup16.getCheckedRadioButtonId() == R.id.q16Btn2){sum+=1;}
                else if(radioGroup16.getCheckedRadioButtonId() == R.id.q16Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup17.getCheckedRadioButtonId() ==R.id.q17Btn1) {sum+=0;}
                else if(radioGroup17.getCheckedRadioButtonId() == R.id.q17Btn2){sum+=1;}
                else if(radioGroup17.getCheckedRadioButtonId() == R.id.q17Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup18.getCheckedRadioButtonId() ==R.id.q18Btn1) {sum+=0;}
                else if(radioGroup18.getCheckedRadioButtonId() == R.id.q18Btn2){sum+=1;}
                else if(radioGroup18.getCheckedRadioButtonId() == R.id.q18Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup19.getCheckedRadioButtonId() ==R.id.q19Btn1) {sum+=0;}
                else if(radioGroup19.getCheckedRadioButtonId() == R.id.q19Btn2){sum+=1;}
                else if(radioGroup19.getCheckedRadioButtonId() == R.id.q19Btn3){sum+=2;}
                else {sum+=3;}

                if(radioGroup20.getCheckedRadioButtonId() ==R.id.q20Btn1) {sum+=0;}
                else if(radioGroup20.getCheckedRadioButtonId() == R.id.q20Btn2){sum+=1;}
                else if(radioGroup20.getCheckedRadioButtonId() == R.id.q20Btn3){sum+=2;}
                else {sum+=3;}

                Toast.makeText(SearchActivity.this, "최종 sum : "+sum + "점", Toast.LENGTH_SHORT).show();

                // 0 ~ 15 점 : 편안한 상태
                // 16 ~ 24 점 : 가벼운 우울감
                // 25 점 이상 : 다양한 우울증상으로 일상생활에 영향을 주고 있는 상태

                /*Intent intent = new Intent(SearchActivity.this, MenuActivity.class);
                intent.putExtra("sum", sum);
                startActivity(intent);

                finish();*/

            }

        });


    }


    //라디오 버튼 클릭 리스너
    RadioButton.OnClickListener radioButtonClickListener = new RadioButton.OnClickListener(){
        @Override
        public void onClick(View view) {
            //ㅏToast.makeText(SearchActivity.this, "눌렸습니다.", Toast.LENGTH_LONG).show();

        }
    };
}
