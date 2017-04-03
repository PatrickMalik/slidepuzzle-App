package pmalik.at.slidepuzzle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MainMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

    }

    public void switchToStart(View view){
        Intent intent = new Intent(MainMenu.this, GameView.class);
        startActivity(intent);
    }

    public void switchToOptions(View view){
        Intent intent = new Intent(MainMenu.this, OptionsView.class);
        startActivity(intent);
    }

    public void switchToHighscores(View view){
        Intent intent = new Intent(MainMenu.this, HighscoresView.class);
        startActivity(intent);
    }


}
