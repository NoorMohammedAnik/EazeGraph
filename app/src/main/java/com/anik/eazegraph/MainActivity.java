package com.anik.eazegraph;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnBarChart,btnStackedBarChart,btnPieChart,btnLineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBarChart=findViewById(R.id.btn_bar_chart);
        btnStackedBarChart=findViewById(R.id.btn_stacked_bar_chart);
        btnPieChart=findViewById(R.id.btn_pie_chart);
        btnLineChart=findViewById(R.id.btn_line_chart);

        btnBarChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,BarChartActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Bar Chart", Toast.LENGTH_SHORT).show();
            }
        });


        btnPieChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,PieChartActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "PIE Chart", Toast.LENGTH_SHORT).show();
            }
        });


        btnLineChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,LineChartActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Line Chart", Toast.LENGTH_SHORT).show();
            }
        });


        btnStackedBarChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,StackedBarChartActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Stacked Bar Chart", Toast.LENGTH_SHORT).show();
            }
        });





    }
}
