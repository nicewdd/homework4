package com.bytedance.clockapplication;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bytedance.clockapplication.widget.Clock;


import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {

    private View mRootView;
    private Clock mClockView;

//    private Handler handle = new Handler(){
//
//        @Override
//        public void handleMessage(Message mes){
//            switch(mes.what){
//                case 1:
//                    mClockView.setShowAnalog(mClockView.isShowAnalog());
//                    break;
//            }
//        }
//    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRootView = findViewById(R.id.root);
        mClockView = findViewById(R.id.clock);
        mRootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mClockView.setShowAnalog(!mClockView.isShowAnalog());
            }
        });

    }
}
