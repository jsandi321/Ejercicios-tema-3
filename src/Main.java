public class Main
{
    public static void main(String[] args) {
        //Parte 1
        /*
        Crear una funcion con tres parametros que sean numeros que se
        suman entre si y llamarla desde el main
         */
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        System.out.println(miCoche.puertas);


    }
    public int Sumar(int numA, int numB, int numC)
    {
        int resultado;
        resultado = numA + numB + numC;
        return resultado;
    }
}

class Coche
{
    //Atributos de la clase
    public int puertas = 0;

    public void AgregarPuertas()
    {
        this.puertas++;
    }
}