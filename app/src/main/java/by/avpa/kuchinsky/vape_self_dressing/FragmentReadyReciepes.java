package by.avpa.kuchinsky.vape_self_dressing;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ListView;

import by.avpa.kuchinsky.vape_self_dressing.ReadyRec.AngryVape;
import by.avpa.kuchinsky.vape_self_dressing.ReadyRec.BadDrip.BadDrip_main;
import by.avpa.kuchinsky.vape_self_dressing.ReadyRec.Banzai.Banzai_main;
import by.avpa.kuchinsky.vape_self_dressing.ReadyRec.BoardWalk.BoardWalkMain;
import by.avpa.kuchinsky.vape_self_dressing.ReadyRec.Boiler.BoilerMain;
import by.avpa.kuchinsky.vape_self_dressing.ReadyRec.Bombies.Bombies_main;
import by.avpa.kuchinsky.vape_self_dressing.ReadyRec.VapeWild;

/**
 * Created by Alexandr Kuchinsky on 02.04.2018.
 */

public class FragmentReadyReciepes extends Fragment {

    View view;

    public FragmentReadyReciepes() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.ready_reciepes, container, false);
        GridLayout mainGrid = view.findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
        mainGrid.setClickable(true);

        return view;
    }

    private void setSingleEvent(GridLayout mainGrid) {

        for (int i = 0; i < mainGrid.getChildCount(); i++) {

            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI==0){

                        Intent intent = new Intent(getContext(), AngryVape.class);
                        startActivity(intent);


                    } else if (finalI==1){

                        Intent intent = new Intent(getContext(), AngryVape.class);
                        startActivity(intent);


                    }
                    else if (finalI==2){

                        Intent intent = new Intent(getContext(), VapeWild.class);
                        startActivity(intent);


                    }
                    else if (finalI==3){

                        Intent intent = new Intent(getContext(), VapeWild.class);
                        startActivity(intent);


                    }
                    else if (finalI==4){

                        Intent intent = new Intent(getContext(), BadDrip_main.class);
                        startActivity(intent);


                    }
                    else if (finalI==5){

                        Intent intent = new Intent(getContext(), BadDrip_main.class);
                        startActivity(intent);


                    }
                    else if (finalI==6){

                        Intent intent = new Intent(getContext(), Banzai_main.class);
                        startActivity(intent);


                    }
                    else if (finalI==7){

                        Intent intent = new Intent(getContext(), Banzai_main.class);
                        startActivity(intent);


                    }
                    else if (finalI==8){

                        Intent intent = new Intent(getContext(), Bombies_main.class);
                        startActivity(intent);


                    }
                    else if (finalI==9){

                        Intent intent = new Intent(getContext(), Bombies_main.class);
                        startActivity(intent);


                    }
                    else if (finalI==10){

                        Intent intent = new Intent(getContext(), BoardWalkMain.class);
                        startActivity(intent);


                    }
                    else if (finalI==11){

                        Intent intent = new Intent(getContext(), BoardWalkMain.class);
                        startActivity(intent);


                    }
                    else if (finalI==12){

                        Intent intent = new Intent(getContext(), BoilerMain.class);
                        startActivity(intent);


                    }
                    else if (finalI==13){

                        Intent intent = new Intent(getContext(), BoilerMain.class);
                        startActivity(intent);


                    }

                }
            });
        }
    }



}