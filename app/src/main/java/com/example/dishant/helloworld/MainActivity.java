package com.example.dishant.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: getting started");
        TextView textView = (TextView) findViewById(R.id.textview1);

        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick:  button clicked");
                ToastMessage("Hello World");
            }
        });
    }

    /**
     * prints out the messages of the toast
     * @param message
     */
    private void ToastMessage(String message){
        Toast.makeText(MainActivity.this,message, Toast.LENGTH_SHORT).show();
    }

}
