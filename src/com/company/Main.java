package com.company;
import ucn.Registro;
import ucn.ArchivoEntrada;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        ArchivoEntrada archivo = new ArchivoEntrada("notas estudiantes.txt");

        while (!archivo.isEndFile()){
            Registro registro = archivo.getRegistro();

            String nombre = registro.getString();
            double nota1 = registro.getDouble();
            double nota2 = registro.getDouble();
            double nota3 = registro.getDouble();

            double promedio = calcularPromedio(nota1,nota2,nota3);
            aprueboRepruebo(promedio);
            System.out.println(nombre);

        }
    }

    public static double calcularPromedio(double numero1, double numero2, double numero3){

        double promedio = (numero1+numero2+numero3)/3;
        return promedio;
    }

    public static void aprueboRepruebo(double promedio){
        if (promedio<4){
            System.out.println("El promedio es reprobatorio");
        }
        else{
            System.out.println("El promedio es aprobatorio");
        }
    }
}
