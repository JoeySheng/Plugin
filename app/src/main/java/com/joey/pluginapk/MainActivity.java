package com.joey.pluginapk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.joey.pluginapk.library.TestInterface;
import com.joey.pluginapk.plugin.PluginManager;

public class MainActivity extends AppCompatActivity {

    private TextView mDateTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDateTv = (TextView) this.findViewById(R.id.tv_date);

        TestInterface testPlugin = PluginManager.getInstance().createTestPluginInstance();
        mDateTv.setText(testPlugin.getDateFromTimeStamp("yyyy-MM-dd", System.currentTimeMillis()));
    }
}
