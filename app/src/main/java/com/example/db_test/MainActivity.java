package com.example.db_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText etText;
    private Button btAdd;
    private ListView listView;
    private DatabaseHelper databaseHelper;
    private ArrayList arrayList;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText = findViewById(R.id.et_text);
        btAdd = findViewById(R.id.bt_add);
        listView = findViewById(R.id.list_view);

        databaseHelper = new DatabaseHelper(MainActivity.this);
//        databaseHelper.addText("hi");
        arrayList = databaseHelper.getAllText();
        arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
        databaseHelper.addText("hi");
//                if (!text.isEmpty()) {
//                    if (databaseHelper.addText(text)) {
//                        etText.setText("");
//                        arrayList.clear();
//                        arrayList.addAll(databaseHelper.getAllText());
//                        arrayAdapter.notifyDataSetChanged();
//                        listView.invalidateViews();
//                        listView.refreshDrawableState();
//                    }
//                }
//            }
//        });
    }
}