package com.example.csonline;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) getSupportActionBar().hide();
        String[] courseDesc = getResources().getStringArray(R.array.description_array);
        String[] courses = getResources().getStringArray(R.array.course_array);
        ListView listView = findViewById(R.id.listView);
        Button videoButton = findViewById(R.id.button);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listview_layout, courses);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(this, ListActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("title", courses[position]);
            bundle.putString("desc", courseDesc[position]);
            intent.putExtras(bundle);
            startActivity(intent);
        });
        videoButton.setOnClickListener(v -> {
            startActivity(new Intent(this, VideoActivity.class));
        });
    }
}