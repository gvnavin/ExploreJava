package gvnavin.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        test(new Restr());
        test(new RestrWith());
    
        Collection<? extends Restr> list = getWildCardExtendsList();
        
        print_wildCard(list);
        print_wildCardExtends(list);
        
    }
    
    private static Collection<? extends Restr> getWildCardExtendsList() {
        Collection<Restr> list = new ArrayList<>();
        
        list.add(new Restr());
        
        final RestrWith restrWith = new RestrWith();
        list.add(restrWith);
        
        final RestrWith2 restrWith2 = new RestrWith2();
        list.add(restrWith2);
        return list;
    }
    
    private static void print_wildCard(final Collection<?> col) {
        for (final Object o : col) {
            System.out.println("o = " + o);
        }
    }
    
    private static void print_wildCardExtends(final Collection<? extends Restr> col) {
        for (final Restr o : col) {
            System.out.println("o = " + o);
        }
    }
    
    private static void test(final Restr re) {
        System.out.println("re.method1(); = " + re.method1());
        if (re instanceof RestrWith) {
            System.out.println("((RestrWith)re).method2() = " + ((RestrWith) re).method2());
        }
    }
    
    static class Restr {
       protected String method1() {
           System.out.println("Restr.method1");
           return "method1";
       }
   }
    
    static class RestrWith extends Restr {
        protected String method2() {
            System.out.println("B.method2");
            return "method2";
        }
    }
    
    static class RestrWith2 extends Restr {
        protected String method2() {
            System.out.println("B.method2");
            return "method2";
        }
    }
    
    
}
