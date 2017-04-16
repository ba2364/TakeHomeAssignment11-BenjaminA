package com.ba2364.takehomeassignment11_benjamina;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CityViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView cityNameView;
    private TextView cityYearEstView;
    private ImageView cityFlagView;
    private Context context;

    public CityViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        cityNameView = (TextView) itemView.findViewById(R.id.city_name);
        cityYearEstView = (TextView) itemView.findViewById(R.id.established);
        cityFlagView = (ImageView) itemView.findViewById(R.id.cityflag);
        this.context = context;
    }

    public void bind(final City city) {
        cityNameView.setText(city.cityName);
        cityYearEstView.setText(city.yearEst);
        cityFlagView.setImageResource(city.logoIDNum);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                City t = new City(city.cityName, city.yearEst, city.logoIDNum);
                Intent teamIntent = new Intent(context, DetailedInfo.class);
                teamIntent.putExtra(Keys.CITY, t);
                context.startActivity(teamIntent);

                Toast.makeText(context, cityNameView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}