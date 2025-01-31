// Gerado pelo compilador do view binder. Não edite!
package com.example.communikids.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.communikids.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMenuOpcaoBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout Login;

  @NonNull
  public final ImageButton btnCadastroaluno;

  @NonNull
  public final ImageButton btnMOvoltar;

  @NonNull
  public final ImageButton btnMenuinteracao;

  @NonNull
  public final ImageView imgIcon128;

  @NonNull
  public final ImageView imgLogo;

  private ActivityMenuOpcaoBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout Login,
      @NonNull ImageButton btnCadastroaluno, @NonNull ImageButton btnMOvoltar,
      @NonNull ImageButton btnMenuinteracao, @NonNull ImageView imgIcon128,
      @NonNull ImageView imgLogo) {
    this.rootView = rootView;
    this.Login = Login;
    this.btnCadastroaluno = btnCadastroaluno;
    this.btnMOvoltar = btnMOvoltar;
    this.btnMenuinteracao = btnMenuinteracao;
    this.imgIcon128 = imgIcon128;
    this.imgLogo = imgLogo;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMenuOpcaoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMenuOpcaoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_menu_opcao, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMenuOpcaoBinding bind(@NonNull View rootView) {
  // Isso é feito para otimizar o bytecode compilado quanto ao tamanho e desempenho.
    int id;
    missingId: {
      LinearLayout Login = (LinearLayout) rootView;

      id = R.id.btnCadastroaluno;
      ImageButton btnCadastroaluno = ViewBindings.findChildViewById(rootView, id);
      if (btnCadastroaluno == null) {
        break missingId;
      }

      id = R.id.btnMOvoltar;
      ImageButton btnMOvoltar = ViewBindings.findChildViewById(rootView, id);
      if (btnMOvoltar == null) {
        break missingId;
      }

      id = R.id.btnMenuinteracao;
      ImageButton btnMenuinteracao = ViewBindings.findChildViewById(rootView, id);
      if (btnMenuinteracao == null) {
        break missingId;
      }

      id = R.id.imgIcon128;
      ImageView imgIcon128 = ViewBindings.findChildViewById(rootView, id);
      if (imgIcon128 == null) {
        break missingId;
      }

      id = R.id.imgLogo;
      ImageView imgLogo = ViewBindings.findChildViewById(rootView, id);
      if (imgLogo == null) {
        break missingId;
      }

      return new ActivityMenuOpcaoBinding((LinearLayout) rootView, Login, btnCadastroaluno,
          btnMOvoltar, btnMenuinteracao, imgIcon128, imgLogo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
