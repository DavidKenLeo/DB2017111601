package com.example.student.db2017111601;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ArrayList<Map<String, Object>> mylist = new ArrayList<>();
    ListView lv;
    SimpleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        HashMap<String, Object> m1 = new HashMap<>();
        m1.put("city", "台北");
        m1.put("code", "02");
        m1.put("img", R.drawable.tp);
        mylist.add(m1);

        HashMap<String, Object> m2 = new HashMap<>();
        m2.put("city", "台中");
        m2.put("code", "04");
        m2.put("img", R.drawable.tc);
        mylist.add(m2);

        HashMap<String, Object> m3 = new HashMap<>();
        m3.put("city", "高雄");
        m3.put("code", "07");
        m3.put("img", R.drawable.kh);
        mylist.add(m3);
        adapter = new SimpleAdapter(MainActivity.this,
                mylist, R.layout.myitem,
                new String[] {"city", "code", "img"},
                new int[] {R.id.textView, R.id.textView2, R.id.imageView});
        lv.setAdapter(adapter);
    }
}
