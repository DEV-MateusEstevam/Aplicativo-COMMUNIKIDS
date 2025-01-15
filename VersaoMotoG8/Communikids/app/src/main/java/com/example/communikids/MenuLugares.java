package com.example.communikids;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuLugares extends AppCompatActivity implements View.OnClickListener {

    ImageButton  btnQuero, btnQuero1, btnCasa, btnCinema, btnCozinha, btnCtia, btnCtio, btnCvom, btnCvoh, btnEscola, btnEstadio, btnIgreja, btnIr, btnIrvoce, btnMedico, btnParquinho, btnPiscina, btnPraca, btnPraia, btnQuarto, btnShopping, btnSorveteria;
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

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lugares);

        btnCasa = (android.widget.ImageButton) findViewById(R.id.btnCasa);
        btnCinema = (android.widget.ImageButton) findViewById(R.id.btnCinema);
        btnCozinha = (android.widget.ImageButton) findViewById(R.id.btnCozinha);
        btnCtia = (android.widget.ImageButton) findViewById(R.id.btnCtia);
        btnCtio = (android.widget.ImageButton) findViewById(R.id.btnCtio);
        btnCvom = (android.widget.ImageButton) findViewById(R.id.btnCvom);
        btnCvoh = (android.widget.ImageButton) findViewById(R.id.btnCvoh);
        btnEscola = (android.widget.ImageButton) findViewById(R.id.btnEscola);
        btnEstadio = (android.widget.ImageButton) findViewById(R.id.btnEstadio);
        btnIgreja = (android.widget.ImageButton) findViewById(R.id.btnIgreja);
        btnIr = (android.widget.ImageButton) findViewById(R.id.btnIr);
        btnIrvoce = (android.widget.ImageButton) findViewById(R.id.btnIrvoce);
        btnMedico = (android.widget.ImageButton) findViewById(R.id.btnMedico);
        btnParquinho = (android.widget.ImageButton) findViewById(R.id.btnParquinho);
        btnPiscina = (android.widget.ImageButton) findViewById(R.id.btnPiscina);
        btnPraca = (android.widget.ImageButton) findViewById(R.id.btnPraca);
        btnPraia = (android.widget.ImageButton) findViewById(R.id.btnPraia);
        btnQuarto = (android.widget.ImageButton) findViewById(R.id.btnQuarto);
        btnShopping = (android.widget.ImageButton) findViewById(R.id.btnShopping);
        btnSorveteria = (android.widget.ImageButton) findViewById(R.id.btnSorveteria);
        btnQuero = (android.widget.ImageButton) findViewById(R.id.btnQuero);
        btnQuero1 = (android.widget.ImageButton) findViewById(R.id.btnQuero1);

        btnCasa.setOnClickListener(this);
        btnCinema.setOnClickListener(this);
        btnCozinha.setOnClickListener(this);
        btnCtia.setOnClickListener(this);
        btnCtio.setOnClickListener(this);
        btnCvom.setOnClickListener(this);
        btnCvoh.setOnClickListener(this);
        btnEscola.setOnClickListener(this);
        btnEstadio.setOnClickListener(this);
        btnIgreja.setOnClickListener(this);
        btnIr.setOnClickListener(this);
        btnIrvoce.setOnClickListener(this);
        btnMedico.setOnClickListener(this);
        btnParquinho.setOnClickListener(this);
        btnPiscina.setOnClickListener(this);
        btnPraca.setOnClickListener(this);
        btnPraia.setOnClickListener(this);
        btnQuarto.setOnClickListener(this);
        btnShopping.setOnClickListener(this);
        btnSorveteria.setOnClickListener(this);
        btnQuero.setOnClickListener(this);
        btnQuero1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //botão quero
        if(v.getId()==R.id.btnQuero){

            this.setA(true);

            if (!isResume){
                isResume = true;
                btnQuero.setImageDrawable(getResources().getDrawable(R.drawable.btnmaqueroon));

            } else{
                isResume = false;
                btnQuero.setImageDrawable(getResources().getDrawable(R.drawable.btnmaquerooff));
            }
            this.setA(false);

            musicPlayer = MediaPlayer.create(this,R.raw.quero);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();

        }
        //botao não quero
        if(v.getId()==R.id.btnQuero1){

            this.setA(false);

            if (!isResume){
                isResume = true;
                btnQuero1.setImageDrawable(getResources().getDrawable(R.drawable.btnmanqueroon));

            } else{
                isResume = false;
                btnQuero1.setImageDrawable(getResources().getDrawable(R.drawable.btnmanquerooff));
            }

            this.setA(true);

            musicPlayer = MediaPlayer.create(this,R.raw.naoquero);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }


        if (v.getId()==R.id.btnCasa){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrcasa);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrcasa);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnCinema){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrcinema);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrcinema);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnCozinha){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrcozinha);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrcozinha);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnCtia){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrtia);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrtia);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnCtio){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrtio);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrtio);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnCvom){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrcvom);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrcvom);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnCvoh){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrcvoh);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrcvoh);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnEscola){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrescola);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrescola);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnEstadio){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrestadio);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrestadio);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnIgreja){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrigreja);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrigreja);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnIr){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrir);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrir);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnIrvoce) {
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this, R.raw.mlqrirvoce);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f, 0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrirvoce);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnMedico){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrmedico);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrmedico);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnParquinho){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrparquinho);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrparquinho);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnPiscina){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrpiscina);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrpiscina);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnPraca){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrpraca);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrpraca);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnPraia){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrpraia);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrpraia);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnQuarto){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrquarto);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrquarto);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnShopping){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrshopping);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrshopping);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnSorveteria){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mlqrsorveteria);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mlnqrsorveteria);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

    }
}