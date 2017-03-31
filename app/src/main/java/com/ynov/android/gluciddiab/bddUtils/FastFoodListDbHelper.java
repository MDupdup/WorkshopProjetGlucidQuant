package com.ynov.android.gluciddiab.bddUtils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Malo on 30/03/2017.
 */

public class FastFoodListDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "fastfood.db";

    private static final int DATABASE_VERSION = 1;

    public FastFoodListDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String SQL_CREATE_KFCLIST_TABLE = "CREATE TABLE " +
                FastFoodListDb.KFCListEntry.TABLE_NAME + " (" +
                FastFoodListDb.KFCListEntry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                FastFoodListDb.KFCListEntry.CATEGORIE + " TEXT NOT NULL, " +
                FastFoodListDb.KFCListEntry.PRODUCT_NAME + " TEXT NOT NULL, " +
                FastFoodListDb.KFCListEntry.GLU_RAPIDE + " REAL NOT NULL, " +
                FastFoodListDb.KFCListEntry.GLU_LENT + " REAL NOT NULL, " +
                FastFoodListDb.KFCListEntry.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP " +
                ");";

        sqLiteDatabase.execSQL(SQL_CREATE_KFCLIST_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
