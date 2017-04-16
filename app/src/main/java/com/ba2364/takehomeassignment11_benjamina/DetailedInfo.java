package com.ba2364.takehomeassignment11_benjamina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedInfo extends AppCompatActivity {

    private ImageView cityFlag;
    private TextView cityName;
    private TextView yearEstd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_info);

        cityFlag = (ImageView) findViewById(R.id.city_flag_detail);
        cityName = (TextView) findViewById(R.id.city_name_detail);
        yearEstd = (TextView) findViewById(R.id.year_est_detail);

        Intent teamIntent = getIntent();
        City t = (City) teamIntent.getSerializableExtra(Keys.CITY);

        cityFlag.setImageResource(t.getLogoIDNum());
        cityName.setText(t.getCityName());
        yearEstd.setText(t.getYearEst());
    }
}