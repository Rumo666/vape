package by.avpa.kuchinsky.vape_self_dressing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        getSupportActionBar().setTitle("Результат замеса");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        float basovoy = getIntent().getExtras().getFloat("base");
        float basovoyK = getIntent().getExtras().getFloat("basek");
        float Pg = getIntent().getExtras().getFloat("pg");
        float PgK = getIntent().getExtras().getFloat("pgk");
        float Vg = getIntent().getExtras().getFloat("vg");
        float VgK = getIntent().getExtras().getFloat("vgk");
        float Wat = getIntent().getExtras().getFloat("wat");
        float WatK = getIntent().getExtras().getFloat("watK");
        float AR = getIntent().getExtras().getFloat("ar");
        float ARK = getIntent().getExtras().getFloat("arK");


        TextView BasovoyML = (TextView)findViewById(R.id.basovoyMl);
        TextView Basovoykap = (TextView)findViewById(R.id.basovoyK);
        BasovoyML.setText(" "+basovoy + " мл");
        Basovoykap.setText(basovoyK + " капель");
        TextView pg = (TextView)findViewById(R.id.pgMl);
        TextView pgK = (TextView)findViewById(R.id.pgK);
        pg.setText(" "+Pg + " мл");
        pgK.setText(PgK + " капель");
        TextView vg = (TextView)findViewById(R.id.vgMl);
        TextView vgK = (TextView)findViewById(R.id.vgK);
        vg.setText(" "+Vg + " мл");
        vgK.setText(VgK + " капель");
        TextView wat = (TextView)findViewById(R.id.watMl);
        TextView watM = (TextView)findViewById(R.id.watK);
        wat.setText(" "+Wat + " мл");
        watM.setText(WatK + " капель");
        TextView arK = (TextView)findViewById(R.id.arK);
        TextView arM = (TextView)findViewById(R.id.arMl);
        arM.setText(" "+AR + " мл");
        arK.setText(ARK + " капель");




    }
}
