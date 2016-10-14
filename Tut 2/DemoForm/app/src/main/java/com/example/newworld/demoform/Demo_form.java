package com.example.newworld.demoform;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Demo_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_form);
    }

    SharedPreferences ref;
    Button btnAdd;
    Button btnPrint;
    EditText txtName;
    EditText txtId;

    private void addEvent() {
        txtName = (EditText) this.findViewById(R.id.txtName);
        txtId = (EditText) this.findViewById(R.id.txtId);
        btnAdd = (Button) this.findViewById(R.id.btnAdd);
        btnPrint = (Button) this.findViewById(R.id.Print);

        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ref.edit().putString(txtId.getText().toString(), txtName.getText().toString()).commit();
                txtId.setText("");
                txtName.setText("");
            }
        });
    }
}
