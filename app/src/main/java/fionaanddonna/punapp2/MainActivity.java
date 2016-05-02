package fionaanddonna.punapp2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] PunsArray = new String[]{"How many tickles does it take for a squid to laugh? Ten tickles",
            "Which president was least guilty Lincoln. He was in a cent.",
            "A photon checks into a hotel and is asked if he needs help with luggage. No, i’m traveling light.”",
            "What do you call an alligator in a vest? An investigator.", "What do you call a thieving alligator? A crookodile. ",
            "What do you call a cow with no legs? Ground beef.", "What do you call a pig that does karate? A pork chop."};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button puns = (Button) findViewById(R.id.button);
        puns.setOnClickListener(new ButtonListener());
    }


    private class ButtonListener implements View.OnClickListener
    {
        public void onClick(View v)
        {
            TextView textView2 = (TextView) findViewById(R.id.textView2);
            Random random = new Random();
            int index = random.nextInt(PunsArray.length);

            textView2.setText(PunsArray[index]);

            //System.out.println(PunsArray[index]);
        }
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
