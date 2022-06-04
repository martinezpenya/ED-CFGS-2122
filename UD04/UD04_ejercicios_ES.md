---
title: UD04: Junit en Netbeans (Ejercicios)
language: ES
author: David Martínez Peña [www.martinezpenya.es]
subject: Entornos de desarrollo
keywords: [EED, 2022, Entornos, Desarrollo]
IES: IES Mestre Ramón Esteve (Catadau) [iesmre.es]
header: ${title} - ${subject} (ver: ${today})
footer: ${currentFileName}.pdf - ${author} - ${IES} - ${pageNo}/${pageCount}
typora-root-url: ${filename}/../
typora-copy-images-to: ${filename}/../assets
---
[toc]
# Introducción.

Las pruebas de software son parte esencial del ciclo de desarrollo. La elaboración y mantenimiento de unidad, pueden ayudarnos a asegurar que los los métodos individuales de nuestro código, funcionan correctamente. Los entorno de desarrollo, integran frameworks, que permiten automatizar las pruebas.

En el caso de entornos de desarrollo para Java, como NetBeans y Eclipse, nos encontramos con el framework JUnit. JUnit es una herramienta de automatización de pruebas que nos permite de manera rápida y sencilla, elaborar pruebas. La herramienta nos permite diseñar clases de prueba, para cada clase diseñada en nuestra aplicación. Una vez creada las clases de prueba, establecemos los métodos que queremos probar, y para ello diseñamos casos de prueba. Los criterios de creación de casos de prueba, pueden ser muy diversos, y dependerán de lo que queramos probar.

Una vez diseñados los casos de prueba, pasamos a probar la aplicación. La herramienta de automatización, en este caso Junit, nos presentará un informe con los resultados de la prueba. En función de los resultados, deberemos o no, modificar el código.

- Algunos test no superados:

  ![tests no superados](assets/junit-test-fail.png)

- Todos los tests superados:

  ![](assets/junit-test-pass.png)

Los entornos de desarrollo más extendidos, que se utilizan para implementar aplicaciones Java, tales como NetBeans o Eclipse, incorporan un plugin para trabajar con Junit nos va a servir para realizar pruebas unitarias de clases escritas en Java, dentro de un entorno de pruebas. Es un framework con muy pocas clases fácil de aprender y de utilizar.

Una vez que hemos diseñado nuestra aplicación, y la hemos depurado, procedemos a probarla. En el caso del ejemplo, disponemos de una clase, de nombre `Ccuenta`, donde se han definido una serie de métodos.

El objetivo va a ser el diseño y ejecución de algunos casos de prueba.

# Inicio de Junit

Para iniciar Junit, seleccionada en la ventana de proyectos la clase a probar, abrimos el menú contextual y seleccionamos `Tools` > `Create/Update Tests`.

Nos aparece un formulario donde debemos indicar el nombre de la clase. Puesto que vamos a probar la clase `Ccuenta`, por convenio es recomendable llamar a la clase de prueba `CcuentaTest`. Esta clase se va a insertar en un nuevo paquete de nuestro proyecto, denominado `Test Packages` (Paquetes de pruebas). Nos da a elegir entre `JUnit`, `TestNG` y `JUnit4`. Son las dos versiones de JUnit disponibles en NetBeans 12.X. En nuestro caso, elegimos `JUnit4`, desmarcamos la opción `Integration Tests`. 

Como se aprecia en el formulario, JUnit va a generar los métodos que aparecen seleccionados. En nuestro caso lo vamos a dejar tal cual, aunque luego van a ser modificados en el código.

![junit_form](assets/junit_form.png)

Al pulsar el botón `OK` nos aparecen un nueva clase de nombre `CcuentaTest`, que contiene los métodos que estaban seleccionados en el formulario anterior, con un código prototipo. Es en ese código en el que el programador creará sus casos de prueba. 

![CcuentaTest](assets/CcuentaTest.png)

El diseño de los casos de prueba, requiere que se establezcan criterios que garanticen que esa prueba tiene muchas probabilidades de encontrar algún error no detectado hasta el momento.

# Casos de prueba

El paso anterior genera una serie de métodos que van ligados a una serie de anotaciones. Comenzamos por conocer los inicializadores y finalizadores:

- Para la clase: 

  - `setUpClass()` (`@BeforeClass`): Sólo puede haber un método con este marcador, es invocado una vez al principio de todos los test. Se suele usar para inicializar atributos.
  - `tearDown()` (`@AfterClass`): Sólo puede haber un método con este marcador y se invoca al finalizar todos los test.

