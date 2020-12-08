package com.alaminkarno.phonebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Phone> phoneList;
    RecyclerView recyclerView;
    PhoneAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PhoneAdapter(phoneList,this);
        recyclerView.setAdapter(adapter);

        phoneList.add(new Phone("Alamin","12345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));
        phoneList.add(new Phone("Alamin","012345678",R.drawable.ic_baseline_assignment_ind_24));

        adapter.notifyDataSetChanged();
    }
}