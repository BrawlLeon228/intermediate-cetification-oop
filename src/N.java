public class N extends C{
    public N(double value) {
        super(value);
    }



    @Override
    public double summ(C num) {
        System.out.println("Произвелось сложение " + value + " и " + num.value);
        return value + num.value;
    }

    @Override
    public double divide(C num) {
        System.out.println("Произвелось деление " + value + " на " + num.value);
        return value / num.value;
    }

    @Override
    public double multiply(C num) {
        System.out.println("Произвелось умножение " + value + " и " + num.value);
        return value * num.value;
    }
}