- Para cada uno de los tests:

  - `setUp()` (`@Before`): Se ejecuta antes de de cada test.
  - `tearDown()` (`@After`): Se ejecuta después de cada test.

  Se utilizan para inicializar y finalizar las condiciones de prueba, como puede ser la creación de un objeto, inicialización de variables, etc. En algunos casos, no es necesario utilizar estos métodos, pero siempre se suelen incluir.

A continuación, debemos conocer las anotaciones:

- `@Ignore`: Los métodos marcados con esta anotación no serán ejecutados.
- `@Test`: Representa un test que se debe ejecutar. 
- `@Test (timeout=X)` el test será válido si se ejecuta antes de `X` milisegundos.

Y por último, es necesario conocer las aserciones. Los método `assertXXX()`, se utilizan para hacer las pruebas. Estos métodos, permiten comprobar si la salida del método que se está probando, concuerda con los valores esperados. Las principales son:

- `assertTrue()` evalúa una expresión booleana. La prueba pasa si el valor de la expresión es true.
- `assertFalse()` evalúa una expresión booleana. La prueba pasa si el valor de la expresión es false.
- `assertNull()` verifica que la referencia a un objeto es nula.
- `assertNotNull()` verifica que la referencia a un objeto es no nula.
- `assertSame()` compara dos referencias y asegura que los objetos referenciados tienen la misma dirección de memoria. La prueba pasa si los dos argumentos son el mismo objeto o pertenecen al mismo objeto.
- `assertNotSame()` Compara dos referencias a objetos y asegura que ambas apuntan a diferentes direcciones de memoria. La prueba pasa si los dos argumentos suplidos son objetos diferentes o pertenecen a objetos distintos.
- `assertEquals()` Se usa para comprobar igualdad a nivel de contenidos. La igual de tipos primitivos se compara usando “==”, la igual entre objetos se compara con el método `equals()`. La prueba pasa si los valores de los argumentos son iguales.
- `fails()` causa que la prueba falle inmediatamente. Se puede usar cuando la prueba indica un error o cuando se espera que el método que se está probando llame a una excepción.

En este punto, nos disponemos a diseñar los métodos que necesitemos para los casos de prueba.

```java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
         * 	Math.abs (esperado – real) <= delta
         * Por ejemplo:
         * 	afirmarEquals( unValorDoble, otroValorDoble, 0.001 )
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
```

Estos métodos intentan probar los métodos de la clase `Ccuenta`. Para ello, teniendo seleccionado el proyecto, accederemos al menú contextual y pulsamos la opción `Test`.

Como se puede comprobar, la prueba sobre el método retirar ha fallado, pero la resta de pruebas sobre los métodos han resultado exitosas. Con esta información, debemos comprobar que el caso de prueba está correctamente diseñado, en cuyo caso, lo que se ha encontrado es un error en el diseño del método `retirar`, y hay que corregirlo. La ventaja de utilizar herramientas automatizadas, es que se facilita la regresión, ya que tenemos diseñado el caso de prueba para el método, así que una vez recodificado el método retirar, podemos volver a probar todos los métodos de manera automatizada.

# Clase `Ccuenta`

```java
/**
 *
 * @author David Martínez (wwww.martinezpenya.es|iesmre.com)
 */
public class CCuenta {

    // Propiedades de la Clase Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double interes;

    // Constructor sin argumentos
    public CCuenta() {
    }

    // Constructor con parámetro para iniciar todas las propiedades de la clase
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        interes = tipo;
    }

    //getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    //Método para ingresar cantidades en la cuenta. Modifica el saldo.
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo += cantidad;
    }

    // Método para retirar cantidades en la cuenta. Modifica el saldo.
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getSaldo()< cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = cantidad;
    }
}
```

# Actividades

## Junit_1

Tal cual tenemos ahora mismo la clase `Ccuenta` y `CcuentaTest`, hemos descubierto un problema en el método `retirar`. Explica como se lanzan las pruebas desde Netbeans (donde se vea el test que no es satisfactorio), justifica si el problema está en el Test o en el método `retirar`. Realiza las modificaciones oportunas (en el test o en el método `retirar`) para que el test sea satisfactorio explicando paso a paso y con capturas como realiza los test y resultan todos satisfactorios.

Envia la memoria en PDF a la tarea correspondiente de AULES.

## Junit_2

Modifique los métodos de prueba (tests) que considere oportuno para conseguir que para cada uno de los tests se impriman los milisegundos empleados en la prueba. Hay que hacerlo de la manera más eficiente posible, y no repetir código en cada uno de los tests.

Envia la memoria en PDF a la tarea correspondiente de AULES.

# Fuentes de información

- https://netbeans.apache.org/kb/docs/java/junit-intro.html
- https://www.discoduroderoer.es/como-hacer-una-aplicacion-de-prueba-con-junit/
