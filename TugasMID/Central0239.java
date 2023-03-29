/*
* Siti Nurfadhilah
*13020210239
*/

interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0239 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0239 obj = new Central0239();
        System.out.println("main");
        obj.aaa();
    }
}