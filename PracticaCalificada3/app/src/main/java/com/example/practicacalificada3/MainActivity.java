package com.example.practicacalificada3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements Pizza1Fragment.OnFragmentInteractionListener,Pizza2Fragment.OnFragmentInteractionListener,
        Pizza3Fragment.OnFragmentInteractionListener, Pizza4Fragment.OnFragmentInteractionListener, Pizza5Fragment.OnFragmentInteractionListener{

    Pizza1Fragment fragmentoPizza1;
    Pizza2Fragment fragmentoPizza2;
    Pizza3Fragment fragmentoPizza3;
    Pizza4Fragment fragmentoPizza4;
    Pizza5Fragment fragmentoPizza5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentoPizza1 = new Pizza1Fragment();
        fragmentoPizza2 = new Pizza2Fragment();
        fragmentoPizza3 = new Pizza3Fragment();
        fragmentoPizza4 = new Pizza4Fragment();
        fragmentoPizza5 = new Pizza5Fragment();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }

    public void onClick(View view) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (view.getId()){
            case R.id.btn_pizza1:
                transaction.replace(R.id.DetalleFrag, fragmentoPizza1);
                break;
            case R.id.btn_pizza2:
                transaction.replace(R.id.DetalleFrag, fragmentoPizza2);
                break;
            case R.id.btn_pizza3:
                transaction.replace(R.id.DetalleFrag, fragmentoPizza3);
                break;
            case R.id.btn_pizza4:
                transaction.replace(R.id.DetalleFrag, fragmentoPizza4);
                break;
            case R.id.btn_pizza6:
                transaction.replace(R.id.DetalleFrag, fragmentoPizza5);
                break;
        }
        transaction.commit();
    }
}
