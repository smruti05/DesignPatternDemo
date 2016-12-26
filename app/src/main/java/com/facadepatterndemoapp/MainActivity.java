package com.facadepatterndemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity";
    @BindView(R.id.tvResult)
    TextView textViewResult;
    ShopKeeper shopKeeper = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        shopKeeper = new ShopKeeper();
    }

    @OnClick({R.id.buttonCheckSamsungSale, R.id.buttonCheckMotorolaSale, R.id.buttonCheckAsusSale})
    public void onClickOfAnyMobileBrand(View view) {
        switch (view.getId()) {
            case R.id.buttonCheckAsusSale:
                showSelectedMobileSale(shopKeeper.asusMobileSale());
                break;
            case R.id.buttonCheckSamsungSale:
                showSelectedMobileSale(shopKeeper.samsungMobileSale());
                break;
            case R.id.buttonCheckMotorolaSale:
                showSelectedMobileSale(shopKeeper.motorolaMobileSale());
                break;
            default:
                Log.i(TAG, "default case called");
        }
    }

    private void showSelectedMobileSale(String text) {
        textViewResult.setText(text);
    }
}
