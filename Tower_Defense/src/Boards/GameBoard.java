package Boards;

import Cell.Cell;

import Road.Road;

import util.Position;

public abstract class GameBoard {

    protected Cell[][] cells  ;
    protected int height ;
    protected int width  ;

    public GameBoard(int height , int width ) {
         this.height = height ;
         this.width = width  ; 
         this.cells = new Cell[height][width] ;


    }

    public abstract void initBoard() ;

    public Cell getCell(Position p ) throws IndexOutOfBoundsException {

        if (p.getX() >= this.width || p.getX() < 0
         || p.getY() >= this.height || p.getY() < 0
        ) {
              throw new IndexOutOfBoundsException()  ;
        }
        return this.cells[p.getX()][p.getY()] ;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void displayBoard() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                if (cells[i][j].isCellPath()) {
                    System.out.print(" [X]");
                }else {
                    System.out.print(" [ ]");
                }
                        
            }
            System.out.println();
        }
    }



} 
