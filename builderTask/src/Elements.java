public class Elements {
    private String name;
    private String icon;
    private String strongAgainst;
    private String weakAgainst;

    public void setName(String name) {
        this.name = name;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setStrongAgainst(String strongAgainst) {
        this.strongAgainst = strongAgainst;
    }

    public void setWeakAgainst(String weakAgainst) {
        this.weakAgainst = weakAgainst;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public String getStrongAgainst() {
        return strongAgainst;
    }

    public String getWeakAgainst() {
        return weakAgainst;
    }

    public void show(){
        if(name!="") System.out.println("name: " + name);
        if(icon!="") System.out.println("icon: " + icon);
        if(strongAgainst!="") System.out.println("strong against: " + strongAgainst);
        if(weakAgainst!="") System.out.println("weak against: " + weakAgainst);
    }
}
