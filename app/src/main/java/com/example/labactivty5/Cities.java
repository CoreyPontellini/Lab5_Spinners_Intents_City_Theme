package com.example.labactivty5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Cities extends AppCompatActivity {

    TextView cityName,cityPop,cityClimate;
    ImageView cityImage;
    Button returnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);

        cityName = findViewById(R.id.tvCity);
        cityPop = findViewById(R.id.tvPopulation);
        cityClimate = findViewById(R.id.tvClimate);
        cityImage = findViewById(R.id.cityImage);

        Intent intent = getIntent();
        String cityLoc = intent.getStringExtra("city");
        String cityCli = intent.getStringExtra("climate");
        int image = intent.getIntExtra(MainActivity.image,1);
        int cityPopu = intent.getIntExtra("population",0);
        cityName.setText(cityLoc);
        cityClimate.setText(cityCli);
        cityImage.setImageResource(image);
        cityPop.setText((String.valueOf(cityPopu)));

        returnHome = findViewById(R.id.homeScreen);

        returnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cities.this,MainActivity.class));
            }
        });



    }
}