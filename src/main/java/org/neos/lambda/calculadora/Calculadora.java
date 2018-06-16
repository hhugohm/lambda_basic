package org.neos.lambda.calculadora;

/**
 * @author Hugo Hidalgo
 *         15/06/2018
 */
public class Calculadora {

    private double operadorA;
    private double operadorB;
    private String operacion;
    private double resultado;

    public Calculadora() {
    }

    public Calculadora(double operadorA, double operadorB) {
        this.operadorA = operadorA;
        this.operadorB = operadorB;
    }

    public Calculadora(double operadorA, double operadorB, String operacion) {
        this.operadorA = operadorA;
        this.operadorB = operadorB;
        this.operacion = operacion;
    }

    public double getOperadorA() {
        return operadorA;
    }

    public void setOperadorA(double operadorA) {
        this.operadorA = operadorA;
    }

    public double getOperadorB() {
        return operadorB;
    }

    public void setOperacorB(double operadorB) {
        this.operadorB = operadorB;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public IOperacion executeOperacion() {
        return (Calculadora::execute);
    }

    private IOperationSuma sum() {
        return calculadora ->
                calculadora.getOperadorA() +
                        calculadora.getOperadorB();
    }

    private IOperationResta rest() {
        return calculadora -> calculadora.getOperadorA() -
                calculadora.getOperadorB();
    }

    private IOperationMultiplicacion mult() {
        return calculadora -> calculadora.getOperadorA() *
                calculadora.getOperadorB();
    }

    private IOperationDivision div() {
        return calculadora -> calculadora.getOperadorA() /
                calculadora.getOperadorB();
    }

    private static void execute(Calculadora calculadora) {
        switch (calculadora.getOperacion()) {
            case "+": {
                calculadora.setResultado(calculadora.sum().suma(calculadora));
                break;
            }
            case "-": {
                calculadora.setResultado(calculadora.rest().resta(calculadora));
                break;
            }
            case "*": {
                calculadora.setResultado(calculadora.mult().multiplica(calculadora));
                break;
            }
            case "/": {
                calculadora.setResultado(calculadora.div().divide(calculadora));
                break;
            }
            default: {
                break;
            }
        }
    }

}
