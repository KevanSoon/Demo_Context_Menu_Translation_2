package sg.edu.rp.c346.id19013989.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText = findViewById(R.id.textViewTranslatedText);

        registerForContextMenu(tvTranslatedText);
    }
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_main, menu);




    }

    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()== R.id.EnglishSelection) { //check whether the selected menu item ID is 0
            //code for action
            tvTranslatedText.setText("Hello");

            return true; //menu item successfully handled
        }
        else if(item.getItemId()== R.id.italianSelection) { //check if the selected menu item ID is 1
            //code for action
            tvTranslatedText.setText("Ciao");

            return true;  //menu item successfully handled
        }
        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }


}


