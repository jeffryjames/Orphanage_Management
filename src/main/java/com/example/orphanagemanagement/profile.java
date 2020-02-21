package com.example.orphanagemanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class profile extends AppCompatActivity {

    private EditText p_name;
    private EditText p_address;
    private EditText p_contact;
    private EditText p_guardian;
    private Button btnsave;

    private FirebaseFirestore mFirestore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mFirestore = FirebaseFirestore.getInstance();


        p_name =(EditText)findViewById(R.id.fullname);
        p_address =(EditText)findViewById(R.id.address);
        p_contact =(EditText)findViewById(R.id.contact);
        p_guardian =(EditText)findViewById(R.id.guardian);
        btnsave= (Button)findViewById(R.id.btn_save);





        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user_name = p_name.getText().toString();
                String user_address = p_address.getText().toString();
                String user_contact = p_contact.getText().toString();
                String user_guardian= p_guardian.getText().toString();





                Map<String, String>userMap = new HashMap<>();

                userMap.put("Name",user_name);
                userMap.put("Address",user_address);
                userMap.put("Contact",user_contact);
                userMap.put("Guardian",user_guardian);






                mFirestore.collection("users").add(userMap).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {

                        Toast.makeText(profile.this,"Username Added to Firestore", Toast.LENGTH_SHORT).show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                        String error = e.getMessage();
                        Toast.makeText(profile.this, "Error:" + error, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

    }
}
