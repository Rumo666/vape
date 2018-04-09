package by.avpa.kuchinsky.vape_self_dressing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class Tutorial extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("First title").setContent("first content")
        .setSummary("First summary").setDrawable(R.drawable.eliq)
        .setBackgroundColor(R.color.colW).build());

        addFragment(new Step.Builder().setTitle("Second title").setContent("Second content")
                .setSummary("Second summary").setDrawable(R.drawable.ic_av_timer_black_24dp)
                .setBackgroundColor(R.color.colorPrimary).build());

        addFragment(new Step.Builder().setTitle("Third title").setContent("Third content")
                .setSummary("Third summary").setDrawable(R.drawable.ic_colorize_black_24dp)
                .setBackgroundColor(R.color.colorPrimary).build());
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.end:

                break;
            case R.id.next:

                break;
        }
    }
}
