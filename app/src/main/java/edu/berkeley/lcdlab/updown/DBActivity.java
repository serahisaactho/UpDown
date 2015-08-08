
// Currently unused class.
package edu.berkeley.lcdlab.updown;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

public class DBActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_info);

        // Create new helper
        DatabaseHelper dbHelper= new DatabaseHelper(getApplicationContext()); //use 'this' or getApplicationContext();
        //DatabaseHelper dbHelper = new DatabaseHelper(getContext());
        // Get the database. If it does not exist, this is where it will
        // also be created.
        SQLiteDatabase db= dbHelper.getWritableDatabase();

        // Create insert entries
        ContentValues values = new ContentValues();
        values.put(FeedReaderContract.Table1.COLUMN_NAME_COL1, "value1");
        values.put(FeedReaderContract.Table1.COLUMN_NAME_COL2, "value2");
        values.put(FeedReaderContract.Table1.COLUMN_NAME_COL3, "value3");

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FeedReaderContract.Table1.TABLE_NAME,
                null,
                values);
    }
}



