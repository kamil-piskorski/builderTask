public class Fire extends Builder {

    @Override
    public void getName() {
        elements.setName("Ogień");
    }

    @Override
    public void getIcon() {
        elements.setIcon("F");
    }

    @Override
    public void getStrongAgainst() {
        elements.setStrongAgainst("Wiatr");
    }

    @Override
    public void getWeakAgainst() {
        elements.setWeakAgainst("Woda");
    }
}
