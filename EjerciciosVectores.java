
package practicavectores;

public class EjerciciosVectores {
    int[] numeros;

    public EjerciciosVectores() {
       numeros = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    }
    public void sumaPromedio(){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
            suma += numeros[i];
            System.out.println("La suma es: "+suma);
            double promedio = suma/numeros.length;
            System.out.println("El promedio es: "+promedio);
        }
    }
    
}
