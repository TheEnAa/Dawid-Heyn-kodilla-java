package com.kodilla.checkers;

import java.util.ArrayList;

public class GameBoard {
    ArrayList<String> list;

    public GameBoard() {
        list = new ArrayList<String>(10);
    }
    public void addList(){
        for(int i=0;i<10;i++)
            list.add(new ArrayList<String>(10));
    }
public static void main (String[] args){
        GameBoard board = new GameBoard();
        board.addList();
    }