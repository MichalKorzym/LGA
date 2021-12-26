package com.company;

import java.util.Arrays;

public class Streaming {




    public Molecule[][] streamingALG(Molecule[][] moleculeArray,Molecule[][] arrayNextTimeStep) {


        for (int i = 0; i < moleculeArray.length; i++) {
            for (int j = 0; j < moleculeArray[i].length; j++) {
                    if(moleculeArray[i][j].getState()!=2) {

                        if(moleculeArray[i+1][j].getState()==2)
                        {
                            arrayNextTimeStep[i][j].setInUp(moleculeArray[i - 1][j].getOutDown());
                            arrayNextTimeStep[i][j].setInDown(0);
                            arrayNextTimeStep[i][j].setInLeft(moleculeArray[i][j - 1].getOutRight());
                            arrayNextTimeStep[i][j].setInRight(moleculeArray[i][j + 1].getOutLeft());
                            arrayNextTimeStep[i][j].setState(moleculeArray[i][j].getState());


                        }else if((moleculeArray[i-1][j].getState()==2))
                        {
                            arrayNextTimeStep[i][j].setInUp(0);
                            arrayNextTimeStep[i][j].setInDown(moleculeArray[i + 1][j].getOutUp());
                            arrayNextTimeStep[i][j].setInLeft(moleculeArray[i][j - 1].getOutRight());
                            arrayNextTimeStep[i][j].setInRight(moleculeArray[i][j + 1].getOutLeft());
                            arrayNextTimeStep[i][j].setState(moleculeArray[i][j].getState());



                        }else if(moleculeArray[i][j-1].getState()==2)
                        {
                            arrayNextTimeStep[i][j].setInUp(moleculeArray[i - 1][j].getOutDown());
                            arrayNextTimeStep[i][j].setInDown(moleculeArray[i + 1][j].getOutUp());
                            arrayNextTimeStep[i][j].setInLeft(0);
                            arrayNextTimeStep[i][j].setInRight(moleculeArray[i][j + 1].getOutLeft());
                            arrayNextTimeStep[i][j].setState(moleculeArray[i][j].getState());


                        }else if(moleculeArray[i][j+1].getState()==2)
                        {
                            arrayNextTimeStep[i][j].setInUp(moleculeArray[i - 1][j].getOutDown());
                            arrayNextTimeStep[i][j].setInDown(moleculeArray[i + 1][j].getOutUp());
                            arrayNextTimeStep[i][j].setInLeft(moleculeArray[i][j - 1].getOutRight());
                            arrayNextTimeStep[i][j].setInRight(0);
                            arrayNextTimeStep[i][j].setState(moleculeArray[i][j].getState());


                        }else
                        {


                            arrayNextTimeStep[i][j].setInUp(moleculeArray[i - 1][j].getOutDown());
                            arrayNextTimeStep[i][j].setInDown(moleculeArray[i + 1][j].getOutUp());
                            arrayNextTimeStep[i][j].setInLeft(moleculeArray[i][j - 1].getOutRight());
                            arrayNextTimeStep[i][j].setInRight(moleculeArray[i][j + 1].getOutLeft());
                            arrayNextTimeStep[i][j].setState(moleculeArray[i][j].getState());




                        }


                }

            }

        }
        for (int i = 0; i < arrayNextTimeStep.length; i++) {
            for (int j = 0; j < arrayNextTimeStep[i].length; j++) {
                if(arrayNextTimeStep[i][j].getState()!=2) {
                    Molecule[] neighoburs={arrayNextTimeStep[i][j-1],arrayNextTimeStep[i+1][j],arrayNextTimeStep[i][j+1],arrayNextTimeStep[i-1][j]};
                    new Colision().colisionResult(arrayNextTimeStep[i][j],neighoburs);
                }
                if ((i == 11) || (j == 11)
                        || (i == arrayNextTimeStep.length / 4 - 1 && (j <= arrayNextTimeStep.length / 4 - 1 || j >= (arrayNextTimeStep.length / 4) + 101)) ||
                        ((i == arrayNextTimeStep.length / 4 + 11) && (j <= arrayNextTimeStep.length / 4 - 1 || j >= (arrayNextTimeStep.length / 4) + 101))
                        || (i == (arrayNextTimeStep.length) - 12) ||
                        (j == (arrayNextTimeStep.length) - 12)
                        || ((i >= arrayNextTimeStep.length / 4 && i <= (arrayNextTimeStep.length / 4) + 10) && j == arrayNextTimeStep.length / 4 - 1)
                        || (i >= arrayNextTimeStep.length / 4 && i <= (arrayNextTimeStep.length / 4) + 10) && j == arrayNextTimeStep.length / 4 + 101)
                            new Colision().colisionWithWall(arrayNextTimeStep[i][j]);


            }
        }

        int k,l,m,n,o,p,b,v,h,g,y,t;

        k=350;
        l=175;
        m=349;
        n=175;
        o=351;
        p=175;
        b=350;
        v=176;
        y=350;
        t=174;
//
//            System.out.println("350 175 IN UP DOWN LEFT RIGT "+arrayNextTimeStep[k][l].getInUp()+" "+arrayNextTimeStep[k][l].getInDown()+" "+arrayNextTimeStep[k][l].getInLeft()+" "+arrayNextTimeStep[k][l].getInRight());
//            System.out.println("350 175 OUT UP DOWN LEFT RIGT "+arrayNextTimeStep[k][l].getOutUp()+" "+arrayNextTimeStep[k][l].getOutDown()+" "+arrayNextTimeStep[k][l].getOutLeft()+" "+arrayNextTimeStep[k][l].getOutRight());
//
//            System.out.println("349 175 IN UP DOWN LEFT RIGT "+arrayNextTimeStep[m][n].getInUp()+" "+arrayNextTimeStep[m][n].getInDown()+" "+arrayNextTimeStep[m][n].getInLeft()+" "+arrayNextTimeStep[m][n].getInRight());
//            System.out.println("349 175 OUT UP DOWN LEFT RIGT "+arrayNextTimeStep[m][n].getOutUp()+" "+arrayNextTimeStep[m][n].getOutDown()+" "+arrayNextTimeStep[m][n].getOutLeft()+" "+arrayNextTimeStep[m][n].getOutRight());
//
//            System.out.println("351 175 IN UP DOWN LEFT RIGT "+arrayNextTimeStep[o][p].getInUp()+" "+arrayNextTimeStep[o][p].getInDown()+" "+arrayNextTimeStep[o][p].getInLeft()+" "+arrayNextTimeStep[o][p].getInRight());
//            System.out.println("351 175 OUT UP DOWN LEFT RIGT "+arrayNextTimeStep[o][p].getOutUp()+" "+arrayNextTimeStep[o][p].getOutDown()+" "+arrayNextTimeStep[o][p].getOutLeft()+" "+arrayNextTimeStep[o][p].getOutRight());
//
//            System.out.println("350 176 IN UP DOWN LEFT RIGT "+arrayNextTimeStep[b][v].getInUp()+" "+arrayNextTimeStep[b][v].getInDown()+" "+arrayNextTimeStep[b][v].getInLeft()+" "+arrayNextTimeStep[b][v].getInRight());
//        System.out.println("350 176 OUT UP DOWN LEFT RIGT "+arrayNextTimeStep[b][v].getOutUp()+" "+arrayNextTimeStep[b][v].getOutDown()+" "+arrayNextTimeStep[b][v].getOutLeft()+" "+arrayNextTimeStep[b][v].getOutRight());
//
//        System.out.println("350 174 IN UP DOWN LEFT RIGT "+arrayNextTimeStep[y][t].getInUp()+" "+arrayNextTimeStep[y][t].getInDown()+" "+arrayNextTimeStep[y][t].getInLeft()+" "+arrayNextTimeStep[y][t].getInRight());
//        System.out.println("350 174 OUT UP DOWN LEFT RIGT "+arrayNextTimeStep[y][t].getOutUp()+" "+arrayNextTimeStep[y][t].getOutDown()+" "+arrayNextTimeStep[y][t].getOutLeft()+" "+arrayNextTimeStep[y][t].getOutRight());

//        System.out.println("329 IN UP DOWN LEFT RIGT "+arrayNextTimeStep[350][154].getInUp()+" "+arrayNextTimeStep[350][154].getInDown()+" "+arrayNextTimeStep[350][154].getInLeft()+" "+arrayNextTimeStep[350][154].getInRight());
//        System.out.println("329 OUT UP DOWN LEFT RIGT "+arrayNextTimeStep[350][154].getOutUp()+" "+arrayNextTimeStep[350][154].getOutDown()+" "+arrayNextTimeStep[350][154].getOutLeft()+" "+arrayNextTimeStep[350][154].getOutRight());
//
        int sum=0;
        for (int i = 0; i < arrayNextTimeStep.length; i++)
            for (int j = 0; j < arrayNextTimeStep[i].length; j++)
        if(arrayNextTimeStep[i][j].getState()==1)
            sum++;

        System.out.println(sum);

        return arrayNextTimeStep;
    }

    }






