package com.ynov.android.gluciddiab.bddUtils;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Malo on 30/03/2017.
 */

public class FastFoodData {
    public static void insertFastFoodData(SQLiteDatabase db){
        if(db == null){
            return;
        }

        List<ContentValues> list = new ArrayList<ContentValues>();


        /******************************************************************/
        /*                                                                */
        /*                      BUCKETS A PARTAGER                        */
        /*                                                                */
        /******************************************************************/


        ContentValues cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Buckets à Partager");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Duo Tenders");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 31);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Buckets à Partager");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Duo Wings Hot");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 36);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Duo Mix");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 35);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Duo Mix + Pièces Hot (Pièces et Wings Hot)");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 32);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Duo Mix + Pièces Hot (Pièces et Tenders)");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 29);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Duo Mix + Pièces OR (Pièces et Wings Hot)");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 34);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Duo Mix + Pièces OR (Pièces et Tenders)");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 31);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Maxi Tenders");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 26);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Maxi Wings Hot");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 30);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Big Mix (Tenders et Hot wings)");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 66);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Big Mix + Pièces Hot");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 31);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Big Mix + Pièces OR");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 34);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);


        /******************************************************************/
        /*                                                                */
        /*                           SANDWICHES                           */
        /*                                                                */
        /******************************************************************/


        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Krunchy sauce burger");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 25);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 4);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Twister Tenders");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 26);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 1);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "The B.O.S.S Bacon");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 33);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 5);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Brazer");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 30);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 7);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Tower Original");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 59);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 10);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Tower Zinger");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 21);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 10);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Boxmaster OR");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 58);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 1);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Boxmaster Zinger");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 42);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 1);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Boxmaster Fish");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 57);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 4);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Boxmaster Maxx OR");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 67);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 2);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Boxmaster Freestyle");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 60);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 3);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "I-twist 2HOT4U");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 28);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 5);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "I-twist cheese");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 24);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 2);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Chizza");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 27);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 3);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Double Stacker Cheese & Bacon");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 45);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 7);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Double Stacker Zinger");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 52);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 12);
        list.add(cv);

        /******************************************************************/
        /*                                                                */
        /*                             SALADES                            */
        /*                                                                */
        /******************************************************************/

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Salades");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Salade Caesar Poulet cuit au four (sans sauce)");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 12);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 7);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Salades");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Salade Chèvre Noix Tenders (sans sauce)");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 10);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 3);
        list.add(cv);

        /******************************************************************/
        /*                                                                */
        /*                  PIECES DE POULET / POISSON                    */
        /*                                                                */
        /******************************************************************/

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Tenders 2");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 10);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Tenders 4");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 21);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Tenders 5");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 26);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Wings Hot 3");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 11);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Wings Hot 6");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 22);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Wings Hot 9");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 32);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Pièces OR 2");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 16);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Pièces Hot 2");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 14);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Fish 2");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 18);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        /******************************************************************/
        /*                                                                */
        /*                        ACCOMPAGNEMENTS                         */
        /*                                                                */
        /******************************************************************/


        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "4 Tomates cerises");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 1);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 1);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Cobette");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 22);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 4);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Frites petites salées");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 32);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Frites normales salées");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 34);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 1);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Frites Grandes salées");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 49);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 1);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Petite salade (sans sauce)");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 1);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 1);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Big shots raclette");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 8);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Big shots Emmental");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 5);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "DIP'N'CRUNCH - Croustillant");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 16);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 2);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Mini rostis");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 3);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        /******************************************************************/
        /*                                                                */
        /*                            DESSERTS                            */
        /*                                                                */
        /******************************************************************/

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Cookie cuit au chocolat au lait");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 13);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 23);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Cookie triple chocolat");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 11);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 21);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Mini cookies");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 7);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 9);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Sundae nature");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 5);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 19);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "P'tit Yaourt Fraise");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 1);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 11);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Andros Pocket");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 14);
        list.add(cv);

        /*
        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Sundae saveur choc noisette");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, );
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);*/

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Sundae caramel");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 6);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 30);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Sundae Fraise");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 6);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 23);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Moelleux chocolat");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 12);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 25);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Tiramisu");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 7);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 15);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Muffin aux myrtilles");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 18);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 35);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Muffin chocolat cœur fondant choco-noisettes");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 10);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 34);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Muffin Nutella au cœur fondant");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 15);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 32);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Muffin Chocolat au cœur fondant");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 12);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 31);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "P'tit Flan");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 11);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 11);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Kream Ball Fraise");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 22);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 30);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Kream Ball Saveur Chocolat Noisettes");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 4);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 49);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Kream Ball Caramel");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 3);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 48);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Kream Ball Caramel au beurre salé");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 17);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 48);
        list.add(cv);


        /******************************************************************/
        /*                                                                */
        /*                        BOISSONS FROIDES                        */
        /*                                                                */
        /******************************************************************/


        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Bière Heineken 33cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 13);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "7UP 25cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 26);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "7UP 33cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 34);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "7UP 40cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 42);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "7UP 50cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 52);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Orangina 25cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 25);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Orangina 33cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 33);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Orangina 40cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 40);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Orangina 50cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 1);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 50);
        list.add(cv);

        /*
        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Orangina 1,5L");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, );
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);*/

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Lipton Ice Tea 25cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 1);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 17);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Lipton Ice Tea 33cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 23);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Lipton Ice Tea 40cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 1);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 36);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Lipton Ice Tea 50cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 1);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 35);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Lipton Ice Tea 1,5L");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 1);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 26);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Oasis Tropical 25cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 23);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Oasis Tropical 33cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 30);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Oasis Tropical 40cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 1);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 36);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Oasis Tropical 50cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 46);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Oasis Tropical 2L");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 46);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Pepsi 25cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 27);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Pepsi 33cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 36);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Pepsi 40cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 44);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Pepsi 50cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 55);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Pepsi 1,5L");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 41);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Pepsi Max 25cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Pepsi Max 33cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Pepsi Max 40cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Pepsi Max 50cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 1);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Pepsi Max 1,5L");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 1);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Vittel 33cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Vittel 50cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Perrier 33cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Perrier 50cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Tropicana Pure Premium 25cl");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 25);
        list.add(cv);

        /******************************************************************/
        /*                                                                */
        /*                        BOISSONS CHAUDES                        */
        /*                                                                */
        /******************************************************************/

        /*
        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Chaudes");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Café");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, );
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Chaudes");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Chocolat");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, );
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Chaudes");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Lait");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, );
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Boissons Chaudes");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Thé");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, );
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);*/

        /******************************************************************/
        /*                                                                */
        /*                             SAUCES                             */
        /*                                                                */
        /******************************************************************/

        /*
        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "2HOT4U");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, );
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Creamy Curry");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, );
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Smoky BBQ");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, );
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Sweet Imperial");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, );
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Originale Recipe");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, );
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);
        */

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Américaine");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 1);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 3);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Mayonnaise stick");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 1);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        /*
        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Ketchup stick");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, );
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);*/

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Huile pimentée");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Salade - Nature (allégée)");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 1);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 1);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Salade - Balsamique");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 2);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "Salade - Caesar");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 1);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 4);
        list.add(cv);

        cv = new ContentValues();
        cv.put(FastFoodListDb.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(FastFoodListDb.KFCListEntry.PRODUCT_NAME, "DIP'N'CRUNCH - Sauce au cheddar fondu");
        cv.put(FastFoodListDb.KFCListEntry.GLU_LENT, 0);
        cv.put(FastFoodListDb.KFCListEntry.GLU_RAPIDE, 1);
        list.add(cv);



        try
        {
            db.beginTransaction();
            for(ContentValues c:list){
                db.insert(FastFoodListDb.KFCListEntry.TABLE_NAME, null, c);
            }
            db.setTransactionSuccessful();
        } catch(SQLException e) {

        } finally {
            db.endTransaction();
        }

    }
}
