package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // define varaibles outside of methods
    private Button button_hi;
    private int number = 0;
    private TextView textView_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // links the activity to the xml layout called activity_main file


        //look up the button by its id
        button_hi = findViewById(R.id.button_hello);
        textView_count = findViewById(R.id.button_countUp);
        // add an event listener to listen for the lick

        button_hi.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
               // handle what happens when i click
                sayHello(v);
            }
        });
        // when click happens, do something

    }

    public void sayHello (View view){
        // create a toast with a message saying hello
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        // short => 2 seconds
        // long => longer
        toast.show();

    }

    public void countUp(View view){
        // increment the value and display in the text view
        // set the text of the text view to the number

        number++;

        // when u see an object, you want to make sure its not null before you access!
        if (textView_count!=null){
            textView_count.setText(Integer.toString(number));
        }
    }
}