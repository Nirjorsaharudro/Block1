package com.example.block1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonBlue,buttonPink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBlue = (Button) findViewById(R.id.button_blueinvisible);
        buttonPink = (Button) findViewById(R.id.button_pinkpanthar);
    }
    public void toDo(View v){
        if(v.equals(buttonBlue))
            v.setVisibility(View.INVISIBLE);
        if(v.equals(buttonPink))
            Toast.makeText(getApplicationContext(),
                    "to do to do to do...",
                    Toast.LENGTH_SHORT).show();
    }
}
