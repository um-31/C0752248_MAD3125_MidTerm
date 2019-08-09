package com.example.c0752248_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView txtMissionName,txtFlightNumber,txtLaunchYear,txtRocketId,txtRocketType;
    MyListData myListData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        myListData = (MyListData) getIntent().getSerializableExtra("sendData");
        init();
        setData();
    }
    public void init() {
        txtMissionName = (TextView) findViewById(R.id.txtMissionName);
        txtFlightNumber = (TextView) findViewById(R.id.txtFlightNumber);
        txtLaunchYear = (TextView) findViewById(R.id.txtLaunchYear);
        txtRocketId = (TextView) findViewById(R.id.txtRocketId);
        txtRocketType = (TextView) findViewById(R.id.txtRocketType);
    }
    public void setData() {
        txtMissionName.setText("Mission Name: "+myListData.getMissionName());
        txtFlightNumber.setText("Flight Number: "+myListData.getFlightNumber());
        txtLaunchYear.setText("Launch Year: "+myListData.getLaunchYear());
        txtRocketId.setText("Rocket Id: "+myListData.getRocketId());
        txtRocketType.setText("Rocket Type: "+myListData.getRocketType());
    }
}
