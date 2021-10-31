package com.gasstudio.tugas4_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView MainImageView;
    TextView title,deskripsi;

    String data1,data2;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        MainImageView = findViewById(R.id.MainImageView);
        title = findViewById(R.id.title);
        deskripsi = findViewById(R.id.deskripsi);

        getData();
        setData();
    }

    private void getData(){
        if (getIntent().hasExtra("image") && getIntent().hasExtra("data1") &&
        getIntent().hasExtra("data2")){

        data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            image = getIntent().getIntExtra("image", 1);

        }else{
            Toast.makeText(this,"No Data",Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        title.setText(data1);
        deskripsi.setText(data2);
        MainImageView.setImageResource(image);
    }
}