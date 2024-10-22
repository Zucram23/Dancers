class ElectricBoogieDancer extends Dancer{

    // konstruktør bliver kaldt fra klassen Dancer.
    public ElectricBoogieDancer(String name){
        super(name);
    }
    // overrider dance() metoden fra superklassen Dancer.
    @Override
    public void dance() {
        System.out.println(name+"is an performing electric boogie move");
    }
}
