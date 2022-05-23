package com.example.userapp;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

//CharacterInformationという関数　firebaseと接続
public class User2_CharacterInformation {
    private DatabaseReference databaseReference;
    public User2_CharacterInformation(){
        FirebaseDatabase db =FirebaseDatabase.getInstance();
        databaseReference = db.getReference(User2_Character.class.getSimpleName());

    }

    public Task<Void> add(User2_Character character){

        return databaseReference.push().setValue(character);
    }
}
