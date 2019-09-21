package com.example.autenticacaofirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

        mAuth.signOut();
        if(mAuth.getCurrentUser() != null){

            Log.i("USER", "usuario esta Logado");

        }else{
            Log.i("USER", "usuario nao esta ogado");
        }



        //Login USUARIO
        /* mAuth.signInWithEmailAndPassword("testeleandro@gmail.com", "842682ll")
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            Log.i("AUTH", "usuario Logado");
                        }else{
                            Log.i("AUTH", "Erro ao logar");
                        }
                    }
                });

         */

        // CREATE USUARIO
        /*mAuth.createUserWithEmailAndPassword("testeleandro@gmail.com", "842682ll")
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            Log.i("AUTH", "usuario cadastrado com sucesso");
                        }else{
                            Log.i("AUTH", "Erro ao cadastrar usuario");
                        }
                    }
                });

         */

    }


}
