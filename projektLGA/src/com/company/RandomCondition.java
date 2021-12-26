package com.company;

import java.util.Random;

public class RandomCondition {


    public void setRandomCondition(Molecule[][] moleculesArray) {
        Random generator = new Random();
        double possibility ;

        for(int i=0;i< moleculesArray.length;i++){
            for(int j=0;j< moleculesArray[i].length;j++) {
                if (j> 11 && j < moleculesArray.length - 12 & i > 11 && i < moleculesArray.length / 4-1) {
                    possibility = generator.nextDouble();
                    //System.out.println(possibility);
                    if (possibility < 0.90) {
                        moleculesArray[i][j].setState(0);
                        moleculesArray[i][j].setOutDown(0);
                        moleculesArray[i][j].setOutUp(0);
                        moleculesArray[i][j].setOutLeft(0);
                        moleculesArray[i][j].setOutRight(0);
                    } else {
                        moleculesArray[i][j].setState(1);
                        possibility = generator.nextDouble();
                        if(possibility<0.25)
                        moleculesArray[i][j].setOutLeft(1);
                        if(possibility>=0.25&&possibility<0.5)
                            moleculesArray[i][j].setOutUp(1);
                        if(possibility>=0.5&&possibility<0.75)
                            moleculesArray[i][j].setOutRight(1);
                        if(possibility>=0.75)
                            moleculesArray[i][j].setOutDown(1);
                    }

                    }
                }
            }




    }

}
