package com.example.android.tallerempresaxyz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void combinacion1(){
        int opcionGenero=0;//es hombre
        int opcionTipoZapato=0;// zapatilla
        int opcionMarca=0;//Nike
        int cant=1;//cantidad = 1
        double valorEsperado = 120000.0;
        double valorReal= Metodos.calcularTest(opcionGenero,opcionTipoZapato,opcionMarca,cant);
        assertEquals(valorEsperado,valorReal,0);
    }
    @Test
    public void combinacion2(){
        int opcionGenero=0;//es hombre
        int opcionTipoZapato=0;// zapatilla
        int opcionMarca=1;//Adidas
        int cant=1;//cantidad = 1
        double valorEsperado = 140000.0;
        double valorReal= Metodos.calcularTest(opcionGenero,opcionTipoZapato,opcionMarca,cant);
        assertEquals(valorEsperado,valorReal,0);
    }
    @Test
    public void combinacion3(){
        int opcionGenero=0;//es hombre
        int opcionTipoZapato=0;// zapatilla
        int opcionMarca=3;//puma
        int cant=1;//cantidad = 1
        double valorEsperado = 130000.0;
        double valorReal= Metodos.calcularTest(opcionGenero,opcionTipoZapato,opcionMarca,cant);
        assertEquals(valorEsperado,valorReal,0);
    }
    @Test
    public void combinacion4(){
        int opcionGenero=0;//es hombre
        int opcionTipoZapato=1;// Clasico
        int opcionMarca=0;//Nike
        int cant=1;//cantidad = 1
        double valorEsperado = 50000.0;
        double valorReal= Metodos.calcularTest(opcionGenero,opcionTipoZapato,opcionMarca,cant);
        assertEquals(valorEsperado,valorReal,0);
    }
    @Test
    public void combinacion5(){
        int opcionGenero=0;//es hombre
        int opcionTipoZapato=1;// Clasico
        int opcionMarca=1;//adidas
        int cant=1;//cantidad = 1
        double valorEsperado = 80000.0;
        double valorReal= Metodos.calcularTest(opcionGenero,opcionTipoZapato,opcionMarca,cant);
        assertEquals(valorEsperado,valorReal,0);
    }
    @Test
    public void combinacion6(){
        int opcionGenero=0;//es hombre
        int opcionTipoZapato=1;// Clasico
        int opcionMarca=2;//puma
        int cant=1;//cantidad = 1
        double valorEsperado = 100000.0;
        double valorReal= Metodos.calcularTest(opcionGenero,opcionTipoZapato,opcionMarca,cant);
        assertEquals(valorEsperado,valorReal,0);
    }
    @Test
    public void combinacion7(){
        int opcionGenero=1;//es Mujer
        int opcionTipoZapato=0;// zapatilla
        int opcionMarca=0;//Nike
        int cant=1;//cantidad = 1
        double valorEsperado = 100000.0;
        double valorReal= Metodos.calcularTest(opcionGenero,opcionTipoZapato,opcionMarca,cant);
        assertEquals(valorEsperado,valorReal,0);
    }
    @Test
    public void combinacion8(){
        int opcionGenero=1;//es Mujer
        int opcionTipoZapato=0;// zapatilla
        int opcionMarca=1;//Adidas
        int cant=1;//cantidad = 1
        double valorEsperado = 130000.0;
        double valorReal= Metodos.calcularTest(opcionGenero,opcionTipoZapato,opcionMarca,cant);
        assertEquals(valorEsperado,valorReal,0);
    }
    @Test
    public void combinacion9(){
        int opcionGenero=1;//es Mujer
        int opcionTipoZapato=0;// zapatilla
        int opcionMarca=3;//puma
        int cant=1;//cantidad = 1
        double valorEsperado = 110000.0;
        double valorReal= Metodos.calcularTest(opcionGenero,opcionTipoZapato,opcionMarca,cant);
        assertEquals(valorEsperado,valorReal,0);
    }
    @Test
    public void combinacion10(){
        int opcionGenero=1;//es Mujer
        int opcionTipoZapato=1;// Clasico
        int opcionMarca=0;//Nike
        int cant=1;//cantidad = 1
        double valorEsperado = 60000.0;
        double valorReal= Metodos.calcularTest(opcionGenero,opcionTipoZapato,opcionMarca,cant);
        assertEquals(valorEsperado,valorReal,0);
    }
    @Test
    public void combinacion11(){
        int opcionGenero=1;//es Mujer
        int opcionTipoZapato=1;// Clasico
        int opcionMarca=1;//adidas
        int cant=1;//cantidad = 1
        double valorEsperado = 70000.0;
        double valorReal= Metodos.calcularTest(opcionGenero,opcionTipoZapato,opcionMarca,cant);
        assertEquals(valorEsperado,valorReal,0);
    }
    @Test
    public void combinacion12(){
        int opcionGenero=1;//es Mujer
        int opcionTipoZapato=1;// Clasico
        int opcionMarca=2;//puma
        int cant=1;//cantidad = 1
        double valorEsperado = 120000.0;
        double valorReal= Metodos.calcularTest(opcionGenero,opcionTipoZapato,opcionMarca,cant);
        assertEquals(valorEsperado,valorReal,0);
    }
}