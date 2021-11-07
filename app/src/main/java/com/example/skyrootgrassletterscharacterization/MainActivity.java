package com.example.skyrootgrassletterscharacterization;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public void openWebPage(String url)
    {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }


    Button btnGithub, btnLaunchApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGithub = findViewById(R.id.githubBtn);
        btnGithub.setOnClickListener(this);

        btnLaunchApp = findViewById(R.id.launchBtn);
        btnLaunchApp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch(view.getId()){
            case R.id.githubBtn:
                openWebPage("https://github.com/AfaqShuaib09/Sky_Root_And_Grass_Letters_Characterization");
                break;
            case R.id.launchBtn:
                intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                break;
        }
    }
}