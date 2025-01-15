package com.example.communikids;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuAlimentos extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnQuero, btnQuero1, btnAgua, btnAlmocar, btnArroz, btnCafeManha, btnCarne, btnComer, btnFeijao, btnJantar, btnMacarrao, btnSalada, btnBatata, btnBiscoito, btnFrutas, btnChocolate, btnLanche, btnLeite, btnPao, btnPipoca, btnSorvete, btnSuco;
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
        setContentView(R.layout.activity_menu_alimentos);

        btnAgua = (android.widget.ImageButton) findViewById(R.id.btnAgua);
        btnAlmocar = (android.widget.ImageButton) findViewById(R.id.btnAlmocar);
        btnArroz = (android.widget.ImageButton) findViewById(R.id.btnArroz);
        btnBatata = (android.widget.ImageButton) findViewById(R.id.btnBatata);
        btnBiscoito = (android.widget.ImageButton) findViewById(R.id.btnBiscoito);
        btnCafeManha = (android.widget.ImageButton) findViewById(R.id.btnCafeManha);
        btnCarne = (android.widget.ImageButton) findViewById(R.id.btnCarne);
        btnChocolate = (android.widget.ImageButton) findViewById(R.id.btnChocolate);
        btnComer = (android.widget.ImageButton) findViewById(R.id.btnComer);
        btnFeijao = (android.widget.ImageButton) findViewById(R.id.btnFeijao);
        btnFrutas = (android.widget.ImageButton) findViewById(R.id.btnFrutas);
        btnJantar = (android.widget.ImageButton) findViewById(R.id.btnJantar);
        btnLanche = (android.widget.ImageButton) findViewById(R.id.btnLanche);
        btnLeite = (android.widget.ImageButton) findViewById(R.id.btnLeite);
        btnMacarrao = (android.widget.ImageButton) findViewById(R.id.btnMacarrao);
        btnPao = (android.widget.ImageButton) findViewById(R.id.btnPao);
        btnPipoca = (android.widget.ImageButton) findViewById(R.id.btnPipoca);
        btnSalada = (android.widget.ImageButton) findViewById(R.id.btnSalada);
        btnSorvete = (android.widget.ImageButton) findViewById(R.id.btnSorvete);
        btnSuco = (android.widget.ImageButton) findViewById(R.id.btnSuco);
        btnQuero = (android.widget.ImageButton) findViewById(R.id.btnQuero);
        btnQuero1 = (android.widget.ImageButton) findViewById(R.id.btnQuero1);

        btnAgua.setOnClickListener(this);
        btnAlmocar.setOnClickListener(this);
        btnArroz.setOnClickListener(this);
        btnBatata.setOnClickListener(this);
        btnBiscoito.setOnClickListener(this);
        btnCafeManha.setOnClickListener(this);
        btnCarne.setOnClickListener(this);
        btnChocolate.setOnClickListener(this);
        btnComer.setOnClickListener(this);
        btnFeijao.setOnClickListener(this);
        btnFrutas.setOnClickListener(this);
        btnJantar.setOnClickListener(this);
        btnLanche.setOnClickListener(this);
        btnLeite.setOnClickListener(this);
        btnMacarrao.setOnClickListener(this);
        btnPao.setOnClickListener(this);
        btnPipoca.setOnClickListener(this);
        btnSalada.setOnClickListener(this);
        btnSorvete.setOnClickListener(this);
        btnSuco.setOnClickListener(this);
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

        if (v.getId()==R.id.btnAgua){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqragua);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqragua);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnAlmocar){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqralmocar);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqralmocar);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnArroz){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrarroz);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrarroz);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnBatata){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrbatata);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrbatata);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnBiscoito){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrbiscoito);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrbiscoito);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnCafeManha){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrcafemanha);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrcafemanha);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnCarne){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrcarne);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrcarne);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnChocolate){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrchocolate);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrchocolate);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnComer){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrcomer);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrcomer);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnFeijao){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrfeijao);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrfeijao);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnFrutas){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrfruta);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrfruta);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnJantar) {
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this, R.raw.maqrjantar);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f, 0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrjantar);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnLanche){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrlanche);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrlanche);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnLeite){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrleite);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrleite);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnMacarrao){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrmacarrao);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrmacarrao);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnPao){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrpao);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrpao);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnPipoca){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrpipoca);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrpipoca);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnSalada){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrsalada);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrsalada);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnSorvete){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrsorvete);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrsorvete);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnSuco){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.maqrsuco);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.manqrsuco);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }
    }
}