package com.example.francisco.practica2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtCap, txtTasa, txtPer,txtRes,txtRes1;
    private EditText edtxtCap, edtxtTasa, edtxtPer;
    private Button btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtCap = (TextView)findViewById(R.id.txtV1);
        txtTasa = (TextView)findViewById(R.id.txtV2);
        txtPer = (TextView)findViewById(R.id.txtV3);
        txtRes = (TextView)findViewById(R.id.txtV4);
        txtRes1 = (TextView)findViewById(R.id.txtV5);
        edtxtCap = (EditText)findViewById(R.id.edtxt1);
        edtxtTasa = (EditText)findViewById(R.id.edtxt2);
        edtxtPer = (EditText)findViewById(R.id.edtxt3);
        btnCal = (Button)findViewById(R.id.btn1);


        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valorCap = edtxtCap.getText().toString();
                String valorTasa = edtxtTasa.getText().toString();
                String valorPer = edtxtPer.getText().toString();
                double nroCap = Double.parseDouble(valorCap);
                double nroTasa = Double.parseDouble(valorTasa);
                double nroPer = Double.parseDouble(valorPer);
                double monto = nroCap*Math.pow((1+nroTasa/100),nroPer);
                double interes = monto-nroCap;
                String res = "";
                String res1 = "";
                res = "El monto total es: "+String.format("%8.2f\n",monto);
                res1 = "El interes a pagar es: "+String.format("%8.2f\n",interes);
                txtRes.setText(res);
                txtRes1.setText(res1);

            }

        });


    }
}
