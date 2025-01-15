package com.example.communikids;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Menu01 extends AppCompatActivity implements OnClickListener {

    ImageButton btnAlimento, btnBrinquedos, btnLugares, btnPessoas, btnNecessidade;
    MediaPlayer musicPlayer;
    public boolean isResume;
    public boolean A ;

    public boolean getA(){
        return A;
    }
    public boolean setA(boolean A){
        this.A = A;
        return A;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu01);
        //Objects.requireNonNull(getSupportActionBar()).hide(); faz parte do som nos botoes
        btnAlimento = (android.widget.ImageButton) findViewById(R.id.btnAlimento);
        btnBrinquedos = (android.widget.ImageButton) findViewById(R.id.btnBrinquedos);
        btnLugares = (android.widget.ImageButton) findViewById(R.id.btnLugares);
        btnPessoas = (android.widget.ImageButton) findViewById(R.id.btnPessoas);
        btnNecessidade = (android.widget.ImageButton) findViewById(R.id.btnNecessidade);
        btnAlimento.setOnClickListener(this);
        btnBrinquedos.setOnClickListener(this);
        btnLugares.setOnClickListener(this);
        btnPessoas.setOnClickListener(this);
        btnNecessidade.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnAlimento){

                this.setA(true);

                if (!isResume){
                    isResume = true;
                    btnAlimento.setImageDrawable(getResources().getDrawable(R.drawable.btnalimentoson));

                } else{
                    isResume = false;
                    btnAlimento.setImageDrawable(getResources().getDrawable(R.drawable.btnalimentosoff));
                }
                this.setA(false);

            musicPlayer = MediaPlayer.create(this,R.raw.alimentos);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();

            // ir para a tela de MenuAlimento
            Intent telaAlimento = new Intent(this, MenuAlimentos.class);//inserir MenuAlimento
            startActivity(telaAlimento);
        }

        if (v.getId()==R.id.btnBrinquedos){

                    this.setA(true);

                    if (!isResume){
                        isResume = true;
                        btnBrinquedos.setImageDrawable(getResources().getDrawable(R.drawable.btnbrinquedoson));

                    } else{
                        isResume = false;
                        btnBrinquedos.setImageDrawable(getResources().getDrawable(R.drawable.btnbrinquedosoff));
                    }
                    this.setA(false);

            musicPlayer = MediaPlayer.create(this,R.raw.brinquedos);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            // ir para tela de menuBrinquedo
            Intent telaBrinquedo = new Intent(this, MenuBrinquedo.class);//inserir MenuBrinquedo
            startActivity(telaBrinquedo);
        }

        if (v.getId()==R.id.btnLugares){

                    this.setA(true);

                    if (!isResume){
                        isResume = true;
                        btnLugares.setImageDrawable(getResources().getDrawable(R.drawable.btnlugareson));

                    } else{
                        isResume = false;
                        btnLugares.setImageDrawable(getResources().getDrawable(R.drawable.btnlugaresoff));
                    }
                    this.setA(false);

            musicPlayer = MediaPlayer.create(this,R.raw.lugares);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();

            Intent telaLugares = new Intent(this, MenuLugares.class);//inserir MenuLugares
            startActivity(telaLugares);
        }

        if (v.getId()==R.id.btnPessoas){

                this.setA(true);

                if (!isResume){
                    isResume = true;
                    btnPessoas.setImageDrawable(getResources().getDrawable(R.drawable.btnpessoason));

                } else{
                    isResume = false;
                    btnPessoas.setImageDrawable(getResources().getDrawable(R.drawable.btnpessoasoff));
                }
                this.setA(false);

            musicPlayer = MediaPlayer.create(this,R.raw.pessoas);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            // ir para tela de menuPessoas
            Intent telaPessoas = new Intent(this, MenuPessoas.class);//inserir MenuBrinquedo
            startActivity(telaPessoas);
        }

        if (v.getId()==R.id.btnNecessidade){

                this.setA(true);

                if (!isResume){
                    isResume = true;
                    btnNecessidade.setImageDrawable(getResources().getDrawable(R.drawable.btnnecessidadeon));

                } else{
                    isResume = false;
                    btnNecessidade.setImageDrawable(getResources().getDrawable(R.drawable.btnnecessidadeoff));
                }
                this.setA(false);

            musicPlayer = MediaPlayer.create(this,R.raw.necessidades);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            // ir para tela de menuNecessidade
            Intent telaNecessidades = new Intent(this, MenuNecessidades.class);//inserir MenuBrinquedo
            startActivity(telaNecessidades);
        }
    }
}