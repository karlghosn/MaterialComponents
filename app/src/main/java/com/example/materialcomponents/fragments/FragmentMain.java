package com.example.materialcomponents.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.materialcomponents.MainActivity;
import com.example.materialcomponents.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentMain extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        final MainActivity activity = (MainActivity) getActivity();
        assert container != null;
        assert activity != null;

        Button bottomBarBt = rootView.findViewById(R.id.bottom_app_bar);
        Button chipsBt = rootView.findViewById(R.id.material_chips);
        Button materialBt = rootView.findViewById(R.id.material_buttons);
        Button textFieldsBt = rootView.findViewById(R.id.text_fields);

        bottomBarBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.replaceFragment(new FragmentBottomBar());
            }
        });

        chipsBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.replaceFragment(new FragmentChips());
            }
        });

        materialBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.replaceFragment(new FragmentButtons());
            }
        });

        textFieldsBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.replaceFragment(new FragmentTextFields());
            }
        });

        return rootView;
    }
}
