public class Wind extends Builder {
    @Override
    public void getName() {
        elements.setName("Wiatr");
    }

    @Override
    public void getIcon() {
        elements.setIcon("~~~");
    }

    @Override
    public void getStrongAgainst() {
        elements.setStrongAgainst("Piorun");
    }

    @Override
    public void getWeakAgainst() {
        elements.setWeakAgainst("Ogień");
    }
}
