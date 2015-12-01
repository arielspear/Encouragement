package com.arielspear.encouragement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare View variables and assign Views from layout files
        final TextView quoteLabel = (TextView) findViewById(R.id.quoteTextView);
        Button showQuoteButton = (Button) findViewById(R.id.showQuoteButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //update label with dynamically selected quote
                quoteLabel.setText("");
            }
        };

        showQuoteButton.setOnClickListener(listener);
    }
    
}
