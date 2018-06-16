package org.neos.lambda.calculadora;

/**
 * 
 * @author Hugo Hidalgo
 * 15/06/2018
 *
 */
public class CalculadoraTest {

	public static void main(String[] args) {
		
		Calculadora calculadora1 = new Calculadora(5,5,"+");
		calculadora1
		.executeOperacion()
		.calcula(calculadora1);
		
		Calculadora calculadora2 = new Calculadora(5,6,"-");
		calculadora2
		.executeOperacion()
		.calcula(calculadora2);
		

		Calculadora calculadora3 = new Calculadora(5,5,"*");
		calculadora3
		.executeOperacion()
		.calcula(calculadora3);
		
		Calculadora calculadora4 = new Calculadora(5,5,"/");
		calculadora4
		.executeOperacion()
		.calcula(calculadora4);
		
		System.out.println("Resultado: " + calculadora1.getResultado());
		System.out.println("Resultado: " + calculadora2.getResultado());
		System.out.println("Resultado: " + calculadora3.getResultado());
		System.out.println("Resultado: " + calculadora4.getResultado());
		
		

	}

}
