// Gerado pelo compilador do view binder. Não edite!
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

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout Login;

  @NonNull
  public final ImageButton btnLCAcessar;

  @NonNull
  public final ImageButton btnLCCadastreSe;

  @NonNull
  public final EditText txtLCEmail;

  @NonNull
  public final EditText txtLCSenha;

  private ActivityLoginBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout Login,
      @NonNull ImageButton btnLCAcessar, @NonNull ImageButton btnLCCadastreSe,
      @NonNull EditText txtLCEmail, @NonNull EditText txtLCSenha) {
    this.rootView = rootView;
    this.Login = Login;
    this.btnLCAcessar = btnLCAcessar;
    this.btnLCCadastreSe = btnLCCadastreSe;
    this.txtLCEmail = txtLCEmail;
    this.txtLCSenha = txtLCSenha;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // Isso é feito para otimizar o bytecode compilado quanto ao tamanho e desempenho.
    int id;
    missingId: {
      LinearLayout Login = (LinearLayout) rootView;

      id = R.id.btnLCAcessar;
      ImageButton btnLCAcessar = ViewBindings.findChildViewById(rootView, id);
      if (btnLCAcessar == null) {
        break missingId;
      }

      id = R.id.btnLCCadastre_se;
      ImageButton btnLCCadastreSe = ViewBindings.findChildViewById(rootView, id);
      if (btnLCCadastreSe == null) {
        break missingId;
      }

      id = R.id.txtLCEmail;
      EditText txtLCEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtLCEmail == null) {
        break missingId;
      }

      id = R.id.txtLCSenha;
      EditText txtLCSenha = ViewBindings.findChildViewById(rootView, id);
      if (txtLCSenha == null) {
        break missingId;
      }

      return new ActivityLoginBinding((LinearLayout) rootView, Login, btnLCAcessar, btnLCCadastreSe,
          txtLCEmail, txtLCSenha);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
