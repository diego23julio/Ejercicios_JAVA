/*
Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.
Segunda parte:
Crear una clase coche
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.
 */
public class Main {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 6;
        int num3 = 9;

        System.out.println("La suma es igual a "+suma(num1, num2, num3));

        Coche miCoche = new Coche();
        miCoche.PuertasCoche();

        System.out.println("Las puertas que tiene el coche son "+miCoche.num_door);


    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}
class Coche{
    public int num_door = 0;

    public void PuertasCoche(){
        this.num_door++;
    }
}
