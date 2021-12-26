package com.company;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {



        Molecule[][] moleculesArray= new Molecule[800][800];
        Molecule[][] tmpArray= new Molecule[800][800];
        for(int i=0;i< moleculesArray.length;i++)
            for(int j=0;j< moleculesArray[i].length;j++) {
                moleculesArray[i][j] = new Molecule();
                tmpArray[i][j] = new Molecule();
            }
        //ustawianie początkowych wartosci
        new SettingStartState().setStartValues(moleculesArray);


            //Losowe wartosci startowe
        new RandomCondition().setRandomCondition(moleculesArray);


//        //Wartosci testowe
//        moleculesArray[350][150].setOutRight(1); //151
//       moleculesArray[350][150].setState(1);  //151
//
//
////
//        moleculesArray[325][175].setOutDown(1);
//        moleculesArray[325][175].setState(1);
////
////        moleculesArray[375][175].setOutUp(1);
////        moleculesArray[375][175].setState(1);
////////
//   moleculesArray[350][201].setOutLeft(1);
//   moleculesArray[350][201].setState(1);




        new SettingStartState().setStartValues(tmpArray);

        GridVisualization pixelGrid = new GridVisualization(moleculesArray.length,moleculesArray.length);
        JFrame jFrame = new JFrame();
        jFrame.setPreferredSize(new Dimension(moleculesArray.length+15,moleculesArray.length+50));
        jFrame.setTitle("Michał Korzym LGA symulation");

        pixelGrid.setBorder( new MatteBorder(1, 1, 1, 1, Color.BLACK) );
        jFrame.add(pixelGrid);
        jFrame.pack();
        jFrame.setVisible(true);


        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while(true) {
            Molecule[][] resultnew = new Streaming().streamingALG(moleculesArray,tmpArray);
            pixelGrid.toogleMatrix(resultnew);
            pixelGrid.repaint();
            moleculesArray=resultnew;
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }




    }
}
