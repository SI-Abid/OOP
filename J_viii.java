
class Pair {
    public int first, second;
    Pair() {
        first = second = 0;
    }
    Pair(int x, int y) {
        first=x;
        second=y;
    }
    public void swap() {
        int tmp = first;
        first = second;
        second = tmp;
    }
    public void swap(Pair o) {  //call by reference
        int tmp = first;
        first = o.first;
        o.first = tmp;
        tmp = second;
        second = o.second;
        o.second = tmp;
    }
    public void xSwap(Pair o) {
        o.swap();
        this.swap();
        this.swap(o);
    }
    public boolean isEqual(Pair o) {
        return (first == o.first && second == o.second);
    }
    public void printValue() {
        System.out.println(this+" -> First: "+first+", Second: "+second);
    }
}

public class J_viii {
    public static void main(String[] args) {
        Pair p = new Pair(4,5);
        Pair q = new Pair(8,9);

        p.printValue();
        q.printValue();

        p.swap();

        p.printValue();
        q.printValue();

        p.swap(q);

        p.printValue();
        q.printValue();

        p.xSwap(q);

        p.printValue();
        q.printValue();

    }
}
