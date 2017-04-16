package com.ba2364.takehomeassignment11_benjamina;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_item_save:
                cities.add(getRandomCity());
                cityAdapter.notifyDataSetChanged();   // this is important to inform the program that data has changed
                Toast.makeText(this, "City added", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void initialData() {
        cities = new ArrayList<>();
        cities.add(new City("New York", "Established 1624", R.drawable.newyork));
        cities.add(new City("Los Angeles", "Established 1781", R.drawable.losangeles));
        cities.add(new City("Boston", "Established 1630", R.drawable.boston));
    }

    private City getRandomCity() {
        int num = (int) (Math.random() * 4);
        if (num == 0)
            return new City("New York", "Established 1624 ", R.drawable.newyork);
        else if (num == 1)
            return new City("Los Angeles", "Established 1781 ", R.drawable.losangeles);
        else if (num == 2)
            return new City("Boston", "Established 1630", R.drawable.boston);
        else if (num == 3)
            return new City("Chicago", "Established 1780", R.drawable.chicago);
        else
            return new City("Philadelphia", "Established 1682", R.drawable.phila);
    }
}