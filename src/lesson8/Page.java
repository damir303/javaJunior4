package lesson8;

public class Page  {
    private String name;
    private int age;
    private String gorod;
    private WallEnty[] stena = new WallEnty[100];

    public Page() {
    }

    public Page(String name, int age, String gorod, WallEnty[] stena) {
        this.name = name;
        this.age = age;
        this.gorod = gorod;
        this.stena = stena;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGorod() {
        return gorod;
    }

    public void setGorod(String gorod) {
        this.gorod = gorod;
    }

    public WallEnty[] getStena() {
        return stena;
    }

    public void setStena(WallEnty[] stena) {
        this.stena = stena;
    }

    public void prinMaxLike() {
        int max = 0;
        for (int i = 0; i < this.stena.length; i++) {
            for (int j = 0; j < this.stena[i].getComentarii().length; j++) {
                if (max < this.stena[i].getComentarii()[j].getLiky()){
                    max = this.stena[i].getComentarii()[j].getLiky();
                }
            }
        }
        System.out.println(max);
    }
}
