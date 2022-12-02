public class Rental {

   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }

   public double getCharge() {
      //Adicionar o trecho de código extraído.
        double returnAmount = 0;
        
        switch (this.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    returnAmount += 2;
                    if (this.getDaysRented() > 2)
                        returnAmount += (this.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    returnAmount += this.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    returnAmount += 1.5;
                    if (this.getDaysRented() > 3)
                        returnAmount += (this.getDaysRented() - 3) * 1.5;
                    break;
                }
        return returnAmount;
   }

   public int getFrequentRenterPoints() { 
      //Adicionar o trecho de código extraído.

      int returnRenterPoints = 0;

      // add frequent renter points
      returnRenterPoints ++;
      // add bonus for a two day new release rental
      if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
         this.getDaysRented() > 1) returnRenterPoints ++;
    
      return returnRenterPoints;
   }
}