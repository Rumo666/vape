package by.avpa.kuchinsky.vape_self_dressing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BigTara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_tara);
        getSupportActionBar().setTitle("Составы жидкости для электронных сигарет");
        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }
}
