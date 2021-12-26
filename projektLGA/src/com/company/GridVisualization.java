package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;



    public class GridVisualization extends JPanel {

        public BufferedImage grid;
        public void togglePixel(int color, int x, int y) {
            //PUSTO
            if (color == 0) {
                color = Color.BLACK.getRGB();
                //GAZ
            } else if(color ==1) {
                color = Color.GREEN.getRGB();
                //SCIANA
            }else if(color ==2)
                color=Color.gray.getRGB();
            grid.setRGB(x, y, color);

        }
        public GridVisualization(int width, int height) {
            grid = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        }



        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(grid, 0, 0, this);
        }



        public void toogleMatrix(Molecule[][] array) {

            for(int i = 0; i < array.length;i++) {
                for(int j =0;j < array.length;j++){
                    togglePixel(array[i][j].state,i,j);
                }
            }

        }

    }


