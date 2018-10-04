package com.example.materialcomponents.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.materialcomponents.R;
import com.google.android.material.bottomappbar.BottomAppBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentBottomBar extends Fragment {
    private BottomAppBar bottomAppBar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bottom_bar, container, false);

        bottomAppBar = rootView.findViewById(R.id.bar);
        Button moveBt = rootView.findViewById(R.id.move_fab);

        moveBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomAppBar.setFabAlignmentMode(bottomAppBar.getFabAlignmentMode() == BottomAppBar.FAB_ALIGNMENT_MODE_CENTER ?
                        BottomAppBar.FAB_ALIGNMENT_MODE_END : BottomAppBar.FAB_ALIGNMENT_MODE_CENTER);
            }
        });

        return rootView;
    }
}
