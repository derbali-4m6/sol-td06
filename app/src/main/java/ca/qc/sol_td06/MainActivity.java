package ca.qc.sol_td06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<String> names;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init
        listView = findViewById(R.id.main_listview);

        //data source
        names = new ArrayList<>();
        names.add("Fed Leroux"); names.add("Annie Bedard"); names.add("Samuel Groulx");

        //adapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);
        listView.setAdapter(adapter);

    }

    public void addNewPerson(View view) {
        names.add("Test Test");
        adapter.notifyDataSetChanged();
    }

    public void goToRecyclerView(View view) {
        Intent intent = new Intent(this, DemoRecyclerViewActivity.class);
        startActivity(intent);
    }
}





















