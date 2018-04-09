package by.avpa.kuchinsky.vape_self_dressing.ReadyRec;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import by.avpa.kuchinsky.vape_self_dressing.R;

public class AngryVape extends AppCompatActivity {

    private boolean isOpen =false;
    private ConstraintSet layout1, layout2;
    private ConstraintLayout constraintLayout;
    private ImageView imageViewPhoto;
    private Button rec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angry_vape);
        getSupportActionBar().setTitle("Составы жидкости для электронных сигарет");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        layout1 = new ConstraintSet();
        layout2 = new ConstraintSet();

        imageViewPhoto= (ImageView)findViewById(R.id.photoAV);
        constraintLayout= (ConstraintLayout)findViewById(R.id.angryVape);
        layout2.clone(this, R.layout.recept_expanded);
        layout1.clone(constraintLayout);

        imageViewPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!isOpen) {
                    TransitionManager.beginDelayedTransition(constraintLayout);
                    layout2.applyTo(constraintLayout);
                    isOpen = !isOpen;
                } else {
                    TransitionManager.beginDelayedTransition(constraintLayout);
                    layout1.applyTo(constraintLayout);
                    isOpen = !isOpen;

                }

            }
        });

        rec = (Button)findViewById(R.id.av_recept);
        rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inna = new Intent(AngryVape.this, AV1.class);
                startActivity(inna);
            }
        });

    }
}
