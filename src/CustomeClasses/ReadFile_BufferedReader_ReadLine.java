/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomeClasses;

/**
 *
 * @author peter
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile_BufferedReader_ReadLine {
  public static void main(String [] args) throws IOException {
    String fileName = "C:\\Users\\peter\\Desktop\\COMPMASTER_INPUT_SOURCE\\compmaster.txt";
    FileReader fileReader = new FileReader(fileName);

    try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      String line;
      while((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
    }
  }}