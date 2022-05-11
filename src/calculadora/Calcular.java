/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author mvsro
 */
public class Calcular {
    public static double calcular (Escolha escolha, double num1, double num2) throws Exception {
        if (escolha == null){ 
            throw new Exception("Não foi selecionada uma operação Valida");
        }else{
            return escolha.resolver(num1, num2);
        }
   
    }
}
