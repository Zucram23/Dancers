class Dancer {

    protected String name;
// Kontruktør til at oprette forskellige dansere.
    public Dancer(String name){
        this.name = name;
    }
// metode som bliver kaldt hvis der ikke overrides
    public void dance(){
    System.out.println("Dancer is performing a basic move");


}

}
