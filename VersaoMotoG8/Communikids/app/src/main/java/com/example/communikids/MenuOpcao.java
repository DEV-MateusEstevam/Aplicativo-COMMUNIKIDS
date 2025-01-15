package com.example.communikids;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuOpcao extends AppCompatActivity implements View.OnClickListener{

    ImageButton btnMenuinteracao, btnCadastroaluno, btnMOvoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_opcao);

        btnMenuinteracao = (android.widget.ImageButton) findViewById(R.id.btnMenuinteracao);
        btnCadastroaluno = (android.widget.ImageButton) findViewById(R.id.btnCadastroaluno);
        btnMOvoltar = (android.widget.ImageButton) findViewById(R.id.btnMOvoltar);

        btnMenuinteracao.setOnClickListener(this);
        btnCadastroaluno.setOnClickListener(this);
        btnMOvoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnMenuinteracao) {

            MediaPlayer musicPlayer = MediaPlayer.create(this, R.raw.btnmenuinteracoes);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            // ir para a tela de menu01
            Intent telaMenu01 = new Intent(this, Menu01.class);
            startActivity(telaMenu01);
        }

        if (v.getId() == R.id.btnCadastroaluno) {
            MediaPlayer musicPlayer = MediaPlayer.create(this, R.raw.btncadastraralunos);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            // ir para a tela de mainactivity
            Intent telaCadastrar = new Intent(this, MainActivity.class);
            startActivity(telaCadastrar);
        }

        if (v.getId() == R.id.btnMOvoltar) {
            MediaPlayer musicPlayer = MediaPlayer.create(this, R.raw.mnatemais);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            // ir para a tela de login
            Toast.makeText(getApplicationContext(), "Logoff realizado com sucesso. Volte Sempre!",
                    Toast.LENGTH_LONG).show();
            Intent telaLogin = new Intent(this, Login.class);
            startActivity(telaLogin);
        }
    }
}