package com.example.sobin_av.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String KEY_BTC = "KEY_BTC";

    public static void start(MainActivity activity, int btcCounter) {
        Intent intent = new Intent(activity, SecondActivity.class);
        intent.putExtra(KEY_BTC, btcCounter);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        int btcCount = getIntent().getIntExtra(KEY_BTC, 0);
        TextView statusText = findViewById(R.id.status_text);
        statusText.setText(getString(R.string.btc_status, btcCount));
        Log.i("SECOND_ACTIVITY", "btcCount updated = " + btcCount);
    }
}
