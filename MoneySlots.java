public class MoneySlots{

    private Balence bal;
    public MoneySlots(Balence balence){
        this.bal = balence;
    }
    public void addDollar(){
        bal.addToBalence(1.00);
    }
    public void addQuarter(){
        bal.addToBalence(0.25);
    }


}
