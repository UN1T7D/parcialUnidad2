package com.example.parcialdiferidounidad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSeleccionarOpcion;

    EditText edtNumero1;
    EditText edtNumero2;

    TextView txtOpcion;
    TextView txtResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSeleccionarOpcion = findViewById(R.id.btnSeleccionarOpcion);

        edtNumero1 = findViewById(R.id.edtNumero1);
        edtNumero2 = findViewById(R.id.edtNumero2);

        txtOpcion = findViewById(R.id.txtOpcion);
        txtResultado = findViewById(R.id.txtResultado);

        

        btnSeleccionarOpcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    //int numero1 = 0, numero2 = 0;
                    String numero1 = edtNumero1.getText().toString();
                    String numero2 = edtNumero2.getText().toString();

                    if (!numero1.isEmpty() && !numero2.isEmpty()){

                        Intent mainActivity2 = new Intent(MainActivity.this, MainActivity2.class);

                        Bundle bdlActivity2 = new Bundle();
                        String n1 = numero1;
                        String n2 = numero2;

                        /*bdlActivity2.putFloat("num1", n1);
                        bdlActivity2.putFloat("num2", n2);*/

                        mainActivity2.putExtra("num1", n1);
                        mainActivity2.putExtra("num2", n2);

                        startActivity(mainActivity2);

                    }else {
                        if (numero1.isEmpty()){
                            edtNumero1.setError("Rellena este campo obligatorio");
                        }

                        if (numero2.isEmpty()){
                            edtNumero2.setError("Rellena este campo obligatorio");
                        }
                    }


                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Al parecer nos has completado los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}