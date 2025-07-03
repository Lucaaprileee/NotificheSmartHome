public class Luci implements Observer{

    private String name;

    public Luci(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "accensione luce garzie a  " + message);
    }
    

}
