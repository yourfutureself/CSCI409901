public class Keypad {

    private Choice choice; //initalize before

    public Keypad(Choice choice) {
        this.choice = choice;
    }
    
    String data;
    
    public void keypadPress(String key){
        if (String.valueOf(key).matches("\n")){
            choice.setChoice(this.data);
        }else{this.data += key;}
        
    }
}
