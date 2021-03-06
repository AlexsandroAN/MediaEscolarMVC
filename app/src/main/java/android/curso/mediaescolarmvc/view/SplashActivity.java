package android.curso.mediaescolarmvc.view;

import android.content.Intent;
import android.curso.mediaescolarmvc.R;
import android.curso.mediaescolarmvc.controller.AplicativoController;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Verificar se Google Play Service Client está
        // Instalado


            apresentarTelaSplash();

         

    }

    private void apresentarTelaSplash() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent telaPrincipal
                        = new Intent(SplashActivity.this,
                        MainActivity.class);

                startActivity(telaPrincipal);

                finish();

            }
        }, SPLASH_TIME_OUT);

    }
}
