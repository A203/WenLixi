package com.xiye.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private EditText editText1;
    private EditText editText2;
    Integer integer[] = new  Integer[3];
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button)findViewById(R.id.btn1);
        textView = (TextView)findViewById(R.id.textview);
        editText1=(EditText)findViewById(R.id.num1);
        editText2=(EditText)findViewById(R.id.num2);
        Button btn2=(Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                integer[0] = new Integer(editText1.getText().toString());
                double x = integer[0];
                integer[1] = new Integer(editText2.getText().toString());
                double y=integer[1];
                textView.setText(x-y+"");
            }
        });
        Button btn3=(Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                integer[0] = new Integer(editText1.getText().toString());
                double x = integer[0];
                integer[1] = new Integer(editText2.getText().toString());
                double y=integer[1];
                textView.setText(x*y+"");
            }
        });
        Button btn4=(Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                integer[0] = new Integer(editText1.getText().toString());
                double x = integer[0];
                integer[1] = new Integer(editText2.getText().toString());
                double y=integer[1];
                textView.setText(x/y+"");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                integer[0] = new Integer(editText1.getText().toString());
                double x = integer[0];
                integer[1] = new Integer(editText2.getText().toString());
                double y=integer[1];
                textView.setText(x+y+"");
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
