package by.avpa.kuchinsky.vape_self_dressing;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.appodeal.ads.Appodeal;
import com.appodeal.ads.BannerCallbacks;
import com.appodeal.ads.InterstitialCallbacks;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    public static boolean ShowAdInOnLogin = true;
    Button tutorShow;
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, "ca-app-pub-5519130679591776~2247482211");
        String appKey = "e4f3b8a7d41076075e7188d8979941e7b44e9693739f8b8d";
        Appodeal.initialize(this, appKey, Appodeal.INTERSTITIAL | Appodeal.BANNER | Appodeal.MREC);

        tabLayout = (TabLayout)findViewById(R.id.tabLid);
        appBarLayout = (AppBarLayout) findViewById(R.id.appBar);
        viewPager = (ViewPager) findViewById(R.id.viewPagerId);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentReadyReciepes(), "Готовые рецепты");
        adapter.AddFragment(new FragmentSelfDressing(), "Самозамес");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);





//        tutorShow = (Button)findViewById(R.id.btn_tutor);
//        tutorShow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Tutorial.class);
//                startActivity(intent);
//            }
//        });

    }
}
