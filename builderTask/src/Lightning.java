public class Lightning extends Builder {
    @Override
    public void getName() {
        elements.setName("Piorun");
    }

    @Override
    public void getIcon() {
        elements.setIcon("L");
    }

    @Override
    public void getStrongAgainst() {
        elements.setStrongAgainst("Ziemia");
    }

    @Override
    public void getWeakAgainst() {
        elements.setWeakAgainst("Wiatr");
    }
}
