package mans.abdullah.abdullah_mansour.basketball3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    // create objects from view classes
    private TextView scoreA,scoreB;
    private Button A3,A2,A1,B3,B2,B1,reset;
    // create two variables
    private int A,B;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // attach each object with his view
        scoreA = (TextView) findViewById(R.id.scoreA);
        scoreB = (TextView) findViewById(R.id.scoreB);
        A3 = (Button) findViewById(R.id.plus3A_btn);
        A2 = (Button) findViewById(R.id.plus2A_btn);
        A1 = (Button) findViewById(R.id.plus1A_btn);
        B3 = (Button) findViewById(R.id.plus3B_btn);
        B2 = (Button) findViewById(R.id.plus2B_btn);
        B1 = (Button) findViewById(R.id.plus1B_btn);
        reset = (Button) findViewById(R.id.reset_btn);

        // start app with 0 score
        A = 0;
        B = 0;

        // start app with 0 score at each text view
        scoreA.setText(A + "");
        scoreB.setText(B + "");

        // button A3 to add 3
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // update int A by 3
                A = A + 3;
                // set scoreA to int A
                scoreA.setText(String.valueOf(A));
            }
        });

        // button A2 to add 2
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // update int A by 2
                A = A + 2;
                // set scoreA to int A
                scoreA.setText(String.valueOf(A));
            }
        });

        // button A1 to add 1
        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // update int A by 1
                A = A + 1;
                // set scoreA to int A
                scoreA.setText(Integer.toString(A));
            }
        });
    }
}
