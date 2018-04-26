package example.piyushd.admob;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

/**
 * Created by Imroz Quazi on 25-04-2018.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
    }
}
