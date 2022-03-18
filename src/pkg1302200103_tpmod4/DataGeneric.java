/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1302200103_tpmod4;

/**
 *
 * @author dedyh
 */
public class DataGeneric {
     private data T;
    public DataGeneric(String T) {
        this.T = new data(T);
    }
    public void printData(){
        System.out.printf("Data yang tersimpan adalah: %s",this.T.dat);
    }

    public static void main(String[] args) {
        DataGeneric x = new DataGeneric("1302200103");
        x.printData();
    }
}
