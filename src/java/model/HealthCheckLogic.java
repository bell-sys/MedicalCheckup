/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author abi05
 */
public class HealthCheckLogic {
    public void execute(Health health){
        //BMIを算出して設定
        double height = health.getHeight();
        double weight = health.getWeight();
        double bmi = weight / (height / 100.0 * height / 100.0);
        
        health.setBmi(bmi);
    }
}
