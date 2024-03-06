package co.edu.sena.oop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;
        double numero4 = 0;

        int opcion;

        data data = new data();


        System.out.println( "Misceláe de Ejercicios OOP Java");
        System.out.println( "-------------------------------");
        System.out.println( "Menú Principal");
        System.out.println( "1. Operadores");
        System.out.println( "2. Condicionales");
        System.out.println( "3. Ciclos");
        System.out.println( "4. Arreglos");
        System.out.println( "99. Salir");
        System.out.println( "Ingrese una opción");

        //manipulacion Menú Principal

        opcion = scr.nextInt();
        switch (opcion) {
            case 1: {
                // Sub Menú Operadores
                System.out.println("Categoría Operadores");
                System.out.println("1. Calcular área triángulo");
                System.out.println("2. Sumar dos números");
                System.out.println("3. Número al cuadrado");
                System.out.println("4. Conversión de Euro a Dolar");
                System.out.println("5. Área y perimetro de un cuadrado");
                System.out.println("6. Área y Volumen de un cilindro");
                System.out.println("7. Longitud y área del círculo");
                System.out.println("8. Promedio de 3 números");
                System.out.println( "99. Salir");
                System.out.println("Digite su opción:");
                opcion = scr.nextInt();
                switch (opcion) {
                    case 1:
                    {
                        System.out.println("----------------------------");
                        System.out.println("1. Calcular el área de un triangulo");
                        System.out.println("Ingrese la base");
                        numero1 = scr.nextDouble();
                        System.out.println("Ingrese la altura");
                        numero2 = scr.nextDouble();
                        System.out.println("El área del triángulo es: " + data.areaTriangulo(numero1, numero2));
                    };
                    break;
                    case 2:
                    {
                        System.out.println("----------------------------");
                        System.out.println("Sumar los números");
                        System.out.println("Ingrese el primer número");
                        numero1 = scr.nextDouble();
                        System.out.println("Ingrese el segundo número");
                        numero2 = scr.nextDouble();
                        System.out.println("El resultado es: " + data.sumaNumeros(numero1, numero2));
                    };
                    break;
                    case 3:
                    {
                        System.out.println("----------------------------");
                        System.out.println("Número al cuadrado");
                        System.out.println("Ingrese el número");
                        numero1 = scr.nextDouble();
                        System.out.println("El resultado es:" + data.numeroAlCuadrado(numero1));
                    };
                    break;
                    case 4:
                    {
                        System.out.println("----------------------------");
                        System.out.println("Conversión de Euro a Dolar");
                        System.out.println("Ingrese la cantidad de Euros");
                        numero1 = scr.nextDouble();
                        System.out.println("La cantidad de dolares es:" + data.conversionEuros(numero1));
                    };
                    break;
                    case 5:
                    {
                        System.out.println("----------------------------");
                        System.out.println("Área y perimetro de un cuadrado");
                        System.out.println("Ingrese el lado del cuadrado");
                        numero1 = scr.nextDouble();
                        System.out.println("El área del cuadrado es: " + data.areaCuadrado(numero1) + " y el perimetro " + data.perimetroCuadrado(numero1));
                    };
                    break;
                    case 6:
                    {
                        System.out.println("----------------------------");
                        System.out.println("Área y Volumen de un cilindro");
                        System.out.println("Ingrese el radio del cilindro");
                        numero1 = scr.nextDouble();
                        System.out.println("Ingrese la altura del cilindro");
                        numero2 = scr.nextDouble();
                        System.out.println("El área del cilindro es: " + data.areaCilindro(numero1, numero2) + " y el volumen es " + data.volumenCilindro(numero1,numero2));
                    };
                    break;
                    case 7:
                    {
                        System.out.println("----------------------------");
                        System.out.println("Longitud y área del círculo");
                        System.out.println("Ingrese el radio de la circunferencia");
                        numero1 = scr.nextDouble();
                        System.out.println("La longitud de la circunferencia es: " + data.longitudCircunferencia(numero1) + " y el área es " + data.areaCircunferencia(numero1));
                    };
                    break;
                    case 8:
                    {
                        System.out.println("----------------------------");
                        System.out.println("Promedio de 3 números");
                        System.out.println("Ingrese el primer número");
                        numero1 = scr.nextDouble();
                        System.out.println("Ingrese el segundo número");
                        numero2 = scr.nextDouble();
                        System.out.println("Ingrese el tercer número");
                        numero3 = scr.nextDouble();
                        System.out.println("El promedio de los tres números es: " + data.promedioNumeros(numero1, numero2, numero3));
                    };
                    case 99:
                    {
                        System.out.println("Finalizado");
                    };
                            break;
                    default: System.out.println("Finalizado");
                };
            };
            case 2: {}; break;
            case 3: {}; break;
            case 4: {}; break;
            case 99:
            {
                System.out.println( "99. Finalizado");
            }; break;

        };
    }
}
