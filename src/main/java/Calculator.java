public class Calculator {

    private int number1;
    private int number2;

    private double double1;
    private double double2;


    public Calculator(int number1, int number2, double double1, double double2) {
        this.number1 = number1;
        this.number2 = number2;
        this.double1 = double1;
        this.double2 = double2;
    }

    public int add() {
        return this.number1 + this.number2;
    }

    public int subtract() {
        return this.number1 - this.number2;
    }

    public int multiply() {
        return this.number1 * this.number2;
    }

    public double divide() {
        return this.double1 / this.double2;
    }
}
