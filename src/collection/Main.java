package collection;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        int number = 0;
        List <Integer> list = new ArrayList();

        InputStream is = System.in;
        Reader r = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(r);

        OutputStream os = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        while ((number = reader.read()) != -1) {
            list.add(number);
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0 ; i <= list.size(); i++) {
            if (i % 2 == 0){
                set.add(list.get(i));
                set.add(" ");
            }
        }
        bw.write(String.valueOf(set));

        reader.close();
        bw.flush();
        bw.close();
    }
}
