/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author welli
 */
public class Adicao extends BaseJogo{
     
     public Adicao(){
         super();this.randomNum1(); this.randomNum2();
     }
     @Override
     public void randomNum1(){
	double d = Math.random() *  (Math.pow(10,super.getNivel())) + 1;
        int n = (int) d;
	super.setNum1(n);
     }
     
    @Override
     public void randomNum2(){
	double d = Math.random() *  (Math.pow(10,super.getNivel())) + 1;
        int n = (int) d;
	super.setNum2(n);
     }
     
    @Override
     public boolean getResult(int n) {
        int resp = super.getNum1() + super.getNum2();
	if ( resp == n){
		randomNum1(); randomNum2();		
       		return true;
	}
	return false;
     } 
} 

