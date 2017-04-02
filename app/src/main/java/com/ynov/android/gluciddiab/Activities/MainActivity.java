package com.ynov.android.gluciddiab.Activities;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.ynov.android.gluciddiab.R;
import com.ynov.android.gluciddiab.bddUtils.FastFoodListDb;
import com.ynov.android.gluciddiab.bddUtils.FastFoodListDbHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Button toRestoPage;

    Spinner dropdown;

    String[] liste = {
            "élément 1",
            "élement 2",
            "élément 3"
    };

    SQLiteDatabase myDb;



    /*public ArrayList<String> getCategories(int id) {
        ArrayList<String> categoriesNames = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = null;
        try {
            String query = "SELECT categorie FROM kfcdata";
            Cursor cursor = sqLiteDatabase.rawQuery(query, null);
            while (cursor.moveToNext()){
                categoriesNames.add(cursor.getString(cursor.getColumnIndex("categorie")));
            }
        } catch (Exception e) {
            //Log.e(TAG, "Erreur lors de la récupération des noms de catégories" + e.toString());
        }
        return categoriesNames;
    }*/





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toRestoPage = (Button) findViewById(R.id.buttonToResto);

        FastFoodListDbHelper dbHelper = new FastFoodListDbHelper(this);

        myDb = dbHelper.getReadableDatabase();

        Cursor crs = myDb.rawQuery("SELECT categorie FROM kfcdata", null);

        crs.moveToFirst();

        String[] categoryList = new String[crs.getCount()];

        int i = 0;
        while(crs.moveToNext()) {
            String line = crs.getString(crs.getColumnIndex("categorie"));
            categoryList[i] = line;
            i++;
        }


        dropdown = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, liste);
        dropdown.setAdapter(adapter);




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

    /*private Cursor getCategory() {
        return myDb.query(
                FastFoodListDb.KFCListEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                FastFoodListDb.KFCListEntry.COLUMN_TIMESTAMP
        );
    }*/



}
