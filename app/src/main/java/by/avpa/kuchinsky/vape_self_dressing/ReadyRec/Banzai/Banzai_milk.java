package by.avpa.kuchinsky.vape_self_dressing.ReadyRec.Banzai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import by.avpa.kuchinsky.vape_self_dressing.R;

public class Banzai_milk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banzai_mil);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Milk Plus");
    }
}
