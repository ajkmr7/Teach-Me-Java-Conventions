package powerpackage;

public class PowerFinder {

    private int base;
    private int power;

    public PowerFinder(int base, int power) {
        this.base = base;
        this.power = power;
    }

    public int calculatePower(){
        int result = 1;
        int exponent = power;

        while(exponent > 0){
            result *= base;
            exponent--;
        }

        return result;
    }
}
