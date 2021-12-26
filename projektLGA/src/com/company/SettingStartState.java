package com.company;

public class SettingStartState {

    int[] valuesWall={0,0,0,0};


    public void setStartValues(Molecule[][] gasArray)
    {
        for(int i=0;i< gasArray.length;i++) {
            for (int j = 0; j < gasArray.length; j++) {
                if ((i >= 0 && i <= 10) || (j >= 0 && j <= 10)
                        || (i >= gasArray.length/4 && i <= (gasArray.length/4)+10 )
                        || (i >= (gasArray.length) - 11)&&(i<=(gasArray.length)-1)||
                        (j >= (gasArray.length) - 11)&&(j<=(gasArray.length)-1)
                      ) {

                        setInValues(gasArray[i][j]);
                    setOutValues(gasArray[i][j]);
                    gasArray[i][j].setState(2);

                } else {
                    setInValues(gasArray[i][j]);
                    setOutValues(gasArray[i][j]);
                    gasArray[i][j].setState(0);

                }



                    }
                }

        for(int i=0;i< gasArray.length;i++)
            for (int j = 0; j < gasArray.length; j++)
        if( (i >= gasArray.length/4 && i <= (gasArray.length/4)+10 )&&j >= gasArray.length/4 && j <= (gasArray.length/4)+100 )
            gasArray[i][j].state = 0;






            }


            public void setInValues(Molecule molecule)
            {
                molecule.setInUp(0);
                molecule.setInDown(0);
                molecule.setInDown(0);
                molecule.setInDown(0);

            }


    public void setOutValues(Molecule molecule)
    {
        molecule.setOutUp(0);
        molecule.setOutDown(0);
        molecule.setOutDown(0);
        molecule.setOutDown(0);

    }

          }





