/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AOUGASSA VIGNO
 */
public class CreationDeTableau {

     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int tableauEntier[][]= {{1,3,7,5,9,0},{6,9,7,5}},i=0,j=0;
    while(i<6)
    {
        j=0;
    while(j<5)
    {
        System.out.print(tableauEntier[i][j]);
        j++;
    }
    System.out.println(" ");
    i++;
    }
    }
}


    }
    

