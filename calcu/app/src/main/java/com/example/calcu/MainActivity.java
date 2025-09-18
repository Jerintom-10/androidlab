package com.example.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText result;
    Button add,sub,mul,div,one,two,three,four,five,six,seven,eight,nine,zero,equal,cancel;
    float temp1,temp2;
    String op="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(EditText)findViewById(R.id.etresult);
        add=(Button) findViewById(R.id.btplus);
        sub=(Button) findViewById(R.id.btminus);
        mul=(Button) findViewById(R.id.btmult);
        div=(Button) findViewById(R.id.btdiv);
        one=(Button) findViewById(R.id.btone);
        two=(Button) findViewById(R.id.bttwo);
        three=(Button) findViewById(R.id.btthree);
        four=(Button) findViewById(R.id.btfour);
        five=(Button) findViewById(R.id.btfive);
        six=(Button) findViewById(R.id.btsix);
        seven=(Button) findViewById(R.id.btseven);
        eight=(Button) findViewById(R.id.bteight);
        nine=(Button) findViewById(R.id.btnine);
        zero=(Button) findViewById(R.id.btzero) ;
        equal=(Button) findViewById(R.id.btequal);
        cancel=(Button) findViewById(R.id.btcancel);


        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        equal.setOnClickListener(this);
        cancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Button b=(Button) v;
        if(v==cancel)
        {
            result.setText("");
        }
        else if(v==add || v==sub || v==mul || v==div)
        {
            temp1=Float.parseFloat(result.getText().toString());
            op=b.getText().toString();
            result.setText("");
        }

        else if(v==equal)
        {
            temp2=Float.parseFloat(result.getText().toString());
            if(op.equals("+"))
                result.setText(temp1+temp2+"");
            else if(op.equals("-"))
                result.setText(temp1-temp2+"");
            else if(op.equals("*"))
                result.setText(temp1*temp2+"");
            else if(op.equals("/"))
                result.setText(temp1/temp2+"");
        }
        else
        {
            String s=result.getText().toString();
            result.setText(s+b.getText().toString());
        }
    }
}