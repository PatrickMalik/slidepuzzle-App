package pmalik.at.slidepuzzle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Austr on 31.03.2017.
 */

public class GameView extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_view);
    }

    public void switchToMenu(View view){
        Intent intent = new Intent(GameView.this, MainMenu.class);
        startActivity(intent);
    }


}
