package by.avpa.kuchinsky.vape_self_dressing;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

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





        return view;
    }
}
