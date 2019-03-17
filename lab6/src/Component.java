public interface Component {

    void printDescription(Burger order) ;
    void printdes();
    void addChild(Component c);
    void removeChild(Component c);
    Component getChild(int i);
    double getPrice();
}

