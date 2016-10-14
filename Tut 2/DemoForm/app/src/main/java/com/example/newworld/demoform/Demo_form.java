package com.example.newworld.demoform;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class Demo_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_form);
        ref = this.getSharedPreferences("com.demoform", Context.MODE_PRIVATE);
        ref.edit().clear().commit();
        addEvent();
    }

    SharedPreferences ref;
    Button btnAdd;
    Button btnPrint;
    EditText txtName;
    EditText txtId;
    // thêm sự kiện
    private void addEvent() {
        txtName = (EditText) this.findViewById(R.id.txtName);
        txtId = (EditText) this.findViewById(R.id.txtId);
        btnAdd = (Button) this.findViewById(R.id.btnAdd);
        btnPrint = (Button) this.findViewById(R.id.Print);

        // sự kiện btnAdd
        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ref.edit().putString(txtName.getText().toString(), txtId.getText().toString()).commit();
                txtId.setText("");
                txtName.setText("");
            }
        });

        //sự kiện btnPrint
        btnPrint.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int maxRandom = ref.getAll().size();
                if(maxRandom==0) {
                    Toast.makeText(v.getContext(),"Không có dữ liệu!", Toast.LENGTH_LONG).show();
                    return;
                }
                Random  r = new Random();
                int term=-1;
                String result="";
                while(true) {
                    int a = r.nextInt(maxRandom);
                    if(term==a)
                        continue;
                    String keym = ref.getAll().keySet().toArray()[a].toString();
                    result += "ID: "+ keym + "; Name: "+ ref.getString(keym, "NULL");
                    result += "\r\n";
                    if(term!=-1)
                        break;
                    term = a;
                }
                Toast.makeText(v.getContext(),result, Toast.LENGTH_LONG).show();
            }
        });
    }
}
