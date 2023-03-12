package com.example.danawa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class detailActivity extends AppCompatActivity {

    TextView detail_name_text;
    TextView detail_cost_text;
    TextView detail_level_text;
    ImageView imageView;
    String detail_name, detail_cost, detail_level;
    int detail_pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detail_name_text = findViewById(R.id.detail_name_text);
        detail_cost_text = findViewById(R.id.detail_cost_text);
        detail_level_text = findViewById(R.id.detail_level_text);
        imageView = findViewById(R.id.imageView);
        Intent intent = getIntent();

        detail_name = intent.getStringExtra("pro_name");
        detail_cost = intent.getStringExtra("pro_cost");
        detail_level = intent.getStringExtra("pro_level");
        detail_pic = intent.getExtras().getInt("pro_pic");

        detail_name_text.setText(detail_name);
        detail_cost_text.setText("가격 : " + detail_cost);
        detail_level_text.setText(detail_level);
        imageView.setImageResource(detail_pic);


        Button imageButton = (Button) findViewById(R.id.button_first);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), homeActivity.class);
                startActivity(intent);
            }
        });
        Toolbar toolbar = findViewById(R.id.menu_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                // 액티비티 이동
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}