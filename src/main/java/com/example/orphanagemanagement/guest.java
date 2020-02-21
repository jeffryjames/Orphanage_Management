package com.example.orphanagemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class guest extends AppCompatActivity {
    Button guest_back;
    Button gallery;
    Button query;
    Button donate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);

        TextView text =(TextView)findViewById(R.id.locate);
        text.setMovementMethod(LinkMovementMethod.getInstance());



        gallery =(Button)findViewById(R.id.gallery);
        guest_back = (Button) findViewById(R.id.guest_back);
        donate = (Button) findViewById(R.id.donate);
        query = (Button) findViewById(R.id.query);





        gallery.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View view) {
                Intent intent = new Intent(guest.this, pictures.class);
                startActivity(intent);
            }
        });


        guest_back.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View view) {
                Intent intent = new Intent(guest.this, Login.class);
                startActivity(intent);
            }
        });

        donate.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View view) {
                Intent intent = new Intent(guest.this, Donate.class);
                startActivity(intent);
            }
        });

        query.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View view) {
                Intent intent = new Intent(guest.this, add_members.class);
                startActivity(intent);
            }
        });



    }
}
