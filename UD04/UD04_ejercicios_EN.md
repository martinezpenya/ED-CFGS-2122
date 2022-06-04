---
    title: UD04: Junit en Netbeans (Exercise)
    language: EN
    author: David Martínez Peña [www.martinezpenya.es]
    subject: Develoument Enviroment
    keywords: [EED, 2022, Develoument, Enviroment]
    IES: IES Mestre Ramón Esteve (Catadau) [iesmre.es]
    header: ${title} - ${subject} (ver:${today}) 
    footer:${currentFileName}.pdf - ${author} - ${IES} - ${pageNo}/${pageCount}
    typora-root-url:${filename}/../
    typora-copy-images-to:${filename}/../assets
    imgcover:/media/DADES/NextCloud/DOCENCIA/ED_2122/ED-CFGS-2122/UD04/assets/cover.png
---
[toc]
# Introduction.

Software testing is an essential part of the development cycle. Creating and maintaining units can help us ensure that individual methods in our code work correctly. The development environment integrates Frameworks, which allow you to automate tests.

In the case of development environments for Java, such as NetBeans and Eclipse, we find the JUnit framework. JUnit is a test automation tool that allows us to quickly and easily create tests. The tool allows us to design test classes, for each class designed in our application. Once the test classes have been created, we establish the methods that we want to test, and for this we design test cases. The criteria for creating test cases can be very diverse, and will depend on what we want to test.

Once the test cases have been designed, we proceed to test the application. The automation tool, in this case Junit, will present us with a report with the results of the test. Depending on the results, we may or may not modify the code.

- Some unsurpassed tets:

  ![tests no superados](assets/junit-test-fail.png)

- Some tests passed:

  ![](assets/junit-test-pass.png)

The most widespread development environments, which are used to implement Java applications, such as NetBeans or Eclipse, incorporate a plugin to work with Junit. It will help us to carry out unit tests of classes written in Java, within a test environment. It is a framework with very few classes that is easy to learn and use.

Once we have designed our application, and we have debugged it, we proceed to test it. In the case of the example, we have a class, named `Ccount`, where a series of methods have been defined.

The objective is going to be the design and execution of some test cases.

# Junit start

To start Junit, select the class to test in the project window, open the context menu and select  `Tools` > `Create/Update Tests`.

appears to us where we must indicate the name of the class. Since we are going to test the class `Ccount`,by convention it is advisable to call the test class `CcountTest`. This class is going to be inserted into a new package in our project, called `Test Packages` (test packages). It gives us a choice between `JUnit`, `TestNG` and `JUnit4`. They are the two versions of JUnit available in NetBeans 12.X. In our case, we choose `JUnit4`, uncheck the option `Integration Tests`. 

As can be seen in the form, JUnit will generate the methods that appear selected. In our case we are going to leave it as it is, although later they will be modified in the code.

![junit_form](assets/junit_form.png)

When pressing the button `OK` we get a new kind of name `CcountTest`, which contains the methods that were selected in the previous form, with a prototype code. It is in that code that the programmer will create his test cases.

![CcuentaTest](assets/CcuentaTest.png)

The design of the test cases requires that criteria be established that guarantee that the test has a high probability of finding some error not detected so far.

# Test cases

The previous step generates a series of methods that are tied to a series of annotations. We start by learning about initializers and finalizers:

- For classes: 

  - `setUpClass()` (`@BeforeClass`): There can only be one method with this marker, it is called once at the beginning of all tests. It is often used to initialize attributes.
  - `tearDown()` (`@AfterClass`): There can only be one method with this marker and it is called at the end of all tests.

- For each of the tests:

  - `setUp()` (`@Before`): It is executed before each test.
  - `tearDown()` (`@After`): It is executed after each test.

  They are used to initialize and terminate test conditions, such as object creation, variable initialization, etc. In some cases, it is not necessary to use these methods, but they are usually always included.

Next, we need to know the annotations:

- `@Ignore`: Methods marked with this annotation will not be executed..
- `@Test`: Represents a test that must be executed. 
- `@Test (timeout=X)` the test will be valid if it is executed before `X` milliseconds.

And finally, you need to know the assertions. The `assertXXX()` methods are used to do the tests. These methods allow you to check whether the output of the method being tested agrees with the expected values. The main ones are:

