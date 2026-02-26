package OOPs.Abstraction.AbstractClasses.RealisticExample;

abstract class Bank {
    String branch;
    Bank(String branch){
        this.branch = branch;
        System.out.println("Branch is " + branch);
    }
    abstract void calculateInterest();
}

class HDFC extends Bank{

    HDFC(String branch){
        super(branch);
    }

    void calculateInterest(){
        System.out.println("Interest is 10%");
    }
}

class Driver{
    public static void main(String[] args) {
        HDFC obj = new HDFC("RR Nagar");
        obj.calculateInterest();
    }
}

