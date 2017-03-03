package com.example.interns.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView);
        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);

        Button button=new Button(this);
        textView.setText("0");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int number=Integer.parseInt(textView.getText().toString());
                number=number+1;

                if(number%10==0)
                    Toast.makeText(MainActivity.this, ""+number, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
