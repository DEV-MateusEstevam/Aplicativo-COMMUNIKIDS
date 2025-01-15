package com.example.communikids;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CriaBanco extends SQLiteOpenHelper {
    private static final String NOME_BANCO = "banco_alunos.db";//mudei de banco_exemplo
    private static final int VERSAO = 8;
    public CriaBanco(Context context) {
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE cadastroAlunos ("//mudei de contatos
                + "codigo integer primary key autoincrement,"
                + "nome text,"
                + "email text,"
                + "dataNascimento text,"
                + "telefone text,"
                + "sexo text,"
                + "cep text,"
                + "endereco text,"
                + "bairro text,"
                + "cidade text)";

        db.execSQL(sql);
        sql = "CREATE TABLE colaborador ("
                + "idColaborador integer primary key autoincrement,"
                + "nome text,"
                + "email text,"
                + "cpf text,"
                + "senha text)" ;

        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS cadastroAlunos");//mudei de contatos
        db.execSQL("DROP TABLE IF EXISTS colaborador");
        onCreate(db);
    }
}