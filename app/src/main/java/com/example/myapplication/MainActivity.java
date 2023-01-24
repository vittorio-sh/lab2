package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);
        TextView tview = (TextView)findViewById(R.id.textView);
        EditText etext = (EditText)findViewById(R.id.edittext1);
        CheckBox cbox = (CheckBox)findViewById(R.id.checkBox);
        Button btn = (Button)findViewById(R.id.but1);
        btn.setOnClickListener( (click) -> { tview.setText(etext.getText());
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.toast_msg), Toast.LENGTH_LONG).show();


        } );
        cbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean isChecked) {

                    Snackbar.make(buttonview, getString(R.string.checker) + isChecked , Snackbar.LENGTH_LONG)
                            .setAction("Undo", click -> buttonview.setChecked( !isChecked ))
                            .show();
            }
        });



    }
}