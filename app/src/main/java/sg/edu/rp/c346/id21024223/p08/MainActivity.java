package sg.edu.rp.c346.id21024223.p08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //Step 1: obtain the SharedPreferences instance
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        //Step 2: Retrieve the saved data from the SharedPreferences with a default value if no matching data
        String msg = prefs.getString("greetings", "No greetings name");
        Toast toast = Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG);
                toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        //Step 1: obtain the SharedPreferences instance
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        //Step 2: create a SharedPreferences Editor by calling edit()
        SharedPreferences.Editor prefEdit = prefs.edit();
        //Step 3: set a key-value pair in the editor
        prefEdit.putString("greetings", "hello!");
        //Step 4: call commit() to save the changed made to the SharedPreferences
        prefEdit.commit();

    }
}