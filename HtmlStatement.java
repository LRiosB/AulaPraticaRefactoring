import java.util.Enumeration;

public class HtmlStatement extends Statement {
    
    public String generateResultString(Customer aCustomer){
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
    }

    public String generateFigures(Rental each){
        return each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "<BR>\n";
    }

    public String generateFooterPart1(Customer aCustomer){
        return "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }
    public String generateFooterPart2(Customer aCustomer){
        return "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
    }
}