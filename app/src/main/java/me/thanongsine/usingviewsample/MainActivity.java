package me.thanongsine.usingviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding view from Xml file to Java file
        final EditText nameEditText = findViewById(R.id.name_edit_ext);
        Button btnGreeting = findViewById(R.id.greeting_btn);
        final TextView greetingTextView = findViewById(R.id.greeting_textView);

        //Handle when user click btnGreeting
        btnGreeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Get text from nameEditText & set to greetingTextView
                String nameText = "Hi, " + nameEditText.getText().toString();
                greetingTextView.setText(nameText);

            }
        });

    }
}
