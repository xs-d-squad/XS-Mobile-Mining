package io.xsmobilemining.presentation.views.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.webkit.WebViewClient;

import io.xsmobilemining.R;
import io.xsmobilemining.databinding.MiningDashboardBinding;

public class MiningDashboardActivity extends AppCompatActivity {

    MiningDashboardBinding mdBinding;
    private static final String MINING_DASH_URL = "https://mining.xonicsystems.io";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mdBinding = DataBindingUtil.setContentView(this, R.layout.activity_mining_dashboard);

        init();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK && mdBinding.wvMiningDash.canGoBack()){
            mdBinding.wvMiningDash.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void init(){
        launchWebView();
    }

    private void launchWebView(){
        mdBinding.wvMiningDash.loadUrl(MINING_DASH_URL);
        mdBinding.wvMiningDash.setWebViewClient(new WebViewClient());
        mdBinding.wvMiningDash.getSettings().setJavaScriptEnabled(true);
    }
}
