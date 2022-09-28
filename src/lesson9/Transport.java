package lesson9;

public abstract class Transport {
    private String name;
    private int col;
    private boolean spot;
    public boolean isSport(){
        return spot;
    }

    public void printName(){
        System.out.println(name);
    }

    public Transport() {
    }

    public Transport(String name, int col) {
        this.name = name;
        this.col = col;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public abstract void edet();
}
