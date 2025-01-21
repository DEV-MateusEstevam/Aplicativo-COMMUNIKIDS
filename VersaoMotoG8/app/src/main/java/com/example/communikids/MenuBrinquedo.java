package com.example.communikids;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuBrinquedo extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnQuero, btnQuero1, btnBicicleta, btnBola, btnBoneca, btnBrincar, btnCarrinho, btnCelular, btnDancar, btnDesenhar, btnFora, btnGibi, btnLivro, btnMusica, btnPintar, btnQuebra, btnTablet, btnTv, btnUrsinho, btnVideogame;
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
        setContentView(R.layout.activity_menu_brinquedo);

        btnBicicleta = (android.widget.ImageButton) findViewById(R.id.btnBicicleta);
        btnBola = (android.widget.ImageButton) findViewById(R.id.btnBola);
        btnBoneca = (android.widget.ImageButton) findViewById(R.id.btnBoneca);
        btnBrincar = (android.widget.ImageButton) findViewById(R.id.btnBrincar);
        btnCarrinho = (android.widget.ImageButton) findViewById(R.id.btnCarrinho);
        btnCelular = (android.widget.ImageButton) findViewById(R.id.btnCelular);
        btnDancar = (android.widget.ImageButton) findViewById(R.id.btnDancar);
        btnDesenhar = (android.widget.ImageButton) findViewById(R.id.btnDesenhar);
        btnFora = (android.widget.ImageButton) findViewById(R.id.btnFora);
        btnGibi = (android.widget.ImageButton) findViewById(R.id.btnGibi);
        btnLivro = (android.widget.ImageButton) findViewById(R.id.btnLivro);
        btnMusica = (android.widget.ImageButton) findViewById(R.id.btnMusica);
        btnPintar = (android.widget.ImageButton) findViewById(R.id.btnPintar);
        btnQuebra = (android.widget.ImageButton) findViewById(R.id.btnQuebra);
        btnTablet = (android.widget.ImageButton) findViewById(R.id.btnTablet);
        btnTv = (android.widget.ImageButton) findViewById(R.id.btnTv);
        btnUrsinho = (android.widget.ImageButton) findViewById(R.id.btnUrsinho);
        btnVideogame = (android.widget.ImageButton) findViewById(R.id.btnVideogame);
        btnQuero = (android.widget.ImageButton) findViewById(R.id.btnQuero);
        btnQuero1 = (android.widget.ImageButton) findViewById(R.id.btnQuero1);

        btnBicicleta.setOnClickListener(this);
        btnBola.setOnClickListener(this);
        btnBoneca.setOnClickListener(this);
        btnBrincar.setOnClickListener(this);
        btnCarrinho.setOnClickListener(this);
        btnCelular.setOnClickListener(this);
        btnDancar.setOnClickListener(this);
        btnDesenhar.setOnClickListener(this);
        btnFora.setOnClickListener(this);
        btnGibi.setOnClickListener(this);
        btnLivro.setOnClickListener(this);
        btnMusica.setOnClickListener(this);
        btnPintar.setOnClickListener(this);
        btnQuebra.setOnClickListener(this);
        btnTablet.setOnClickListener(this);
        btnTv.setOnClickListener(this);
        btnUrsinho.setOnClickListener(this);
        btnVideogame.setOnClickListener(this);
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


        if (v.getId()==R.id.btnBicicleta){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrbicicleta);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrbicicleta);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnBola){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrbola);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrbola);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnBoneca){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrboneca);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrboneca);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnBrincar){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrbrincar);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrbrincar);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnCarrinho){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrcarrinho);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrcarrinho);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnCelular){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrcelular);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrcelular);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnDancar){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrdancar);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrdancar);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnDesenhar){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrdesenhar);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrdesenhar);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnFora){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrfora);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrfora);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnGibi){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrgibi);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrgibi);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnLivro){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrlivro);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrlivro);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnMusica) {
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this, R.raw.mbqrmusica);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f, 0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrmusica);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnPintar){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrpintar);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrpintar);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnQuebra){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrquebra);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrquebra);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnTablet){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrtablet);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrtablet);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnTv){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrtv);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrtv);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnUrsinho){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrursinho);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrursinho);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnVideogame){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mbqrvideogame);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mbnqrvideogame);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }
    }
}