package com.example.portal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView list;
    TextView txt;
    ImageView img;
    String names[] = {"Prothom Alo","Kaler Kontho","Bangladesh Pratadin","Jonokontho","Jugantor","Amader Somoy","Samakal","Ittefaq","BDnews24","Banglanews24","Bangla Tribune"};
    int images[] = {R.drawable.prothomalo,R.drawable.kalerkantho,R.drawable.bdpratidin,R.drawable.janakantha,R.drawable.jugantor,R.drawable.amadershomoy,R.drawable.samakal,R.drawable.ittefaq,R.drawable.bdnews24,R.drawable.banglanews24,R.drawable.banglatribune};

    String []listviewitems = new String[]{

            "https://www.prothomalo.com" ,
            "https://www.kalerkantho.com/",
            "https://www.bd-pratidin.com/",
            "http://www.dailyjanakantha.com/",
            "https://www.jugantor.com/",
            "http://www.dainikamadershomoy.com/",
            "https://samakal.com/",
            "https://www.ittefaq.com.bd/",
            "https://www.mzamin.com/",
            "https://m.bdnews24.com/bn/",
            "https://m.banglanews24.com/",
            "http://www.banglatribune.com/"


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list1);

        Customadapter customAdapter = new Customadapter();


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                String Temp = listviewitems[position].toString();
                intent.putExtra("listviewitems",Temp);
                startActivity(intent);

            }
        });

        list.setAdapter(customAdapter);

    }

    private class Customadapter extends BaseAdapter{


        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.layout2,null);
            TextView txt = view1.findViewById(R.id.textofview);
            ImageView img = view1.findViewById(R.id.image);

            txt.setText(names[position]);
            img.setImageResource(images[position]);

            return view1;




        }
    }

}
