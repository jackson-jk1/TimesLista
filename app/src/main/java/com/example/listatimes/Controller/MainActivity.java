package com.example.listatimes.Controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.listatimes.Adapter.AdapterTimes;
import com.example.listatimes.Model.Time;
import com.example.listatimes.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewTimes;
    private List<Time> timeList = new ArrayList<Time>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewTimes = findViewById(R.id.recyclerViewTimes);
        this.createTime();
        AdapterTimes adapterTime = new AdapterTimes(timeList);

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(getApplicationContext());
        recyclerViewTimes.setLayoutManager(layoutManager);
        recyclerViewTimes.setHasFixedSize(true);
        recyclerViewTimes.setAdapter(adapterTime);
    }

    private void createTime() {
        Time obj = new Time(R.drawable.coxa,"Coritiba", "Curitiba-PR");
        timeList.add(obj);
        obj = new Time(R.drawable.atlhetico,"Athletico", "Curitiba-PR");
        timeList.add(obj);
        obj = new Time(R.drawable.parana,"Parana", "Curitiba-PR");
        timeList.add(obj);
        obj = new Time(R.drawable.operario,"Operario", "Ponta Grossa-PR");
        timeList.add(obj);
    }
}