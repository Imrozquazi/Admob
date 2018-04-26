package example.piyushd.admob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-1644168301464894/6846313565");


        mAdView = (AdView) findViewById(R.id.admobadview);
       // mAdView.setAdSize(AdSize.BANNER);
       // mAdView.setAdUnitId("ca-app-pub-1644168301464894/6846313565");

        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("ca-app-pub-1644168301464894/6846313565")// Add your real device id here
                .build();
        mAdView.loadAd(adRequest);

    }


    }

