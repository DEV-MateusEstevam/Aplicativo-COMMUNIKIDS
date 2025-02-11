// Gerado pelo compilador do view binder. Não edite!
package com.example.communikids.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.communikids.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView Bairro;

  @NonNull
  public final TextView Cep;

  @NonNull
  public final TextView Cidade;

  @NonNull
  public final TextView Codigo;

  @NonNull
  public final TextView DataNasc;

  @NonNull
  public final TextView Email;

  @NonNull
  public final TextView Endereco;

  @NonNull
  public final TextView Nome;

  @NonNull
  public final TextView Sexo;

  @NonNull
  public final TextView Telefone;

  @NonNull
  public final ImageButton btnAlterar;

  @NonNull
  public final ImageButton btnCadastrar;

  @NonNull
  public final ImageButton btnConsultar;

  @NonNull
  public final ImageButton btnDeletar;

  @NonNull
  public final TextView textView;

  @NonNull
  public final EditText txtBairro;

  @NonNull
  public final EditText txtCep;

  @NonNull
  public final EditText txtCidade;

  @NonNull
  public final EditText txtCodigo;

  @NonNull
  public final EditText txtDataNasc;

  @NonNull
  public final EditText txtEmail;

  @NonNull
  public final EditText txtEndereco;

  @NonNull
  public final EditText txtNome;

  @NonNull
  public final EditText txtSexo;

  @NonNull
  public final EditText txtTelefone;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull TextView Bairro,
      @NonNull TextView Cep, @NonNull TextView Cidade, @NonNull TextView Codigo,
      @NonNull TextView DataNasc, @NonNull TextView Email, @NonNull TextView Endereco,
      @NonNull TextView Nome, @NonNull TextView Sexo, @NonNull TextView Telefone,
      @NonNull ImageButton btnAlterar, @NonNull ImageButton btnCadastrar,
      @NonNull ImageButton btnConsultar, @NonNull ImageButton btnDeletar,
      @NonNull TextView textView, @NonNull EditText txtBairro, @NonNull EditText txtCep,
      @NonNull EditText txtCidade, @NonNull EditText txtCodigo, @NonNull EditText txtDataNasc,
      @NonNull EditText txtEmail, @NonNull EditText txtEndereco, @NonNull EditText txtNome,
      @NonNull EditText txtSexo, @NonNull EditText txtTelefone) {
    this.rootView = rootView;
    this.Bairro = Bairro;
    this.Cep = Cep;
    this.Cidade = Cidade;
    this.Codigo = Codigo;
    this.DataNasc = DataNasc;
    this.Email = Email;
    this.Endereco = Endereco;
    this.Nome = Nome;
    this.Sexo = Sexo;
    this.Telefone = Telefone;
    this.btnAlterar = btnAlterar;
    this.btnCadastrar = btnCadastrar;
    this.btnConsultar = btnConsultar;
    this.btnDeletar = btnDeletar;
    this.textView = textView;
    this.txtBairro = txtBairro;
    this.txtCep = txtCep;
    this.txtCidade = txtCidade;
    this.txtCodigo = txtCodigo;
    this.txtDataNasc = txtDataNasc;
    this.txtEmail = txtEmail;
    this.txtEndereco = txtEndereco;
    this.txtNome = txtNome;
    this.txtSexo = txtSexo;
    this.txtTelefone = txtTelefone;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // Isso é feito para otimizar o bytecode compilado quanto ao tamanho e desempenho.
    int id;
    missingId: {
      id = R.id.Bairro;
      TextView Bairro = ViewBindings.findChildViewById(rootView, id);
      if (Bairro == null) {
        break missingId;
      }

      id = R.id.Cep;
      TextView Cep = ViewBindings.findChildViewById(rootView, id);
      if (Cep == null) {
        break missingId;
      }

      id = R.id.Cidade;
      TextView Cidade = ViewBindings.findChildViewById(rootView, id);
      if (Cidade == null) {
        break missingId;
      }

      id = R.id.Codigo;
      TextView Codigo = ViewBindings.findChildViewById(rootView, id);
      if (Codigo == null) {
        break missingId;
      }

      id = R.id.DataNasc;
      TextView DataNasc = ViewBindings.findChildViewById(rootView, id);
      if (DataNasc == null) {
        break missingId;
      }

      id = R.id.Email;
      TextView Email = ViewBindings.findChildViewById(rootView, id);
      if (Email == null) {
        break missingId;
      }

      id = R.id.Endereco;
      TextView Endereco = ViewBindings.findChildViewById(rootView, id);
      if (Endereco == null) {
        break missingId;
      }

      id = R.id.Nome;
      TextView Nome = ViewBindings.findChildViewById(rootView, id);
      if (Nome == null) {
        break missingId;
      }

      id = R.id.Sexo;
      TextView Sexo = ViewBindings.findChildViewById(rootView, id);
      if (Sexo == null) {
        break missingId;
      }

      id = R.id.Telefone;
      TextView Telefone = ViewBindings.findChildViewById(rootView, id);
      if (Telefone == null) {
        break missingId;
      }

      id = R.id.btnAlterar;
      ImageButton btnAlterar = ViewBindings.findChildViewById(rootView, id);
      if (btnAlterar == null) {
        break missingId;
      }

      id = R.id.btnCadastrar;
      ImageButton btnCadastrar = ViewBindings.findChildViewById(rootView, id);
      if (btnCadastrar == null) {
        break missingId;
      }

      id = R.id.btnConsultar;
      ImageButton btnConsultar = ViewBindings.findChildViewById(rootView, id);
      if (btnConsultar == null) {
        break missingId;
      }

      id = R.id.btnDeletar;
      ImageButton btnDeletar = ViewBindings.findChildViewById(rootView, id);
      if (btnDeletar == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.txtBairro;
      EditText txtBairro = ViewBindings.findChildViewById(rootView, id);
      if (txtBairro == null) {
        break missingId;
      }

      id = R.id.txtCep;
      EditText txtCep = ViewBindings.findChildViewById(rootView, id);
      if (txtCep == null) {
        break missingId;
      }

      id = R.id.txtCidade;
      EditText txtCidade = ViewBindings.findChildViewById(rootView, id);
      if (txtCidade == null) {
        break missingId;
      }

      id = R.id.txtCodigo;
      EditText txtCodigo = ViewBindings.findChildViewById(rootView, id);
      if (txtCodigo == null) {
        break missingId;
      }

      id = R.id.txtDataNasc;
      EditText txtDataNasc = ViewBindings.findChildViewById(rootView, id);
      if (txtDataNasc == null) {
        break missingId;
      }

      id = R.id.txtEmail;
      EditText txtEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtEmail == null) {
        break missingId;
      }

      id = R.id.txtEndereco;
      EditText txtEndereco = ViewBindings.findChildViewById(rootView, id);
      if (txtEndereco == null) {
        break missingId;
      }

      id = R.id.txtNome;
      EditText txtNome = ViewBindings.findChildViewById(rootView, id);
      if (txtNome == null) {
        break missingId;
      }

      id = R.id.txtSexo;
      EditText txtSexo = ViewBindings.findChildViewById(rootView, id);
      if (txtSexo == null) {
        break missingId;
      }

      id = R.id.txtTelefone;
      EditText txtTelefone = ViewBindings.findChildViewById(rootView, id);
      if (txtTelefone == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, Bairro, Cep, Cidade, Codigo,
          DataNasc, Email, Endereco, Nome, Sexo, Telefone, btnAlterar, btnCadastrar, btnConsultar,
          btnDeletar, textView, txtBairro, txtCep, txtCidade, txtCodigo, txtDataNasc, txtEmail,
          txtEndereco, txtNome, txtSexo, txtTelefone);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
