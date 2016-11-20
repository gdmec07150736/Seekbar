package com.example.administrator.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SeekBar sb;
    private TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sb= (SeekBar) findViewById(R.id.seekbar);
        tv1= (TextView) findViewById(R.id.jindu);
        tv2= (TextView) findViewById(R.id.status);
        sb.setProgress(30);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv1.setText("当前："+progress+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                tv2.setText("正在拖动");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                tv2.setText("停止拖动");
            }
        }

        );
    }
}
