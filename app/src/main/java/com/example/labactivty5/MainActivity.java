package com.example.labactivty5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    String[] cities = {"Select a City","Vancouver","Kelowna","Toronto","Saskatoon","St. Johns"};
    Spinner spinnerCities;

    //image key ID
    public static final String image = "picture";

    // Vancouver variables
    final String VPOPULATION = "2657000";
    final String vClim = "Climate Type: Oceanic";

    //Kelowna Variables

    final String KPOPULATION = "160507";
    final String kClim = "Climate Type: Inland Ocean";

    //Toronto Variables
    final String TPOPULATION = "6372000";
    final String tClim = "Climate Type: Continental";

    //Saskatoon Variables
    final String SPOPULATION = "342000";
    final String sClim = "Climate Type: Cold Semi-Arid";

    //St. Johns Variables
    final String STJPOPULATION = "224000";
    final String stjClim = "Climate Type: Humid Continental";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerCities = findViewById(R.id.citySpinner);

        ArrayAdapter adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, cities);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerCities.setAdapter(adapter);

        spinnerCities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String city = spinnerCities.getSelectedItem().toString();
                int pop = 0;


                switch (city) {
                    case "Select a City":
                        Toast.makeText(getApplicationContext(), "Please select a City!", Toast.LENGTH_LONG).show();
                        break;
                    case "Vancouver": {
                        pop = Integer.parseInt(VPOPULATION);
                        Intent intent = new Intent(MainActivity.this, Cities.class);
                        intent.putExtra("city",city);
                        intent.putExtra("population",pop);
                        intent.putExtra("climate",vClim);
                        intent.putExtra(image,R.drawable.vancouver);

                        startActivity(intent);

                        break;
                    }
                    case "Kelowna": {
                        pop = Integer.parseInt(KPOPULATION);
                        Intent intent = new Intent(MainActivity.this, Cities.class);
                        intent.putExtra("city",city);
                        intent.putExtra("population",pop);
                        intent.putExtra("climate",kClim);
                        intent.putExtra(image,R.drawable.kelowna);

                        startActivity(intent);

                        break;
                    }
                    case "Toronto": {
                        pop = Integer.parseInt(TPOPULATION);
                        Intent intent = new Intent(MainActivity.this, Cities.class);
                        intent.putExtra("city",city);
                        intent.putExtra("population",pop);
                        intent.putExtra("climate",tClim);
                        intent.putExtra(image,R.drawable.toronto);

                        startActivity(intent);

                        break;
                    }
                    case "Saskatoon": {
                        pop = Integer.parseInt(SPOPULATION);
                        Intent intent = new Intent(MainActivity.this, Cities.class);
                        intent.putExtra("city",city);
                        intent.putExtra("population",pop);
                        intent.putExtra("climate",sClim);
                        intent.putExtra(image,R.drawable.saskatoon);

                        startActivity(intent);

                        break;
                    }
                    case "St. Johns": {
                        pop = Integer.parseInt(STJPOPULATION);
                        Intent intent = new Intent(MainActivity.this, Cities.class);
                        intent.putExtra("city",city);
                        intent.putExtra("population",pop);
                        intent.putExtra("climate",stjClim);
                        intent.putExtra(image,R.drawable.stjohns);
                        startActivity(intent);

                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





    }
}