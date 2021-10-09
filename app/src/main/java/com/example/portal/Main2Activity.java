package com.example.portal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    WebView weblist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        weblist = findViewById(R.id.web);
        Intent intent = getIntent();

        Bundle bundle  = intent.getExtras();
        String data =bundle.getString("list");
        String Temp = getIntent().getStringExtra("listviewitems");
        weblist.loadUrl(Temp);



    }



}
