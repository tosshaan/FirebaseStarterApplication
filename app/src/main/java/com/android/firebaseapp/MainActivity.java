package com.android.firebaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void search(View button)
    {
        EditText etId = (EditText) findViewById(R.id.EditTextId);
        String idToSearch = etId.getText().toString();
    }

    public void submit(View button) {

        EditText etName = (EditText) findViewById(R.id.EditTextName);
        EditText etId = (EditText) findViewById(R.id.EditTextId);
        String name = etName.getText().toString();
        String id = etId.getText().toString();

        Student student = new Student();
        student.setName(name);
        student.setStudentId(id);

        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myFirebaseRef = database
        //        .getReferenceFromUrl("https://fir-demo-680f0.firebaseio.com");

        //Firebase myFirebaseRef = new Firebase("https://fir-demo-680f0.firebaseio.com");
        //myFirebaseRef.child(student.getStudentId()).setValue(student);

        Intent output = new Intent();
        setResult(RESULT_OK, output);
    }
}
