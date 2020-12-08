package com.alaminkarno.phonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView nameTV,phoneTV;
    ImageView imageView;

    String name,phone;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameTV = findViewById(R.id.nameTV);
        phoneTV = findViewById(R.id.phoneCallTV);
        imageView = findViewById(R.id.imageView);

        name = getIntent().getStringExtra(PhoneAdapter.NAME);
        phone = getIntent().getStringExtra(PhoneAdapter.PHONE);
        image = getIntent().getIntExtra(PhoneAdapter.IMAGE,0);


        nameTV.setText(name);
        phoneTV.setText(phone);
        imageView.setImageResource(image);
    }
}