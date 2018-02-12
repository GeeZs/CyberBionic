package JavaEssential.ClassObject.App002;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 199.03f, "QWERTY12345");
        Device monitor = new Monitor("Samsung", 199.03f, "QWERTY12345", 13,14);
        Device ethernetAdapter = new EthernetAdapter("Samsung", 199.03f, "QWERTY12345", 220, "e.g. 01-23-45-67-89-ab");
        System.out.println(device.toString());
        System.out.println(monitor.toString());
        System.out.println(ethernetAdapter.toString());
    }
}
