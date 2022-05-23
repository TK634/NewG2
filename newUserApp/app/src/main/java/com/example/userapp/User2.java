package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class User2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user2);


        //Get nationality,age and name by Edittext (デザイン画面のidと対応させる)
        final EditText nationality = findViewById(R.id.Nationality);
        final EditText age = findViewById(R.id.Age);
        final EditText name = findViewById(R.id.Name);
        Button btn_character = findViewById(R.id.ButtonToUser3);


        User2_CharacterInformation cha = new User2_CharacterInformation();
        btn_character.setOnClickListener(v -> {


            User2_Character character = new User2_Character(nationality.getText().toString(), age.getText().toString(), name.getText().toString());
            cha.add(character).addOnSuccessListener(suc -> {
                Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er -> {
                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
            });

            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("users");/*user →　characterに変更する？*/
            myRef.setValue(character);

            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn_character.getContext(), User3.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY1", "value");

            // 新規画面表示実行
            startActivity(newIntent);


        });
    }
}