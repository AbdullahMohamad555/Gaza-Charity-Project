package ucac.edu.ps.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    private ImageView imageView;
    private Animation anim;
    private TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imageView = findViewById(R.id.iv_palestine);
        view = findViewById(R.id.tv_textWelcome);

        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation);
        imageView.setAnimation(anim);
        view.setAnimation(anim);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(7000);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        t1.start();

    }
}