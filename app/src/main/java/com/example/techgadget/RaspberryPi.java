package com.example.techgadget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RaspberryPi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raspberry_pi);

        final Button btnLoad = findViewById(R.id.btnViewPage);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.digikey.com/en/product-highlight/r/raspberry-pi/raspberry-pi-4-model-b?utm_adgroup=Raspberry%20Pi&utm_source=google&utm_medium=cpc&utm_campaign=NB_Development%20Board_E&utm_term=raspberry%20pi&utm_content=Raspberry%20Pi&gclid=Cj0KCQiAs67yBRC7ARIsAF49CdWrbIC7-4T0gx4TA8BA7iD8E7n9nKIW2hbYn0ZpLu_dFQKBsfdH2zkaAp2uEALw_wcB")));

            }
        });
    }
}
