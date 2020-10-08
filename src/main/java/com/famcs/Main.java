package com.famcs;
import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //default output & input filenames are output.csv and input.csv

        List companies = new ArrayList<Company>();

        try(BufferedReader buffRead = new BufferedReader(new FileReader(args[0]))) {

            String line;

            while((line = buffRead.readLine()) != null) {
                companies.add(new Company(line.split(";")));
            }

        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        catch (IOException | ParseException ioExc) {
            ioExc.printStackTrace();
        }


        try(FileWriter fWriter = new FileWriter(args[1])) {

            for(Object item : companies) {
                fWriter.write(item.toString());
                fWriter.append(System.lineSeparator());
            }

        }

        catch (IOException ioExc) {
            ioExc.printStackTrace();
        }

    }

}
