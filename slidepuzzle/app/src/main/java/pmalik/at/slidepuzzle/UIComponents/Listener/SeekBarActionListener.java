package pmalik.at.slidepuzzle.uiComponents.Listener;

import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by Austr on 03.04.2017.
 */

public class SeekBarActionListener implements SeekBar.OnSeekBarChangeListener {

    TextView seekBarValueDisplay;

    public SeekBarActionListener(TextView textView){
        this.seekBarValueDisplay = textView;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        seekBarValueDisplay.setText(String.valueOf(progress));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
