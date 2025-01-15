package com.example.communikids;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cadastre_se extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnCACSalvar, btnCACVoltar;
    EditText txtCACNome, txtCACEmail, txtCACCpf, txtCACSenha, txtCACSenha2;
    MediaPlayer musicPlayer;
    String cacNome, cacEmail, cacCpf, cacSenha, cacSenha2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastre_se);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Cadastre_se), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnCACSalvar = (android.widget.ImageButton) findViewById(R.id.btnCACSalvar);
        btnCACVoltar = (android.widget.ImageButton) findViewById(R.id.btnCACVoltar);
        txtCACNome = (EditText) findViewById(R.id.txtCACNome);
        txtCACEmail = (EditText) findViewById(R.id.txtCACEmail);
        txtCACCpf = (EditText) findViewById(R.id.txtCACCpf);
        txtCACSenha = (EditText) findViewById(R.id.txtCACSenha);
        txtCACSenha2 = (EditText) findViewById(R.id.txtCACSenha2);
        btnCACSalvar.setOnClickListener(this);
        btnCACVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnCACSalvar) {

            Boolean erro = false;
            cacNome = txtCACNome.getText().toString();
            cacEmail = txtCACEmail.getText().toString();
            cacCpf = txtCACCpf.getText().toString();
            cacSenha = txtCACSenha.getText().toString();
            cacSenha2 = txtCACSenha2.getText().toString();

            erro = VerificaDados();
            if (!erro) {    // se erro == false
                //gravar os dados
                BancoController bd = new BancoController(getBaseContext());
                String resultado;

                resultado = bd.gravaColaborador(cacNome, cacEmail, cacCpf, cacSenha);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();

                musicPlayer = MediaPlayer.create(this,R.raw.btncadeducador);
                //musicPlayer.setLooping(true);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
                // ir para a tela de login
                Intent telaCVLogin = new Intent(this, Login.class);
                startActivity(telaCVLogin);

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.btnneducador);
                //musicPlayer.setLooping(true);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }
        }

        if (v.getId() == R.id.btnCACVoltar) {
            musicPlayer = MediaPlayer.create(this,R.raw.mnatemais);
            //musicPlayer.setLooping(true);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            // ir para a tela de login
            Intent telaCVLogin = new Intent(this, Login.class);
            startActivity(telaCVLogin);
        }
    }

    public boolean VerificaDados() {
        if (cacNome.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Atenção - O campo 'NOME' deve ser preenchido!", Toast.LENGTH_LONG).show();
            return true;
        }
        if (cacEmail.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Atenção - O campo 'E-MAIL' deve ser preenchido!", Toast.LENGTH_LONG).show();
            return true;
        }
        if (cacCpf.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Atenção - O campo 'CPF' deve ser preenchido!", Toast.LENGTH_LONG).show();
            return true;
        }
        if (cacSenha.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Atenção - O campo 'SENHA' deve ser preenchido!", Toast.LENGTH_LONG).show();
            return true;
        }
        if (cacSenha2.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Atenção - O campo 'CONFIRMAR SENHA' deve ser preenchido!", Toast.LENGTH_LONG).show();
            return true;
        }
        if (!cacSenha.equals(cacSenha2)) {
            Toast.makeText(getApplicationContext(), "Atenção - O campos 'SENHA' e 'CONFIRMAR SENHA' devem ser iguais!", Toast.LENGTH_LONG).show();
            return true;
        }
        return false;
    }
}