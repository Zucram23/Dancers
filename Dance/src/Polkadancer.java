class Polkadancer extends Dancer {
    // konstruktør bliver kaldt fra klassen Dancer.
    public Polkadancer(String name){
        super(name);
    }
    // overrider dance() metoden fra superklassen Dancer.
    @Override
    public void dance() {
        System.out.println(name+ "is performing the polkadance");
    }
}
