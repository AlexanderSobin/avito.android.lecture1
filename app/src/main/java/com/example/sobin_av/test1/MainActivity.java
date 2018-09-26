package com.example.sobin_av.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView btcText;
    private int btcCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btcText = findViewById(R.id.btc_text);
        btcText.setText(R.string.initial_btc);

        Button addBtcButton = findViewById(R.id.add_btc_button);
        addBtcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btcCounter++;
                String btc = String.valueOf(btcCounter);
                btcText.setText(btc);
                if (btcCounter % 5 == 0) {
                    openSecondActivity();
                }
            }
        });
    }
    public void openSecondActivity() {
        SecondActivity.start(this, btcCounter);
    }
}
