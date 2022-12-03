import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = generateResultString(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += generateFigures(each);
      }
      //add footer lines
      result += generateFooterPart1(aCustomer);
      result += generateFooterPart2(aCustomer);
      return result;
   }

    private String generateResultString(Customer aCustomer){
        return "Rental Record for " + aCustomer.getName() +
      "\n";
    }

    private String generateFigures(Rental each){
        return "\t" + each.getMovie().getTitle()+ "\t" +
         String.valueOf(each.getCharge()) + "\n";
    }

    private String generateFooterPart1(Customer aCustomer){
        return "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }
    private String generateFooterPart2(Customer aCustomer){
        return "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
    }
}