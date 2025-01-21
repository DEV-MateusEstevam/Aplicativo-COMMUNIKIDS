package com.example.communikids;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuNecessidades extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnQuero, btnQuero1, btnAjuda, btnAonde, btnAtemais, btnBanho, btnBarulho, btnBem, btnBnoite;
    ImageButton btnBtarde, btnBdia, btnCalor, btnCansada, btnCoco, btnComo, btnDor, btnEntendi, btnFeliz, btnFicar, btnFrio;
    ImageButton btnGostei, btnLavarmao, btnMedo, btnMuitagnt, btnNao, btnNaoentendi, btnNaogostei, btnObrigado, btnPare;
    ImageButton btnPorfavor, btnQuando, btnSair, btnSilencio, btnSim, btnTriste, btnVoce, btnXixi;
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
        setContentView(R.layout.activity_menu_necessidades);

        btnAjuda = (android.widget.ImageButton) findViewById(R.id.btnAjuda);
        btnAonde = (android.widget.ImageButton) findViewById(R.id.btnAonde);
        btnAtemais = (android.widget.ImageButton) findViewById(R.id.btnAtemais);
        btnBanho = (android.widget.ImageButton) findViewById(R.id.btnBanho);
        btnBarulho = (android.widget.ImageButton) findViewById(R.id.btnBarulho);
        btnBem = (android.widget.ImageButton) findViewById(R.id.btnBem);
        btnBnoite = (android.widget.ImageButton) findViewById(R.id.btnBnoite);
        btnBtarde = (android.widget.ImageButton) findViewById(R.id.btnBtarde);
        btnBdia = (android.widget.ImageButton) findViewById(R.id.btnBdia);
        btnCalor = (android.widget.ImageButton) findViewById(R.id.btnCalor);
        btnCansada = (android.widget.ImageButton) findViewById(R.id.btnCansada);
        btnCoco = (android.widget.ImageButton) findViewById(R.id.btnCoco);
        btnComo = (android.widget.ImageButton) findViewById(R.id.btnComo);
        btnDor = (android.widget.ImageButton) findViewById(R.id.btnDor);
        btnEntendi = (android.widget.ImageButton) findViewById(R.id.btnEntendi);
        btnFeliz = (android.widget.ImageButton) findViewById(R.id.btnFeliz);
        btnFicar = (android.widget.ImageButton) findViewById(R.id.btnFicar);
        btnFrio = (android.widget.ImageButton) findViewById(R.id.btnFrio);
        btnGostei = (android.widget.ImageButton) findViewById(R.id.btnGostei);
        btnLavarmao = (android.widget.ImageButton) findViewById(R.id.btnLavarmao);
        btnMedo = (android.widget.ImageButton) findViewById(R.id.btnMedo);
        btnMuitagnt = (android.widget.ImageButton) findViewById(R.id.btnMuitagnt);
        btnNao = (android.widget.ImageButton) findViewById(R.id.btnNao);
        btnNaoentendi = (android.widget.ImageButton) findViewById(R.id.btnNaoentendi);
        btnNaogostei = (android.widget.ImageButton) findViewById(R.id.btnNaogostei);
        btnObrigado = (android.widget.ImageButton) findViewById(R.id.btnObrigado);
        btnPare = (android.widget.ImageButton) findViewById(R.id.btnPare);
        btnPorfavor = (android.widget.ImageButton) findViewById(R.id.btnPorfavor);
        btnQuando = (android.widget.ImageButton) findViewById(R.id.btnQuando);
        btnSair = (android.widget.ImageButton) findViewById(R.id.btnSair);
        btnSilencio = (android.widget.ImageButton) findViewById(R.id.btnSilencio);
        btnSim = (android.widget.ImageButton) findViewById(R.id.btnSim);
        btnTriste = (android.widget.ImageButton) findViewById(R.id.btnTriste);
        btnVoce = (android.widget.ImageButton) findViewById(R.id.btnVoce);
        btnXixi = (android.widget.ImageButton) findViewById(R.id.btnXixi);
        btnQuero = (android.widget.ImageButton) findViewById(R.id.btnQuero);
        btnQuero1 = (android.widget.ImageButton) findViewById(R.id.btnQuero1);

        btnAjuda.setOnClickListener(this);
        btnAonde.setOnClickListener(this);
        btnAtemais.setOnClickListener(this);
        btnBanho.setOnClickListener(this);
        btnBarulho.setOnClickListener(this);
        btnBem.setOnClickListener(this);
        btnBnoite.setOnClickListener(this);
        btnBtarde.setOnClickListener(this);
        btnBdia.setOnClickListener(this);
        btnCalor.setOnClickListener(this);
        btnCansada.setOnClickListener(this);
        btnCoco.setOnClickListener(this);
        btnComo.setOnClickListener(this);
        btnDor.setOnClickListener(this);
        btnEntendi.setOnClickListener(this);
        btnFeliz.setOnClickListener(this);
        btnFicar.setOnClickListener(this);
        btnFrio.setOnClickListener(this);
        btnGostei.setOnClickListener(this);
        btnLavarmao.setOnClickListener(this);
        btnMedo.setOnClickListener(this);
        btnMuitagnt.setOnClickListener(this);
        btnNao.setOnClickListener(this);
        btnNaoentendi.setOnClickListener(this);
        btnNaogostei.setOnClickListener(this);
        btnObrigado.setOnClickListener(this);
        btnPare.setOnClickListener(this);
        btnPorfavor.setOnClickListener(this);
        btnQuando.setOnClickListener(this);
        btnSair.setOnClickListener(this);
        btnSilencio.setOnClickListener(this);
        btnSim.setOnClickListener(this);
        btnTriste.setOnClickListener(this);
        btnVoce.setOnClickListener(this);
        btnXixi.setOnClickListener(this);
        btnQuero.setOnClickListener(this);
        btnQuero1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //botão quero
        if (v.getId() == R.id.btnQuero) {

            this.setA(true);

            if (!isResume) {
                isResume = true;
                btnQuero.setImageDrawable(getResources().getDrawable(R.drawable.btnmaqueroon));

            } else {
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
        if (v.getId() == R.id.btnQuero1) {

            this.setA(false);

            if (!isResume) {
                isResume = true;
                btnQuero1.setImageDrawable(getResources().getDrawable(R.drawable.btnmanqueroon));

            } else {
                isResume = false;
                btnQuero1.setImageDrawable(getResources().getDrawable(R.drawable.btnmanquerooff));
            }
            this.setA(true);

            musicPlayer = MediaPlayer.create(this,R.raw.naoquero);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }


        if (v.getId() == R.id.btnAjuda) {
            musicPlayer = MediaPlayer.create(this, R.raw.mnajuda);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId() == R.id.btnAonde) {
            musicPlayer = MediaPlayer.create(this, R.raw.mnaonde);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId() == R.id.btnAtemais) {
            musicPlayer = MediaPlayer.create(this, R.raw.mnatemais);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId() == R.id.btnBanho) {
            if (this.getA() == false) {
                musicPlayer = MediaPlayer.create(this, R.raw.mnqrbanho);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f, 0.5f);
                musicPlayer.start();

            } else {
                musicPlayer = MediaPlayer.create(this, R.raw.mnnqrbanho);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f, 0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId() == R.id.btnBarulho) {
            musicPlayer = MediaPlayer.create(this, R.raw.mnbarulho);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId() == R.id.btnBem) {
            musicPlayer = MediaPlayer.create(this, R.raw.mntobem);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId() == R.id.btnBnoite) {
            musicPlayer = MediaPlayer.create(this, R.raw.mnbnoite);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId() == R.id.btnBtarde) {
            musicPlayer = MediaPlayer.create(this, R.raw.mnbtarde);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId() == R.id.btnBdia) {
            musicPlayer = MediaPlayer.create(this, R.raw.mnbdia);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId() == R.id.btnCalor) {
            musicPlayer = MediaPlayer.create(this, R.raw.mncalor);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId() == R.id.btnCansada) {
            musicPlayer = MediaPlayer.create(this, R.raw.mncansada);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId() == R.id.btnCoco) {
            if (this.getA() == false) {
                musicPlayer = MediaPlayer.create(this, R.raw.mnqrcoco);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f, 0.5f);
                musicPlayer.start();
            } else {
                musicPlayer = MediaPlayer.create(this, R.raw.mnnqrcoco);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f, 0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId() == R.id.btnComo) {
            musicPlayer = MediaPlayer.create(this, R.raw.mncomo);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId() == R.id.btnDor) {
            musicPlayer = MediaPlayer.create(this, R.raw.mndor);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId() == R.id.btnEntendi) {
            musicPlayer = MediaPlayer.create(this, R.raw.mnentendi);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId() == R.id.btnFeliz) {
            musicPlayer = MediaPlayer.create(this, R.raw.mnfeliz);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId() == R.id.btnFicar) {
            if (this.getA() == false) {
                musicPlayer = MediaPlayer.create(this, R.raw.mnqrficar);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f, 0.5f);
                musicPlayer.start();
            } else {
                musicPlayer = MediaPlayer.create(this, R.raw.mnnqrficar);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f, 0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId() == R.id.btnFrio) {
            musicPlayer = MediaPlayer.create(this, R.raw.mnfrio);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f, 0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnGostei){
            musicPlayer = MediaPlayer.create(this,R.raw.mnqrgostei);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnLavarmao){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mnqrlavarmao);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mnnqrlavarmao);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnMedo){
            musicPlayer = MediaPlayer.create(this,R.raw.mnmedo);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnMuitagnt){
            musicPlayer = MediaPlayer.create(this,R.raw.mnmuitagnt);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnNao){
            musicPlayer = MediaPlayer.create(this,R.raw.mnnao);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnNaoentendi){
            musicPlayer = MediaPlayer.create(this,R.raw.mnnaoentendi);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnNaogostei){
            musicPlayer = MediaPlayer.create(this,R.raw.mnnqrgostei);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnObrigado){
            musicPlayer = MediaPlayer.create(this,R.raw.mnobrigado);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnPare){
            musicPlayer = MediaPlayer.create(this,R.raw.mnpare);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnPorfavor){
            musicPlayer = MediaPlayer.create(this,R.raw.mnporfavor);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnQuando){
            musicPlayer = MediaPlayer.create(this,R.raw.mnquando);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnSair){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mnqrsair);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mnnqrsair);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnSilencio){
            musicPlayer = MediaPlayer.create(this,R.raw.mnsilencio);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnSim){
            musicPlayer = MediaPlayer.create(this,R.raw.mnsim);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnTriste){
            musicPlayer = MediaPlayer.create(this,R.raw.mntriste);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnVoce){
            musicPlayer = MediaPlayer.create(this,R.raw.mnvoce);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
        }

        if (v.getId()==R.id.btnXixi){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mnqrxixi);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mnnqrxixi);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }
    }
}