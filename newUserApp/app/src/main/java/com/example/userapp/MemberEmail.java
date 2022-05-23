package com.example.userapp;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MemberEmail {
    private DatabaseReference databaseReference;
    public MemberEmail(){
        FirebaseDatabase db =FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Member.class.getSimpleName());
    }

    public Task<Void> add(Member men){

        return databaseReference.push().setValue(men);
    }
}
