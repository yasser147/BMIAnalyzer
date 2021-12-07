package com.aug.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView Logout;
    Button addRecord,addFood,viewFood;
    private ArrayList<UserRecord> userRecord;
    private RecyclerView rvOldStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvOldStatus = findViewById(R.id.rvOldStatus);
        addRecord = findViewById(R.id.addRecord);
        addFood = findViewById(R.id.addFood);
        viewFood = findViewById(R.id.viewFood);
        Logout = findViewById(R.id.Logout);
        userRecord = new ArrayList<>();

        setUserRecord();
        setAdapter();
        // add Record
        addRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addRecordIntent = new Intent(MainActivity.this,AddRecordActivity.class);
                startActivity(addRecordIntent);

            }
        });
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logoutIntent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(logoutIntent);

            }
        });
    }

    private void setAdapter() {

        OldStatusAdapter adapter = new OldStatusAdapter(userRecord);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvOldStatus.setLayoutManager(layoutManager);
        rvOldStatus.setAdapter(adapter);

    }

    private void setUserRecord() {
        userRecord.add(new UserRecord("normal", "70Kg", "178Cm", "12-12-2012"));
        userRecord.add(new UserRecord("normal", "70Kg", "178Cm", "12-12-2012"));
        userRecord.add(new UserRecord("yasser", "77Kg", "182Cm", "17-02-1998"));
        userRecord.add(new UserRecord("normal", "70Kg", "178Cm", "12-12-2012"));
        userRecord.add(new UserRecord("normal", "70Kg", "178Cm", "12-12-2012"));
        userRecord.add(new UserRecord("normal", "70Kg", "178Cm", "12-12-2012"));
        userRecord.add(new UserRecord("normal", "70Kg", "178Cm", "12-12-2012"));
        userRecord.add(new UserRecord("normal", "70Kg", "178Cm", "12-12-2012"));
        userRecord.add(new UserRecord("normal", "70Kg", "178Cm", "12-12-2012"));

    }
}