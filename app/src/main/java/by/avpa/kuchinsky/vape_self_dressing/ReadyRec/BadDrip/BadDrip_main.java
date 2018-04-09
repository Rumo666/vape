package by.avpa.kuchinsky.vape_self_dressing.ReadyRec.BadDrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

import by.avpa.kuchinsky.vape_self_dressing.R;


public class BadDrip_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad_drip_main);
        getSupportActionBar().setTitle("BAD DRIP");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        GridLayout mainGrid = (GridLayout)findViewById(R.id.bdGrid);
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

                        Intent intent = new Intent(BadDrip_main.this, Cereal_Trip.class);
                        startActivity(intent);


                    }else if (finalI==1){

                        Intent intent = new Intent(BadDrip_main.this, Cereal_Trip.class);
                        startActivity(intent);


                    }
                    else if (finalI==2){

                        Intent intent = new Intent(BadDrip_main.this, Ugly_Butter.class);
                        startActivity(intent);


                    }else if (finalI==3){

                        Intent intent = new Intent(BadDrip_main.this, Ugly_Butter.class);
                        startActivity(intent);


                    }
                    else if (finalI==4){

                        Intent intent = new Intent(BadDrip_main.this, Bad_Blood.class);
                        startActivity(intent);


                    }else if (finalI==5){

                        Intent intent = new Intent(BadDrip_main.this, Bad_Blood.class);
                        startActivity(intent);


                    }
                    else  if (finalI==6){

                        Intent intent = new Intent(BadDrip_main.this, Cereal_Killer.class);
                        startActivity(intent);


                    }else if (finalI==7){

                        Intent intent = new Intent(BadDrip_main.this, Cereal_Killer.class);
                        startActivity(intent);


                    }
                    else if (finalI==8){

                        Intent intent = new Intent(BadDrip_main.this, Gnarly_Sause.class);
                        startActivity(intent);


                    }else if (finalI==9){

                        Intent intent = new Intent(BadDrip_main.this, Gnarly_Sause.class);
                        startActivity(intent);


                    }



                }
            });
        }
    }



}