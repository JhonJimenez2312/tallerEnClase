package com.example.android.tallerempresaxyz;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    private Resources resources;
    private Spinner spinnerGenero,spinnerTipoZapato,spinnerMarca;
    private String arrayOpciones[];
    ArrayAdapter<String> adapter;
    private EditText precioFinal;
    private EditText cantidad;
    private TextView total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        resources = this.getResources();
        total = (TextView)findViewById(R.id.txtTotal);
        cantidad = (EditText)findViewById(R.id.txtCantidad);


        //llenado del spinner de genero
        spinnerGenero =(Spinner)findViewById(R.id.cmbGenero);
        arrayOpciones = resources.getStringArray(R.array.arrayGenero);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,arrayOpciones);
        spinnerGenero.setAdapter(adapter);

        //llenado del spinner de tipo de zapato
        spinnerTipoZapato =(Spinner)findViewById(R.id.cmbTipoDeZapato);
        arrayOpciones = resources.getStringArray(R.array.arrayTipoZapato);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,arrayOpciones);
        spinnerTipoZapato.setAdapter(adapter);

        //llenado del spinner de tipo de marca
        spinnerMarca =(Spinner)findViewById(R.id.cmbMarca);
        arrayOpciones = resources.getStringArray(R.array.arrayMarcas);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,arrayOpciones);
        spinnerMarca.setAdapter(adapter);
    // inicializamos
        spinnerGenero.setSelection(0);
        spinnerTipoZapato.setSelection(0);
        spinnerMarca.setSelection(0);
    }


    public void calcular(View v){
        double precioTotal=0.0;
        int opcionGenero,opcionTipoZapato,opcionMarca;
       // cantidad = (EditText)findViewById(R.id.txtCantidad);
        if(validar()){
            opcionGenero=spinnerGenero.getSelectedItemPosition();
            opcionTipoZapato=spinnerTipoZapato.getSelectedItemPosition();
            opcionMarca=spinnerMarca.getSelectedItemPosition();
            //VALIDAR LA CAJA DE CANTIDAD
          //  cantidad = (EditText)findViewById(R.id.txtCantidad);
            int cant = Integer.parseInt(cantidad.getText().toString());
            // si es hombre
            if(opcionGenero==0){
                //si tipo de zapato zapatilla
                if(opcionTipoZapato==0){
                    //si marca nike
                    if(opcionMarca==0){
                        precioTotal=120000*cant;

                    }else{
                        //si marca adidas
                        if(opcionMarca==1){
                            precioTotal=140000*cant;
                        }else{
                            //si marca puma
                            precioTotal=130000*cant;
                        }
                    }
                }else{
                    //si tipo de zapato clasico
                    //si marca nike
                    if(opcionMarca==0){
                        precioTotal=50000*cant;

                    }else{
                        //si marca adidas
                        if(opcionMarca==1){
                            precioTotal=80000*cant;
                        }else{
                            //si marca puma
                            precioTotal=100000*cant;
                        }
                    }
                }
            }else{
                //si es mujer
                //si tipo de zapato zapatilla
                if(opcionTipoZapato==0){
                    //si marca nike
                    if(opcionMarca==0){
                        precioTotal=100000*cant;

                    }else{
                        //si marca adidas
                        if(opcionMarca==1){
                            precioTotal=130000*cant;
                        }else{
                            //si marca puma
                            precioTotal=110000*cant;
                        }
                    }
                }else{
                    //si tipo de zapato clasico
                    //si marca nike
                    if(opcionMarca==0){
                        precioTotal=60000*cant;

                    }else{
                        //si marca adidas
                        if(opcionMarca==1){
                            precioTotal=70000*cant;
                        }else{
                            //si marca puma
                            precioTotal=120000*cant;
                        }
                    }
                }
            }

        }
        total.setText("\n$ "+precioTotal);
    }

    public boolean validar(){
        cantidad = (EditText)findViewById(R.id.txtCantidad);
        String x =cantidad.getText().toString();
        int cant2 = Integer.parseInt(cantidad.getText().toString());
        if(x.isEmpty()||cantidad.getText().toString().trim().isEmpty()||cant2==0){
            cantidad.setError(resources.getString(R.string.mensaje_error_uno));
            cantidad.setText("");
            cantidad.requestFocus();
            return false;
        }

        return true;
    }
}
