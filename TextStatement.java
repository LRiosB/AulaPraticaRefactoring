import java.util.Enumeration;

public class TextStatement extends Statement {
    
    public String generateResultString(Customer aCustomer){
        return "Rental Record for " + aCustomer.getName() +
      "\n";
    }

    public String generateFigures(Rental each){
        return "\t" + each.getMovie().getTitle()+ "\t" +
         String.valueOf(each.getCharge()) + "\n";
    }

    public String generateFooterPart1(Customer aCustomer){
        return "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }
    public String generateFooterPart2(Customer aCustomer){
        return "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
    }
}