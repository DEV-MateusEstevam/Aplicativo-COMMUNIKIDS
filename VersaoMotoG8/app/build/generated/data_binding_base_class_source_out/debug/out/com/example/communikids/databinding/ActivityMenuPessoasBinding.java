// Gerado pelo compilador do view binder. Não edite!
package com.example.communikids.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.communikids.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMenuPessoasBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageButton btnCozinheira;

  @NonNull
  public final ImageButton btnDiretora;

  @NonNull
  public final ImageButton btnEla;

  @NonNull
  public final ImageButton btnEle;

  @NonNull
  public final ImageButton btnFisioterapeuta;

  @NonNull
  public final ImageButton btnIrma;

  @NonNull
  public final ImageButton btnIrmao;

  @NonNull
  public final ImageButton btnMae;

  @NonNull
  public final ImageButton btnPai;

  @NonNull
  public final ImageButton btnProfessora;

  @NonNull
  public final ImageButton btnQuero;

  @NonNull
  public final ImageButton btnQuero1;

  @NonNull
  public final ImageButton btnTia;

  @NonNull
  public final ImageButton btnTio;

  @NonNull
  public final ImageButton btnVoh;

  @NonNull
  public final ImageButton btnVom;

  private ActivityMenuPessoasBinding(@NonNull ScrollView rootView,
      @NonNull ImageButton btnCozinheira, @NonNull ImageButton btnDiretora,
      @NonNull ImageButton btnEla, @NonNull ImageButton btnEle,
      @NonNull ImageButton btnFisioterapeuta, @NonNull ImageButton btnIrma,
      @NonNull ImageButton btnIrmao, @NonNull ImageButton btnMae, @NonNull ImageButton btnPai,
      @NonNull ImageButton btnProfessora, @NonNull ImageButton btnQuero,
      @NonNull ImageButton btnQuero1, @NonNull ImageButton btnTia, @NonNull ImageButton btnTio,
      @NonNull ImageButton btnVoh, @NonNull ImageButton btnVom) {
    this.rootView = rootView;
    this.btnCozinheira = btnCozinheira;
    this.btnDiretora = btnDiretora;
    this.btnEla = btnEla;
    this.btnEle = btnEle;
    this.btnFisioterapeuta = btnFisioterapeuta;
    this.btnIrma = btnIrma;
    this.btnIrmao = btnIrmao;
    this.btnMae = btnMae;
    this.btnPai = btnPai;
    this.btnProfessora = btnProfessora;
    this.btnQuero = btnQuero;
    this.btnQuero1 = btnQuero1;
    this.btnTia = btnTia;
    this.btnTio = btnTio;
    this.btnVoh = btnVoh;
    this.btnVom = btnVom;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMenuPessoasBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMenuPessoasBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_menu_pessoas, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMenuPessoasBinding bind(@NonNull View rootView) {
   // Isso é feito para otimizar o bytecode compilado quanto ao tamanho e desempenho.
    int id;
    missingId: {
      id = R.id.btnCozinheira;
      ImageButton btnCozinheira = ViewBindings.findChildViewById(rootView, id);
      if (btnCozinheira == null) {
        break missingId;
      }

      id = R.id.btnDiretora;
      ImageButton btnDiretora = ViewBindings.findChildViewById(rootView, id);
      if (btnDiretora == null) {
        break missingId;
      }

      id = R.id.btnEla;
      ImageButton btnEla = ViewBindings.findChildViewById(rootView, id);
      if (btnEla == null) {
        break missingId;
      }

      id = R.id.btnEle;
      ImageButton btnEle = ViewBindings.findChildViewById(rootView, id);
      if (btnEle == null) {
        break missingId;
      }

      id = R.id.btnFisioterapeuta;
      ImageButton btnFisioterapeuta = ViewBindings.findChildViewById(rootView, id);
      if (btnFisioterapeuta == null) {
        break missingId;
      }

      id = R.id.btnIrma;
      ImageButton btnIrma = ViewBindings.findChildViewById(rootView, id);
      if (btnIrma == null) {
        break missingId;
      }

      id = R.id.btnIrmao;
      ImageButton btnIrmao = ViewBindings.findChildViewById(rootView, id);
      if (btnIrmao == null) {
        break missingId;
      }

      id = R.id.btnMae;
      ImageButton btnMae = ViewBindings.findChildViewById(rootView, id);
      if (btnMae == null) {
        break missingId;
      }

      id = R.id.btnPai;
      ImageButton btnPai = ViewBindings.findChildViewById(rootView, id);
      if (btnPai == null) {
        break missingId;
      }

      id = R.id.btnProfessora;
      ImageButton btnProfessora = ViewBindings.findChildViewById(rootView, id);
      if (btnProfessora == null) {
        break missingId;
      }

      id = R.id.btnQuero;
      ImageButton btnQuero = ViewBindings.findChildViewById(rootView, id);
      if (btnQuero == null) {
        break missingId;
      }

      id = R.id.btnQuero1;
      ImageButton btnQuero1 = ViewBindings.findChildViewById(rootView, id);
      if (btnQuero1 == null) {
        break missingId;
      }

      id = R.id.btnTia;
      ImageButton btnTia = ViewBindings.findChildViewById(rootView, id);
      if (btnTia == null) {
        break missingId;
      }

      id = R.id.btnTio;
      ImageButton btnTio = ViewBindings.findChildViewById(rootView, id);
      if (btnTio == null) {
        break missingId;
      }

      id = R.id.btnVoh;
      ImageButton btnVoh = ViewBindings.findChildViewById(rootView, id);
      if (btnVoh == null) {
        break missingId;
      }

      id = R.id.btnVom;
      ImageButton btnVom = ViewBindings.findChildViewById(rootView, id);
      if (btnVom == null) {
        break missingId;
      }

      return new ActivityMenuPessoasBinding((ScrollView) rootView, btnCozinheira, btnDiretora,
          btnEla, btnEle, btnFisioterapeuta, btnIrma, btnIrmao, btnMae, btnPai, btnProfessora,
          btnQuero, btnQuero1, btnTia, btnTio, btnVoh, btnVom);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
