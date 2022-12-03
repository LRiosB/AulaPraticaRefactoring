import java.util.Enumeration;

public abstract class Statement {
    
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

    abstract String generateResultString(Customer aCustomer);
    abstract String generateFigures(Rental each);
    abstract String generateFooterPart1(Customer aCustomer);
    abstract String generateFooterPart2(Customer aCustomer);
}