public class Earth extends Builder {
    public Earth(){};
    @Override
    public void getName(){
        elements.setName("Ziemia");
    }

    @Override
    public void getIcon() {
        elements.setIcon("Z");
    }

    @Override
    public void getStrongAgainst() {
        elements.setStrongAgainst("Woda");
    }

    @Override
    public void getWeakAgainst() {
        elements.setWeakAgainst("Piorun");
    }
}
