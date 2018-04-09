package by.avpa.kuchinsky.vape_self_dressing.ReadyRec.Banzai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

import by.avpa.kuchinsky.vape_self_dressing.R;


public class Banzai_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banzai_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("BANZAI VAPORS");
        GridLayout mainGrid = (GridLayout)findViewById(R.id.bzGrid);
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

                        Intent intent = new Intent(Banzai_main.this, Banzai_milk.class);
                        startActivity(intent);


                    }else if (finalI==1){

                        Intent intent = new Intent(Banzai_main.this, Banzai_milk.class);
                        startActivity(intent);


                    }

                }
            });
        }
    }}



