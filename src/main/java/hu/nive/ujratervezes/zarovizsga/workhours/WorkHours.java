package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.*;

public class WorkHours {

    public String minWork(String file){
        String nani="";

        try(BufferedReader br = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream("workhours.txt")))) {
            for(String line; (line = br.readLine()) != null; ) {
                System.out.println(line);
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
