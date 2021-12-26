package com.company;

public class Colision {


    public void colisionResult(Molecule molecule,Molecule[] neighbours)
    {


            if(molecule.getInUp()==1&&molecule.getInDown()==1&&molecule.getInLeft()==0&&molecule.getInRight()==0) {

                molecule.setOutLeft(1);
                molecule.setOutRight(1);
                molecule.setOutUp(0);
                molecule.setOutDown(0);
                molecule.setInUp(0);
                molecule.setInDown(0);
                molecule.setState(0);
            }

            else  if((molecule.getInLeft()==1&&molecule.getInRight()==1&&molecule.getInUp()==0&&molecule.getInDown()==0)) {

                molecule.setOutUp(1);
                molecule.setOutDown(1);
                molecule.setOutLeft(0);
                molecule.setInLeft(0);
                molecule.setInRight(0);
                molecule.setOutRight(0);
                molecule.setState(0);

            }
//            //nieparzyste gora dol
//            else if((molecule.getInDown()==1&&neighbours[1].getInUp()==1&&molecule.getInLeft()==0&&neighbours[2].getInRight()==0))
//            {
//                neighbours[1].setInUp(0);
//                molecule.setOutLeft(1);
//                molecule.setOutRight(1);
//                molecule.setOutUp(0);
//                molecule.setOutDown(0);
//                molecule.setInUp(0);
//                molecule.setInDown(0);
//                molecule.setState(0);
//            }
//            //nieparzyste lewo/prawo
//            else if(molecule.getInLeft()==1&&neighbours[2].getInRight()==1&&molecule.getInUp()==0&&neighbours[3].getInDown()==0)
//            {
//                molecule.setOutUp(1);
//                molecule.setOutDown(1);
//                molecule.setOutLeft(0);
//                neighbours[2].setInRight(0);
//                molecule.setInLeft(0);
//                molecule.setInRight(0);
//                molecule.setOutRight(0);
//                molecule.setState(0);
//
//            }
//
//    //nieparzyste prawo/lewo
//       else if(molecule.getInRight()==1&&neighbours[0].getInLeft()==1&&molecule.getInDown()==0&&neighbours[1].getInUp()==0) {
//                molecule.setOutUp(1);
//                molecule.setOutDown(1);
//                molecule.setOutLeft(0);
//                neighbours[0].setInLeft(0);
//                molecule.setInLeft(0);
//                molecule.setInRight(0);
//                molecule.setOutRight(0);
//                molecule.setState(0);
//
//        //nieparzyste gora/dol
//            }else if((molecule.getInUp()==1&&neighbours[3].getInDown()==1&&molecule.getInRight()==0&&neighbours[0].getInLeft()==0))
//            {
//                neighbours[3].setInDown(0);
//                molecule.setOutLeft(1);
//                molecule.setOutRight(1);
//                molecule.setOutUp(0);
//                molecule.setOutDown(0);
//                molecule.setInUp(0);
//                molecule.setInDown(0);
//                molecule.setState(0);
//
//// proba
//            }else if((molecule.getInUp()==1&&neighbours[3].getInDown()==1&&molecule.getInRight()==1&&neighbours[0].getInLeft()==1))
//            {
//                neighbours[3].setInDown(0);
//                neighbours[0].setInLeft(0);
//                molecule.setOutUp(molecule.getInDown());
//                molecule.setOutDown(1);
//                molecule.setOutRight(molecule.getInLeft());
//                molecule.setOutLeft(1);
//                molecule.setState(1);
//
//            } else if(molecule.getInRight()==1&&neighbours[0].getInLeft()==1&&molecule.getInDown()==1&&neighbours[3].getInUp()==1) {
//
//                neighbours[0].setInLeft(0);
//                neighbours[3].setInUp(0);
//                molecule.setOutUp(1);
//                molecule.setOutDown(molecule.getInUp());
//                molecule.setOutRight(molecule.getInLeft());
//                molecule.setOutLeft(1);
//                molecule.setState(1);
//
//
//            }
//            else if(molecule.getInLeft()==1&&neighbours[2].getInRight()==1&&molecule.getInUp()==1&&neighbours[1].getInDown()==1)
//            {
//                neighbours[2].setInRight(0);
//                neighbours[1].setInDown(0);
//                molecule.setOutUp(molecule.getInDown());
//                molecule.setOutDown(1);
//                molecule.setOutRight(1);
//                molecule.setOutLeft(molecule.getInRight());
//                molecule.setState(1);
//            }
//            else if((molecule.getInDown()==1&&neighbours[1].getInUp()==1&&molecule.getInLeft()==1&&neighbours[2].getInRight()==1))
//            {
//                neighbours[1].setInUp(0);
//                neighbours[2].setInRight(0);
//                molecule.setOutUp(1);
//                molecule.setOutDown(molecule.getInUp());
//                molecule.setOutRight(1);
//                molecule.setOutLeft(molecule.getInRight());
//                molecule.setState(1);
////wszystkie nieparzyste
//            }else if((neighbours[1].getInUp()==1&&neighbours[3].getInDown()==1&&neighbours[2].getInRight()==1&&neighbours[0].getInLeft()==1)) {
//                neighbours[3].setInDown(0);
//                neighbours[1].setInUp(0);
//                neighbours[0].setInLeft(0);
//                neighbours[2].setInRight(0);
//                molecule.setOutLeft(1);
//                molecule.setOutRight(1);
//                molecule.setOutUp(1);
//                molecule.setOutDown(1);
//                molecule.setOutUp(0);
//                molecule.setOutDown(0);
//                molecule.setInUp(0);
//                molecule.setInDown(0);
//                molecule.setState(0);

//wszystkie parzyste
            else if((molecule.getInLeft()==1&&molecule.getInRight()==1&&molecule.getInUp()==1&&molecule.getInDown()==1)) {
                molecule.setOutUp(molecule.getInDown());
                molecule.setOutDown(molecule.getInUp());
                molecule.setOutRight(molecule.getInLeft());
                molecule.setOutLeft(molecule.getInRight());
                molecule.setState(1);


            }

            else if((molecule.getInLeft()==1||molecule.getInRight()==1||molecule.getInUp()==1||molecule.getInDown()==1)) {
                molecule.setOutUp(molecule.getInDown());
                molecule.setOutDown(molecule.getInUp());
                molecule.setOutRight(molecule.getInLeft());
                molecule.setOutLeft(molecule.getInRight());
                molecule.setState(1);


            }else {

                molecule.setOutUp(molecule.getInUp());
                molecule.setOutDown(molecule.getInUp());
                molecule.setOutRight(molecule.getInLeft());
                molecule.setOutLeft(molecule.getInRight());
                molecule.setState(0);
            }

    }





    public void colisionWithWall(Molecule molecule)
    {

        if(molecule.getOutUp()==1)
        {
            molecule.setOutDown(1);
            molecule.setOutUp(0);
            molecule.setInDown(0);
            molecule.setState(1);

        }else if(molecule.getOutDown()==1)
        {
            molecule.setOutDown(0);
            molecule.setOutUp(1);
            molecule.setInUp(0);
            molecule.setState(1);

        }else if(molecule.getOutLeft()==1)
        {
            molecule.setOutLeft(0);
            molecule.setOutRight(1);
            molecule.setInRight(0);
            molecule.setState(1);


        }else if(molecule.getOutRight()==1) {
            molecule.setOutRight(0);
            molecule.setOutLeft(1);
            molecule.setInLeft(0);
            molecule.setState(1);
        }










    }





}




