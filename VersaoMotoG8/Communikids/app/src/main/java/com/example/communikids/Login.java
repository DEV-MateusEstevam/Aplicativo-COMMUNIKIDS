package com.example.communikids;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnLCAcessar, btnLCCadastre_se;
    EditText txtLCEmail, txtLCSenha;
    MediaPlayer musicPlayer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLCAcessar = (android.widget.ImageButton) findViewById(R.id.btnLCAcessar);
        btnLCCadastre_se = (android.widget.ImageButton) findViewById(R.id.btnLCCadastre_se);
        txtLCEmail = (EditText) findViewById(R.id.txtLCEmail);
        txtLCSenha = (EditText) findViewById(R.id.txtLCSenha);
        btnLCCadastre_se.setOnClickListener(this);
        btnLCAcessar.setOnClickListener(this);
    }

    //navegação para outras telas
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnLCCadastre_se) {
            MediaPlayer musicPlayer = MediaPlayer.create(this, R.raw.btncadastrareducador);
            //musicPlayer.setLooping(true);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            // ir para a tela de Cadastre_se
            Intent telaCad = new Intent(this, Cadastre_se.class);
            startActivity(telaCad);
        }
        if (v.getId() == R.id.btnLCAcessar) {
            if (VerificaDados() == true) {
                // ir para tela de menuopcao
                Intent telaCADAluno = new Intent(this, MenuOpcao.class);
                startActivity(telaCADAluno);
            }
        }
    }
    public boolean VerificaDados() {
        String email = txtLCEmail.getText().toString();
        String senha = txtLCSenha.getText().toString();
        if (email.isEmpty()){
            musicPlayer = MediaPlayer.create(this,R.raw.btnfazerlogin);
            //musicPlayer.setLooping(true);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            Toast.makeText(getApplicationContext(), "O campo E-mail deve ser preenchido!",
                    Toast.LENGTH_LONG).show();
            return false;
        }else if (senha.isEmpty()){
            musicPlayer = MediaPlayer.create(this,R.raw.btnfazerlogin);
            //musicPlayer.setLooping(true);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            Toast.makeText(getApplicationContext(), "O campo Senha deve ser preenchido!",
                    Toast.LENGTH_LONG).show();
            return false;
        }
        // consultar a senha e email
        BancoController bd = new BancoController(getBaseContext());

        Cursor dados = bd.PesquisarLogin(email, senha) ;

        if(dados.moveToFirst()){
            musicPlayer = MediaPlayer.create(this,R.raw.sbvcommunikids);
            //musicPlayer.setLooping(true);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            return true;
            //this.limpar();

        }else{
            musicPlayer = MediaPlayer.create(this,R.raw.btnfazerlogin);
            //musicPlayer.setLooping(true);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            String msg= "Email ou Senha inválida!";
            Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            return false;
        }
    }
}