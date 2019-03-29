package vcx.admin.com.myvectordrawablelearn;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    ImageView mImgCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mImgCheck = (ImageView) findViewById(R.id.imageView);
        mImgCheck.setVisibility(View.INVISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ((Animatable) mImgCheck.getDrawable()).start();
                mImgCheck.setVisibility(View.VISIBLE);
            }
        }, 1500);
        /*mImgCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Animatable) mImgCheck.getDrawable()).start();
            }
        });*/
    }

}
