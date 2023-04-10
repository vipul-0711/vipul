 class Account {
    int acc;
    String name;
    float amount;

    void insert(int a,String n,float amt){
        acc=a;
        name=n;
        amount=amt;
    }
    //deposit method
     void deposit(float amt)
     {
         amount=amount+amt;
         System.out.println(amt+"deposited");

     }
     //withdraw method
     void withdrawal(float  amt){
        if(amount<amt)
        {
            System.out.println("insuffiecnt balance");

        }
        else {
            amount=amount-amt;
            System.out.println(amt+"withdrwal");
        }
     }
//method to check balance of account
     void checkbalance(){
         System.out.println("balance is"+amount);
     }
     void display(){
         System.out.println(acc +" "+ name+" "+ amount);


     }
     //creating test class to deposit AND withdraw
     class TestAccount{
         public void main(String[] args) {
             Account t1 = new Account();
             //before deposit
             t1.insert(12345, "Vipul Raj", 90000);
             t1.display();
             t1.checkbalance();
             //after deposit
             t1.deposit(2000);
             t1.checkbalance();
             //after withdrawal
             t1.withdrawal(500);
             t1.checkbalance();;

         }
         }
     }

