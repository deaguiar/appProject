package wgmg.wgmgtheapp.theapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView firstTextView = (TextView) findViewById(R.id.textView);
        Button button1 = (Button) findViewById(R.id.COMPOSE);
        Button button2 = (Button) findViewById(R.id.ME);
        Button button3 = (Button) findViewById(R.id.SETTINGS);
        Button button4 = (Button) findViewById(R.id.DISCOVER);
        Button button5 = (Button) findViewById(R.id.SIGN_UP);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //add action to  Compose button

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //add action to  me button

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //add action to settings button

            }
        });


        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //add action to  Discover button

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //add action to  Sign up  button

            }
        });
    }
}
