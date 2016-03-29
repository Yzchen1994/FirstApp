package com.myremotecomputerlab.firstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void add(View view){
        int num1 = Integer.parseInt(((EditText)findViewById(R.id.number1)).getText().toString());
        int num2 = Integer.parseInt(((EditText)findViewById(R.id.number2)).getText().toString());
        int result=num1+num2;
        Log.i("Result", Integer.toString(result));
        TextView resultView = (TextView) findViewById(R.id.resultOutput);
        resultView.setText(Integer.toString(result));
    }

    public void sub(View view){
        int num1 = Integer.parseInt(((EditText)findViewById(R.id.number1)).getText().toString());
        int num2 = Integer.parseInt(((EditText)findViewById(R.id.number2)).getText().toString());
        int result=num1-num2;
        Log.i("Result", Integer.toString(result));
        TextView resultView = (TextView) findViewById(R.id.resultOutput);
        resultView.setText(Integer.toString(result));
    }

    public void mul(View view){
        int num1 = Integer.parseInt(((EditText)findViewById(R.id.number1)).getText().toString());
        int num2 = Integer.parseInt(((EditText)findViewById(R.id.number2)).getText().toString());
        int result=num1*num2;
        Log.i("Result", Integer.toString(result));
        TextView resultView = (TextView) findViewById(R.id.resultOutput);
        resultView.setText(Integer.toString(result));
    }

    public void div(View view){
        double num1 = Integer.parseInt(((EditText)findViewById(R.id.number1)).getText().toString());
        double num2 = Integer.parseInt(((EditText)findViewById(R.id.number2)).getText().toString());
        if(num2!=0){
            double result=num1/num2;
            Log.i("Result", Double.toString(result));
            TextView resultView = (TextView) findViewById(R.id.resultOutput);
            resultView.setText(Double.toString(result));
        }else{
            Log.i("Error:", "num2 is zero");
            TextView resultView=(TextView) findViewById(R.id.resultOutput);
            resultView.setText("Error: num2 is zero.");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
