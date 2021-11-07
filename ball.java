
package lab.pkg3.pkg1;

/**
 *
 * @author sameeh boshra
 */
public class ball implements tossable {
    private String brandName;

    public String getBrandName() {
        return brandName;
    }

    public void Ball(String brandName) {
        this.brandName = brandName;
    }
    

    @Override
    public void toss() {
    }
    
    public void bounce()
    {
        
    }
}

