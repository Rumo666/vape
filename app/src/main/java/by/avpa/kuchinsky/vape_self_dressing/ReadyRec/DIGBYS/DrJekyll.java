package by.avpa.kuchinsky.vape_self_dressing.ReadyRec.DIGBYS;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import by.avpa.kuchinsky.vape_self_dressing.R;

public class DrJekyll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dr_jekyll);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Dr Jekyll!");
    }
}
