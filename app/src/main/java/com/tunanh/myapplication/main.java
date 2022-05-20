package com.tunanh.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class main extends AppCompatActivity {
    private Button bt_1,bt_2,bt_3,bt_4,bt_5,bt_6,bt_7;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        bt_1=(Button) findViewById(R.id.btrelative1);
        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(main.this, relative_1.class);
                startActivity(intent);
            }
        });
        bt_2=(Button) findViewById(R.id.btrelative2);
        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(main.this,relative_2.class);
                startActivity(intent);
            }
        });
        bt_3=(Button) findViewById(R.id.btrelative3);
        bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(main.this,relative_3.class);
                startActivity(intent);
            }
        });
        bt_4=(Button) findViewById(R.id.btconstaint1);
        bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(main.this, constraint_1.class);
                startActivity(intent);
            }
        });
        bt_5=(Button) findViewById(R.id.btconstaint2);
        bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(main.this,constraint_2.class);
                startActivity(intent);
            }
        });
        bt_6=(Button) findViewById(R.id.btconstaint3);
        bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(main.this,constraint_3.class);
                startActivity(intent);
            }
        });
        bt_7=(Button) findViewById(R.id.btlinear);
        bt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(main.this,linear.class);
                startActivity(intent);
            }
        });
    }
}
