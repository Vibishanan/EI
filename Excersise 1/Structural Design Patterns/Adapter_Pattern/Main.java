package Adapter_Pattern;

public class Main {
    public static void main(String[] args) {
        LegacySystem legacySystem = new LegacySystem();
        NewSystemInterface adapter = new LegacySystemAdapter(legacySystem);
        
        adapter.request();
    }
}

