package com.example.danawa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class lsmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lsm);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        final com.example.danawa.ProductAdapter adapter = new com.example.danawa.ProductAdapter();
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 펄스", "459,000" , "발볼 등급 : C", R.drawable.adi1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 펄스 UCL", "459,000" , "발볼 등급 : C", R.drawable.adi2));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 프릭+폴 포그바X스텔라 맥카트니 ", "369,000" , "발볼 등급 : C", R.drawable.adi3));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 프릭+", "359,000" , "발볼 등급 : C", R.drawable.adi4));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 엣지.1", "299,000" , "발볼 등급 : C", R.drawable.adi5));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 엣지.1 ", "299,000" , "발볼 등급 : C", R.drawable.adi6));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 엣지.3 L", "109,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 엣지.3 ", "129,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 엣지.1 L ", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 엣지.1 L ", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 뮤테이터 20.2", "169,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 프릭.1 L", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 뮤테이터 20.1", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 프릭.1 L", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 뮤테이터 20.1 L", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 프릭.1", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 프릭.1 L", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 프릭.3 L", "109,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 프릭.1", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 프릭.3", "129,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 프릭.1 L", "299,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 20.4 FXG", "79,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 20.3 L", "99,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 20.4 S FXG", "89,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 19.1", "239,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 19.4 FXG", "79,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 프레데터 18.1", "259,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 네메시스 0.1", "299,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 네메시스 0.1", "299,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 네메시스 0.1", "299,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 네메시스 19+", "329,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 네메시스 0.3", "129,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 네메시스 19.3", "119,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 스피드플로우+", "359,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 F50 고스티드 아디제로", "339,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 F50 고스티드 UCL", "339,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 스피드플로우.3", "109,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 고스티드.1", "299,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 스피드플로우.1", "299,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 스피드플로우 메시.1", "299,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 스피드플로우.1", "299,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 스피드플로우.2", "179,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 스피드플로우.4 FXG ", "79,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 스피드플로우.1", "299,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 스피드플로우.3 LL", "139,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 고스티드.1", "299,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 19.3", "119,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 고스티드.3", "129,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 고스티드.2", "179,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 고스티드.1", "299,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 고스티드.4 FXG", "79,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 19.2", "169,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 19.1", "239,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 19.4 FXG", "79,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 엑스 17+", "359,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 코파  18.3", "39,900" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 코파  19.3", "48,130" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 코파  20.1", "526,100" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 코파  20.1", "138,910" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 코파  20.3", "52,720" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 코파  20.4", "37,260" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 코파  글로로 20.2", "55,050" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 코파  문디알 21PK", "178,480" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 코파  문디알", "101,740" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 코파  센스.1", "151,480" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 코파  센스.1", "160,540" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 코파  센스.1", "151,840" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("아디다스 코파  센스.3", "57,650" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("미즈노 레뷸라컵 JP", "239,000" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("미즈노 레뷸라컵 셀렉트", "83,000" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("미즈노 레뷸라3 엘리트", "195,000" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("미즈노 레뷸라컵 프로", "119,000" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("미즈노 모렐리아네오3 프로", "139,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("미즈노 모렐리아네오3 엘리트", "183,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("미즈노 모렐리아네오3 베타", "293,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("미즈노 모렐리아네오3 베타엘리트", "234,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("미즈노 모렐리아 UL", "279,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("미즈노 웨이브컵 레전드", "219,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 울트라 프로", "109,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 울트라 매치플러스", "83,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 울트라 매치", "79,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 울트라 2.1", "119,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 울트라 1.4", "179,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 울트라 1.3", "175,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 울트라 2.3", "109,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 울트라 2.1", "109,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 울트라 1.2", "175,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 울트라 2.2", "109,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 울트라 3.2", "76,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 퓨처Z 3.4", "84,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 퓨처Z 1.4", "199,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 퓨처Z 1.3", "199,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 퓨처Z 1.2", "195,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 퓨처 5.4", "49,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 TACTO 2", "39,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 킹 플래티넘", "167,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 원 20.2", "119,000" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 원 20.3", "79,000" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("푸마 원 20.4", "49,000" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 GT2 엘리트 AG-PRO", "289,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 GT2 엘리트 FG", "289,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 GT2 아카데미 HG", "99,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 GT2 엘리트 DF SW FG","329,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 GT2 아카데미 FLYEASE FG", "99,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 GT2 아카데미 HG", "99,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 GT2 엘리트 DF FG", "309,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 GT 아카데미 HG", "99,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 GT 아카데미 HG", "99,000" , "발볼 등급 : C", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 비전 2 아카데미 DF HG", "109,000" ,  "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 비전 2 엘리트 DF FG", "329,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 비전 2 프로 DF HG", "199,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 비전 2 프로 DF FG", "179,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 비전 엘리트 DF FG", "329,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 베놈 클럽 FG", "79,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 베놈 프로 FG", "179,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 베놈 프로 HG", "179,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 베놈 아카데미 HG", "99,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 베놈 프로 HG", "179,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 베놈 아카데미 HG", "99,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 베놈 프로 HG", "179,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 팬텀 베놈 아카데미 HG", "99,000" , "발볼 등급 : B", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 수퍼플라이 8 엘리트 FG", "319,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 엘리트 AG", "299,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 수퍼플라이 8 엘리트 MDS FG", "339,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 수퍼플라이 8 엘리트 FG", "319,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 수퍼플라이 8 엘리트 FG", "319,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 엘리트 FG", "299,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 프로 HG", "169,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 아카데미 HG", "99,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 엘리트 FG", "299,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 엘리트 FG", "289,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 아카데미 HG", "99,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 엘리트 HG", "289,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 아카데미 HG", "99,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 수퍼플라이 8 엘리트 FG", "309,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 수퍼플라이 8 엘리트 FG", "309,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 엘리트 FG", "289,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 프로 HG", "169,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 프로 HG", "169,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 아카데미 HG", "99,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 아카데미 HG", "99,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 수퍼플라이 7 아카데미 HG", "109,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 13 아카데미 HG", "99,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 13 아카데미 HG", "99,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 13 아카데미 FG", "99,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 수퍼플라이 7 아카데미 HG", "109,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 13 프로 HG", "139,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 수퍼플라이 7 엘리트 FG", "329,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 13 프로 네이마르 HG", "149,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 수퍼플라이 7 엘리트 MDS FG", "349,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 13 아카데미 MDS HG", "99,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 13 프로 MDS HG", "139,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 13 프로 HG", "139,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 13 프로 MDS HG", "139,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 13 아카데미 MDS FG", "99,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 수퍼플라이 7 아카데미 MDS HG", "119,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 13 프로 HG", "139,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 머큐리얼 베이퍼 14 엘리트 AG", "289,000" , "발볼 등급 : A", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드8 아카데미", "60,670" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드8 아카데미", "85,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드8 아카데미", "82,010" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드8 아카데미", "144,000" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드8 클럽", "73,990" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드8 아카데미", "388,740" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드9 아카데미", "70,190" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드9 엘리트 PRO", "256,150" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드9 아카데미", "87,210" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드8 엘리트", "153,500" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드9 아카데미", "64,580" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드9 아카데미", "73,000" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드8 프로", "75,640" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드9 엘리트", "215,190" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드9 엘리트", "367,900" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드9 PRO", "98,600" , "발볼 등급 : D", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드9 엘리트", "185,900" , "발볼 등급 : E", R.drawable.birdmissile1));
        adapter.addItem(new com.example.danawa.Product("나이키 티엠포 레전드9 엘리트", "208,810" , "발볼 등급 : D", R.drawable.birdmissile1));


        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new com.example.danawa.OnProductItemClickListener() {
            @Override
            public void onItemClick(com.example.danawa.ProductAdapter.ViewHolder holder, View view, int position) {
                com.example.danawa.Product item = adapter.getItem(position);
                Intent intent = new Intent(lsmActivity.this, detailActivity.class);

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
                Intent intent = new Intent(getApplicationContext(), adiActivity.class);
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