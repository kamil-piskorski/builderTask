public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
            this.builder = builder;
    }

    Elements getElement(){
        return builder.getElements();
    }
    public void get(){
        builder.newElement();
        builder.getName();
        builder.getIcon();
        builder.getStrongAgainst();
        builder.getWeakAgainst();
    }

    public Builder getBuilder(String type) {
        switch (type){
            case "1": return new Fire();
            case "2": return new Water();
            case "3": return new Lightning();
            case "4": return new Earth();
            case "5": return new Wind();
            default:
                try {
                    System.out.println("wrong player, try again");
            //        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("try again")));
                } catch (Exception e){
                    e.printStackTrace();
                }
        }

        return null;
    }
}
