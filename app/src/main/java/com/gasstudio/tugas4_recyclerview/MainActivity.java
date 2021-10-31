package com.gasstudio.tugas4_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int image[] = {R.drawable.adobe_xd,R.drawable.facebook,R.drawable.figma,
                    R.drawable.firefox,R.drawable.instagram,R.drawable.line,
                    R.drawable.whatsapp,R.drawable.youtube};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.Programming);
        s2 = getResources().getStringArray(R.array.descriptoion);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, image);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}