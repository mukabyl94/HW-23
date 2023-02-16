import java.util.*;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] intMassive = new int[10];
        for (int i = 0; i < intMassive.length; i++) {
            intMassive[i] = random.nextInt(0,2);
//           System.out.println(intMassive[i]);
        }
        findMinMax(intMassive);



        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(0,2));
        }
        System.out.println();
        findMinMax(integers);



        LinkedList<Integer> integers1 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            integers1.add(random.nextInt(0,2));
        }
        System.out.println();
        findMinMax(integers1);

    }
    public static void findMinMax(int[] array){
        for (int i = 0; i < array.length; i++) {
            int sun = array[i];
            int sun2 = i;
            for (int j =i+1; j < array.length; j++) {
                if (array[j]<sun){
                    sun = array[j];
                    sun2 = j;
                }
            }
            if (i!=sun2){
                int tmp = array[i];
                array[i]=array[sun2];
                array[sun2]=tmp;
            }
            System.out.print(array[i] + " ");
        }
    }
    public static void findMinMax(ArrayList<Integer> integers){
        Collections.sort(integers);
        System.out.println(integers);
    }
    public static void findMinMax(LinkedList<Integer> integers){
        Collections.sort(integers);
        System.out.println(integers);
    }

}