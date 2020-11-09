package com.xpf.order.debug;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.xpf.common.utils.Config;
import com.xpf.order.R;

public class Order_DebugMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_debug_activity_main);
        Log.d(Config.TAG, "order/debug/onCreate run...");
    }
}
