package Livrables.LivrableOne  ;
import Boards.* ;
import Road.Road ; 
import util.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Livrable1b {

    public static void main(String[] args) {

        if (args.length != 3) {
        System.out.println("Uniquement trois parametres");
        return;
    }

        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        int nbpaths = Integer.parseInt(args[2]); 
        
        LinearBoard LinearBoard = new Boards.LinearBoard(height, width) ; 
        LinearBoard.generateRandomRoads(nbpaths) ; 

      

    }
}

