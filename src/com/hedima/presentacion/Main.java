import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Crear un bloque de código que pinte las vocales y solo las vocales que existen en un array de caracteres.
        // El programa debe de ir comprobando, con un bucle, para determinar si cada carácter del array es o no una vocal.
//        char[] palabras = {'f', 'a', 'b', 'e', 't'};
//        for (int t = 0; t < palabras.length; t++) {
//            if (palabras[t] == 'a' || palabras[t] == 'e' || palabras[t] == 'o' || palabras[t] == 'i') {
//                System.out.println(palabras[t]);
//            }


            //Crear un bloque de código que lea las componentes de un array de enteros
            // y me pinte cuales son pares, cuales impares y cuales son múltiplos de tres.
            // Para este ejercicio utilizar un bucle que recorra el array y utilizar el operador %.
            int[] array = {10,5,15,25,4,56,8,98,7,45,10,12,36,5,2,4,13,12};

            for (int i= 0; i < array.length;i++) {
                if (array[i]%2==0) {
                    System.out.println("El numero es par : "+array[i]);
                }else if (array[i]%2==1) {
                    System.out.println("el numero es impar : "+array[i]);

                }
                if (array[i]%3==0) {
                    System.out.println("el numero son multiplos de tres: "+array[i]);
                }

            }

//        Dado los siguientes arrays, hacer un bloque de código que construya un array de la siguiente manera:
//        char[] cars1 = new char[]{'1','2','3','4','5','6'};
//        char[] cars2 = new char[]{'a','e','r','t','y','u'};
//        El array resultado que se debe de construir es el siguiente:
//        char[] result = new char[]{'1','a','2','e','3','r','4','t','5','y','6','u'};
            char[] cars1 = {'1','2','3','4','5','6'};
            char[] cars2 = {'a','e','r','t','y','u'};
            char[] result = new char[12];
            int iResult = 0;
                for (int a = 0;a<cars1.length;a++){
                    result[iResult]=cars1[a];
                    iResult++;
                    result[iResult]=cars2[a];
                    iResult++;
                }                 
                System.out.println("resultado es:"+ Arrays.toString(result));


    }

}
