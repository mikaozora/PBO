/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author ASUS GAMING PC
 */
public class sepedamotor {
    public static void main(String[] args) {
        sepedamotor motor = new sepedamotor();
        motor.setMerk("");
        motor.setNama("");
    }
    private static void setMerk(String merk){
        merk = "honda";
        System.out.println("Merk motor adalah "+merk);
    }

    private static void setNama(String nama) {
        nama = "beat";
        System.out.println("Nama motor adalah " +nama);
    }
}
