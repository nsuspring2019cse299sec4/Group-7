package com.example.pizzaorder;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ProgressDialog;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseError;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    EditText Phone, Password;
    Button LogInButton, RegisterButton;
    ProgressDialog dialog;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_main);
        LogInButton = (Button) findViewById(R.id.login);
        RegisterButton = (Button) findViewById(R.id.register);
        Phone = (EditText) findViewById(R.id.phone);
        Password = (EditText) findViewById(R.id.password);
        final ProgressDialog dialog = new ProgressDialog(this);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("user");

        LogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog.setMessage("Logging in. Please wait...");
                dialog.setIndeterminate(true);
                dialog.show();

                myRef.addValueEventListener(new ValueEventListener() {

                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        if (dataSnapshot.child(Phone.getText().toString()).exists()) {
                            dialog.dismiss();
                            User user = dataSnapshot.child(Phone.getText().toString()).getValue(User.class);
                            if (user.getPassword().equals(Password.getText().toString())) {
                                Toast.makeText(MainActivity.this, "Signed in successfully !", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(MainActivity.this, "Wrong password !", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            dialog.dismiss();
                            Toast.makeText(MainActivity.this, "Phone number does not exist !", Toast.LENGTH_SHORT).show();
                        }
                        Phone.getText().clear();
                        Password.getText().clear();
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                

            }
        });
    }
}
