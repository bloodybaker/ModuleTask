public class MyExeption extends Exception {
    private int detale;

    public MyExeption(int detale) {
        this.detale = detale;
    }
    public String toString(){
        return "Exeption " + detale;
    }
}
