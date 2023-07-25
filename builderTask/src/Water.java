public class Water extends Builder {
    @Override
    public void getName() {
        elements.setName("Woda");
    }

    @Override
    public void getIcon() {
        elements.setIcon("W");
    }

    @Override
    public void getStrongAgainst() {
        elements.setStrongAgainst("Ogień");
    }

    @Override
    public void getWeakAgainst() {
        elements.setWeakAgainst("Ziemia");
    }
}
