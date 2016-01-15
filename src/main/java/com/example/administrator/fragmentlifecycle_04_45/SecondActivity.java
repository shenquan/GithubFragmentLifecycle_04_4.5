package com.example.administrator.fragmentlifecycle_04_45;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/1/15.
 */
public class SecondActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("对话框风格的Activity");
        setContentView(tv);
    }

}
