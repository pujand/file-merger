/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import model.FileHandler;

/**
 *
 * @author user
 */
public class FileController {
    public String GetUniqueText(){
        ArrayList<String> contents = new ArrayList<>();
        try{
         FileHandler fileHandler = new FileHandler();
        contents.addAll(fileHandler.ReadFile("D://d1.txt")); 
        }catch(IOException e){
            e.printStackTrace();
        }
        
        try{
         FileHandler fileHandler = new FileHandler();
        contents.addAll(fileHandler.ReadFile("D://d2.txt")); 
        }catch(IOException e){
            e.printStackTrace();
        }
        
        try{
         FileHandler fileHandler = new FileHandler();
        contents.addAll(fileHandler.ReadFile("D://d3.txt")); 
        }catch(IOException e){
            e.printStackTrace();
        }
        Set uniqueValues = new HashSet(contents);
        contents = new ArrayList<>(uniqueValues);
        Collections.sort(contents);
        
        return contents.toString();
    }    
    
}
