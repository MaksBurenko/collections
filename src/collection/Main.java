package collection;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        int number = 0;
        List <Integer> list1 = new ArrayList();

        Scanner sc = new Scanner(System.in);

        OutputStream os = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        while (sc.hasNextInt()) {
            number = sc.nextInt();
            list1.add(number);
        }

        List <Integer> list2 = new ArrayList();

        for (int i = 0 ; i < list1.size(); i++) {
            if (i % 2 != 0){
                list2.add(list1.get(i));
            }
        }

        Collections.reverse(list2);

        for (int temp : list2) {
            bw.write(String.valueOf(temp) + " ");
        }

        sc.close();
        bw.flush();
        bw.close();
    }
}