- `assertTrue()` evaluates a boolean expression. The test passes if the value of the expression is true.
- `assertFalse()` evaluates a boolean expression. The test passes if the value of the expression is false.
- `assertNull()` checks that the reference to an object is null.
- `assertNotNull()` checks that the reference to an object is not null.
- `assertSame()` compares two references and ensures that the referenced objects have the same memory address. The test passes if the two arguments are the same object or belong to the same object.
- `assertNotSame()` Compares two object references and ensures that they both point to different memory addresses. The test passes if the two supplied arguments are different objects or belong to different objects.
- `assertEquals()` It is used to check equality at the content level. The equal of primitive types is compared using “==”, the equal between objects is compared with the method `equals()`.The test passes if the values of the arguments are equal.
- `fails()` causes the test to fail immediately. Can be used when the test returns an error or when the method being tested is expected to call an exception.

At this point, we are ready to design the methods we need for the test cases.

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
public class CCountTest {

    //the variables we use to do the tests are static!.
    static CCount countNoParmeters;
    static CCount countDavid;
    static CCount countPepe;
    static CCount countNobalance;
    static CCount countThousandBalance;

    //Although the constructor is not required, Junit adds it, note that it does not 
    //has no annotation.
    public CCountTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        //This method will be executed only once before all tests
        
        //in our case we print the beginning of the TEST.
        System.out.println("TEST START");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        //This method will be executed only once after finishing all the tests
        //in our case we do not use it.
    }

    @Before
    public void setUp() {
        //This method will be executed at the beginning of each Test
       //in our case we will print the comment that the test begins
        
         //and we will create here the objects that we are going to need to make tests.
        System.out.print("We start the test");
        countNoParmeters = new CCount();
        countDavid = new CCount("David", "1234", 50, 0.5);
        countPepe = new CCount("Pepe", "5678", 200, 1);
    }

    @After
    public void tearDown() {
       //This method will be executed at the end of each Test
         //in our case we will print the comment that the test has finished
         //We add the end variable and the calculation with respect to the beginning to know
         //the most used in the test.
        System.out.println("End of test \n");
    }

    //We start with the tests or tests.
    /**
     * Test of getNombre method, of class CCount.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        //CCount instance = new CCount();
        //String expResult = "";
        //String result = instance.getName();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

       //As the WHERE indicates, we must modify the code and replace it
         //for our tests in this case we can define two test cases:
        //null name
        assertNull(countNoParmeters.getName());

        //name "David"
        assertEquals("David", countDavid.getName());

        //name "Pepe"
        assertEquals("Pepe", countPepe.getName());
    }

    /**
     * Test of setName method, of class CCount.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");

        //We changed the name to the account David
        countDavid.setNombre("David2");
        assertEquals("David2", countaDavid.getName());

        //We change the name to the account without parameters
        countNoParmeters.setName("Anonymous");
        assertEquals("Anonymous", countNoParmeters.getName());
    }

    /**
     * Test of getCount method, of class CCount.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");

        //count null
        assertNull(countNoParameters.getCount());

        //count "1234" David
        assertEquals("1234", countDavid.getCount());

        //saldo 200 Pepe
        assertEquals("5678", countPepe.getCount());
    }

    /**
     * Test of setCount method, of class CCount.
     */
    @Test
    public void testSetCount() {
        System.out.println("setCount");

        //We changed the account to david
        countDavid.setCount("0000");
        assertEquals("0000", countDavid.getCount());

        //We change the account without parameters
        countNoParameters.setCount("4321");
        assertEquals("4321", countNoParameters.getCount());
    }

    /**
     * Test of getBalance method, of class CCount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");

        //count zero
        assertEquals(0, countNoParameters.getBalance(), 0);

        //balance 50
        assertEquals(50, countaDavid.getBalance(), 0);

        //name 200
        assertEquals(200, countPepe.getBalance(), 0);

       /*
          * When you want to compare floating point types (double or float),
          * needs an additional parameter to avoid rounding errors.
          * The claim is evaluated as follows:
          * Math.abs (expected – actual) <= delta
          * For example:
          * assertEquals( oneDoubleValue, anotherDoubleValue, 0.001 )
          */
     }

    /**
     * Test of setBalance method, of class CCount.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");

       // We change the balance to the David account
        countDavid.setBalance(0);
        assertEquals(0, countDavid.getBalance(), 0);

        //We change the balance to the account without parameters
        countNoParmeters.setBalance(1000.0001);
        assertEquals(1000.0001,  countNoParmeters.getBalance(), 0);
    }

    /**
     * Test of getInteres method, of class CCount.
     */
    @Test
    public void testGetInterests() {
        System.out.println("getInterests");

        //zero interest
        assertEquals(0, countNoParameters.getInterest(), 0);

        //interest 0.5
        assertEquals(0.5, countDavid.getInterests(), 0);

        //interest 1
        assertEquals(1, countPepe.getInterests(), 0);
    }

    /**
     * Test of setInteres method, of class CCount.
     */
    @Test
    public void testSetInterests() {
        System.out.println("setInterests");

        //We change the interest to the david account
        counteDavid.setInterests(0);
        assertEquals(0, countDavid.getInterests(), 0);

        //We change the interest to the account without parameters
        countNoParameters.setInterests(10.01);
        assertEquals(10.01, countNoParameters.getInterests(), 0);
    }

    /**
     * Test of PayIn method, of class CCount.
     */
    @Test
    public void testPayIn() throws Exception {
        System.out.println("Pay in ");

        //we entered 100 to the one that was empty
        countNoParameters.PayIn(100);
        assertEquals(100, countNoParameters.getBalance(), 0);

        //we entered 0 to the one that had 50
        countDavid.PayIn(0);
        assertEquals(50, countDavid.getBalance(), 0);
    }

    //The Enter case is a bit special, because it can throw an exception
     //when the amount is negative, we treat those cases with an annotation
     //special where you identify the type of exception expected.
    @Test(expected = Exception.class)
    public void testPayInExcepcion() throws Exception {
        System.out.println("enter exception");
       // try to enter a negative amount
        countPepe.PayIn(-200);
    }

    /**
     * Test of retirar method, of class CCpunt.
     */
    @Test
    public void testWithdraw() throws Exception {
        System.out.println("Withdraw");

        //Remove 0 from the one that had 50
        countDavid.Withdraw(0);
        assertEquals(50, countDavid.getBalance(), 0);

       //We withdraw 50 from the one who had 200
        countPepe.Withdraw(50);
        assertEquals(150, countPepe.getBalance(), 0);
    }

   //Same for the exception when trying to withdraw an amount greater than the balance
    @Test(expected = Exception.class)
    public void testWithdrawExcepcion() throws Exception {
        System.out.println("withdraw Excepción");
        // try to withdraw when there is no balance
        countNoParameters.Withdraw(200);
    }
}
```

These methods try to test the methods of the class`Ccount`. To do this, having the project selected, we will access the context menu and press the option `Test`.

As can be seen, the test on the withdraw method has failed, but the rest of the tests on the methods have been successful. With this information, we must verify that the test case is correctly designed, in which case, what has been found is an error in the design of the method `withdraw`,and it must be corrected. The advantage of using automated tools is that regression is facilitated, since we have designed the test case for the method, so once the withdraw method has been recoded, we can retest all the methods automatically.

# Class `Ccount`

```java
/**
 *
 * @author David Martínez (wwww.martinezpenya.es|iesmre.com)
 */
