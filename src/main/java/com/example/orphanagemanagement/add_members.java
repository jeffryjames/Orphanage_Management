package com.example.orphanagemanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



public class add_members extends AppCompatActivity {

    private EditText Name_;
    private EditText query_;
    private Button insert_;

    private Firebase mRootRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_members);

        mRootRef = new Firebase("https://orphanage-management-a44c9.firebaseio.com/Queries");


        Name_ = (EditText)findViewById(R.id.txtName);
        insert_= (Button)findViewById(R.id.insert);
        query_ = (EditText)findViewById(R.id.txtQuery);




        insert_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = Name_.getText().toString();
                String value2 = query_.getText().toString();

                Firebase childRef = mRootRef.child("Name");

               mRootRef.push().setValue(value);
                mRootRef.push().setValue(value2);
            }
        });


    }

    }


