package ch12_base;

public class APeople2 {

    String name;

    public APeople2() {}
    public APeople2(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof APeople2 p2) {
            if ( this.name.equals(p2.name) ) {
                return true;
            } 
        }
        return false;
    } // equals

    @Override
    public String toString() {
        return this.name;
    }

} // APeople2
