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

public final class ActivityMenuNecessidadesBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageButton btnAjuda;

  @NonNull
  public final ImageButton btnAonde;

  @NonNull
  public final ImageButton btnAtemais;

  @NonNull
  public final ImageButton btnBanho;

  @NonNull
  public final ImageButton btnBarulho;

  @NonNull
  public final ImageButton btnBdia;

  @NonNull
  public final ImageButton btnBem;

  @NonNull
  public final ImageButton btnBnoite;

  @NonNull
  public final ImageButton btnBtarde;

  @NonNull
  public final ImageButton btnCalor;

  @NonNull
  public final ImageButton btnCansada;

  @NonNull
  public final ImageButton btnCoco;

  @NonNull
  public final ImageButton btnComo;

  @NonNull
  public final ImageButton btnDor;

  @NonNull
  public final ImageButton btnEntendi;

  @NonNull
  public final ImageButton btnFeliz;

  @NonNull
  public final ImageButton btnFicar;

  @NonNull
  public final ImageButton btnFrio;

  @NonNull
  public final ImageButton btnGostei;

  @NonNull
  public final ImageButton btnLavarmao;

  @NonNull
  public final ImageButton btnMedo;

  @NonNull
  public final ImageButton btnMuitagnt;

  @NonNull
  public final ImageButton btnNao;

  @NonNull
  public final ImageButton btnNaoentendi;

  @NonNull
  public final ImageButton btnNaogostei;

  @NonNull
  public final ImageButton btnObrigado;

  @NonNull
  public final ImageButton btnPare;

  @NonNull
  public final ImageButton btnPorfavor;

  @NonNull
  public final ImageButton btnQuando;

  @NonNull
  public final ImageButton btnQuero;

  @NonNull
  public final ImageButton btnQuero1;

  @NonNull
  public final ImageButton btnSair;

  @NonNull
  public final ImageButton btnSilencio;

  @NonNull
  public final ImageButton btnSim;

  @NonNull
  public final ImageButton btnTriste;

  @NonNull
  public final ImageButton btnVoce;

  @NonNull
  public final ImageButton btnXixi;

  private ActivityMenuNecessidadesBinding(@NonNull ScrollView rootView,
      @NonNull ImageButton btnAjuda, @NonNull ImageButton btnAonde, @NonNull ImageButton btnAtemais,
      @NonNull ImageButton btnBanho, @NonNull ImageButton btnBarulho, @NonNull ImageButton btnBdia,
      @NonNull ImageButton btnBem, @NonNull ImageButton btnBnoite, @NonNull ImageButton btnBtarde,
      @NonNull ImageButton btnCalor, @NonNull ImageButton btnCansada, @NonNull ImageButton btnCoco,
      @NonNull ImageButton btnComo, @NonNull ImageButton btnDor, @NonNull ImageButton btnEntendi,
      @NonNull ImageButton btnFeliz, @NonNull ImageButton btnFicar, @NonNull ImageButton btnFrio,
      @NonNull ImageButton btnGostei, @NonNull ImageButton btnLavarmao,
      @NonNull ImageButton btnMedo, @NonNull ImageButton btnMuitagnt, @NonNull ImageButton btnNao,
      @NonNull ImageButton btnNaoentendi, @NonNull ImageButton btnNaogostei,
      @NonNull ImageButton btnObrigado, @NonNull ImageButton btnPare,
      @NonNull ImageButton btnPorfavor, @NonNull ImageButton btnQuando,
      @NonNull ImageButton btnQuero, @NonNull ImageButton btnQuero1, @NonNull ImageButton btnSair,
      @NonNull ImageButton btnSilencio, @NonNull ImageButton btnSim, @NonNull ImageButton btnTriste,
      @NonNull ImageButton btnVoce, @NonNull ImageButton btnXixi) {
    this.rootView = rootView;
    this.btnAjuda = btnAjuda;
    this.btnAonde = btnAonde;
    this.btnAtemais = btnAtemais;
    this.btnBanho = btnBanho;
    this.btnBarulho = btnBarulho;
    this.btnBdia = btnBdia;
    this.btnBem = btnBem;
    this.btnBnoite = btnBnoite;
    this.btnBtarde = btnBtarde;
    this.btnCalor = btnCalor;
    this.btnCansada = btnCansada;
    this.btnCoco = btnCoco;
    this.btnComo = btnComo;
    this.btnDor = btnDor;
    this.btnEntendi = btnEntendi;
    this.btnFeliz = btnFeliz;
    this.btnFicar = btnFicar;
    this.btnFrio = btnFrio;
    this.btnGostei = btnGostei;
    this.btnLavarmao = btnLavarmao;
    this.btnMedo = btnMedo;
    this.btnMuitagnt = btnMuitagnt;
    this.btnNao = btnNao;
    this.btnNaoentendi = btnNaoentendi;
    this.btnNaogostei = btnNaogostei;
    this.btnObrigado = btnObrigado;
    this.btnPare = btnPare;
    this.btnPorfavor = btnPorfavor;
    this.btnQuando = btnQuando;
    this.btnQuero = btnQuero;
    this.btnQuero1 = btnQuero1;
    this.btnSair = btnSair;
    this.btnSilencio = btnSilencio;
    this.btnSim = btnSim;
    this.btnTriste = btnTriste;
    this.btnVoce = btnVoce;
    this.btnXixi = btnXixi;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMenuNecessidadesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMenuNecessidadesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_menu_necessidades, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMenuNecessidadesBinding bind(@NonNull View rootView) {
    // Isso é feito para otimizar o bytecode compilado quanto ao tamanho e desempenho.
    int id;
    missingId: {
      id = R.id.btnAjuda;
      ImageButton btnAjuda = ViewBindings.findChildViewById(rootView, id);
      if (btnAjuda == null) {
        break missingId;
      }

      id = R.id.btnAonde;
      ImageButton btnAonde = ViewBindings.findChildViewById(rootView, id);
      if (btnAonde == null) {
        break missingId;
      }

      id = R.id.btnAtemais;
      ImageButton btnAtemais = ViewBindings.findChildViewById(rootView, id);
      if (btnAtemais == null) {
        break missingId;
      }

      id = R.id.btnBanho;
      ImageButton btnBanho = ViewBindings.findChildViewById(rootView, id);
      if (btnBanho == null) {
        break missingId;
      }

      id = R.id.btnBarulho;
      ImageButton btnBarulho = ViewBindings.findChildViewById(rootView, id);
      if (btnBarulho == null) {
        break missingId;
      }

      id = R.id.btnBdia;
      ImageButton btnBdia = ViewBindings.findChildViewById(rootView, id);
      if (btnBdia == null) {
        break missingId;
      }

      id = R.id.btnBem;
      ImageButton btnBem = ViewBindings.findChildViewById(rootView, id);
      if (btnBem == null) {
        break missingId;
      }

      id = R.id.btnBnoite;
      ImageButton btnBnoite = ViewBindings.findChildViewById(rootView, id);
      if (btnBnoite == null) {
        break missingId;
      }

      id = R.id.btnBtarde;
      ImageButton btnBtarde = ViewBindings.findChildViewById(rootView, id);
      if (btnBtarde == null) {
        break missingId;
      }

      id = R.id.btnCalor;
      ImageButton btnCalor = ViewBindings.findChildViewById(rootView, id);
      if (btnCalor == null) {
        break missingId;
      }

      id = R.id.btnCansada;
      ImageButton btnCansada = ViewBindings.findChildViewById(rootView, id);
      if (btnCansada == null) {
        break missingId;
      }

      id = R.id.btnCoco;
      ImageButton btnCoco = ViewBindings.findChildViewById(rootView, id);
      if (btnCoco == null) {
        break missingId;
      }

      id = R.id.btnComo;
      ImageButton btnComo = ViewBindings.findChildViewById(rootView, id);
      if (btnComo == null) {
        break missingId;
      }

      id = R.id.btnDor;
      ImageButton btnDor = ViewBindings.findChildViewById(rootView, id);
      if (btnDor == null) {
        break missingId;
      }

      id = R.id.btnEntendi;
      ImageButton btnEntendi = ViewBindings.findChildViewById(rootView, id);
      if (btnEntendi == null) {
        break missingId;
      }

      id = R.id.btnFeliz;
      ImageButton btnFeliz = ViewBindings.findChildViewById(rootView, id);
      if (btnFeliz == null) {
        break missingId;
      }

      id = R.id.btnFicar;
      ImageButton btnFicar = ViewBindings.findChildViewById(rootView, id);
      if (btnFicar == null) {
        break missingId;
      }

      id = R.id.btnFrio;
      ImageButton btnFrio = ViewBindings.findChildViewById(rootView, id);
      if (btnFrio == null) {
        break missingId;
      }

      id = R.id.btnGostei;
      ImageButton btnGostei = ViewBindings.findChildViewById(rootView, id);
      if (btnGostei == null) {
        break missingId;
      }

      id = R.id.btnLavarmao;
      ImageButton btnLavarmao = ViewBindings.findChildViewById(rootView, id);
      if (btnLavarmao == null) {
        break missingId;
      }

      id = R.id.btnMedo;
      ImageButton btnMedo = ViewBindings.findChildViewById(rootView, id);
      if (btnMedo == null) {
        break missingId;
      }

      id = R.id.btnMuitagnt;
      ImageButton btnMuitagnt = ViewBindings.findChildViewById(rootView, id);
      if (btnMuitagnt == null) {
        break missingId;
      }

      id = R.id.btnNao;
      ImageButton btnNao = ViewBindings.findChildViewById(rootView, id);
      if (btnNao == null) {
        break missingId;
      }

      id = R.id.btnNaoentendi;
      ImageButton btnNaoentendi = ViewBindings.findChildViewById(rootView, id);
      if (btnNaoentendi == null) {
        break missingId;
      }

      id = R.id.btnNaogostei;
      ImageButton btnNaogostei = ViewBindings.findChildViewById(rootView, id);
      if (btnNaogostei == null) {
        break missingId;
      }

      id = R.id.btnObrigado;
      ImageButton btnObrigado = ViewBindings.findChildViewById(rootView, id);
      if (btnObrigado == null) {
        break missingId;
      }

      id = R.id.btnPare;
      ImageButton btnPare = ViewBindings.findChildViewById(rootView, id);
      if (btnPare == null) {
        break missingId;
      }

      id = R.id.btnPorfavor;
      ImageButton btnPorfavor = ViewBindings.findChildViewById(rootView, id);
      if (btnPorfavor == null) {
        break missingId;
      }

      id = R.id.btnQuando;
      ImageButton btnQuando = ViewBindings.findChildViewById(rootView, id);
      if (btnQuando == null) {
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

      id = R.id.btnSair;
      ImageButton btnSair = ViewBindings.findChildViewById(rootView, id);
      if (btnSair == null) {
        break missingId;
      }

      id = R.id.btnSilencio;
      ImageButton btnSilencio = ViewBindings.findChildViewById(rootView, id);
      if (btnSilencio == null) {
        break missingId;
      }

      id = R.id.btnSim;
      ImageButton btnSim = ViewBindings.findChildViewById(rootView, id);
      if (btnSim == null) {
        break missingId;
      }

      id = R.id.btnTriste;
      ImageButton btnTriste = ViewBindings.findChildViewById(rootView, id);
      if (btnTriste == null) {
        break missingId;
      }

      id = R.id.btnVoce;
      ImageButton btnVoce = ViewBindings.findChildViewById(rootView, id);
      if (btnVoce == null) {
        break missingId;
      }

      id = R.id.btnXixi;
      ImageButton btnXixi = ViewBindings.findChildViewById(rootView, id);
      if (btnXixi == null) {
        break missingId;
      }

      return new ActivityMenuNecessidadesBinding((ScrollView) rootView, btnAjuda, btnAonde,
          btnAtemais, btnBanho, btnBarulho, btnBdia, btnBem, btnBnoite, btnBtarde, btnCalor,
          btnCansada, btnCoco, btnComo, btnDor, btnEntendi, btnFeliz, btnFicar, btnFrio, btnGostei,
          btnLavarmao, btnMedo, btnMuitagnt, btnNao, btnNaoentendi, btnNaogostei, btnObrigado,
          btnPare, btnPorfavor, btnQuando, btnQuero, btnQuero1, btnSair, btnSilencio, btnSim,
          btnTriste, btnVoce, btnXixi);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
