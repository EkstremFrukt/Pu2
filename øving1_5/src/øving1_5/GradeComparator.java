package øving1_5;

import java.util.Comparator;


public class GradeComparator implements Comparator<Integer>{
    
    GradeComparator(){ 
    }

    @Override
    public int compare(Integer t, Integer t1) {
        return t-t1;
    }
    
}
