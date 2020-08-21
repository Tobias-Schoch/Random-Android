package com.tobiasschoch.random.ui.dashboard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.tobiasschoch.random.R;

import java.util.Random;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        Button plusButton = root.findViewById(R.id.plusButton);
        final ImageView imageView = root.findViewById(R.id.imageView);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Random r = new Random();
                int result = r.nextInt(7-1) + 1;
                if (result == 1) {
                    imageView.setImageResource(R.drawable.one);
                } else if (result == 2) {
                    imageView.setImageResource(R.drawable.two);
                } else if (result == 3) {
                    imageView.setImageResource(R.drawable.three);
                } else if (result == 4) {
                    imageView.setImageResource(R.drawable.four);
                } else if (result == 5) {
                    imageView.setImageResource(R.drawable.five);
                } else if (result == 6) {
                    imageView.setImageResource(R.drawable.six);
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Random r = new Random();
                int result = r.nextInt(7-1) + 1;
                if (result == 1) {
                    imageView.setImageResource(R.drawable.one);
                } else if (result == 2) {
                    imageView.setImageResource(R.drawable.two);
                } else if (result == 3) {
                    imageView.setImageResource(R.drawable.three);
                } else if (result == 4) {
                    imageView.setImageResource(R.drawable.four);
                } else if (result == 5) {
                    imageView.setImageResource(R.drawable.five);
                } else if (result == 6) {
                    imageView.setImageResource(R.drawable.six);
                }
            }
        });


        return root;
    }
}