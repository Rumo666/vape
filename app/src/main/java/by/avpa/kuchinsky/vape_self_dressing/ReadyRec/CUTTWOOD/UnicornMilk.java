package by.avpa.kuchinsky.vape_self_dressing.ReadyRec.CUTTWOOD;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.appodeal.ads.Appodeal;
import com.appodeal.ads.InterstitialCallbacks;
import com.google.android.gms.ads.MobileAds;

import by.avpa.kuchinsky.vape_self_dressing.R;

public class UnicornMilk extends AppCompatActivity {
    public static boolean ShowAdInOnLogin = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unicorn_milk);
        getSupportActionBar().setTitle("Unicorn Milk");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        MobileAds.initialize(this, "ca-app-pub-5519130679591776~2247482211");
        String appKey = "e4f3b8a7d41076075e7188d8979941e7b44e9693739f8b8d";
        Appodeal.initialize(this, appKey, Appodeal.INTERSTITIAL | Appodeal.BANNER | Appodeal.MREC);
        Appodeal.isLoaded(Appodeal.INTERSTITIAL);
        Appodeal.show(this, Appodeal.INTERSTITIAL);


        Appodeal.setInterstitialCallbacks(new InterstitialCallbacks() {
            @Override
            public void onInterstitialLoaded(boolean isPrecache) {
                if (UnicornMilk.ShowAdInOnLogin){
                    Appodeal.show(UnicornMilk.this, Appodeal.INTERSTITIAL);
                    UnicornMilk.ShowAdInOnLogin = false;
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
                Toast.makeText(getApplicationContext(),"Спасибо за клик, братан!",Toast.LENGTH_SHORT).show();
                Log.d("Appodeal", "onInterstitialClicked");
            }
            @Override
            public void onInterstitialClosed() { Log.d("Appodeal", "onInterstitialClosed");

            }
        });
    }
}
