package com.example.communikids;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class BancoController {
    private SQLiteDatabase db;
    private CriaBanco banco;
    public BancoController(Context context) {
        banco = new CriaBanco(context);
    }

    // rotina para incluir um novo usuário (tela de Cadastre_se)
    public String gravaColaborador(String cNome, String cEmail, String cCpf, String cSenha) {
        ContentValues valores;
        long resultado;
        db = banco.getWritableDatabase();

        valores = new ContentValues();
        valores.put("nome", cNome);
        valores.put("email", cEmail);
        valores.put("cpf", cCpf);
        valores.put("senha", cSenha);

        resultado = db.insert("colaborador", null, valores);
        db.close();

        if (resultado == -1)
            return "Erro ao tentar gravar os dados[X]";
        else
            return "Cadastro realizado com sucesso!";

    }

    public String insereDados(String txtNome, String txtEmail, String txtDataNasc, String txtTelefone, String txtSexo, String txtCep, String txtEndereco, String txtBairro, String txtCidade) {
        ContentValues valores;
        long resultado;
        db = banco.getWritableDatabase();

        valores = new ContentValues();
        valores.put("nome", txtNome);
        valores.put("email", txtEmail);
        valores.put("dataNascimento", txtDataNasc);
        valores.put("telefone", txtTelefone);
        valores.put("sexo", txtSexo);
        valores.put("cep", txtCep);
        valores.put("endereco", txtEndereco);
        valores.put("bairro", txtBairro);
        valores.put("cidade", txtCidade);

        resultado = db.insert("cadastroAlunos", null, valores);
        db.close();

        if (resultado == -1)
            return "Erro ao realizar cadastro [X]";
        else
            return "Aluno cadastrado com sucesso!";
    }

    public Cursor PesquisarLogin(String _email, String _senha) {
        Cursor cursor;
        String[] campos = { "idColaborador", "nome", "email", "senha", "cpf" };
        String where = "email = '" + _email + "' and senha = '" + _senha + "'";
        db = banco.getReadableDatabase();
        cursor = db.query("colaborador", campos, where, null, null, null,
                null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }

    public Cursor carregaDadosPeloCodigo(int id) {
        Cursor cursor;
        String[] campos = { "codigo", "nome", "email", "dataNascimento", "telefone", "sexo", "cep", "endereco", "bairro", "cidade"};
        String where = "codigo=" + id;
        db = banco.getReadableDatabase();
        cursor = db.query("cadastroAlunos", campos, where, null, null, null,
                null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }

    public String alteraDados(int id, String txtNome, String txtEmail, String txtDataNasc, String txtTelefone, String txtSexo, String txtCep, String txtEndereco, String txtBairro, String txtCidade){

        String msg = "Dados alterados com sucesso!" ;

        db = banco.getReadableDatabase();

        ContentValues valores = new ContentValues() ;
        valores.put("nome" , txtNome ) ;
        valores.put("email", txtEmail) ;
        valores.put("dataNascimento", txtDataNasc);
        valores.put("telefone", txtTelefone);
        valores.put("sexo", txtSexo);
        valores.put("cep",txtCep);
        valores.put("endereco", txtEndereco);
        valores.put("bairro", txtBairro);
        valores.put("cidade", txtCidade);

        String condicao = "codigo = " + id;

        int linha ;
        linha = db.update("cadastroAlunos", valores, condicao, null) ;

        if (linha < 1){
            msg = "Erro ao alterar os dados [X]" ;
        }

        db.close();
        return msg;
    }

    public String excluirDados(int id){
        String msg = "Registro Excluído com sucesso!" ;

        db = banco.getReadableDatabase();

        String condicao = "codigo = " + id ;

        int linhas ;
        linhas = db.delete("cadastroAlunos", condicao, null) ;

        if ( linhas < 1) {
            msg = "Erro ao Excluir Dados [X]" ;
        }

        db.close();
        return msg;
    }
}