public class CCount {

    // Account class properties
    private String name;
    private String count;
    private double balance;
    private double interests;

    // Constructor with no arguments
    public CCount() {
    }

    // Constructor with parameter to initialize all properties of the class
    public CCount(String name, String count, double bal, double type) {
        name = nom;
        count = cue;
        blance = bal;
        interests = type;
    }

    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterests() {
        return interests;
    }

    public void setInterests(double interests) {
        this.interests = interests;
    }

    //Method for entering amounts into the account. Modify the balance.
    public void (double quantity) throws Exception {
        if (quantity < 0) {
            throw new Exception("A negative amount cannot be entered");
        }
        balance += quantity;
    }

    // Method for withdrawing amounts in the account. Modify the balance.
    public void payIn(double quantity) throws Exception {
        if (quantity < 0) {
            throw new Exception("A negative amount cannot be withdrawn");
        }
        if (getBalance()< quantity) {
            throw new Exception("Not enough balance");
        }
        balance = quantity;
    }
}
```

# Activities

## Junit_1

As we have right now the class `Ccount` i `CcountTest`, we have discovered a problem in the method`Withdraw`. Explain how tests are launched from Netbeans (where you see the test that is not satisfactory), justifies if the problem is in the Test or in the method `withdraw`.Make the appropriate modifications (in the test or in the method `Withdraw`) so that the test is satisfactory, explaining step by step and with screenshots how to perform the tests and they are all satisfactory.

Send the memory in PDF to the corresponding task of AULES.

## Junit_2

Modify the test methods (tests) that you consider appropriate to ensure that for each of the tests the milliseconds used in the test are printed. You have to do it as efficiently as possible, and not repeat code in each of the tests.

Send the memory in PDF to the corresponding task of AULES.

# Information sources

- https://netbeans.apache.org/kb/docs/java/junit-intro.html
- https://www.discoduroderoer.es/como-hacer-una-aplicacion-de-prueba-con-junit/
