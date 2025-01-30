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

public final class ActivityMenuLugaresBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageButton btnCasa;

  @NonNull
  public final ImageButton btnCinema;

  @NonNull
  public final ImageButton btnCozinha;

  @NonNull
  public final ImageButton btnCtia;

  @NonNull
  public final ImageButton btnCtio;

  @NonNull
  public final ImageButton btnCvoh;

  @NonNull
  public final ImageButton btnCvom;

  @NonNull
  public final ImageButton btnEscola;

  @NonNull
  public final ImageButton btnEstadio;

  @NonNull
  public final ImageButton btnIgreja;

  @NonNull
  public final ImageButton btnIr;

  @NonNull
  public final ImageButton btnIrvoce;

  @NonNull
  public final ImageButton btnMedico;

  @NonNull
  public final ImageButton btnParquinho;

  @NonNull
  public final ImageButton btnPiscina;

  @NonNull
  public final ImageButton btnPraca;

  @NonNull
  public final ImageButton btnPraia;

  @NonNull
  public final ImageButton btnQuarto;

  @NonNull
  public final ImageButton btnQuero;

  @NonNull
  public final ImageButton btnQuero1;

  @NonNull
  public final ImageButton btnShopping;

  @NonNull
  public final ImageButton btnSorveteria;

  private ActivityMenuLugaresBinding(@NonNull ScrollView rootView, @NonNull ImageButton btnCasa,
      @NonNull ImageButton btnCinema, @NonNull ImageButton btnCozinha, @NonNull ImageButton btnCtia,
      @NonNull ImageButton btnCtio, @NonNull ImageButton btnCvoh, @NonNull ImageButton btnCvom,
      @NonNull ImageButton btnEscola, @NonNull ImageButton btnEstadio,
      @NonNull ImageButton btnIgreja, @NonNull ImageButton btnIr, @NonNull ImageButton btnIrvoce,
      @NonNull ImageButton btnMedico, @NonNull ImageButton btnParquinho,
      @NonNull ImageButton btnPiscina, @NonNull ImageButton btnPraca, @NonNull ImageButton btnPraia,
      @NonNull ImageButton btnQuarto, @NonNull ImageButton btnQuero, @NonNull ImageButton btnQuero1,
      @NonNull ImageButton btnShopping, @NonNull ImageButton btnSorveteria) {
    this.rootView = rootView;
    this.btnCasa = btnCasa;
    this.btnCinema = btnCinema;
    this.btnCozinha = btnCozinha;
    this.btnCtia = btnCtia;
    this.btnCtio = btnCtio;
    this.btnCvoh = btnCvoh;
    this.btnCvom = btnCvom;
    this.btnEscola = btnEscola;
    this.btnEstadio = btnEstadio;
    this.btnIgreja = btnIgreja;
    this.btnIr = btnIr;
    this.btnIrvoce = btnIrvoce;
    this.btnMedico = btnMedico;
    this.btnParquinho = btnParquinho;
    this.btnPiscina = btnPiscina;
    this.btnPraca = btnPraca;
    this.btnPraia = btnPraia;
    this.btnQuarto = btnQuarto;
    this.btnQuero = btnQuero;
    this.btnQuero1 = btnQuero1;
    this.btnShopping = btnShopping;
    this.btnSorveteria = btnSorveteria;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMenuLugaresBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMenuLugaresBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_menu_lugares, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMenuLugaresBinding bind(@NonNull View rootView) {
  // Isso é feito para otimizar o bytecode compilado quanto ao tamanho e desempenho.
    int id;
    missingId: {
      id = R.id.btnCasa;
      ImageButton btnCasa = ViewBindings.findChildViewById(rootView, id);
      if (btnCasa == null) {
        break missingId;
      }

      id = R.id.btnCinema;
      ImageButton btnCinema = ViewBindings.findChildViewById(rootView, id);
      if (btnCinema == null) {
        break missingId;
      }

      id = R.id.btnCozinha;
      ImageButton btnCozinha = ViewBindings.findChildViewById(rootView, id);
      if (btnCozinha == null) {
        break missingId;
      }

      id = R.id.btnCtia;
      ImageButton btnCtia = ViewBindings.findChildViewById(rootView, id);
      if (btnCtia == null) {
        break missingId;
      }

      id = R.id.btnCtio;
      ImageButton btnCtio = ViewBindings.findChildViewById(rootView, id);
      if (btnCtio == null) {
        break missingId;
      }

      id = R.id.btnCvoh;
      ImageButton btnCvoh = ViewBindings.findChildViewById(rootView, id);
      if (btnCvoh == null) {
        break missingId;
      }

      id = R.id.btnCvom;
      ImageButton btnCvom = ViewBindings.findChildViewById(rootView, id);
      if (btnCvom == null) {
        break missingId;
      }

      id = R.id.btnEscola;
      ImageButton btnEscola = ViewBindings.findChildViewById(rootView, id);
      if (btnEscola == null) {
        break missingId;
      }

      id = R.id.btnEstadio;
      ImageButton btnEstadio = ViewBindings.findChildViewById(rootView, id);
      if (btnEstadio == null) {
        break missingId;
      }

      id = R.id.btnIgreja;
      ImageButton btnIgreja = ViewBindings.findChildViewById(rootView, id);
      if (btnIgreja == null) {
        break missingId;
      }

      id = R.id.btnIr;
      ImageButton btnIr = ViewBindings.findChildViewById(rootView, id);
      if (btnIr == null) {
        break missingId;
      }

      id = R.id.btnIrvoce;
      ImageButton btnIrvoce = ViewBindings.findChildViewById(rootView, id);
      if (btnIrvoce == null) {
        break missingId;
      }

      id = R.id.btnMedico;
      ImageButton btnMedico = ViewBindings.findChildViewById(rootView, id);
      if (btnMedico == null) {
        break missingId;
      }

      id = R.id.btnParquinho;
      ImageButton btnParquinho = ViewBindings.findChildViewById(rootView, id);
      if (btnParquinho == null) {
        break missingId;
      }

      id = R.id.btnPiscina;
      ImageButton btnPiscina = ViewBindings.findChildViewById(rootView, id);
      if (btnPiscina == null) {
        break missingId;
      }

      id = R.id.btnPraca;
      ImageButton btnPraca = ViewBindings.findChildViewById(rootView, id);
      if (btnPraca == null) {
        break missingId;
      }

      id = R.id.btnPraia;
      ImageButton btnPraia = ViewBindings.findChildViewById(rootView, id);
      if (btnPraia == null) {
        break missingId;
      }

      id = R.id.btnQuarto;
      ImageButton btnQuarto = ViewBindings.findChildViewById(rootView, id);
      if (btnQuarto == null) {
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

      id = R.id.btnShopping;
      ImageButton btnShopping = ViewBindings.findChildViewById(rootView, id);
      if (btnShopping == null) {
        break missingId;
      }

      id = R.id.btnSorveteria;
      ImageButton btnSorveteria = ViewBindings.findChildViewById(rootView, id);
      if (btnSorveteria == null) {
        break missingId;
      }

      return new ActivityMenuLugaresBinding((ScrollView) rootView, btnCasa, btnCinema, btnCozinha,
          btnCtia, btnCtio, btnCvoh, btnCvom, btnEscola, btnEstadio, btnIgreja, btnIr, btnIrvoce,
          btnMedico, btnParquinho, btnPiscina, btnPraca, btnPraia, btnQuarto, btnQuero, btnQuero1,
          btnShopping, btnSorveteria);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
