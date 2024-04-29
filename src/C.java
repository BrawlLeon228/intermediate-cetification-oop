public abstract class C {
    protected double value;

    public C(double value) {
        this.value = value;
    }

    public abstract double summ(C num);
    public abstract double multiply(C num);
    public abstract double divide(C num);
}
