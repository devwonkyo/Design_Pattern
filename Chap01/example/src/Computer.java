public class Computer {
    private Cpu cpu;
    private Memory memory;
    private PowerProvider powerProvider;
    private MainBoard mainBoard;
    /*
    public Computer(Cpu cpu, Memory memory, PowerProvider powerProvider, MainBoard mainBoard){
        this.cpu = cpu;
        this.memory = memory;                       //Computer객체에 의존하지 않고 참조만 하여 Computer객체가 각각의 객체들은
                                                    //없어져도 상관없음. --> 집약관계
        this.powerProvider = powerProvider;
        this.mainBoard = mainBoard;
    }
    */

    public Computer(){                     //Computer객체에 의존하여 Computer객체가 없어지면 각각의 객체도 사라짐
        cpu = new Cpu();                   //-->라이프타임이 Computer객체에 의존 --> 합성관계
        memory = new Memory();
        powerProvider = new PowerProvider();
        mainBoard = new MainBoard();
    }
}
class Cpu{

}
class Memory{

}
class PowerProvider{

}
class MainBoard{

}

