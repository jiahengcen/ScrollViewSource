package com.hl.scrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 *
 *  Android 6.0 分析ScrollView
 *  运行环境Android 6.0模拟器（其他版本可能会报错）
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScrollView scrollView=findViewById(R.id.scroll);
        scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                Log.e("HLA","onScrollChange ....");
            }
        });
    }
}
