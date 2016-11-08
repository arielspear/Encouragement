package com.arielspear.encouragement;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
// android.support.v4.app.NotificationCompat.Builder;


public class MainActivity extends AppCompatActivity {

    private QuoteBook mQuoteBook = new QuoteBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare View variables and assign Views from layout files
        final TextView quoteLabel = (TextView) findViewById(R.id.quoteTextView);
        Button showQuoteButton = (Button) findViewById(R.id.showQuoteButton);

        getCompliment(quoteLabel);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quote = getCompliment(quoteLabel);

                Notification note = new Notification.Builder(getApplicationContext())
                        .setContentTitle("ENCOURAGEMENT")
                        .setContentText(quote)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .build();

                NotificationManager NM = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                NM.notify(0, note);
            }
        };

        showQuoteButton.setOnClickListener(listener);
    }

    private String getCompliment(TextView quoteLabel) {
        String quote = mQuoteBook.getCompliment();
        //update label with dynamically selected quote
        quoteLabel.setText(quote);
        return quote;
    }

}
