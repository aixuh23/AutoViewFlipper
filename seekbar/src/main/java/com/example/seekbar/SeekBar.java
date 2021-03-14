package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeekBar extends AppCompatActivity {

    Button btn;
    SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        btn = (Button)findViewById(R.id.btn);
        seekbar = (Seekbar)findViewById(R.id.seekbar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressThread thread = new ProgressThread();
                thread.start();
            }
        });

        seekBar.onSeekBarChangeListener
    }
}

    class ProgressThread extends Thread {
        @Override
        public void run() {
            super.run();
        }
    }
