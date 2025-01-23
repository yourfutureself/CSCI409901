public class Balence {
    private double sum = 0;

    public int getSum() {
        return this.sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    public void addToBalence(int add){
        this.sum += add;
    }
}
