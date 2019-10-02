public class Trapezoid extends Quadrilateral
{
    private int height;

    public Trapezoid(int x1, int y1, int x2, int y2,int x3, int y3, int x4,int y4)
    {
        super( x1, y1, x2, y2, x3, y3, x4, y4 );
    }

    public double getHeight()
    {
        if ( getP1().getY() == getP2().getY() )
            return ( getP2().getY() - getP3().getY() );
        else
            return ( getP1().getY() - getP2().getY() );
    }

    public double getSumOfTwoSides()
    {
        if ( getP1().getY() == getP2().getY() )
            return ( getP1().getX() - getP2().getX() ) + ( getP3().getX() - getP4().getX() );
        else
            return ( getP2().getX() - getP3().getX() ) + ( getP4().getX() - getP1().getX() );
    }

    public double getArea()
    {
        return getSumOfTwoSides() * getHeight() / 2;
    }
    public String show()
    {
        return ("Area of Square = " + getArea());
    }
    
}