package be.cocoding.training.patterns.structuration.facade;

public class ComputerFacade {

    private final Cpu cpu;
    private final Memory memory;
    private final HardDisk hardDisk;

    public ComputerFacade() {
        cpu = new Cpu();
        memory = new Memory();
        hardDisk = new HardDisk();
    }

    public void start(){
        cpu.freeze();
        String dataBlocks = hardDisk.read(12345, 99);
        memory.load(555, dataBlocks);
        cpu.jump(555);
        cpu.start();
    }
}
