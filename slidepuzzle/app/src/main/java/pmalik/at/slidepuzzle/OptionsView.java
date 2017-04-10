package pmalik.at.slidepuzzle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

import pmalik.at.slidepuzzle.uiComponents.Listener.SeekBarActionListener;

/**
 * Created by Austr on 31.03.2017.
 */

public class OptionsView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_view);

        SeekBar seekBar = (SeekBar) findViewById(R.id.options_fieldsize_seekbar);
        TextView textView = (TextView) findViewById(R.id.options_fieldsize_seekbar_value_display);

        SeekBarActionListener seekBarActionListener = new SeekBarActionListener(textView);
        seekBar.setOnSeekBarChangeListener(seekBarActionListener);
    }


}
