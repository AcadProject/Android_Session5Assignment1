package com.acadgild.jayadev.intentsearch;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button)findViewById(R.id.button);
        final EditText t=(EditText)findViewById(R.id.editText);
        if (b != null) {
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent searchIntent=new Intent(Intent.ACTION_WEB_SEARCH );
                    searchIntent.putExtra(SearchManager.QUERY,t.getText().toString());
                    startActivity(searchIntent);
                }
            });
        }
    }
}
