package by.avpa.kuchinsky.vape_self_dressing;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.appodeal.ads.Appodeal;
import com.appodeal.ads.BannerCallbacks;
import com.google.android.gms.ads.MobileAds;

public class LitleTara extends AppCompatActivity {
    Button sostav;
    TextView   tvnikotineNeed, tvnicotineInBasic;
   // EditText krepost_v_bazovoi, krepost_na_vihode, vgNeed, pgNeed, flavorNeed, jidkost_na_vihode, howMuchWater, kolitchestvo_kapel;

    CheckBox checkBox;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_litle_tara);
        MobileAds.initialize(this, "ca-app-pub-5519130679591776~2247482211");

        String appKey = "e4f3b8a7d41076075e7188d8979941e7b44e9693739f8b8d";
        Appodeal.initialize(this, appKey, Appodeal.INTERSTITIAL | Appodeal.BANNER);
       Appodeal.show(this, Appodeal.BANNER_BOTTOM);

        Appodeal.setBannerCallbacks(new BannerCallbacks() {
            @Override
            public void onBannerLoaded(int height, boolean isPrecache) {

                if(Appodeal.isLoaded(Appodeal.BANNER)){
                Appodeal.show(LitleTara.this, Appodeal.BANNER_BOTTOM);}
            }
            @Override
            public void onBannerFailedToLoad() {
                Appodeal.show(LitleTara.this, Appodeal.BANNER_BOTTOM);

            }
            @Override
            public void onBannerShown() {
                Appodeal.show(LitleTara.this, Appodeal.BANNER_BOTTOM);
            }
            @Override
            public void onBannerClicked() {
                Appodeal.hide(LitleTara.this, Appodeal.BANNER);
            }
        });


        getSupportActionBar().setTitle("Для мелкой тары");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        sostav = (Button)findViewById(R.id.sostav);


        tvnikotineNeed = (TextView)findViewById(R.id.tvnikotineNeed);
        tvnicotineInBasic = (TextView)findViewById(R.id.tvnicotineInBasic);
        //vgNeed = (TextView)findViewById(R.id.vgNeed);

       final EditText krepost_v_bazovoi=(EditText)findViewById(R.id.krepost_v_bazovoi);
        final EditText krepost_na_vihode=(EditText)findViewById(R.id.krepost_na_vihode);
        final EditText  pgNeed=(EditText)findViewById(R.id.pgNeed);
        final EditText  flavorNeed=(EditText)findViewById(R.id.flavorNeed);
        final EditText   vgNeed=(EditText)findViewById(R.id.vgNeed);
        final EditText   howMuchWater=(EditText)findViewById(R.id.howMuchWater);
        final EditText   jidkost_na_vihode=(EditText)findViewById(R.id.jidkost_na_vihode);
        final EditText   kolitchestvo_kapel=(EditText)findViewById(R.id.kolitchestvo_kapel);


        checkBox=(CheckBox)findViewById(R.id.checkBox);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()==true){
                    howMuchWater.setVisibility(View.VISIBLE);
                }
                else{
                    howMuchWater.setVisibility(View.INVISIBLE);
                }
            }
        });

//        pgNeed.setOnKeyListener(new View.OnKeyListener()
//                                  {
//                                      public boolean onKey(View v, int keyCode, KeyEvent event)
//                                      {
//                                          if(event.getAction() == KeyEvent.ACTION_DOWN &&
//                                                  (keyCode == KeyEvent.KEYCODE_ENTER))
//                                          {
//
//                                              String strCatName = pgNeed.getText().toString();
//
//                                              vgNeed.setText(100-Integer.parseInt(strCatName));
//                                              return true;
//                                          }
//                                          return false;
//                                      }
//                                  }
//        );

