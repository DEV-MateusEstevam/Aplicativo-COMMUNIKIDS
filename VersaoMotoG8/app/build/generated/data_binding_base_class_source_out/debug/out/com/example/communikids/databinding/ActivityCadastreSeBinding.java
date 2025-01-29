//Gerado pelo compilador do view binder. Não edite!
package com.example.communikids.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.communikids.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCadastreSeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout CadastreSe;

  @NonNull
  public final ImageButton btnCACSalvar;

  @NonNull
  public final ImageButton btnCACVoltar;

  @NonNull
  public final EditText txtCACCpf;

  @NonNull
  public final EditText txtCACEmail;

  @NonNull
  public final EditText txtCACNome;

  @NonNull
  public final EditText txtCACSenha;

  @NonNull
  public final EditText txtCACSenha2;

  private ActivityCadastreSeBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout CadastreSe, @NonNull ImageButton btnCACSalvar,
      @NonNull ImageButton btnCACVoltar, @NonNull EditText txtCACCpf, @NonNull EditText txtCACEmail,
      @NonNull EditText txtCACNome, @NonNull EditText txtCACSenha, @NonNull EditText txtCACSenha2) {
    this.rootView = rootView;
    this.CadastreSe = CadastreSe;
    this.btnCACSalvar = btnCACSalvar;
    this.btnCACVoltar = btnCACVoltar;
    this.txtCACCpf = txtCACCpf;
    this.txtCACEmail = txtCACEmail;
    this.txtCACNome = txtCACNome;
    this.txtCACSenha = txtCACSenha;
    this.txtCACSenha2 = txtCACSenha2;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCadastreSeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCadastreSeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_cadastre_se, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCadastreSeBinding bind(@NonNull View rootView) {
    // Isso é feito para otimizar o bytecode compilado quanto ao tamanho e desempenho.
    int id;
    missingId: {
      LinearLayout CadastreSe = (LinearLayout) rootView;

      id = R.id.btnCACSalvar;
      ImageButton btnCACSalvar = ViewBindings.findChildViewById(rootView, id);
      if (btnCACSalvar == null) {
        break missingId;
      }

      id = R.id.btnCACVoltar;
      ImageButton btnCACVoltar = ViewBindings.findChildViewById(rootView, id);
      if (btnCACVoltar == null) {
        break missingId;
      }

      id = R.id.txtCACCpf;
      EditText txtCACCpf = ViewBindings.findChildViewById(rootView, id);
      if (txtCACCpf == null) {
        break missingId;
      }

      id = R.id.txtCACEmail;
      EditText txtCACEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtCACEmail == null) {
        break missingId;
      }

      id = R.id.txtCACNome;
      EditText txtCACNome = ViewBindings.findChildViewById(rootView, id);
      if (txtCACNome == null) {
        break missingId;
      }

      id = R.id.txtCACSenha;
      EditText txtCACSenha = ViewBindings.findChildViewById(rootView, id);
      if (txtCACSenha == null) {
        break missingId;
      }

      id = R.id.txtCACSenha2;
      EditText txtCACSenha2 = ViewBindings.findChildViewById(rootView, id);
      if (txtCACSenha2 == null) {
        break missingId;
      }

      return new ActivityCadastreSeBinding((LinearLayout) rootView, CadastreSe, btnCACSalvar,
          btnCACVoltar, txtCACCpf, txtCACEmail, txtCACNome, txtCACSenha, txtCACSenha2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
