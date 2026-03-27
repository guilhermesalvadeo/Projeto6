package com.example.erectus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 1. Vinculamos o botão XML com a variável Java
        Button btnEntrar = findViewById(R.id.btnEntrar);
        Button btnTabCadastro = findViewById(R.id.btnTabCriarConta); // Botão do seletor superior

        // 2. Definimos o que acontece quando clica no botão principal de Login
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criamos uma Intent para dizer: "Quero ir daqui para a MainActivity"
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);

                // Opcional: fecha a tela de login para o usuário não voltar pra ela
                finish();
            }
        });

        // 3. Definimos o que acontece quando clica no seletor "Criar Conta" (superior)
        btnTabCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Vai para a tela de Cadastro
                Intent intent = new Intent(LoginActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });
    }
}