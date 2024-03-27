package PA_303_10_1;

public class StoneMonster extends Monster{
    public StoneMonster(String name){
        super(name);
    }

    @Override
    public String attack() {
        return name+" Attack with stone";
    }
}
