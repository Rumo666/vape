package by.avpa.kuchinsky.vape_self_dressing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.appodeal.ads.Appodeal;
import com.appodeal.ads.BannerCallbacks;
import com.appodeal.ads.InterstitialCallbacks;
import com.google.android.gms.ads.MobileAds;

public class Results extends AppCompatActivity {
    public static boolean ShowAdInOnLogin = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_results);

        getSupportActionBar().setTitle("Результат замеса");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        float basovoy = getIntent().getExtras().getFloat("base");
        float basovoyK = getIntent().getExtras().getFloat("basek");
        float Pg = getIntent().getExtras().getFloat("pg");
        float PgK = getIntent().getExtras().getFloat("pgk");
        float Vg = getIntent().getExtras().getFloat("vg");
        float VgK = getIntent().getExtras().getFloat("vgk");
        float Wat = getIntent().getExtras().getFloat("wat");
        float WatK = getIntent().getExtras().getFloat("watK");
        float AR = getIntent().getExtras().getFloat("ar");
        float ARK = getIntent().getExtras().getFloat("arK");


        TextView BasovoyML = (TextView)findViewById(R.id.basovoyMl);
        TextView Basovoykap = (TextView)findViewById(R.id.basovoyK);
        BasovoyML.setText(" "+basovoy + " мл");
        Basovoykap.setText(basovoyK + " капель");
        TextView pg = (TextView)findViewById(R.id.pgMl);
        TextView pgK = (TextView)findViewById(R.id.pgK);
        pg.setText(" "+Pg + " мл");
        pgK.setText(PgK + " капель");
        TextView vg = (TextView)findViewById(R.id.vgMl);
        TextView vgK = (TextView)findViewById(R.id.vgK);
        vg.setText(" "+Vg + " мл");
        vgK.setText(VgK + " капель");
        TextView wat = (TextView)findViewById(R.id.watMl);
        TextView watM = (TextView)findViewById(R.id.watK);
        wat.setText(" "+Wat + " мл");
        watM.setText(WatK + " капель");
        TextView arK = (TextView)findViewById(R.id.arK);
        TextView arM = (TextView)findViewById(R.id.arMl);
        arM.setText(" "+AR + " мл");
        arK.setText(ARK + " капель");
        MobileAds.initialize(this, "ca-app-pub-5519130679591776~2247482211");

        String appKey = "e4f3b8a7d41076075e7188d8979941e7b44e9693739f8b8d";
        Appodeal.initialize(this, appKey, Appodeal.INTERSTITIAL | Appodeal.BANNER | Appodeal.MREC);
        Appodeal.show(this, Appodeal.INTERSTITIAL);
        Appodeal.isLoaded(Appodeal.INTERSTITIAL);

        Appodeal.show(Results.this, Appodeal.BANNER_BOTTOM);
        Appodeal.isLoaded(Appodeal.BANNER_BOTTOM);


        Appodeal.setInterstitialCallbacks(new InterstitialCallbacks() {
            @Override
            public void onInterstitialLoaded(boolean isPrecache) {
                if (Results.ShowAdInOnLogin){
                    Appodeal.show(Results.this, Appodeal.INTERSTITIAL);
                    Results.ShowAdInOnLogin = false;
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
            public void onInterstitialClosed() {

                Appodeal.show(Results.this, Appodeal.BANNER_BOTTOM);
                Appodeal.isLoaded(Appodeal.BANNER_BOTTOM);
            }
        });

        Appodeal.setBannerCallbacks(new BannerCallbacks() {
            @Override
            public void onBannerLoaded(int height, boolean isPrecache) {

                if(Appodeal.isLoaded(Appodeal.BANNER)){
                    Appodeal.show(Results.this, Appodeal.BANNER_BOTTOM);}
            }
            @Override
            public void onBannerFailedToLoad() {
                Appodeal.show(Results.this, Appodeal.BANNER_BOTTOM);

            }
            @Override
            public void onBannerShown() {
                Appodeal.show(Results.this, Appodeal.BANNER_BOTTOM);
            }
            @Override
            public void onBannerClicked() {
                Appodeal.hide(Results.this, Appodeal.BANNER);
            }
        });



    }
}
