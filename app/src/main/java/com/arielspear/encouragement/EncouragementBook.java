package com.arielspear.encouragement;

import java.util.Random;

/**
 * Created by Ariel on 12/1/15.
 */
public class EncouragementBook {

    public String getCompliment(){


        String[] quotes = {
                "You are not a burden.",
                "You're cared about, sometimes people are really tired and don't act the same" +
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
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(quotes.length);
        String quote = quotes[randomNumber];

        return quote;
    }
}
