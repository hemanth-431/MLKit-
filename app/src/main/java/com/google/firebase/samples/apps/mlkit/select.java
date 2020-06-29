package com.google.firebase.samples.apps.mlkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class select extends AppCompatActivity {
RadioGroup radioGroup;
RadioButton radioButton;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
radioGroup=findViewById(R.id.good);
textView=findViewById(R.id.text);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1="FACE_DETECTION";

          try {

                  s1 = radioButton.getText().toString();
              textView.setText(s1);
          }catch (Exception e){

          }

                Intent i=new Intent(select.this,LivePreviewActivity.class);
                       i.putExtra("message", s1);
                startActivity(i);

            }
        });

    }
    public void checkButton(View v){
        int radioId=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(radioId);

    }
}
