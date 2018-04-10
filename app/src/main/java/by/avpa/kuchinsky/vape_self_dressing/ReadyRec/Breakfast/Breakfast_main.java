package by.avpa.kuchinsky.vape_self_dressing.ReadyRec.Breakfast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

import by.avpa.kuchinsky.vape_self_dressing.R;

public class Breakfast_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("BREAKFAST AT TELEOS");
        GridLayout mainGrid = (GridLayout)findViewById(R.id.breakGrid);
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

                        Intent intent = new Intent(Breakfast_main.this, Crunch.class);
                        startActivity(intent);


                    }else if (finalI==1){

                        Intent intent = new Intent(Breakfast_main.this, Crunch.class);
                        startActivity(intent);


                    }

                }
            });
        }
    }}

