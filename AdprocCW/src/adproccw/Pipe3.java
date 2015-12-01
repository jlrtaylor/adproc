
package adproccw;

/**
 * Type 3 Pipe
 * 
 * @author James Taylor <up368574@myport.ac.uk>, Douglas Farr <>
 */
public class Pipe3 extends Pipe{
    
    
    /**
     * Creates a new Type 3 Pipe
     * 
     * @param length
     * @param radius
     * @param grade
     * @param chemicalResist 
     */
    public Pipe3(double length, double radius, int grade, boolean chemicalResist) {
        super(length, radius, grade, 2, false, false, chemicalResist);
        priceMultiplier = 0.17;
    }
}
