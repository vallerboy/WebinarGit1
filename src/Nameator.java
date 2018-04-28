@FunctionalInterface
public interface Nameator {
    String getName(String s);
    default void cos() {
        System.out.println("HELLO!");
    }
}
