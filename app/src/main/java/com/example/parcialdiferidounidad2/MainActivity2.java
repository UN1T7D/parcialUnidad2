package com.example.parcialdiferidounidad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    /*btnSeleccionarOpcion = findViewById(R.id.btnSeleccionarOpcion);

    edtNumero1 = findViewById(R.id.edtNumero1);
    edtNumero2 = findViewById(R.id.edtNumero2);*/

    TextView txtNumero1;
    TextView txtNumero2;

    RadioGroup rgpOperaciones;
    RadioButton rbtnSuma, rbtnResta, rbtnDivision, rbtnMultiplicacion;

    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {

            setContentView(R.layout.activity_main2);

            txtNumero1 = findViewById(R.id.txtNumero1);
            txtNumero2 = findViewById(R.id.txtNumero2);

            //rgpOperaciones = findViewById(R.id.rgpOperaciones);

            rbtnSuma = findViewById(R.id.rbtnSuma);
            rbtnResta = findViewById(R.id.rbtnResta);
            rbtnDivision = findViewById(R.id.rbtnDivision);
            rbtnMultiplicacion = findViewById(R.id.rbtnMultiplicacion);

            btnCalcular = findViewById(R.id.btnCalcular);


            String numero1 = getIntent().getStringExtra("num1");
            String numero2 = getIntent().getStringExtra("num2");

            txtNumero1.setText(numero1);
            txtNumero2.setText(numero2);

            btnCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {

                        //String opcion;
                        int rbg;

                        /*rbg = rgpOperaciones.getCheckedRadioButtonId();
                        rgpOperaciones = findViewById(rbg);*/



                        if (rgpOperaciones.toString().trim() == "Suma"){
                            Intent mainActivity = new Intent(MainActivity2.this, MainActivity.class);

                            Bundle bdlActivity2 = new Bundle();
                            String opcion = "Suma";


                            mainActivity.putExtra("opcion", opcion);

                            startActivity(mainActivity);
                        }

                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Al parecer nos has completado los campos", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Error, intentalo nuevamente", Toast.LENGTH_SHORT).show();
        }



    }
}