package com.cursoandroid.autenticacaousuario.autenticacaousuario;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

          //Login
//        firebaseAuth.signInWithEmailAndPassword("jamilton.cursos@gmail.com","jamilton123")
//                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if(task.isSuccessful()){
//                            Log.i("signIn", "Sucesso ao fazer logar usuário");
//                        }else{
//                            Log.i("signIn", "Erro ao fazer logar usuário");
//                        }
//                    }
//        });

        firebaseAuth.signOut();

        //Verificca usuario logado
        if(firebaseAuth.getCurrentUser() != null){
            Log.i("verificaUsuario","Usuario Logado");
        }else{
            Log.i("verificaUsuario","Usuario não está Logado");
        }


        //Cadastro
//        firebaseAuth.createUserWithEmailAndPassword("jamilton.cursos@gmail.com","jamilton123")
//                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if(task.isSuccessful()){
//                            Log.i("createUser", "Sucesso ao cadastrar usuário");
//                        }else{
//                            Log.i("createUser", "Erro ao cadastrar usuário");
//                        }
//                    }
//                });
    }
}
