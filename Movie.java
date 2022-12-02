public class Movie {

  public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;

  private String _title;
  private int _priceCode;

  public Movie(String title, int priceCode) {
      _title = title;
      _priceCode = priceCode;
  }

  public int getPriceCode() {
      return _priceCode;
  }

  public void setPriceCode(int arg) {
      _priceCode = arg;
  }

  public String getTitle (){
      return _title;
  }

  public double getCharge(int daysRented){
       //Adicionar o trecho de código extraído.
        double returnAmount = 0;
        
        switch (this.getPriceCode()) {
                case Movie.REGULAR:
                    returnAmount += 2;
                    if (daysRented > 2)
                        returnAmount += (daysRented - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    returnAmount += daysRented * 3;
                    break;
                case Movie.CHILDRENS:
                    returnAmount += 1.5;
                    if (daysRented > 3)
                        returnAmount += (daysRented - 3) * 1.5;
                    break;
                }
        return returnAmount;
   }

    public int getFrequentRenterPoints(int daysRented){
       //Adicionar o trecho de código extraído.

      int returnRenterPoints = 0;

      // add frequent renter points
      returnRenterPoints ++;
      // add bonus for a two day new release rental
      if ((this.getPriceCode() == Movie.NEW_RELEASE) &&
         daysRented > 1) returnRenterPoints ++;
    
      return returnRenterPoints;
   }


          
}