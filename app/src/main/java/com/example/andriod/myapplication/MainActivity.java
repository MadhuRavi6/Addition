package com.example.andriod.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button mybutton;

    EditText myet1,myet2,myet3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybutton=(Button)findViewById(R.id.b);
        myet1=(EditText)findViewById(R.id.et1);
        myet2=(EditText)findViewById(R.id.et2);
        myet3=(EditText)findViewById(R.id.et3);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  int a=Integer.parseInt(myet1.getText().toString());
                int b=Integer.parseInt(myet2.getText().toString());
                int c=a+b;
                String str=Integer.toString(c);
                myet3.setText(str);

            }


        });

    }
}
