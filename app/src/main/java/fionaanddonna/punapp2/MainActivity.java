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

    String[] PunsArray = new String[]
            {"How many tickles does it take for a squid to laugh? Ten tickles",
                    "Which president was least guilty Lincoln. He was in a cent.",
                    "A photon checks into a hotel and is asked if he needs help with luggage. No, i’m traveling light.”",
                    "What do you call an alligator in a vest? An investigator.",
                    "What do you call a thieving alligator? A crookodile. ",
                    "What do you call a cow with no legs? Ground beef.", "What do you call a pig that does karate? A pork chop.",
                    "What did the buffalo say to his son when he left for college? Bison.", "Wanna hear a joke about paper? Nevermind, it’s tearable.",
                    "What do you call a fake noodle? An impasta.", "Why couldn’t the bike stand on its own? It’s two tired.",
                    "Why couldn’t the bike stand on its own? It’s two tired.","How do you organize a space party? You planet.",
                    "How do you put a baby alien to sleep? You rocket.","What job did the frog have at the hotel? Bellhop.",
                    "Why did the banana go to the doctor? He wasn’t peeling well.",
                    "What has eyes but cannot see? A potato.",
                    "Two blood cells met and fell in love. Alas, it was all in vein.",
                    "Never trust an atom. They make everything up.",
                    "What happens to light when they break the law? In prism.",
                    "I told a chemistry joke. There was no reaction.",
                    "What kind of bee can’t make up its mind? A may be.",
                    "What did the hamburger name its baby? Patty.",
                    "What do you get from a pampered cow? Spoiled milk.",
                    "What does a volcano do when it wants food? It orders a cratering company.",
                    "Why did the three little pigs fall asleep every time grandpa told a story? Because grandpa was a boar.",
                    "What do you call a fish with no eye? A fsh",
                    "What’s a pirate’s favorite subject? Arrrrrt.",
                    "What do you call a sad strawberry? A blueberry.",
                    "Why wasn’t the teddy bear hungry? Because he was stuffed.",
                    "What do you call a dog owned by dracula? A bloodhound. ",
                    "What do you call an owl that does magic tricks? Hoodini.",
                    "What do you call a bear with no teeth? A gummy bear.",
                    "I read my friend a list of ten puns to make her laugh. Not one pun in ten did.",
                    "Bird puns just fly over my head.",
                    "A friend of mine tried to annoy me with bird puns, but i soon realized that toucan play at that game.",
                    "What kind of bird sticks to a sweater? A vel-crow.",
                    "What does a noesy pepper do? Gets jalapeno business. ",
                    "What do you call a snobbish criminal going down the stairs? A condescending con descending. ",
                    "What kind of shorts do clouds wear? Thunderwear.",
                    "Becoming a vegetarian is a big missed steak.",
                    "What do you call a lazy kangaroo? A pouch potato.",
                    "What do you get when dinosaurs crash their cars?  T-Rex.",
                    "What do you call an everyday potato? A commentator.",
                    "I hate insect puns. They really bug me.",
                    "What do you call a pile of cats? A meowtain. ",
                    "Yesterday a book fell on my head. I only have my shelf to blame.",
                    "What do you call a dinosaur with an extensive vocabulary? A thesaurus.",
                    "Why are frogs so happy? They eat whatever bugs them.",
                    "What did one ocean say to the other? Nothing, they just waved. Sea what I did there? I’m shore you did."
            };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
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
