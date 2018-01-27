package io.xsmobilemining.presentation.views.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebViewClient;

import io.xsmobilemining.R;
import io.xsmobilemining.databinding.MiningDashboardBinding;

public class MiningDashboardActivity extends AppCompatActivity {

    MiningDashboardBinding mdBinding;
    private static final String MINING_DASH_URL = "http://www.allaccesshd.com/XSDashboard/login.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mdBinding = DataBindingUtil.setContentView(this, R.layout.activity_mining_dashboard);

        init();
    }

    private void init(){
        launchWebView();
    }

    private void launchWebView(){
        mdBinding.wvMiningDash.loadUrl(MINING_DASH_URL);
        mdBinding.wvMiningDash.setWebViewClient(new WebViewClient());
    }
}
