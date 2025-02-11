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

public final class ActivityMenuAlimentosBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageButton btnAgua;

  @NonNull
  public final ImageButton btnAlmocar;

  @NonNull
  public final ImageButton btnArroz;

  @NonNull
  public final ImageButton btnBatata;

  @NonNull
  public final ImageButton btnBiscoito;

  @NonNull
  public final ImageButton btnCafeManha;

  @NonNull
  public final ImageButton btnCarne;

  @NonNull
  public final ImageButton btnChocolate;

  @NonNull
  public final ImageButton btnComer;

  @NonNull
  public final ImageButton btnFeijao;

  @NonNull
  public final ImageButton btnFrutas;

  @NonNull
  public final ImageButton btnJantar;

  @NonNull
  public final ImageButton btnLanche;

  @NonNull
  public final ImageButton btnLeite;

  @NonNull
  public final ImageButton btnMacarrao;

  @NonNull
  public final ImageButton btnPao;

  @NonNull
  public final ImageButton btnPipoca;

  @NonNull
  public final ImageButton btnQuero;

  @NonNull
  public final ImageButton btnQuero1;

  @NonNull
  public final ImageButton btnSalada;

  @NonNull
  public final ImageButton btnSorvete;

  @NonNull
  public final ImageButton btnSuco;

  private ActivityMenuAlimentosBinding(@NonNull ScrollView rootView, @NonNull ImageButton btnAgua,
      @NonNull ImageButton btnAlmocar, @NonNull ImageButton btnArroz,
      @NonNull ImageButton btnBatata, @NonNull ImageButton btnBiscoito,
      @NonNull ImageButton btnCafeManha, @NonNull ImageButton btnCarne,
      @NonNull ImageButton btnChocolate, @NonNull ImageButton btnComer,
      @NonNull ImageButton btnFeijao, @NonNull ImageButton btnFrutas,
      @NonNull ImageButton btnJantar, @NonNull ImageButton btnLanche, @NonNull ImageButton btnLeite,
      @NonNull ImageButton btnMacarrao, @NonNull ImageButton btnPao, @NonNull ImageButton btnPipoca,
      @NonNull ImageButton btnQuero, @NonNull ImageButton btnQuero1, @NonNull ImageButton btnSalada,
      @NonNull ImageButton btnSorvete, @NonNull ImageButton btnSuco) {
    this.rootView = rootView;
    this.btnAgua = btnAgua;
    this.btnAlmocar = btnAlmocar;
    this.btnArroz = btnArroz;
    this.btnBatata = btnBatata;
    this.btnBiscoito = btnBiscoito;
    this.btnCafeManha = btnCafeManha;
    this.btnCarne = btnCarne;
    this.btnChocolate = btnChocolate;
    this.btnComer = btnComer;
    this.btnFeijao = btnFeijao;
    this.btnFrutas = btnFrutas;
    this.btnJantar = btnJantar;
    this.btnLanche = btnLanche;
    this.btnLeite = btnLeite;
    this.btnMacarrao = btnMacarrao;
    this.btnPao = btnPao;
    this.btnPipoca = btnPipoca;
    this.btnQuero = btnQuero;
    this.btnQuero1 = btnQuero1;
    this.btnSalada = btnSalada;
    this.btnSorvete = btnSorvete;
    this.btnSuco = btnSuco;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMenuAlimentosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMenuAlimentosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_menu_alimentos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMenuAlimentosBinding bind(@NonNull View rootView) {
    // Isso é feito para otimizar o bytecode compilado quanto ao tamanho e desempenho.
    int id;
    missingId: {
      id = R.id.btnAgua;
      ImageButton btnAgua = ViewBindings.findChildViewById(rootView, id);
      if (btnAgua == null) {
        break missingId;
      }

      id = R.id.btnAlmocar;
      ImageButton btnAlmocar = ViewBindings.findChildViewById(rootView, id);
      if (btnAlmocar == null) {
        break missingId;
      }

      id = R.id.btnArroz;
      ImageButton btnArroz = ViewBindings.findChildViewById(rootView, id);
      if (btnArroz == null) {
        break missingId;
      }

      id = R.id.btnBatata;
      ImageButton btnBatata = ViewBindings.findChildViewById(rootView, id);
      if (btnBatata == null) {
        break missingId;
      }

      id = R.id.btnBiscoito;
      ImageButton btnBiscoito = ViewBindings.findChildViewById(rootView, id);
      if (btnBiscoito == null) {
        break missingId;
      }

      id = R.id.btnCafeManha;
      ImageButton btnCafeManha = ViewBindings.findChildViewById(rootView, id);
      if (btnCafeManha == null) {
        break missingId;
      }

      id = R.id.btnCarne;
      ImageButton btnCarne = ViewBindings.findChildViewById(rootView, id);
      if (btnCarne == null) {
        break missingId;
      }

      id = R.id.btnChocolate;
      ImageButton btnChocolate = ViewBindings.findChildViewById(rootView, id);
      if (btnChocolate == null) {
        break missingId;
      }

      id = R.id.btnComer;
      ImageButton btnComer = ViewBindings.findChildViewById(rootView, id);
      if (btnComer == null) {
        break missingId;
      }

      id = R.id.btnFeijao;
      ImageButton btnFeijao = ViewBindings.findChildViewById(rootView, id);
      if (btnFeijao == null) {
        break missingId;
      }

      id = R.id.btnFrutas;
      ImageButton btnFrutas = ViewBindings.findChildViewById(rootView, id);
      if (btnFrutas == null) {
        break missingId;
      }

      id = R.id.btnJantar;
      ImageButton btnJantar = ViewBindings.findChildViewById(rootView, id);
      if (btnJantar == null) {
        break missingId;
      }

      id = R.id.btnLanche;
      ImageButton btnLanche = ViewBindings.findChildViewById(rootView, id);
      if (btnLanche == null) {
        break missingId;
      }

      id = R.id.btnLeite;
      ImageButton btnLeite = ViewBindings.findChildViewById(rootView, id);
      if (btnLeite == null) {
        break missingId;
      }

      id = R.id.btnMacarrao;
      ImageButton btnMacarrao = ViewBindings.findChildViewById(rootView, id);
      if (btnMacarrao == null) {
        break missingId;
      }

      id = R.id.btnPao;
      ImageButton btnPao = ViewBindings.findChildViewById(rootView, id);
      if (btnPao == null) {
        break missingId;
      }

      id = R.id.btnPipoca;
      ImageButton btnPipoca = ViewBindings.findChildViewById(rootView, id);
      if (btnPipoca == null) {
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

      id = R.id.btnSalada;
      ImageButton btnSalada = ViewBindings.findChildViewById(rootView, id);
      if (btnSalada == null) {
        break missingId;
      }

      id = R.id.btnSorvete;
      ImageButton btnSorvete = ViewBindings.findChildViewById(rootView, id);
      if (btnSorvete == null) {
        break missingId;
      }

      id = R.id.btnSuco;
      ImageButton btnSuco = ViewBindings.findChildViewById(rootView, id);
      if (btnSuco == null) {
        break missingId;
      }

      return new ActivityMenuAlimentosBinding((ScrollView) rootView, btnAgua, btnAlmocar, btnArroz,
          btnBatata, btnBiscoito, btnCafeManha, btnCarne, btnChocolate, btnComer, btnFeijao,
          btnFrutas, btnJantar, btnLanche, btnLeite, btnMacarrao, btnPao, btnPipoca, btnQuero,
          btnQuero1, btnSalada, btnSorvete, btnSuco);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