//      pgNeed.setOnTouchListener(new View.OnTouchListener() {
//          @Override
//          public boolean onTouch(View v, MotionEvent event) {
//              if (event.getAction() == MotionEvent.) {
//                  vgNeed.setText(100-Integer.parseInt(vgNeed.getText().toString()));
//                  v.setFocusableInTouchMode(true);}
//                  else {
//                  vgNeed.setText(100-Integer.parseInt(vgNeed.getText().toString()));
//                  v.setFocusableInTouchMode(true);
//              }
//
//              return v.performClick();
//          }
//      });




        sostav.setOnClickListener(new View.OnClickListener(){
           // @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(krepost_na_vihode.getText().toString())>Integer.parseInt(krepost_v_bazovoi.getText().toString())){

                    showAlertWithNikotine(v);

                } else if( krepost_v_bazovoi.getText().length() == 0 || krepost_na_vihode.getText().length() == 0
                         || pgNeed.getText().length() == 0 || flavorNeed.getText().length() == 0 ||
                        pgNeed.getText().length() == 0 || howMuchWater.getText().length() == 0 || vgNeed.getText().length() == 0
                        || jidkost_na_vihode.getText().length() == 0)
                { if (kolitchestvo_kapel.getText().length()==0 || Integer.parseInt(kolitchestvo_kapel.getText().toString())>50)

                    showAlert(v);
                    kolitchestvo_kapel.setText("20");}
                    else if (Integer.parseInt(vgNeed.getText().toString())+Integer.parseInt(pgNeed.getText().toString())
                        +Integer.parseInt(howMuchWater.getText().toString())+Integer.parseInt(flavorNeed.getText().toString())
                        !=100){
                        summa100(v);
                }
                else {
                 //   krepost_v_bazovoi, krepost_na_vihode, vgNeed, pgNeed, flavorNeed, jidkost_na_vihode, howMuchWater, kolitchestvo_kapel
                    float krepost_in_b = (float)Integer.parseInt(krepost_v_bazovoi.getText().toString());
                    float krepost_at_ex = (float)Integer.parseInt(krepost_na_vihode.getText().toString());
                    float vg = (float)Integer.parseInt(vgNeed.getText().toString());
                    float pg = (float)Integer.parseInt(pgNeed.getText().toString());
                    float flavor = (float)Integer.parseInt(flavorNeed.getText().toString());
                    float jija = (float)Integer.parseInt(jidkost_na_vihode.getText().toString());
                    float hMW = (float)Integer.parseInt(howMuchWater.getText().toString());
                    float k_kap = (float)Integer.parseInt(kolitchestvo_kapel.getText().toString());

                    float baseNeed, propilenglikolNeed, glicerinNeed, vodaNeed, aromkaNeed;
                    float baseNeedK, propilenglikolNeedK, glicerinNeedK, vodaNeedK, aromkaNeedK;

                    aromkaNeed = flavor * jija/100;
                    baseNeed= (krepost_at_ex*jija)/krepost_in_b;
                    float jija_arom = aromkaNeed + baseNeed;
                    float dlya_podwetov = jija-jija_arom;
                    vodaNeed = dlya_podwetov*hMW/100;
                    propilenglikolNeed =(dlya_podwetov-vodaNeed)*pg/100;
                    glicerinNeed = (dlya_podwetov-vodaNeed-propilenglikolNeed);

                    baseNeedK = baseNeed * k_kap;
                    propilenglikolNeedK = propilenglikolNeed * k_kap;
                    glicerinNeedK = glicerinNeed * k_kap;
                    vodaNeedK = vodaNeed * k_kap;
                    aromkaNeedK = aromkaNeed * k_kap;

                    Intent intent = new Intent(LitleTara.this, Results.class);
                    intent.putExtra("base", baseNeed);
                    intent.putExtra("basek", baseNeedK);
                    intent.putExtra("pg", propilenglikolNeed);
                    intent.putExtra("pgk", propilenglikolNeedK);
                    intent.putExtra("vg", glicerinNeed);
                    intent.putExtra("vgk", glicerinNeedK);
                    intent.putExtra("wat", vodaNeed);
                    intent.putExtra("watK", vodaNeedK);
                    intent.putExtra("ar", aromkaNeed);
                    intent.putExtra("arK", aromkaNeedK);






                    startActivity(intent);


//                    Toast.makeText(v.getContext(), " Ароматизатора: " + aromkaNeed + " мл" + aromkaNeedK +"kapel",
//                            Toast.LENGTH_LONG).show();
//                    Toast.makeText(v.getContext(), " Базовой жидкости: " + baseNeed + " мл " + baseNeedK + "kapel",
//                            Toast.LENGTH_LONG).show();
//                    Toast.makeText(v.getContext(), " Дистиллированной воды: " + vodaNeed + " мл" + vodaNeedK + "kapel",
//                            Toast.LENGTH_LONG).show();
//                    Toast.makeText(v.getContext(), " Пропиленгликоля: " + propilenglikolNeed + " мл" + propilenglikolNeedK + "kapel",
//                            Toast.LENGTH_LONG).show();
//                    Toast.makeText(v.getContext(), " Пищевого глицерина: " + glicerinNeed + " мл" + glicerinNeedK + "kapel",
//                            Toast.LENGTH_LONG).show();
//float all = baseNeed+ propilenglikolNeed+ glicerinNeed+ vodaNeed+ aromkaNeed;
//
//                    Toast.makeText(v.getContext(), " All:   " + all + " мл" ,
//                            Toast.LENGTH_LONG).show();

                }
            }
        });


    }

public void showAlertWithNikotine(View view){
    AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
    myAlert.setMessage(R.string.erR).setPositiveButton("Исправить", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {


            dialog.dismiss();
        }
    }).setTitle("Ошибка!").setIcon(R.drawable.eliq)
            .create();
    myAlert.show();
}
public void showAlert(View view){
    AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
    myAlert.setMessage("Заполните все необходимые поля").setPositiveButton("Заполнить", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {


            dialog.dismiss();
        }
    }).setTitle("Ошибка!").setIcon(R.drawable.eliq)
            .create();
    myAlert.show();
}
public void summa100(View view){
    AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
    myAlert.setMessage("Сумма полей:Процент пропиленгликоля, Процент пищевого глицерина, " +
            "Процент дистиллированной воды, Процент ароматизатора - должна быть равна 100!").setPositiveButton("Исправить", new DialogInterface.OnClickListener() {

        @Override
        public void onClick(DialogInterface dialog, int which) {


            dialog.dismiss();
        }
    }).setTitle("Будь внимательнее!").setIcon(R.drawable.eliq)
            .create();
    myAlert.show();
}
}
