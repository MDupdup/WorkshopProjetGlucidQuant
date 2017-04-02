package com.ynov.android.gluciddiab.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.ynov.android.gluciddiab.R;

/**
 * Created by Malo on 31/03/2017.
 */

public class RestoActivity extends AppCompatActivity {


    TextView restoTitle;

    Button breakFast;
    Button lunch;
    Button snack;
    Button meal;

    Button restoChoiceKFC;
    Button restoChoiceMcDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto);

        restoTitle = (TextView) findViewById(R.id.textRestoTitle);

        restoChoiceKFC = (Button) findViewById(R.id.buttonRestoChoiceKFC);
        restoChoiceMcDo = (Button) findViewById(R.id.buttonRestoChoiceMcDo);

        breakFast = (Button) findViewById(R.id.buttonBreakFast);
        lunch = (Button) findViewById(R.id.buttonLunch);
        snack = (Button) findViewById(R.id.buttonSnack);
        meal = (Button) findViewById(R.id.buttonMeal);

        breakFast.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                breakFast.setPressed(true);
                lunch.setPressed(false);
                snack.setPressed(false);
                meal.setPressed(false);
                return true;
            }
        });

        lunch.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                breakFast.setPressed(false);
                lunch.setPressed(true);
                snack.setPressed(false);
                meal.setPressed(false);
                return true;
            }
        });

        snack.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                breakFast.setPressed(false);
                lunch.setPressed(false);
                snack.setPressed(true);
                meal.setPressed(false);
                return true;
            }
        });

        meal.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                breakFast.setPressed(false);
                lunch.setPressed(false);
                snack.setPressed(false);
                meal.setPressed(true);
                return true;
            }
        });

        restoChoiceKFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast msgKFC = Toast.makeText(getBaseContext(), "go vers KFC", Toast.LENGTH_LONG);
                msgKFC.show();

                Intent startKFCActivityIntent = new Intent(RestoActivity.this, KFCActivity.class);

                startActivity(startKFCActivityIntent);



            }
        });

        restoChoiceMcDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast msgMcDo = Toast.makeText(getBaseContext(), "go vers MacDonald's", Toast.LENGTH_LONG);
                msgMcDo.show();

                Intent startMcDoActivityIntent = new Intent(RestoActivity.this, McDoActivity.class);

                startActivity(startMcDoActivityIntent);
            }
        });
    }
}
