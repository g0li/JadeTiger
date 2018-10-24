package com.lilliemountain.jadetiger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        int columns=getResources().getInteger(R.integer.col);
        recyclerView.setLayoutManager(new GridLayoutManager(this,columns));

        List<Event> eventList=new ArrayList<>();
        eventList.add(new Event("Simon Maenling",
                "Gr Flr 7/10 Botwala Bldg Horniman Circle Fort",
                R.drawable.simon,
                "Vidar Nordli Mathisen",
                "F-11 Sector 4 Nerul Navi Mumbai",
                R.drawable.vidar));
        eventList.add(new Event("Alekon",
                "51 Rd Flr Olympus rd Flr Perin Nariman Street",
                R.drawable.alekon,
                "Wesley Tingey",
                "300 Gandhipuram Coimbatore",
                R.drawable.wesley_tingey));
        recyclerView.setAdapter(new EventAdapter(this,eventList));
    }
}
