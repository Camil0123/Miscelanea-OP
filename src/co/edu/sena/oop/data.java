package co.edu.sena.oop;

public class data {

    //Metodos o Funciones

    public Double areaTriangulo(double num1, double num2) {
        return (num1 * num2) / 2;
    };
    public Double sumaNumeros(double num1, double num2) {
        return num1 + num2;
    };

    public Double numeroAlCuadrado(double num1) {
        return num1*num1;
    };

    public Double conversionEuros(double num1) {
        return num1*1.08512;
    };

    public Double areaCuadrado(double num1) {
        return num1*num1;
    };

    public Double perimetroCuadrado(double num1) {
        return num1*4;
    };

    public Double areaCilindro(double num1, double num2) {
        return (2*3.14*num1)*(num1+num2);
    };

    public Double volumenCilindro(double num1, double num2) {
        return 3.14*(num1*num1)*num2;
    };

    public Double longitudCircunferencia(double num1) {
        return (num1+num1)*3.14;
    };

    public Double areaCircunferencia(double num1) {
        return (num1*num1)*3.14;
    };

    public Double promedioNumeros(double num1, double num2, double num3) {
        return (num1+num2+num3)/3;
    };

}
