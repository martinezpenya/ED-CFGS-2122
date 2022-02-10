package UD04;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import UD04.CCuenta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|iesmre.com)
 */
public class CCuentaTest {

    //Las variables que usaremos para hacer los tests, ojo! son static!.
    static CCuenta cuentaSinParmetros;
    static CCuenta cuentaDavid;
    static CCuenta cuentaPepe;
    static CCuenta cuentaSinSaldo;
    static CCuenta cuentaSaldoMil;

    //Aunque el constructor no es obligatorio, Junit lo añade, observa que no 
    //tiene ninguna anotación.
    public CCuentaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        //Este método se ejecutará una sola vez antes de todos los tests
        //en nuestro caso imprimimos el comienzo del TEST.
        System.out.println("INICIO TEST");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        //Este método se ejecutará una sola vez al terminar todos los tests
        //en nuestro caso no lo usamos.
    }

    @Before
    public void setUp() {
        //Este método se ejecutará al comienzo de cada Test
        //en nuestro caso imprimiremos el comentario de que comienza la prueba
        //y crearemos aquí los objetos que vamos a necesitar para hacer pruebas.
        System.out.print("Comienza la prueba ");
        cuentaSinParmetros = new CCuenta();
        cuentaDavid = new CCuenta("David", "1234", 50, 0.5);
        cuentaPepe = new CCuenta("Pepe", "5678", 200, 1);
    }

    @After
    public void tearDown() {
        //Este método se ejecutará al finalizar cada Test
        //en nuestro caso imprimiremos el comentario de que ha terminado la prueba
        //Añadimos la variable fin y el calculo respecto al comienzo para saber
        //los ms empleados en la prueba.
        System.out.println("Fin de la prueba\n");
    }

    //Comenzamos con los tests o pruebas.
    /**
     * Test of getNombre method, of class CCuenta.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        //CCuenta instance = new CCuenta();
        //String expResult = "";
        //String result = instance.getNombre();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

        //Tal y como indica el TODO, debemos modificar el código y sustituirlo
        //por nuestros tests en este caso podemos definir dos casos de prueba:
        //nombre nulo
        assertNull(cuentaSinParmetros.getNombre());

        //nombre "David"
        assertEquals("David", cuentaDavid.getNombre());

        //nombre "Pepe"
        assertEquals("Pepe", cuentaPepe.getNombre());
    }

    /**
     * Test of setNombre method, of class CCuenta.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");

        //Cambiamos el nombre a la cuenta David
        cuentaDavid.setNombre("David2");
        assertEquals("David2", cuentaDavid.getNombre());

        //Cambiamos el nombre a la cuenta sin parámetros
        cuentaSinParmetros.setNombre("Anonimo");
        assertEquals("Anonimo", cuentaSinParmetros.getNombre());
    }

    /**
     * Test of getCuenta method, of class CCuenta.
     */
    @Test
    public void testGetCuenta() {
        System.out.println("getCuenta");

        //cuenta nulo
        assertNull(cuentaSinParmetros.getCuenta());

        //cuenta "1234" David
        assertEquals("1234", cuentaDavid.getCuenta());

        //saldo 200 Pepe
        assertEquals("5678", cuentaPepe.getCuenta());
    }

    /**
     * Test of setCuenta method, of class CCuenta.
     */
    @Test
    public void testSetCuenta() {
        System.out.println("setCuenta");

        //Cambiamos la cuenta David
        cuentaDavid.setCuenta("0000");
        assertEquals("0000", cuentaDavid.getCuenta());

        //Cambiamos la cuenta sin parámetros
        cuentaSinParmetros.setCuenta("4321");
        assertEquals("4321", cuentaSinParmetros.getCuenta());
    }

    /**
     * Test of getSaldo method, of class CCuenta.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");

        //cuenta cero
        assertEquals(0, cuentaSinParmetros.getSaldo(), 0);

        //saldo 50
        assertEquals(50, cuentaDavid.getSaldo(), 0);

        //nombre 200
        assertEquals(200, cuentaPepe.getSaldo(), 0);

        /*
         * Cuando desea comparar tipos de punto flotante (double o float),
         * necesita un parámetro adicional para evitar errores de redondeo.
         * La afirmación se evalúa como se indica a continuación:
         * Math.abs (esperado – real) <= delta
         * Por ejemplo:
         * afirmarEquals( unValorDoble, otroValorDoble, 0.001 )
         */
    }

    /**
     * Test of setSaldo method, of class CCuenta.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");

        //Cambiamos el saldo a la cuenta David
        cuentaDavid.setSaldo(0);
        assertEquals(0, cuentaDavid.getSaldo(), 0);

        //Cambiamos el saldo a la cuenta sin parámetros
        cuentaSinParmetros.setSaldo(1000.0001);
        assertEquals(1000.0001, cuentaSinParmetros.getSaldo(), 0);
    }

    /**
     * Test of getInteres method, of class CCuenta.
     */
    @Test
    public void testGetInteres() {
        System.out.println("getInteres");

        //interes cero
        assertEquals(0, cuentaSinParmetros.getInteres(), 0);

        //interes 0.5
        assertEquals(0.5, cuentaDavid.getInteres(), 0);

        //interes 1
        assertEquals(1, cuentaPepe.getInteres(), 0);
    }

    /**
     * Test of setInteres method, of class CCuenta.
     */
    @Test
    public void testSetInteres() {
        System.out.println("setInteres");

        //Cambiamos el interes a la cuenta David
        cuentaDavid.setInteres(0);
        assertEquals(0, cuentaDavid.getInteres(), 0);

        //Cambiamos el interes a la cuenta sin parámetros
        cuentaSinParmetros.setInteres(10.01);
        assertEquals(10.01, cuentaSinParmetros.getInteres(), 0);
    }

    /**
     * Test of ingresar method, of class CCuenta.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");

        //ingresamos 100 a la que estaba vacia
        cuentaSinParmetros.ingresar(100);
        assertEquals(100, cuentaSinParmetros.getSaldo(), 0);

        //ingresamos 0 a la que tenia 50
        cuentaDavid.ingresar(0);
        assertEquals(50, cuentaDavid.getSaldo(), 0);
    }

    //El caso de Ingresar es un poco especial, porque puede lanzar una excepción
    //cuando la cantidad es negativa, esos casos lo tratamos con una anotación 
    //especial donde identificas el tipo de excepcion esperada.
    @Test(expected = Exception.class)
    public void testIngresaExcepcion() throws Exception {
        System.out.println("Excepción ingresar");
        //intentamos ingresar una cantidad negativa
        cuentaPepe.ingresar(-200);
    }

    /**
     * Test of retirar method, of class CCuenta.
     */
    @Test
    public void testRetirar() throws Exception {
        System.out.println("retirar");

        //retiramos 0 a la que tenia 50
        cuentaDavid.retirar(0);
        assertEquals(50, cuentaDavid.getSaldo(), 0);

        //retiramos 50 a la que tenia 200
        cuentaPepe.retirar(50);
        assertEquals(150, cuentaPepe.getSaldo(), 0);
    }

    //Lo mismo para la excepción al intentar retirar una cantidad mayor que el saldo
    @Test(expected = Exception.class)
    public void testRetirarExcepcion() throws Exception {
        System.out.println("Excepción retirar");
        //intentamos retirar cuando no hay saldo
        cuentaSinParmetros.retirar(200);
    }
}