package com.ajibadedah.jokedisplaylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "main_joke";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        String joke = getIntent().getStringExtra(JOKE_KEY);
        TextView jokeText = (TextView) findViewById(R.id.joke_text);
        if (joke != null && joke.length() != 0) {
            jokeText.setText(joke);
        }
    }
}
