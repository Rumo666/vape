package by.avpa.kuchinsky.vape_self_dressing.ReadyRec.Breakfast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import by.avpa.kuchinsky.vape_self_dressing.R;

public class Crunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crunch);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Crunch");
    }
}
