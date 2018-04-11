package by.avpa.kuchinsky.vape_self_dressing.ReadyRec.BadDrip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.appodeal.ads.Appodeal;
import com.appodeal.ads.InterstitialCallbacks;
import com.google.android.gms.ads.MobileAds;

import by.avpa.kuchinsky.vape_self_dressing.R;


public class Cereal_Killer extends AppCompatActivity {
    public static boolean ShowAdInOnLogin = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cereal__killer);
        getSupportActionBar().setTitle("Cereal Killer");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        MobileAds.initialize(this, "ca-app-pub-5519130679591776~2247482211");
        String appKey = "e4f3b8a7d41076075e7188d8979941e7b44e9693739f8b8d";
        Appodeal.initialize(this, appKey, Appodeal.INTERSTITIAL | Appodeal.BANNER | Appodeal.MREC);
        Appodeal.isLoaded(Appodeal.INTERSTITIAL);
        Appodeal.show(this, Appodeal.INTERSTITIAL);


              Appodeal.setInterstitialCallbacks(new InterstitialCallbacks() {
            @Override
            public void onInterstitialLoaded(boolean isPrecache) {
                if (Cereal_Killer.ShowAdInOnLogin){
                    Appodeal.show(Cereal_Killer.this, Appodeal.INTERSTITIAL);
                    Cereal_Killer.ShowAdInOnLogin = false;
                }


            }
            @Override
            public void onInterstitialFailedToLoad() {
                Log.d("Appodeal", "onInterstitialFailedToLoad");
            }
            @Override
            public void onInterstitialShown() {
                Log.d("Appodeal", "onInterstitialShown");
            }
            @Override
            public void onInterstitialClicked() {
                Log.d("Appodeal", "onInterstitialClicked");
            }
            @Override
            public void onInterstitialClosed() { Log.d("Appodeal", "onInterstitialClosed");

            }
        });
    }
}
