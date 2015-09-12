package view;

import controller.FileController;
import java.io.IOException;
import model.FileHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {
    public static void main(String arg[]){
        FileController fileController = new FileController();
        System.out.println("Unique text: "+ fileController.GetUniqueText());
    }
}
