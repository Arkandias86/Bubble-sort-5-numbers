import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Doudou on 30/06/2017.
 */
public class Tableau {

    public static void main(String[] args) {
        boolean permutation;
        int[] arrayList = new int[5];
        int nombre, i, temporary, emplacement;
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez un nombre, il y en aura 5, pressez entrée entre chacun");
        for (i = 0; i < arrayList.length; i++) {
            nombre = sc.nextInt();
            arrayList[i] = nombre;
        }
        System.out.println("Votre liste est:\n" + Arrays.toString(arrayList));

        System.out.println(("Voici votre liste triée par l'algorithme du tri a bulle:"));

        do{
            permutation = false;
            for(emplacement = 0; emplacement < arrayList.length - 1; emplacement++){
                if(arrayList[emplacement] > arrayList[emplacement+1]){
                    temporary = arrayList[emplacement];
                    arrayList[emplacement] = arrayList[emplacement+1];
                    arrayList[emplacement+1] = temporary;
                    permutation = true;
                }
            }
        }while(permutation == true);
        System.out.println(Arrays.toString(arrayList));


    }
}
