class BreakDancer extends Dancer {
    // konstruktør bliver kaldt fra klassen Dancer.
    public BreakDancer(String name){
        super(name);
    }

    // overrider dance() metoden fra superklassen Dancer.
    @Override
    public void dance() {
        System.out.println(name+ "is performing a breakdance move");
    }
}
