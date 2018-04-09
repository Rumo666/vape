package by.avpa.kuchinsky.vape_self_dressing.ReadyRec.BoardWalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import by.avpa.kuchinsky.vape_self_dressing.R;

public class BombShell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bomb_shell);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Bomb Shell");
    }
}
