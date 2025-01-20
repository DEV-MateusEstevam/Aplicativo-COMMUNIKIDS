package com.example.communikids;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.database.Cursor;
import android.view.View;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    MediaPlayer musicPlayer;
    ImageButton btnCadastrar;
    ImageButton btnConsultar;
    ImageButton btnAlterar;
    ImageButton btnDeletar;
    EditText codigo, nome, email, dataNascimento, telefone, sexo, cep, endereco, bairro, cidade;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        codigo = (EditText) findViewById(R.id.txtCodigo);
        nome = (EditText) findViewById(R.id.txtNome);
        email = (EditText) findViewById(R.id.txtEmail);
        dataNascimento = (EditText) findViewById(R.id.txtDataNasc);
        telefone = (EditText) findViewById(R.id.txtTelefone);
        sexo = (EditText) findViewById(R.id.txtSexo);
        cep = (EditText) findViewById(R.id.txtCep);
        endereco = (EditText) findViewById(R.id.txtEndereco);
        bairro = (EditText) findViewById(R.id.txtBairro);
        cidade = (EditText) findViewById(R.id.txtCidade);

        btnCadastrar = (android.widget.ImageButton) findViewById(R.id.btnCadastrar);
        btnConsultar = (android.widget.ImageButton) findViewById(R.id.btnConsultar);
        btnAlterar = (android.widget.ImageButton) findViewById(R.id.btnAlterar);
        btnDeletar = (android.widget.ImageButton) findViewById(R.id.btnDeletar);
        btnCadastrar.setOnClickListener(this);
        btnConsultar.setOnClickListener(this);
        btnAlterar.setOnClickListener(this);
        btnDeletar.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.btnCadastrar) {
            cadastrar();
        }

        if (v.getId() == R.id.btnConsultar) {
            consultar();
        }

        if (v.getId() == R.id.btnAlterar) {
            alterar();
        }

        if (v.getId() == R.id.btnDeletar) {
            deletar();
        }
    }

    private void consultar() {

        int txtCodigo = Integer.parseInt(codigo.getText().toString());

        BancoController bd = new BancoController(getBaseContext());

        Cursor dados = bd.carregaDadosPeloCodigo(txtCodigo) ;

        if(dados.moveToFirst()){
            nome.setText( dados.getString(1) );
            email.setText( dados.getString(2) );
            dataNascimento.setText( dados.getString(3) );
            telefone.setText(dados.getString(4) );
            sexo.setText(dados.getString(5) );
            cep.setText(dados.getString(6) );
            endereco.setText(dados.getString(7) );
            bairro.setText(dados.getString(8) );
            cidade.setText(dados.getString(9) );

            musicPlayer = MediaPlayer.create(this,R.raw.btnconsultar);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();

        }else{
            musicPlayer = MediaPlayer.create(this,R.raw.btnnconsultar);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            String msg= "Código não cadastrado";
            Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            limpar();
        }

    }

    public void cadastrar() {
        String msg = "";
        String txtNome = nome.getText().toString();
        String txtEmail = email.getText().toString();
        String txtDataNasc = dataNascimento.getText().toString();
        String txtTelefone = telefone.getText().toString();
        String txtSexo = sexo.getText().toString();
        String txtCep = cep.getText().toString();
        String txtEndereco = endereco.getText().toString();
        String txtBairro = bairro.getText().toString();
        String txtCidade = cidade.getText().toString();

        boolean erro = false;
        if (txtNome.length()==0) {
            musicPlayer = MediaPlayer.create(this,R.raw.btnncadastrar);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            msg="Preencha com no minimo 3 caracteres o campo 'Nome'";
            Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();
            erro = true;

        } else if (txtEmail.length()<10){
            musicPlayer = MediaPlayer.create(this,R.raw.btnncadastrar);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            msg="Preencha com no minimo 10 caracteres o campo 'E-mail'";
            Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();
            erro = true;

        } else if (txtDataNasc.length()<10){
            musicPlayer = MediaPlayer.create(this,R.raw.btnncadastrar);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            msg="Preencha com no minimo 11 caracteres o campo 'Data de Nascimento'";
            Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();
            erro = true;

        }else if (txtTelefone.length()<11){
            musicPlayer = MediaPlayer.create(this,R.raw.btnncadastrar);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            msg="Preencha com no minimo 11 caracteres o campo 'Telefone'";
            Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();
            erro = true;
        }

        if (erro==false){
            musicPlayer = MediaPlayer.create(this,R.raw.btncadastrar);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();

            BancoController bd = new BancoController(getBaseContext());
            String resultado;

            resultado = bd.insereDados(txtNome, txtEmail, txtDataNasc, txtTelefone, txtSexo, txtCep, txtEndereco, txtBairro, txtCidade);

            Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            Intent telaMenuOpcao = new Intent(this, MenuOpcao.class);
            startActivity(telaMenuOpcao);
            limpar();
        }
    }

    public void alterar() {
        int id = Integer.parseInt(codigo.getText().toString()) ;
        String txtNome  = nome.getText().toString() ;
        String txtEmail = email.getText().toString() ;
        String txtDataNasc = dataNascimento.getText().toString();
        String txtTelefone = telefone.getText().toString();
        String txtSexo = sexo.getText().toString();
        String txtCep = cep.getText().toString();
        String txtEndereco = endereco.getText().toString();
        String txtBairro = bairro.getText().toString();
        String txtCidade = cidade.getText().toString();
        String msg = "";

        boolean erro = false;
        if (codigo.getText().toString().length()==0) {
            musicPlayer = MediaPlayer.create(this,R.raw.btnnalterar);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            msg="Preencha o corretamente campo 'Código' para Alterar o Registro [X]";
            Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();
            erro = true;

        } else if (txtNome.length()==0) {
            musicPlayer = MediaPlayer.create(this,R.raw.btnnalterar);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            msg="Preencha com no minimo 3 caracteres o campo 'Nome' [X]";
            Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();
            erro = true;

        }else if (txtEmail.length()<10){
            musicPlayer = MediaPlayer.create(this,R.raw.btnnalterar);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            msg="Preencha com no minimo 10 caracteres o campo 'E-mail' [X]";
            Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();
            erro = true;

        }else if (txtDataNasc.length()<10){
            musicPlayer = MediaPlayer.create(this,R.raw.btnnalterar);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            msg="Preencha com no minimo 11 caracteres o campo 'Data de Nascimento' [X]";
            Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();
            erro = true;

        } else if (txtTelefone.length()<11){
            musicPlayer = MediaPlayer.create(this,R.raw.btnnalterar);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            msg="Preencha com no minimo 11 caracteres o campo 'Telefone' [X]";
            Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();
            erro = true;
        }

        if (erro==false){
            BancoController bd = new BancoController(getBaseContext());

            msg = bd.alteraDados(id, txtNome, txtEmail, txtDataNasc, txtTelefone, txtSexo, txtCep,  txtEndereco, txtBairro, txtCidade) ;

            musicPlayer = MediaPlayer.create(this,R.raw.btnalterar);
            musicPlayer.seekTo(0);
            musicPlayer.setVolume(0.5f,0.5f);
            musicPlayer.start();
            Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();
            limpar();
        }
    }

    public void deletar() {
        int id = Integer.parseInt(codigo.getText().toString());

        BancoController bd = new BancoController(getBaseContext());

        String res ;
        res = bd.excluirDados(id) ;

        musicPlayer = MediaPlayer.create(this,R.raw.btndeletar);
        musicPlayer.seekTo(0);
        musicPlayer.setVolume(0.5f,0.5f);
        musicPlayer.start();
        Toast.makeText(getApplicationContext(), res,Toast.LENGTH_LONG).show() ;
        limpar() ;
    }

    public void limpar(){
        codigo.setText("") ;
        nome.setText("") ;
        email.setText("") ;
        dataNascimento.setText("");
        telefone.setText("");
        sexo.setText("");
        cep.setText("");
        endereco.setText("");
        bairro.setText("");
        cidade.setText("");
    }
}
