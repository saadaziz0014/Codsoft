public class Bank implements ATM {
    private int amount;

    Bank(){
        this.amount = 0;
    }

    public void withdrawAmount(int amount){
        if(amount <= 0){
            System.out.println("Please Enter Valid Amount");
        }
        else if(amount > this.amount){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Amount " + amount + " withdrawn");
            this.amount -= amount;
        }
    }

    public void depositAmount(int amount){
        if(amount <= 0){
            System.out.println("Please Enter Valid Amount");
        }
        else{
            this.amount += amount;
        }
    }

    public int checkBalance(){
        return this.amount;
    }
    
}
