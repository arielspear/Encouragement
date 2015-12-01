package com.arielspear.encouragement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private QuoteBook mQuoteBook = new QuoteBook();

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
                String quote = mQuoteBook.getCompliment();
                //update label with dynamically selected quote
                quoteLabel.setText(quote);
            }
        };

        showQuoteButton.setOnClickListener(listener);
    }

}
