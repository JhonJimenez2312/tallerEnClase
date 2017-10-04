package com.example.android.tallerempresaxyz;

/**
 * Created by android on 03/10/2017.
 */

public class Metodos {

    public static double calcularTest(int opcionGenero,int opcionTipoZapato,int opcionMarca, int cant){
        double precioTotal =0.0;


        // cantidad = (EditText)findViewById(R.id.txtCantidad);


        //VALIDAR LA CAJA DE CANTIDAD
        //  cantidad = (EditText)findViewById(R.id.txtCantidad);

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



        return precioTotal;

    }
}
