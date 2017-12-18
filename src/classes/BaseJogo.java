/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author welli
 */
public abstract class BaseJogo{
      private static int nivel;
      private static int acertos, erros;
      private int num1,num2;
      private String barra;
      public abstract boolean getResult(int n); // a classe filha vai implementar
      public abstract void randomNum1();
      public abstract void randomNum2();
      
      /*
        Construtor que inicializa algumas variaveis;
      */
      BaseJogo(){
	nivel = 1;
	acertos = 0;
        erros = 0;
	barra = "";
      }         
      
      /*
        Exibe uma mensagem de fim de jogo
      */
      public void fimDeJogo(){
	if (acertos == 30){
            this.barra = " ";
            JOptionPane.showMessageDialog(null, "Você venceu!");
        }
        
	if (this.barra.equals(" ")){
        this.barra = " ";
        JOptionPane.showMessageDialog(null, "Fim de jogo, perdedor!");
        }
      }
      
      public String incrementaBarra(){
        if (barra.length() < 45){
		this.barra = this.barra + "=";
	}
        else{
            this.barra = " ";
        }
	return this.barra;
      }

      private void sobeNivel(){
	this.acertos += 1;
	if (acertos == 10 || acertos == 25) nivel+=1;
     }

      public String decrementaBarra(){
	if (barra.length() >= 8){
		this.barra = barra.substring(0,barra.length()-8);
	}
        else{
            this.barra = "=";
        }
	sobeNivel();
	return this.barra;
      }
      
      public int getNum1(){
	return num1;
      }
      public int getNum2(){
	return num2;
      }

      public void setNum1(int n) {num1 = n;}
      public void setNum2(int n) {num2 = n;}

      public int getNivel(){
	return this.nivel;
      }
      public int getAcertos(){ return this.acertos;}
      public int getErros(){return this.erros;}
      public void setErros(){this.erros = this.erros + 1;};
} 

