package lab6.part5DealingWithGeneralization.task12ReplaceDelegationWithInheritance;

public class SecurePrinter extends Printer12 {
    void printSecurely(String document) {
        System.out.println("Printing securely: " + document);
        super.print(document);
    }
}
