package com.quickeats.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Rajesh Kumar on 18-04-2018.
 */
public class StoredDB {

    public static StoredDB storedDB;
  public static   SharedPreferences pref;
    SharedPreferences.Editor editor;

    public static StoredDB getInstance(Context context) {
        if (null == storedDB) {
            storedDB = new StoredDB();
            pref = context.getSharedPreferences("MyPref", 0);
        }
        return storedDB;
    }


    public void StorageValues(String name, Object storageValue) {

        editor = pref.edit();

        if(storageValue instanceof String ){
            editor.putString(name, (String )storageValue);
        }else {
            editor.putInt(name, (Integer)storageValue);
        }
        editor.commit();
    }


    public Object getStorageValue(String key){

      return   pref.getString(key, null);
    }


}
