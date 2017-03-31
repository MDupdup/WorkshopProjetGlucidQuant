package com.ynov.android.gluciddiab.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ynov.android.gluciddiab.R;

/**
 * Created by Malo on 31/03/2017.
 */

public class RestoActivity extends AppCompatActivity {


    TextView restoTitle;

    Button restoChoiceKFC;
    Button restoChoiceMcDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto);

        restoTitle = (TextView) findViewById(R.id.textRestoTitle);

        restoChoiceKFC = (Button) findViewById(R.id.buttonRestoChoiceKFC);
        restoChoiceMcDo = (Button) findViewById(R.id.buttonRestoChoiceMcDo);

        restoChoiceKFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast msgKFC = Toast.makeText(getBaseContext(), "go vers KFC", Toast.LENGTH_LONG);
                msgKFC.show();
            }
        });

        restoChoiceMcDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast msgMcDo = Toast.makeText(getBaseContext(), "go vers MacDonald's", Toast.LENGTH_LONG);
                msgMcDo.show();
            }
        });
    }
}
