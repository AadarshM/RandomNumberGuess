package com.aadarsh.randomnumberguess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int r1;
    public void guess(View view){
        EditText num = (EditText) findViewById(R.id.num);
        int r2 = Integer.parseInt(num.getText().toString());
        if (r1<r2){
            Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
        } else if ( r1>r2) {
            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Right! Try again", Toast.LENGTH_SHORT).show();
            Random r = new Random();
            r1 = r.nextInt(20) + 1;
        }
        Log.i("test","Guess clicked");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();
        r1 = r.nextInt(20) + 1;

    }
}
