package com.anik.eazegraph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.models.BarModel;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        BarChart mBarChart =  findViewById(R.id.barchart);

        //Level- values-colorCode
        mBarChart.addBar(new BarModel("JAN",2.3f, 0xFF123456));
        mBarChart.addBar(new BarModel("FEB",2.f,  0xFF343456));
        mBarChart.addBar(new BarModel("MAR",3.3f, 0xFF563456));
        mBarChart.addBar(new BarModel("APR",1.1f, 0xFF873F56));
        mBarChart.addBar(new BarModel("MAY",2.7f, 0xFF56B7F1));
        mBarChart.addBar(new BarModel("JUN",2.f,  0xFF343456));
        mBarChart.addBar(new BarModel("JUL",0.4f, 0xFF1FF4AC));
        mBarChart.addBar(new BarModel("AUG",4.f,  0xFF1BA4E6));

        mBarChart.startAnimation(); //for start chart with animation

    }
}
