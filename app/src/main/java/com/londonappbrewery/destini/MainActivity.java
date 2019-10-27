package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int nTButton = 0;
    int nBButton = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView)findViewById(R.id.storyTextView);
        mButtonTop = (Button)findViewById(R.id.buttonTop);
        mButtonBottom = (Button)findViewById(R.id.buttonBottom);

        storyTextView.setText(R.string.T1_Story);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //changing the text view
                nTButton++;
                if(nTButton==1 && nBButton == 0) {
                    storyTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                }



                else if (nTButton == 1 && nBButton == 1) {
                    storyTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                }

                else if (nTButton==2) {
                    storyTextView.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonBottom.setVisibility(View.INVISIBLE);

                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nBButton++;
                //changing the text views
                if (nBButton == 1 && nTButton == 0) {
                    storyTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                }
                else if (nBButton == 2 && nTButton == 0) {
                    storyTextView.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonBottom.setVisibility(View.INVISIBLE);
                }
                else if ((nBButton == 2 || nBButton == 1 ) && nTButton == 1) {
                    storyTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonBottom.setVisibility(View.INVISIBLE);
                }


            }
        });


    }
}
