public class Choice{
    //initalize a choice object before keypad
    private String choiceValue;
    private Boolean availableBoolean = false;
    public void setAvailableBoolean(Boolean availableBoolean) {
        this.availableBoolean = availableBoolean;
    }
    public void setChoice(String fromKeypad){
        this.choiceValue = fromKeypad;
        checkAvailable(this.choiceValue);
    }
    public String getChoice(){
        return this.choiceValue;
    }
    private String[] names = {"chips1", "chips2", "chips3", "pop1", "pop2", "pop3"};
    private int[] stock = {5,5,5,5,5,5};
    private int[][] rowCol = {{0,0},{1,0},{2,0},{1,0},{1,1},{1,2}};

        public Boolean checkAvailable(String check){
            for(int i = 0;  i < names.length; i++){
                if(this.names[i].equals(check) && this.stock[i]>0) setAvailableBoolean(true);
            }
            return this.availableBoolean;
        }
        public void getRowCol(String check){
            for(int i = 0;  i < names.length; i++){
                if(this.names[i].equals(check) && this.stock[i]>0) setAvailableBoolean(true);
            }
        }
        public void decItem(String check){
            for(int i = 0;  i < names.length; i++){
                if(this.names[i].equals(check)) --this.stock[i];
            }
        }


    }
