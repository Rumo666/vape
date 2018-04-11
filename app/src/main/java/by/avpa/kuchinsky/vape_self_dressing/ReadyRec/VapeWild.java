 package by.avpa.kuchinsky.vape_self_dressing.ReadyRec;

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

import by.avpa.kuchinsky.vape_self_dressing.BigTara;
import by.avpa.kuchinsky.vape_self_dressing.R;
import by.avpa.kuchinsky.vape_self_dressing.ReadyRec.VW.American_Pie;
import by.avpa.kuchinsky.vape_self_dressing.ReadyRec.VW.Cinnamon_Roll;
import by.avpa.kuchinsky.vape_self_dressing.ReadyRec.VW.Circus_Bear;
import by.avpa.kuchinsky.vape_self_dressing.ReadyRec.VW.Tigers_Blood;

import static java.security.AccessController.getContext;

public class VapeWild extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vape_wild);
        getSupportActionBar().setTitle("VAPE WILD");
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
                    Appodeal.show(VapeWild.this, Appodeal.BANNER_BOTTOM);}
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
                Appodeal.hide(VapeWild.this, Appodeal.BANNER);
            }
        });
        GridLayout mainGrid = (GridLayout)findViewById(R.id.vwGrid);
        setSingleEvent(mainGrid);
        mainGrid.setClickable(true);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {

            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI==0){

                        Intent intent = new Intent(VapeWild.this, Cinnamon_Roll.class);
                        startActivity(intent);


                    }else if (finalI==1){

                        Intent intent = new Intent(VapeWild.this, Cinnamon_Roll.class);
                        startActivity(intent);


                    }
                    else if (finalI==2){

                        Intent intent = new Intent(VapeWild.this, American_Pie.class);
                        startActivity(intent);


                    }else if (finalI==3){

                        Intent intent = new Intent(VapeWild.this, American_Pie.class);
                        startActivity(intent);


                    }
                    else if (finalI==4){

                        Intent intent = new Intent(VapeWild.this, Circus_Bear.class);
                        startActivity(intent);


                    }else if (finalI==5){

                        Intent intent = new Intent(VapeWild.this, Circus_Bear.class);
                        startActivity(intent);


                    }
                    else if (finalI==6){

                        Intent intent = new Intent(VapeWild.this, Tigers_Blood.class);
                        startActivity(intent);


                    }else if (finalI==7){

                        Intent intent = new Intent(VapeWild.this, Tigers_Blood.class);
                        startActivity(intent);


                    }

                }
            });
        }
    }



}