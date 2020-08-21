package com.tobiasschoch.random.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.tobiasschoch.random.R;

import java.util.Random;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        Button flipButton = root.findViewById(R.id.flipButton);
        final ImageView imageView2 = root.findViewById(R.id.imageView2);

        flipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Random r = new Random();
                int result = r.nextInt(3-1) + 1;
                if (result == 1) {
                    imageView2.setImageResource(R.drawable.tail);

                } else if (result == 2) {
                    imageView2.setImageResource(R.drawable.head);
                } else {
                    imageView2.setImageResource(R.drawable.six);
                }
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Random r = new Random();
                int result = r.nextInt(3-1) + 1;
                if (result == 1) {
                    imageView2.setImageResource(R.drawable.tail);

                } else if (result == 2) {
                    imageView2.setImageResource(R.drawable.head);
                } else {
                    imageView2.setImageResource(R.drawable.six);
                }
            }
        });

        return root;
    }
}