package filter_Processor;

// Write your short report here (-2 if there is no report)

/**
 * A class to configure the SnapShop application
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SnapShopConfiguration
{
  /**
   * Method to configure the SnapShop.  Call methods like addFilter
   * and setDefaultFilename here.
   * @param theShop A pointer to the application
   */
  public static void configure(SnapShop theShop)
  {

    theShop.setDefaultFilename("/Users/markyu/Desktop/Oxygen/ImageProcessor/src/filter_Processor/seattle.jpg");
    theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");
    theShop.addFilter(new FlipVerticalFilter(),"Flip Vertical" );
    theShop.addFilter(new NegativeFilter(), "Negative Filter");
    // add your other filters below
    theShop.addFilter(new GaussianFilter(),"Guassian");
    theShop.addFilter(new EdgyFilter(), "Edgy");
    theShop.addFilter(new UnsharpMasking(), "Unsharp Masking");
    theShop.addFilter(new LaplacianFilter(),"Laplacian");
  }
}
