package com.example.layouts_simples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RelativeLayout main;
    EditText PrénomValue, NomValue;
    TextView Prénom, Nom,Classe;
    WebView web;
    RelativeLayout.LayoutParams ClasseDimensions, PrénomDimensions,
            PrénomValueDimensions, NomDimensions, webViewDimensions,
           NomValueDimensions, ClickDimensions;
    Button Click;
    int ClaaseId = 1, PrénomId =2, PrénomValueId =3, NomId = 4,
            NomValueId = 5, ClickId = 6, webViewId = 7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
        createClasseTextView();
        createPrénomTextView();
        createPrénomEditText();
        createNomTextView();
        createNomEditText();
        createButton();
        createWebView();
        main.addView(Classe, ClasseDimensions);
        main.addView(Prénom, PrénomDimensions);
        main.addView(PrénomValue, PrénomValueDimensions);
        main.addView(Nom, NomDimensions);
        main.addView(NomValue, NomValueDimensions);
        main.addView(Click, ClickDimensions);
        main.addView(web, webViewDimensions);
        setContentView(main);
    }

    private void init() {
        main = new RelativeLayout(this);
        RelativeLayout.LayoutParams mainDimensions =
                new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        main.setLayoutParams(mainDimensions);
        PrénomValue = new EditText(this);
        NomValue = new EditText(this);
        Classe = new TextView(this);
        Prénom = new TextView(this);
        Nom = new TextView(this);
        Click = new Button(this);
        web = new WebView(this);
    }

    private void createClasseTextView() {
        ClasseDimensions = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        ClasseDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        Classe.setText("ASEDS INE 2");
        Classe.setId(ClaaseId);
        Classe.setLayoutParams(ClasseDimensions);
    }

    private void createPrénomTextView() {
       PrénomDimensions = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        PrénomDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        PrénomDimensions.addRule(RelativeLayout.BELOW, ClaaseId);
        Prénom.setText("Prénom");
        Prénom.setId(PrénomId);
        Prénom.setLayoutParams(PrénomDimensions);
    }

    private void createPrénomEditText() {
        PrénomValueDimensions = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        PrénomValue.setId(PrénomValueId);
        PrénomValueDimensions.addRule(RelativeLayout.BELOW, ClaaseId);
        PrénomValueDimensions.addRule(RelativeLayout.RIGHT_OF, PrénomId);
        PrénomValueDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        PrénomValue.setText("Houda");
        PrénomValue.setLayoutParams(PrénomValueDimensions);
    }

    private void createNomTextView() {
       NomDimensions = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        NomDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        NomDimensions.addRule(RelativeLayout.BELOW, PrénomValueId);
        Nom.setText("Nom");
        Nom.setId(NomId);
    }

    private void createNomEditText() {
        NomValueDimensions = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        NomValueDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        NomValueDimensions.addRule(RelativeLayout.RIGHT_OF, NomId);
        NomValueDimensions.addRule(RelativeLayout.BELOW,
                PrénomValueId);
       NomValue.setId(NomValueId);
        NomValue.setText("EL IBRAHIMI");
    }

    private void createButton() {
       ClickDimensions = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        Click.setText("Click me");
      ClickDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        ClickDimensions.addRule(RelativeLayout.BELOW, NomValueId);
       Click.setId(ClickId);
    }

    private void createWebView() {
        webViewDimensions = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        webViewDimensions.addRule(RelativeLayout.BELOW, ClickId);
        web.setId(webViewId);
        web.loadUrl("https://developer.apple.com");


    }
}







