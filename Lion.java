
package lab_3.pkg2;

/**
 *
 * @author sameeh boshra
 */
public class Lion  implements animal{

    private String eat;
    private int NOleg;
    
 

    public void setEat(String eat) {
        this.eat = eat;
    }

    public int getNOleg() {
        return NOleg;
    }

    public void setNOleg(int NOleg) {
        this.NOleg = NOleg;
    }
    
    @Override
    public void animal_eat(String eat) {
        eat=this.eat;
        System.out.println(eat);
    }

    @Override
    public void animal_travel(boolean b) {
        
    }
    public void print()
    {
        System.out.println(" Lion eat : " + eat);
    }
    
}
