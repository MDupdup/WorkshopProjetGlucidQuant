package com.ynov.android.gluciddiab.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ynov.android.gluciddiab.R;
import com.ynov.android.gluciddiab.bddUtils.FastFoodListDb;

/**
 * Created by Malo on 01/04/2017.
 */

public class KFCActivity extends AppCompatActivity {

    TextView textKFC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kfc);
    }
}
