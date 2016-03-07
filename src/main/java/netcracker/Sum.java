package netcracker;

import javax.ejb.Stateful;

/**
 * Created by Denis on 08.03.2016.
 */
@Stateful
public class Sum {
    private int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
