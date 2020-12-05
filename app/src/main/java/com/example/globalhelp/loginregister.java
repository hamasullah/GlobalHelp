package com.example.globalhelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class loginregister extends AppCompatActivity {
    private ImageView logo;
    private Button login;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginregister);
        logo = (ImageView) findViewById(R.id.logo);
        login=(Button) findViewById(R.id.siginin);
        Animation ani;

        ani = AnimationUtils.loadAnimation(this,R.anim.transitionafterlogo);
       logo.startAnimation(ani);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainDashboard.class);
                startActivity(intent);
                finish();
            }
        });

    }


}
