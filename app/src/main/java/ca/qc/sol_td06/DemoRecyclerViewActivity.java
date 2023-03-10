package ca.qc.sol_td06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DemoRecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;
    List<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_recycler_view);

        //init
        recyclerView = findViewById(R.id.demo_recyclerview);
        contacts = new ArrayList<>();
        contacts.add(new Contact("Felix Jackson"));
        contacts.add(new Contact("Annie Bebard"));
        contacts.add(new Contact("Suzanne Lajoie"));
        contacts.add(new Contact("Claude Frasson"));

        adapter = new MyAdapter(contacts);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
}