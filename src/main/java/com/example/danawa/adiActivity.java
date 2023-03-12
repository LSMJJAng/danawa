package com.example.danawa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class adiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lsm);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        final ProductAdapter adapter = new ProductAdapter();

        adapter.addItem(new Product("아디다스 프레데터 펄스", "459,000" , "발볼 등급 : C", R.drawable.adi1));
        adapter.addItem(new Product("아디다스 프레데터 펄스 UCL", "459,000" , "발볼 등급 : C", R.drawable.adi2));
        adapter.addItem(new Product("아디다스 프레데터 프릭+폴 포그바X스텔라 맥카트니 ", "369,000" , "발볼 등급 : C", R.drawable.adi3));
        adapter.addItem(new Product("아디다스 프레데터 프릭+", "359,000" , "발볼 등급 : C", R.drawable.adi4));
        adapter.addItem(new Product("아디다스 프레데터 엣지.1", "299,000" , "발볼 등급 : C", R.drawable.adi5));
        adapter.addItem(new Product("아디다스 프레데터 엣지.1 ", "299,000" , "발볼 등급 : C", R.drawable.adi6));
        adapter.addItem(new Product("아디다스 프레데터 엣지.3 L", "109,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 엣지.3 ", "129,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 엣지.1 L ", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 엣지.1 L ", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 뮤테이터 20.2", "169,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 프릭.1 L", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 뮤테이터 20.1", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 프릭.1 L", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 뮤테이터 20.1 L", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 프릭.1", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 프릭.1 L", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 프릭.3 L", "109,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 프릭.1", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 프릭.3", "129,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 프릭.1 L", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 20.4 FXG", "79,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 20.3 L", "99,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 20.4 S FXG", "89,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 19.1", "239,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 19.4 FXG", "79,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 프레데터 18.1", "259,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 네메시스 0.1", "299,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 네메시스 0.1", "299,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 네메시스 0.1", "299,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 네메시스 19+", "329,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 네메시스 0.3", "129,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 네메시스 19.3", "119,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 스피드플로우+", "359,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 F50 고스티드 아디제로", "339,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 F50 고스티드 UCL", "339,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 스피드플로우.3", "109,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 고스티드.1", "299,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 스피드플로우.1", "299,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 스피드플로우 메시.1", "299,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 스피드플로우.1", "299,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 스피드플로우.2", "179,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 스피드플로우.4 FXG ", "79,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 스피드플로우.1", "299,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 스피드플로우.3 LL", "139,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 고스티드.1", "299,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 19.3", "119,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 고스티드.3", "129,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 고스티드.2", "179,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 고스티드.1", "299,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 고스티드.4 FXG", "79,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 19.2", "169,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 19.1", "239,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 19.4 FXG", "79,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 엑스 17+", "359,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 코파  18.3", "39,900" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 코파  19.3", "48,130" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 코파  20.1", "526,100" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 코파  20.1", "138,910" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 코파  20.3", "52,720" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 코파  20.4", "37,260" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 코파  글로로 20.2", "55,050" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 코파  문디알 21PK", "178,480" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 코파  문디알", "101,740" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 코파  센스.1", "151,480" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 코파  센스.1", "160,540" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 코파  센스.1", "151,840" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new Product("아디다스 코파  센스.3", "57,650" , "발볼 등급 : D", R.drawable.birdmissile1));

        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new OnProductItemClickListener() {
            @Override
            public void onItemClick(ProductAdapter.ViewHolder holder, View view, int position) {
                Product item = adapter.getItem(position);
                Intent intent = new Intent(adiActivity.this, detailActivity.class);

                intent.putExtra("pro_name", item.getName());
                intent.putExtra("pro_cost", item.getCost());
                intent.putExtra("pro_level", item.getFootlevel());
                intent.putExtra("pro_pic", item.getPic());

                startActivity(intent);
                Toast.makeText(getApplicationContext(), "이름 : " + item.getName() + "\n 가격 : " + item.getCost() +
                        "\n 설명 : " + item.getFootlevel(),Toast.LENGTH_LONG).show();
            }
        });

        Button imageButton = (Button) findViewById(R.id.button_first);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), homeActivity.class);
                startActivity(intent);
            }
        });

        Button imageButton2 = (Button) findViewById(R.id.nike_button);
        imageButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), nikeActivity.class);
                startActivity(intent);
            }
        });

        Button imageButton3 = (Button) findViewById(R.id.adi_button);
        imageButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), lsmActivity.class);
                startActivity(intent);
            }
        });

        Button imageButton4 = (Button) findViewById(R.id.fuma_button);
        imageButton4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), fumaActivity.class);
                startActivity(intent);
            }
        });

        Button imageButton5 = (Button) findViewById(R.id.miz_button);
        imageButton5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mizActivity.class);
                startActivity(intent);
            }
        });

    }
}