package com.campusdual.classroom;

public class Exercise05 {
    public static void main(String[] args) {

        checkLessOrGreaterEqual(3,2);
        checkMultiply(15,5);
        checkPositiveNegative(-7);
    }

    //TODO ↓
    // Si el valor es menor, tiene que devolver el siguiente mensaje: X es menor que Y
    // Si el valor es mayor o igual, tiene que devolver el siguiente mensaje: X es mayor o igual que Y
    public static void checkLessOrGreaterEqual(int n1, int n2) {
        if(n1<n2){
            System.out.println("X es menor que Y");
        }else{
            System.out.println("X es mayor o igual que Y");
        }

    }

    //TODO ↓
    // Si es múltiplo, tiene que devolver el siguiente mensaje: X es múltiplo de Y
    // Si no es múltiplo, tiene que devolver el siguiente mensaje: X no es múltiplo de Y
    public static void checkMultiply(int n1, int n2) {
        if(n1 % n2 ==0){
            System.out.println(n1+" es multiplo de "+n2);
        }else{
            System.out.println(n1+" no es multiplo de "+n2);
        }

    }

    //TODO ↓
    // Si es negativo, tiene que devolver el siguiente mensaje: X es negativo.
    // Si es positivo o cero, tiene que devolver el siguiente mensaje: X es positivo.
    public static void checkPositiveNegative(int num) {
        if(num<0){
            System.out.println(num+" es negativo.");
        }else{
            System.out.println(num+" es positivo.");
        }
    }
}
