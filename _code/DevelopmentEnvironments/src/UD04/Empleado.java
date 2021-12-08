package UD04;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|iesmre.com)
 */
public class Empleado {

    //Constantes
    /**
     * Constante SALARIO_DEF
     */
    public final static double SALARIO_DEF = 600;

    /**
     * Indica que la edad de un empleado es mayor que otro
     */
    public final static int MAYOR = 1;

    /**
     * Indica que las edades de los empleados son iguales
     */
    public final static int IGUAL = 0;

    /**
     * Indica que la edad de un empleado es menor que otro
     */
    public final static int MENOR = -1;

    //Atributos
    /**
     * Nombre del empleado
     */
    private String nombre;
    /**
     * Apellido del empleado
     */
    private String apellido;
    /**
     * Edad del empleado
     */
    private int edad;
    /**
     * Salario del empleado
     */
    private double salario;

    //Metodos publicos
    /**
     * Devuelve el nombre del empleado
     *
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el apellido del empleado
     *
     * @return apellido del empleado
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Devuelve la edad de un empleado
     *
     * @return edad del empleado
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Devuelve el salarioBase
     *
     * @return salarioBse
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Suma un plus si el empleado tiene mas de 40 años
     *
     * @param sueldoPlus
     * @return true si se realiza y false si no se realiza
     */
    public boolean plus(double sueldoPlus) {

        boolean aumento = false;
        if (edad > 40) {
            salario += sueldoPlus;
            aumento = true;
        }
        return aumento;
    }

    /**
     * Indica si dos empleados son iguales segun su nombre y apellido
     *
     * @param a empleado a comparar
     * @return true si son iguales y false si no lo son
     */
    public boolean equals(Empleado a) {
        return a.getNombre().equals(nombre) && a.getApellido().equals(apellido);
    }

    /**
     * Indica si un empleado es mayor, igual o menor que otro segun la edad
     *
     * @param a empleado a comparar
     * @return 1: mayor, 0: iguales y -1 menor que el empleado comparado
     */
    public int compareTo(Empleado a) {

        int estado = MENOR;
        if (this.edad == a.getEdad()) {
            //Los objetos son iguales
            estado = IGUAL;
        } else if (this.edad > a.getEdad()) {
            //El objeto 1 es mayor que la pasada por parametro
            estado = MAYOR;
        }
        return estado;

    }

    /**
     * Devuelve el estado del empleado
     *
     * @return estado del empleado
     */
    @Override
    public String toString() {
        String mensaje = "El empleado se llama " + nombre + " " + apellido
                + " con " + edad + " años " + "y un salario de " + salario;
        return mensaje;
    }

    //Constructores
    /**
     * Constructor por defecto
     */
    public Empleado() {
        this("", "", 0, SALARIO_DEF);
    }

    /**
     * Constructor con 2 parametros
     *
     * @param nombre nombre del empleado
     * @param apellido nombre del empleado
     */
    public Empleado(String nombre, String apellido) {
        this(nombre, apellido, 0, SALARIO_DEF);
    }

    /**
     * Constructor con 3 parametros
     *
     * @param nombre nombre del empleado
     * @param apellido nombre del empleado
     * @param edad edad del empleado
     */
    public Empleado(String nombre, String apellido, int edad) {
        this(nombre, apellido, edad, SALARIO_DEF);
    }

    /**
     * Constructor con 4 parametros
     *
     * @param nombre nombre del empleado
     * @param apellido nombre del empleado
     * @param edad edad del empleado
     * @param salario salario del empleado
     */
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
}
