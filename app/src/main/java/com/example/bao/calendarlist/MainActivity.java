package com.example.bao.calendarlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * 思路
 * 1、生成日历数据
 * 生成每个月的每一天的数据
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarList calendarList=findViewById(R.id.calendarList);
        calendarList.setOnDateSelected(new CalendarList.OnDateSelected() {
            @Override
            public void selected(String startDate, String endDate) {
                Toast.makeText(getApplicationContext(),"s:"+startDate+"e:"+endDate,Toast.LENGTH_LONG).show();
            }
        });
    }


}
