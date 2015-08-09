package com.teamtreehouse.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {
    private FactBook mFactBook = null;
    private ColorWheel mColorWheel = new ColorWheel();

    private static final String TAG = FunFactsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view variables
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout background = (RelativeLayout)findViewById(R.id.funFactsRelativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFactBook = new FactBook(FunFactsActivity.this.getResources());
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();


                factLabel.setText(fact);
                background.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);

        Log.d(TAG, "Activity created!");
    }
}
