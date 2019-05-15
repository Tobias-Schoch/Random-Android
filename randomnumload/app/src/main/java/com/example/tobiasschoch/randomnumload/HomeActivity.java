package com.example.tobiasschoch.randomnumload;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class HomeActivity extends Activity implements OnClickListener {

    private Button button;
    private EditText editText;
    private EditText editText2;
    private TextView textView;
    private TextView textView2;
    private ImageView imageView;

    Random rand = new Random();

    int zahl = 0;
    int links = 1;
    int rechts = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        editText2 = findViewById(R.id.editText2);
        imageView = findViewById(R.id.imageView);

        button.setOnClickListener(this);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        try {
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (view == button) {

            links = Integer.parseInt(editText.getText().toString());
            rechts = Integer.parseInt(editText2.getText().toString());

            zahl = rand.nextInt(rechts + 1 - links) + links;
            textView.setText(zahl + "");
        }
    }
}