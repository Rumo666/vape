package by.avpa.kuchinsky.vape_self_dressing.ReadyRec.Cottos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;

import com.appodeal.ads.Appodeal;
import com.appodeal.ads.BannerCallbacks;
import com.google.android.gms.ads.MobileAds;

import by.avpa.kuchinsky.vape_self_dressing.R;

public class CottosMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cottos_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("COTTO'S REVENGE");
        GridLayout mainGrid = (GridLayout)findViewById(R.id.cotGrid);
        setSingleEvent(mainGrid);
        mainGrid.setClickable(true);
        MobileAds.initialize(this, "ca-app-pub-5519130679591776~2247482211");
        String appKey = "e4f3b8a7d41076075e7188d8979941e7b44e9693739f8b8d";
        Appodeal.initialize(this, appKey, Appodeal.BANNER);
        Appodeal.show(this, Appodeal.BANNER_BOTTOM);
        Appodeal.setBannerAnimation(false);
        Appodeal.setBannerCallbacks(new BannerCallbacks() {
            @Override
            public void onBannerLoaded(int height, boolean isPrecache) {
                Log.d("Appodeal", "onBannerLoaded");
                if(Appodeal.isLoaded(Appodeal.BANNER)){
                    Appodeal.show(CottosMain.this, Appodeal.BANNER_BOTTOM);}
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
                Log.d("Appodeal", "onBannerClicked");
                Appodeal.hide(CottosMain.this, Appodeal.BANNER);
            }
        });
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {

            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI==0){

                        Intent intent = new Intent(CottosMain.this, CottosBourbon.class);
                        startActivity(intent);


                    }else if (finalI==1) {

                        Intent intent = new Intent(CottosMain.this, CottosBourbon.class);
                        startActivity(intent);


                    }

                }
            });
        }
    }}


