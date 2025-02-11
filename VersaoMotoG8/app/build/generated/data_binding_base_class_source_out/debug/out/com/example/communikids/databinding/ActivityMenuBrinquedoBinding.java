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

public final class ActivityMenuBrinquedoBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageButton btnBicicleta;

  @NonNull
  public final ImageButton btnBola;

  @NonNull
  public final ImageButton btnBoneca;

  @NonNull
  public final ImageButton btnBrincar;

  @NonNull
  public final ImageButton btnCarrinho;

  @NonNull
  public final ImageButton btnCelular;

  @NonNull
  public final ImageButton btnDancar;

  @NonNull
  public final ImageButton btnDesenhar;

  @NonNull
  public final ImageButton btnFora;

  @NonNull
  public final ImageButton btnGibi;

  @NonNull
  public final ImageButton btnLivro;

  @NonNull
  public final ImageButton btnMusica;

  @NonNull
  public final ImageButton btnPintar;

  @NonNull
  public final ImageButton btnQuebra;

  @NonNull
  public final ImageButton btnQuero;

  @NonNull
  public final ImageButton btnQuero1;

  @NonNull
  public final ImageButton btnTablet;

  @NonNull
  public final ImageButton btnTv;

  @NonNull
  public final ImageButton btnUrsinho;

  @NonNull
  public final ImageButton btnVideogame;

  private ActivityMenuBrinquedoBinding(@NonNull ScrollView rootView,
      @NonNull ImageButton btnBicicleta, @NonNull ImageButton btnBola,
      @NonNull ImageButton btnBoneca, @NonNull ImageButton btnBrincar,
      @NonNull ImageButton btnCarrinho, @NonNull ImageButton btnCelular,
      @NonNull ImageButton btnDancar, @NonNull ImageButton btnDesenhar,
      @NonNull ImageButton btnFora, @NonNull ImageButton btnGibi, @NonNull ImageButton btnLivro,
      @NonNull ImageButton btnMusica, @NonNull ImageButton btnPintar,
      @NonNull ImageButton btnQuebra, @NonNull ImageButton btnQuero, @NonNull ImageButton btnQuero1,
      @NonNull ImageButton btnTablet, @NonNull ImageButton btnTv, @NonNull ImageButton btnUrsinho,
      @NonNull ImageButton btnVideogame) {
    this.rootView = rootView;
    this.btnBicicleta = btnBicicleta;
    this.btnBola = btnBola;
    this.btnBoneca = btnBoneca;
    this.btnBrincar = btnBrincar;
    this.btnCarrinho = btnCarrinho;
    this.btnCelular = btnCelular;
    this.btnDancar = btnDancar;
    this.btnDesenhar = btnDesenhar;
    this.btnFora = btnFora;
    this.btnGibi = btnGibi;
    this.btnLivro = btnLivro;
    this.btnMusica = btnMusica;
    this.btnPintar = btnPintar;
    this.btnQuebra = btnQuebra;
    this.btnQuero = btnQuero;
    this.btnQuero1 = btnQuero1;
    this.btnTablet = btnTablet;
    this.btnTv = btnTv;
    this.btnUrsinho = btnUrsinho;
    this.btnVideogame = btnVideogame;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMenuBrinquedoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMenuBrinquedoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_menu_brinquedo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMenuBrinquedoBinding bind(@NonNull View rootView) {
  // Isso é feito para otimizar o bytecode compilado quanto ao tamanho e desempenho.
    int id;
    missingId: {
      id = R.id.btnBicicleta;
      ImageButton btnBicicleta = ViewBindings.findChildViewById(rootView, id);
      if (btnBicicleta == null) {
        break missingId;
      }

      id = R.id.btnBola;
      ImageButton btnBola = ViewBindings.findChildViewById(rootView, id);
      if (btnBola == null) {
        break missingId;
      }

      id = R.id.btnBoneca;
      ImageButton btnBoneca = ViewBindings.findChildViewById(rootView, id);
      if (btnBoneca == null) {
        break missingId;
      }

      id = R.id.btnBrincar;
      ImageButton btnBrincar = ViewBindings.findChildViewById(rootView, id);
      if (btnBrincar == null) {
        break missingId;
      }

      id = R.id.btnCarrinho;
      ImageButton btnCarrinho = ViewBindings.findChildViewById(rootView, id);
      if (btnCarrinho == null) {
        break missingId;
      }

      id = R.id.btnCelular;
      ImageButton btnCelular = ViewBindings.findChildViewById(rootView, id);
      if (btnCelular == null) {
        break missingId;
      }

      id = R.id.btnDancar;
      ImageButton btnDancar = ViewBindings.findChildViewById(rootView, id);
      if (btnDancar == null) {
        break missingId;
      }

      id = R.id.btnDesenhar;
      ImageButton btnDesenhar = ViewBindings.findChildViewById(rootView, id);
      if (btnDesenhar == null) {
        break missingId;
      }

      id = R.id.btnFora;
      ImageButton btnFora = ViewBindings.findChildViewById(rootView, id);
      if (btnFora == null) {
        break missingId;
      }

      id = R.id.btnGibi;
      ImageButton btnGibi = ViewBindings.findChildViewById(rootView, id);
      if (btnGibi == null) {
        break missingId;
      }

      id = R.id.btnLivro;
      ImageButton btnLivro = ViewBindings.findChildViewById(rootView, id);
      if (btnLivro == null) {
        break missingId;
      }

      id = R.id.btnMusica;
      ImageButton btnMusica = ViewBindings.findChildViewById(rootView, id);
      if (btnMusica == null) {
        break missingId;
      }

      id = R.id.btnPintar;
      ImageButton btnPintar = ViewBindings.findChildViewById(rootView, id);
      if (btnPintar == null) {
        break missingId;
      }

      id = R.id.btnQuebra;
      ImageButton btnQuebra = ViewBindings.findChildViewById(rootView, id);
      if (btnQuebra == null) {
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

      id = R.id.btnTablet;
      ImageButton btnTablet = ViewBindings.findChildViewById(rootView, id);
      if (btnTablet == null) {
        break missingId;
      }

      id = R.id.btnTv;
      ImageButton btnTv = ViewBindings.findChildViewById(rootView, id);
      if (btnTv == null) {
        break missingId;
      }

      id = R.id.btnUrsinho;
      ImageButton btnUrsinho = ViewBindings.findChildViewById(rootView, id);
      if (btnUrsinho == null) {
        break missingId;
      }

      id = R.id.btnVideogame;
      ImageButton btnVideogame = ViewBindings.findChildViewById(rootView, id);
      if (btnVideogame == null) {
        break missingId;
      }

      return new ActivityMenuBrinquedoBinding((ScrollView) rootView, btnBicicleta, btnBola,
          btnBoneca, btnBrincar, btnCarrinho, btnCelular, btnDancar, btnDesenhar, btnFora, btnGibi,
          btnLivro, btnMusica, btnPintar, btnQuebra, btnQuero, btnQuero1, btnTablet, btnTv,
          btnUrsinho, btnVideogame);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
