package com.example.communikids;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuPessoas extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnQuero, btnQuero1, btnCozinheira, btnDiretora, btnEla, btnEle, btnFisioterapeuta, btnIrma, btnIrmao, btnMae, btnPai, btnProfessora, btnTia, btnTio, btnVom, btnVoh;
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
        setContentView(R.layout.activity_menu_pessoas);

        btnCozinheira = (android.widget.ImageButton) findViewById(R.id.btnCozinheira);
        btnDiretora = (android.widget.ImageButton) findViewById(R.id.btnDiretora);
        btnEla = (android.widget.ImageButton) findViewById(R.id.btnEla);
        btnEle = (android.widget.ImageButton) findViewById(R.id.btnEle);
        btnFisioterapeuta = (android.widget.ImageButton) findViewById(R.id.btnFisioterapeuta);
        btnIrma = (android.widget.ImageButton) findViewById(R.id.btnIrma);
        btnIrmao = (android.widget.ImageButton) findViewById(R.id.btnIrmao);
        btnMae = (android.widget.ImageButton) findViewById(R.id.btnMae);
        btnPai = (android.widget.ImageButton) findViewById(R.id.btnPai);
        btnProfessora = (android.widget.ImageButton) findViewById(R.id.btnProfessora);
        btnTia = (android.widget.ImageButton) findViewById(R.id.btnTia);
        btnTio = (android.widget.ImageButton) findViewById(R.id.btnTio);
        btnVom = (android.widget.ImageButton) findViewById(R.id.btnVom);
        btnVoh = (android.widget.ImageButton) findViewById(R.id.btnVoh);
        btnQuero = (android.widget.ImageButton) findViewById(R.id.btnQuero);
        btnQuero1 = (android.widget.ImageButton) findViewById(R.id.btnQuero1);

        btnCozinheira.setOnClickListener(this);
        btnDiretora.setOnClickListener(this);
        btnEla.setOnClickListener(this);
        btnEle.setOnClickListener(this);
        btnFisioterapeuta.setOnClickListener(this);
        btnIrma.setOnClickListener(this);
        btnIrmao.setOnClickListener(this);
        btnMae.setOnClickListener(this);
        btnPai.setOnClickListener(this);
        btnProfessora.setOnClickListener(this);
        btnTia.setOnClickListener(this);
        btnTio.setOnClickListener(this);
        btnVom.setOnClickListener(this);
        btnVoh.setOnClickListener(this);
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


        if (v.getId()==R.id.btnCozinheira){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mpqrcozinheira);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mpnqrcozinheira);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnDiretora){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mpqrdiretora);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mpnqrdiretora);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnEla){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mpqrela);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mpnqrela);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnEle){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mpqrele);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();

            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mpnqrele);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnFisioterapeuta){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mpqrfisio);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mpnqrfisio);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnIrma){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mpqrirma);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mpnqrirma);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnIrmao){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mpqrirmao);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mpnqrirmao);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnMae){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mpqrmae);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mpnqrmae);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnPai){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mpqrpai);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mpnqrpai);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnProfessora){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mpqrprofessora);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mpnqrprofessora);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnTia){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mpqrtia);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mpnqrtia);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnTio) {
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this, R.raw.mpqrtio);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f, 0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mpnqrtio);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnVom){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mpqrvom);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mpnqrvom);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }

        if (v.getId()==R.id.btnVoh){
            if(this.getA() == false){
                musicPlayer = MediaPlayer.create(this,R.raw.mpqrvoh);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }else{
                musicPlayer = MediaPlayer.create(this,R.raw.mpnqrvoh);
                musicPlayer.seekTo(0);
                musicPlayer.setVolume(0.5f,0.5f);
                musicPlayer.start();
            }
        }
    }
}