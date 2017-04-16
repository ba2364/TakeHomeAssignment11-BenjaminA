package com.ba2364.takehomeassignment11_benjamina;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class CityAdapter extends RecyclerView.Adapter<CityViewHolder> {

    private List<City> cities;
    private Context context;

    public CityAdapter(List<City> cities, Context context) {
        this.cities = cities;
        this.context = context;
    }

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_city_adapter, parent, false);
        return new CityViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(CityViewHolder holder, int position) {
        City city = cities.get(position);
        holder.bind(city);
    }

    @Override
    public int getItemCount() {
        return cities.size();
    }
}