/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class FileHandler {
    
    public ArrayList<String> ReadFile(String filePath) throws IOException{
        ArrayList<String> fileContent = new ArrayList<>();
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        
        String text;
        
        while((text = br.readLine())!= null){
            String[] splitText = text.split(" ");
            for (int i=0; i<splitText.length; i++){                
                fileContent.add(splitText[i]);
            }
        }
        br.close();
        fr.close();
        
        return fileContent;
    }
}
