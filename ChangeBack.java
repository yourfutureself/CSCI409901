public class ChangeBack {
    private int dollars = 0;
    private int quarters = 0;

    public ChangeBack(double amount){
        while(amount >= 0){
            if(amount>0.75){
                ++this.dollars;
                amount -= 1.00;
            }
            else{
                ++this.quarters;
                amount -= 0.25;
            }
        }
    }
}
