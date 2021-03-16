package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class WorkHours {

    public String minWork(String file){
        String nani="";
        List<Hours> hours = new LinkedList<>();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream("workhours.txt")))) {
            for(String line; (line = br.readLine()) != null; ) {
                StringTokenizer tokenizer = new StringTokenizer(line, ",");
                String n1 = tokenizer.nextToken(",").trim();
                String n2 = tokenizer.nextToken(",").trim();
                String n3 = tokenizer.nextToken(",").trim();
                Hours h = new Hours(n1,Integer.valueOf(n2),n3);
                hours.add(h);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nani;
    }

    public static void main(String[] args) {
        new WorkHours().minWork("src/test/resources/hu/nive/ujratervezes/zarovizsga/workhours/workhours.txt");
    }
}
