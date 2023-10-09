package my_lib;

/*
setting this up as a simple static lib

because VERSION is stateful, you could set this up using the Singleton pattern

but 2 diff paths to accomplish the same thing
*/
public class MyLib {
    // assume that current version is V2
    private static final String CURRENT_VERSION = "V2";

    // but still lots of callers out there using V1
    private static String useVersion = "V1";

    // let's assume callers are V1 so it does not potentially break their code by default
    //
    public static void foo() {
        if(useVersion.equals(CURRENT_VERSION)) {
            System.out.println("Doing V2 stuff");
        } else {
            System.out.println("Doing V1 stuff");
        }
    }

    public static void setVersion(String version) {
        useVersion = version;
    }

    public static void main(String[] args) {
        MyLib.foo();
        MyLib.setVersion("V2");
        MyLib.foo();
    }
}
