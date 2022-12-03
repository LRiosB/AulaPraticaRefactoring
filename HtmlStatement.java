import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = generateResultString(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += generateFigures(each);
      }
      //add footer lines
      result += generateFooterPart1(aCustomer);
      result += generateFooterPart2(aCustomer);
      return result;
   }

    private String generateResultString(Customer aCustomer){
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
    }

    private String generateFigures(Rental each){
        return each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "<BR>\n";
    }

    private String generateFooterPart1(Customer aCustomer){
        return "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }
    private String generateFooterPart2(Customer aCustomer){
        return "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
    }
}