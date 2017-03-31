package com.ynov.android.gluciddiab.Activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ynov.android.gluciddiab.R;

public class MainActivity extends AppCompatActivity {

    Button toRestoPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toRestoPage = (Button) findViewById(R.id.buttonToResto);

        toRestoPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast msg = Toast.makeText(getBaseContext(),"button clicked", Toast.LENGTH_LONG);
                msg.show();

                Context context = MainActivity.this;

                Class destinationActivity = RestoActivity.class;

                Intent startRestoActivityIntent = new Intent(context, destinationActivity);

                startActivity(startRestoActivityIntent);
            }
        });
    }
}
