/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author abi05
 */
public class Health implements Serializable{
    private double height;
    private double weight;
    private double bmi;
    
    //デフォルトコンストラクタ
    public Health(){
        
    }
    public Health(double height, double weight){
        this.height = height;
        this.weight = weight;
    }
    

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the bmi
     */
    public double getBmi() {
        return bmi;
    }

    /**
     * @param bmi the bmi to set
     */
    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
    
    public String getBmiStr(){
        return String.format("%.1f", this.bmi);
    }
    
}
