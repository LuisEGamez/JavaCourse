package n3Excercise1;

public class Hombre extends Persona{

    public Hombre()  {
        try{
            //super();
            /* No podemos manejar el error que se genera en la clase base con el constructor de la clase hija, ya que la llamada a súper
            * tiene que ser la primera declaración en el constructor de la clase hija. Por lo tanto la excepción no se puede capturar, ya que
            * no está dentro del bloque try{}. La forma correcta de manejarla sería relanzar la exception en el constructor del hijo para manejarla posteriormente.
            */
        }catch (ArithmeticException ae){
            System.out.println("Manejada por la clase hija");
        }
    }
}

