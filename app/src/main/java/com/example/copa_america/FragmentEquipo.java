package com.example.copa_america;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentEquipo extends Fragment {
    View view;
    TextView cambio;


    public FragmentEquipo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.equipo_fragment, container, false);
        assert getArguments() != null;
        int teamPick = getArguments().getInt("position");
        cambio = (TextView) view.findViewById(R.id.eltexto);

        cambio.setText("este: "+teamPick+" si");
        return view;
    }

}
