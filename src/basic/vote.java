package basic;

public class Vote{
    public static void main(String[] args) {
        int age=18;
        String eligibility;
        eligibility=age>17? "You can basic.vote.":"You cannot basic.vote.";
        System.out.println(eligibility);
    }
}
