package by.avpa.kuchinsky.vape_self_dressing.ReadyRec.CosmigFog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import by.avpa.kuchinsky.vape_self_dressing.R;

public class ColaGummy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cola_gummy);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Cola Gummy");
    }
}
