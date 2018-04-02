package me.thanongsine.usingviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BindingViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binding_view);

        TextView myTextView = findViewById(R.id.my_text_view);
        myTextView.setText("Hello World");

    }
}
