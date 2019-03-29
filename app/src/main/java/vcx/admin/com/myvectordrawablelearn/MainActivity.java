package vcx.admin.com.myvectordrawablelearn;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimatedVectorDrawable mightyMorphinAnimatedVectorDrawable;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        mightyMorphinAnimatedVectorDrawable = (AnimatedVectorDrawable) getDrawable(R.drawable.animate_path);

        final ImageView imageView_tick = (ImageView)findViewById(R.id.img_tick);
        ((Animatable) imageView_tick.getDrawable()).start();
        imageView_tick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Animatable) imageView_tick.getDrawable()).start();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                /*morph();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                            }
                        });
                    }
                }, 2000);*/
            }
        });
    }


    /*public void morph() {
        AnimatedVectorDrawable prevDrawable = mightyMorphinAnimatedVectorDrawable;
        if (prevDrawable.isRunning()) {
            prevDrawable.stop();
        }

        AnimatedVectorDrawable currentDrawable = mightyMorphinAnimatedVectorDrawable;
        imageView.setImageDrawable(currentDrawable);
        currentDrawable.start();
    }*/

}
