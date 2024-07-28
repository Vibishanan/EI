package Adapter_Pattern;

class LegacySystemAdapter implements NewSystemInterface {
    private LegacySystem legacySystem;

    public LegacySystemAdapter(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void request() {
        legacySystem.specificRequest();
    }
}
