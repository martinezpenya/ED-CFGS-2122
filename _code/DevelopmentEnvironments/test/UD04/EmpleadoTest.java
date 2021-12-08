/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD04;

import org.junit.*;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|iesmre.com)
 */
public class EmpleadoTest {

    /*
     * Definimos objetos de tipo empleado para usarlos en todos los tests
     */
    static Empleado empleado1;
    static Empleado empleado2;
    static Empleado empleado3;
    static Empleado empleado4;

    @BeforeClass
    public static void setUpClass() {
        //Creamos los objetos

        empleado1 = new Empleado("Fernando", "Ureña", 23, 1000);
        empleado2 = new Empleado("Antonio", "Lopez", 23, 800);
        empleado3 = new Empleado();
        empleado4 = new Empleado("Fernando", "Ureña", 43, 1200);
    }

    /**
     * Test of plus method, of class Empleado.
     */
    @Test
    public void testPlus() {
        double plus = 50;

        //Devolvera falso ya que tiene menos de 40 años
        Assert.assertEquals(false, empleado1.plus(plus));

        //Devolvera falso ya que tiene menos de 40 años
        Assert.assertEquals(false, empleado2.plus(plus));

        //Devolvera falso ya que tiene menos de 40 años
        Assert.assertEquals(false, empleado3.plus(plus));

        //Devolvera verdadero ya que tiene mas de 40 años
        Assert.assertEquals(true, empleado4.plus(plus));
    }

    /**
     * Test of equals method, of class Empleado.
     */
    @Test
    public void testEquals() {
        //Comprobamos si son iguales unos empleados de otro

        //Devolvera false ya que su nombre y apellido son distintos
        Assert.assertEquals(false, empleado1.equals(empleado2));

        //Devolvera false ya que su nombre y apellido son distintos
        Assert.assertEquals(false, empleado2.equals(empleado3));

        //Devolvera true ya que su nombre y apellido son diguales
        Assert.assertEquals(true, empleado1.equals(empleado4));
    }

    /**
     * Test of compareTo method, of class Empleado.
     */
    @Test
    public void testCompareTo() {
        //Comparamos entre distintos empleados, usamos constantes
 
        //Los dos empleados tienen la misma edad
        Assert.assertEquals(Empleado.IGUAL, empleado1.compareTo(empleado2));
 
        //El empleado 4 es mayor que el empleado 1
        Assert.assertEquals(Empleado.MAYOR, empleado4.compareTo(empleado1));
 
        //El empleado  es mayor que el empleado 1
        Assert.assertEquals(Empleado.MENOR, empleado3.compareTo(empleado2));
    }

}
