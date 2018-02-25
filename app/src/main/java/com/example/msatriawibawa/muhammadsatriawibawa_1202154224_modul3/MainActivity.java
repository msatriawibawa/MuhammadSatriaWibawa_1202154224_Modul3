package com.example.msatriawibawa.muhammadsatriawibawa_1202154224_modul3;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<Air> mAirData;
    private AirAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Selamat Datang", Toast.LENGTH_SHORT).show();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        int gridColumn = getResources().getInteger(R.integer.grid_column_count);

        mRecyclerView.setLayoutManager(new GridLayoutManager(this, gridColumn));

        mAirData = new ArrayList<>();

        mAdapter = new AirAdapter(this, mAirData);
        mRecyclerView.setAdapter(mAdapter);

        initialiseData();

    }

    private void initialiseData(){
        String[] ListAir = getResources().getStringArray(R.array.title_label_air);
        String[] TextAir = getResources().getStringArray(R.array.text_air);
        TypedArray ImageResourceAir = getResources().obtainTypedArray(R.array.image_label_air);
        mAirData.clear();

        for (int i=0; i<ListAir.length; i++){
            mAirData.add(new Air(ListAir[i], TextAir[i], ImageResourceAir.getResourceId(i, 0)));
        }

        ImageResourceAir.recycle();

        mAdapter.notifyDataSetChanged();
    }
}

