package com.tobiasschoch.random.ui.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.tobiasschoch.random.R;

import java.io.IOException;
import java.util.Random;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final EditText editTextNumberDecimal = root.findViewById(R.id.editTextNumberDecimal);
        final EditText editTextNumberDecimal2 = root.findViewById(R.id.editTextNumberDecimal2);
        final TextView textView = root.findViewById(R.id.textView);
        Button plusButton = root.findViewById(R.id.plusButton);

        int bound = Integer.parseInt(editTextNumberDecimal2.getText().toString());
        textView.setText(String.valueOf(11));

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                try
                {
                    int base = Integer.parseInt(editTextNumberDecimal.getText().toString());
                    int bound = Integer.parseInt(editTextNumberDecimal2.getText().toString());
                    bound += 1;

                    if (base > bound) {
                        textView.setText("base not valid");
                        textView.setTextSize(30);
                    } else {
                        Random r = new Random();
                        int result = r.nextInt(bound-base) + base;
                        textView.setText(String.valueOf(result));
                        textView.setTextSize(100);
                    }

                    try {
                        InputMethodManager inputManager = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                        inputManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                    } catch (Exception e) {
                        String input = "";
                    }

                } catch (NumberFormatException ex)
                {
                    textView.setText("Field is not valid");
                    textView.setTextSize(30);
                }

            }
        });
        return root;
    }
}