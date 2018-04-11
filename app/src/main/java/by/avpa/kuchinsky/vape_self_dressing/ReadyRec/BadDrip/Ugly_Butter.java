package by.avpa.kuchinsky.vape_self_dressing.ReadyRec.BadDrip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.appodeal.ads.Appodeal;
import com.appodeal.ads.BannerCallbacks;
import com.google.android.gms.ads.MobileAds;

import by.avpa.kuchinsky.vape_self_dressing.R;
import by.avpa.kuchinsky.vape_self_dressing.ReadyRec.VW.Tigers_Blood;

public class Ugly_Butter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ugly__butter);
        getSupportActionBar().setTitle("Ugly Butter");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        MobileAds.initialize(this, "ca-app-pub-5519130679591776~2247482211");
        String appKey = "e4f3b8a7d41076075e7188d8979941e7b44e9693739f8b8d";
        Appodeal.initialize(this, appKey, Appodeal.BANNER);
        Appodeal.show(this, Appodeal.BANNER_BOTTOM);
        Appodeal.setBannerAnimation(false);
        Appodeal.setBannerCallbacks(new BannerCallbacks() {
            @Override
            public void onBannerLoaded(int height, boolean isPrecache) {

                if(Appodeal.isLoaded(Appodeal.BANNER)){
                    Appodeal.show(Ugly_Butter.this, Appodeal.BANNER_BOTTOM);}
            }
            @Override
            public void onBannerFailedToLoad() {
                Appodeal.destroy(Appodeal.BANNER);

            }
            @Override
            public void onBannerShown() {
                Log.d("Appodeal", "onBannerShown");
            }
            @Override
            public void onBannerClicked() {
                Appodeal.hide(Ugly_Butter.this, Appodeal.BANNER);
            }
        });
    }
}
