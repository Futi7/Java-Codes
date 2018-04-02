class Account {

   public String type;
   public double balance;

   public void setAccount(String typ, double blc){
     type=typ; balance=blc;
   }

   public String getType(){
     return type;
   }

   public double getBalance(){
     return balance;
   }

}

public class AccountTest1{

    public static void main (String [] args){
     
       System.out.println("Account Test");

       Account acc0=new Account();
       Account acc1=new Account();

       acc0.type="Debit";
       acc0.balance=0.0;

       System.out.println( "acc0 type : "+acc0.type);
       System.out.println( "acc0 balance  : "+acc0.balance );

       acc1.setAccount("Saving", 10.0);

       System.out.println( "acc1 type : "+acc1.type );
       System.out.println( "acc1 balance  : "+acc1.balance );


    }
}