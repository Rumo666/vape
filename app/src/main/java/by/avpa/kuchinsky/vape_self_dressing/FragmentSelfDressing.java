package by.avpa.kuchinsky.vape_self_dressing;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.appodeal.ads.Appodeal;
import com.appodeal.ads.BannerCallbacks;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by Alexandr Kuchinsky on 02.04.2018.
 */

public class FragmentSelfDressing extends Fragment {
View view;
Button lilTara;
Button bTara;
    public FragmentSelfDressing() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.self_dressing, container, false);
        lilTara = (Button)view.findViewById(R.id.taraL);
        lilTara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent = new Intent(view.getContext().getApplicationContext(), LitleTara.class);
                startActivity(lIntent);
            }
        });
        bTara = (Button)view.findViewById(R.id.bigTara);
        bTara.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent bIntent = new Intent(view.getContext().getApplicationContext(), BigTara.class);
                startActivity(bIntent);
            }
        });


        MobileAds.initialize(getActivity(), "ca-app-pub-5519130679591776~2247482211");

        String appKey = "e4f3b8a7d41076075e7188d8979941e7b44e9693739f8b8d";
        Appodeal.initialize(getActivity(), appKey, Appodeal.INTERSTITIAL | Appodeal.BANNER);
        // Appodeal.show(this, Appodeal.BANNER_BOTTOM);

        Appodeal.setBannerCallbacks(new BannerCallbacks() {
            @Override
            public void onBannerLoaded(int height, boolean isPrecache) {

                if(Appodeal.isLoaded(Appodeal.BANNER)){
                    Appodeal.show(getActivity(), Appodeal.BANNER_BOTTOM);}
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
                Appodeal.hide(getActivity(), Appodeal.BANNER);
            }
        });


        return view;
    }
}
