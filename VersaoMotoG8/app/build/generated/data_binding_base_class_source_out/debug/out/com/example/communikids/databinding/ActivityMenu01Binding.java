// Gerado pelo compilador do view binder. Não edite!
package com.example.communikids.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ActivityMenu01Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton btnAlimento;

  @NonNull
  public final ImageButton btnBrinquedos;

  @NonNull
  public final ImageButton btnLugares;

  @NonNull
  public final ImageButton btnNecessidade;

  @NonNull
  public final ImageButton btnPessoas;

  private ActivityMenu01Binding(@NonNull LinearLayout rootView, @NonNull ImageButton btnAlimento,
      @NonNull ImageButton btnBrinquedos, @NonNull ImageButton btnLugares,
      @NonNull ImageButton btnNecessidade, @NonNull ImageButton btnPessoas) {
    this.rootView = rootView;
    this.btnAlimento = btnAlimento;
    this.btnBrinquedos = btnBrinquedos;
    this.btnLugares = btnLugares;
    this.btnNecessidade = btnNecessidade;
    this.btnPessoas = btnPessoas;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMenu01Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMenu01Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_menu01, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMenu01Binding bind(@NonNull View rootView) {
    // Isso é feito para otimizar o bytecode compilado quanto ao tamanho e desempenho.
    int id;
    missingId: {
      id = R.id.btnAlimento;
      ImageButton btnAlimento = ViewBindings.findChildViewById(rootView, id);
      if (btnAlimento == null) {
        break missingId;
      }

      id = R.id.btnBrinquedos;
      ImageButton btnBrinquedos = ViewBindings.findChildViewById(rootView, id);
      if (btnBrinquedos == null) {
        break missingId;
      }

      id = R.id.btnLugares;
      ImageButton btnLugares = ViewBindings.findChildViewById(rootView, id);
      if (btnLugares == null) {
        break missingId;
      }

      id = R.id.btnNecessidade;
      ImageButton btnNecessidade = ViewBindings.findChildViewById(rootView, id);
      if (btnNecessidade == null) {
        break missingId;
      }

      id = R.id.btnPessoas;
      ImageButton btnPessoas = ViewBindings.findChildViewById(rootView, id);
      if (btnPessoas == null) {
        break missingId;
      }

      return new ActivityMenu01Binding((LinearLayout) rootView, btnAlimento, btnBrinquedos,
          btnLugares, btnNecessidade, btnPessoas);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
