package ExercicioAoVivo02;

public class main {

    public static void main(String[] args) {

        char[] array1 = {'a', 'b', 'c', 'd', 'e'};
        char[] array2 = new char[5];
        char[] array3 = {'a', 'b', 'c', 'd', 'e'};
        char[] array4 = new char[5];

        for (int i = 0; i < 5; i++){
            array2[4-i] = array1[i];
        }

        System.out.println(array2);

    }




}
