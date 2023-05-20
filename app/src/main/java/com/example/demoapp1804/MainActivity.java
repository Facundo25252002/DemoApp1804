package com.example.demoapp1804;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

 Button btningresar;
 EditText txtemail,txtcajapass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void validarDatos(String mail, String password)
    {
        if(mail.equals("mail@mail.com") && password.equals("123"))
        {  Toast.makeText(this,"Acceso Otorgado", Toast.LENGTH_LONG).show();
           Intent intent = new Intent(this, HomeActivity.class);
           //intent.putExtra("E-Mail","");
           startActivity(intent);

        }else{

            Toast.makeText(this,"Acceso Denegado", Toast.LENGTH_LONG).show();

        }


    }

    private void referenciaViews()
    {

        btningresar = findViewById(R.id.btningresar);
        txtemail = findViewById(R.id.txtemail);
        txtcajapass = findViewById(R.id.txtcajapass);



        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarDatos(txtemail.getText().toString(),txtcajapass.getText().toString());
            }
        });

    }

}
