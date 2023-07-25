public abstract class Builder {
    protected Elements elements;

    public void newElement(){
        elements = new Elements();
    }
    Elements getElements(){
        return elements;
    }

    public abstract void getName();
    public abstract void getIcon();
    public abstract void getStrongAgainst();
    public abstract void getWeakAgainst();

}
