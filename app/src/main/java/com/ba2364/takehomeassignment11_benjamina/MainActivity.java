package com.ba2364.takehomeassignment11_benjamina;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<City> cities;
    private CityAdapter cityAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        cityAdapter = new CityAdapter(cities, this);
        recyclerView.setAdapter(cityAdapter);
    }

    public void addRandomCity(View view) {
        cities.add(getRandomCity());
        cityAdapter.notifyDataSetChanged();   // this is important to inform the program that data has changed
    }

    private void initialData() {
        cities = new ArrayList<>();
        cities.add(new City("New York Giants", "Established 1925", R.drawable.giants));
        cities.add(new City("New York Mets", "Established 1962", R.drawable.mets));
        cities.add(new City("New York Rangers", "Established 1926", R.drawable.rangers));
        cities.add(new City("New York Knicks", "Established 1946", R.drawable.knicks));
    }

    private City getRandomCity() {
        int num = (int) (Math.random() * 8);
        if (num == 0)
            return new City("New York Giants", "Established 1925 ", R.drawable.giants);
        else if (num == 1)
            return new City("New York Mets", "Established 1962 ", R.drawable.mets);
        else if (num == 2)
            return new City("New York Rangers", "Established 1926", R.drawable.rangers);
        else if (num == 3)
            return new City("New York Knicks", "Established 1946", R.drawable.knicks);
        else if (num == 4)
            return new City("New York Yankees", "Established 1903", R.drawable.yankees);
        else if (num == 5)
            return new City("New York Islanders", "Established 1972", R.drawable.isles);
        else if (num == 6)
            return new City("New Jersey Devils", "Established 1974", R.drawable.devils);
        else if (num == 7)
            return new City("Brooklyn Nets", "Established 1967", R.drawable.nets);
        else
            return new City("New York Jets", "Established 1960", R.drawable.jets);
    }
}