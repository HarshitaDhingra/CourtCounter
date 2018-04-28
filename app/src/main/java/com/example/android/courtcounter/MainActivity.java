package com.example.android.courtcounter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)
    }
    int scoreA=0;
    int scoreB=0;
    public void reset(View view)
    {
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
    }
    public void points3A(View view)
    {
        scoreA+=3;
        displayA(scoreA);
    }
    public void points2A(View view)
    {
        scoreA+=2;
        displayA(scoreA);
    }
    public void freeA(View view)
    {
        scoreA+=1;
        displayA(scoreA);
    }
    private void displayA(int s)
    {
        TextView a=(TextView) findViewById(R.id.A0);
        a.setText(String.valueOf(s));
    }
    /*...............................................................................................................*/
    public void points3B(View view)
    {
        scoreB+=3;
        displayB(scoreB);
    }
    public void points2B(View view)
    {
        scoreB+=2;
        displayB(scoreB);
    }
    public void freeB(View view)
    {
        scoreB+=1;
        displayB(scoreB);
    }
    private void displayB(int s)
    {
        TextView a=(TextView) findViewById(R.id.B0);
        a.setText(String.valueOf(s));
    }
}
