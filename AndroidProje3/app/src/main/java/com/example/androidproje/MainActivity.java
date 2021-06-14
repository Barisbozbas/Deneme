package com.example.androidproje;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Context context = this;
   public CardView cardtext,cardtranslate,cardoptions,cardexit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardtext=findViewById(R.id.crdtextreco);
        cardtranslate=findViewById(R.id.crdTranslate);
        cardoptions=findViewById(R.id.crdoptions);
        cardexit=findViewById(R.id.crdexit);

        cardtext.setOnClickListener(this);
        cardtranslate.setOnClickListener(this);
        cardoptions.setOnClickListener(this);
        cardexit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       Intent i;

        switch (v.getId()){

            case R.id.crdtextreco:
                i=new Intent(this,TextRecoginition.class);
                startActivity(i);
                break;

            case R.id.crdTranslate:
                i=new Intent(this,Translate.class);
                startActivity(i);
                break;

       }
    }
}