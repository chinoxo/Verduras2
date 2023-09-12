package com.example.verduras;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText campo1;
    private EditText campo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo1 = findViewById(R.id.num);
        campo2 = findViewById(R.id.num2);

        Button btnCalcular = findViewById(R.id.btcalcu);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularResultado();
            }
        });

        Button btnLimpiar = findViewById(R.id.btlimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                campo1.setText("");
                campo2.setText("");
            }
        });
    }
    private void calcularResultado() {
        String strCampo1 = campo1.getText().toString();
        String strCampo2 = campo2.getText().toString();

        double num1 = Double.parseDouble(strCampo1);
        double num2 = Double.parseDouble(strCampo2);

        double resultado = num1 * num2;

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", resultado);
        startActivity(intent);
    }
}
