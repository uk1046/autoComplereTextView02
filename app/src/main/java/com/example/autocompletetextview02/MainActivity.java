package com.example.autocompletetextview02;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String[] SEARCH_SUGGESTIONS = {
            "Google", "Yahoo", "Bing", "DuckDuckGo", "Ask",
            "AOL", "Yandex", "Baidu", "Wolfram Alpha"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the AutoCompleteTextView in the layout
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        // Create an ArrayAdapter containing search suggestions
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, SEARCH_SUGGESTIONS);

        // Set the adapter for the AutoCompleteTextView
        autoCompleteTextView.setAdapter(adapter);
    }
}
