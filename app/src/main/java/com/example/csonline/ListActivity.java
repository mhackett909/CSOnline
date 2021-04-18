package com.example.csonline;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        if (getSupportActionBar() != null) getSupportActionBar().hide();
        TextView textView3 =  findViewById(R.id.textView3);
        TextView textView2 = findViewById(R.id.textView2);
        Bundle bundle = getIntent().getExtras();
        textView3.setText(bundle.getString("title"));
        textView2.setText(bundle.getString("desc"));
        textView2.setMovementMethod(new ScrollingMovementMethod());
    }
}