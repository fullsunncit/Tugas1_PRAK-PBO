/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author acer
 */
public class Konversi {
    int inputcelcius;
    
    public Konversi(int inputcelcius){
        this.inputcelcius = inputcelcius;
    }
    

    void simpan(){
        System.out.println("\nSuhu dalam Celcius = " + inputcelcius + ".0° C");
        System.out.println("Dalam Fahrenheit   = " + hitungfahren() + "° F");
        System.out.println("Dalam Reamur       = " + hitungreamur() + "° R");
        System.out.println("Dalam Kelvin       = " + hitungkelvin() + "° K");
        if (inputcelcius <= 0){
            System.out.println("Kondisi Air Beku.");
        }
        else if (inputcelcius > 0 && inputcelcius < 100 ){
            System.out.println("Kondisi Air Normal.");
        }
        else if (inputcelcius >= 100){
            System.out.println("Kondisi Air Mendidih.");
        }
    }
    
    double hitungfahren(){
        return ((9 * inputcelcius) / 5) + 32;
    }
    double hitungreamur(){
        return (4 * inputcelcius) / 5;
    }
    double hitungkelvin(){
        return inputcelcius + 273.15;
    }
}




