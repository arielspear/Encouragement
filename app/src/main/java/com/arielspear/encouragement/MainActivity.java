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
                String[] quotes = {
                        "You are not a burden.",
                        "You/'re cared about, sometimes people are really tired and don/'t act the same" +
                                " sometimes but they still love & care for you just the same",
                        "Treat yourself with love, care, give yourself compliments, motivate yourself," +
                                " listen to your gut, sleep when you're tired.",
                        "I love that thing you do when you're just you it's super amazing.",
                        "It's okay to change.",
                        "Just take things one step at a time.",
                        "You are worthy of your dreams.",
                        "I love you.",
                        "You can choose to not let meanies get to you & to not care what others" +
                                " think of you or what you say.",
                        "The anxiety is lying to you. You're going to be okay.",
                        "You are capable.",
                        "You are smart.",
                        "You are strong.",
                        "You are enough.",
                        "You are loved.",
                        "Don't be too hard on yourself, remember you're doing your very best & you " +
                                "are only human. Your best is enough, be accepting."

                };
                //randomly select quote
                Random randomGenerator = new Random(quotes.length);
                int randomNumber = randomGenerator.nextInt();
                String quote = quotes[randomNumber];


                //update label with dynamically selected quote
                quoteLabel.setText(quote);
            }
        };

        showQuoteButton.setOnClickListener(listener);
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
