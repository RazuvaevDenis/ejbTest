package netcracker;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by Denis on 06.02.2016.
 */

@Stateless(name="Calculate")
public class Calculate {
    public int sum(int a,int b){
        return a+b;
    }

}
