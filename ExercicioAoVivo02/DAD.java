package ExercicioAoVivo02;

public class DAD {

    public static void main(String[] args) {

        char[] array1 = {'a', 'b', 'c', 'd', 'e'};

        System.out.println("Os elementos invertidos são: ");
        System.out.println(inverter(array1));

    }

    public static char[] inverter(char[] array){

        char[] arrayOrig = array;

        char[] arrayInv = new char[arrayOrig.length];

        for (int i = 0; i < 5; i++){
            arrayInv[4-i] = arrayOrig[i];
        }

        return arrayInv;

    }

}