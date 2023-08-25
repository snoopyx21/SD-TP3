import org.omg.CORBA.* ;

public class ICouleurImpl
  extends _ICouleurImplBase
{
  public double r, g, b ;

  public ICouleurImpl()
  {
    super() ;
  } ;

  public void setColorRGB (double red, double green, double blue)
  {
    r = red ;
    g = green ;
    b = blue ;
  }

  public double getLuminance ()
  {
    return 0.2126 * r + 0.7152 * g + 0.0722 * b ;
  }
}
