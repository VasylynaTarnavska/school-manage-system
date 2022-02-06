package school;

public class Director extends Teacher{

    private static final int SALARY = 1500;

    public Director(String firstName, String lastName, int age, Subject subject, int balance) {
        super(firstName, lastName, age, subject, balance);
        }

    @Override
    public void receiveSalary(){
        setBalance(getBalance()+getSALARY());
        System.out.println("I`m " + getFirstName() + ". I get a salary " + getSALARY() + "$. My balance is " + getBalance());
    }

    public static int getSALARY() {
        return SALARY;
    }
}
