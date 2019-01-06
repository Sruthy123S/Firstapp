package com.venus.sruthy.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5;
Button b1,b2;
String getName,getAdm,getClg,getEmail,getMob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.nme);
        ed2=(EditText)findViewById(R.id.an);
        ed3=(EditText)findViewById(R.id.clg);
        ed4=(EditText)findViewById(R.id.eid);
        ed5=(EditText)findViewById(R.id.mobn);
        b1=(Button)findViewById(R.id.sb);
       b2=(Button)findViewById(R.id.ne);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Testing successful",Toast.LENGTH_LONG).show();
                getName=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),getName,Toast.LENGTH_LONG ).show();
                getAdm=ed2.getText().toString();
                getClg=ed3.getText().toString();
                getEmail=ed4.getText().toString();
                getMob=ed5.getText().toString();
                Toast.makeText(getApplicationContext(),getAdm,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getClg,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getEmail,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getMob,Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),WelcomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
