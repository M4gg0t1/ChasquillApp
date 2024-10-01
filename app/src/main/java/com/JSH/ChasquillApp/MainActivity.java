package com.JSH.ChasquillApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonFindMasters = findViewById(R.id.buttonFindMasters);
        buttonFindMasters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción para buscar maestros
                Intent intent = new Intent(MainActivity.this, MastersListActivity.class);
                startActivity(intent);
            }
        });
    }
}