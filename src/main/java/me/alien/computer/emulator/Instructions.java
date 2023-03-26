package me.alien.computer.emulator;

public enum Instructions {
    ADD(0x0),
    SUB(0x1),
    DIV(0x2),
    LDA(0x3),
    LDB(0x4),
    SMA(0x5),
    SMB(0x6),
    SMC(0x7),
    LMA(0x8),
    LMB(0x9),
    JMP(0xA),
    JMZ(0xB),
    HLT(0xC),
    NOP(0xD)
    ;

    final int instruction;

    Instructions(int instruction) {
        this.instruction = instruction;
    }

    public int getInstruction() {
        return instruction;
    }

    static Instructions fromInt(int instruction){
        return switch (instruction){
            case 0x0 -> ADD;
            case 0x1 -> SUB;
            case 0x2 -> DIV;
            case 0x3 -> LDA;
            case 0x4 -> LDB;
            case 0x5 -> SMA;
            case 0x6 -> SMB;
            case 0x7 -> SMC;
            case 0x8 -> LMA;
            case 0x9 -> LMB;
            case 0xA -> JMP;
            case 0xB -> JMZ;
            case 0xC -> HLT;
            case 0xD -> NOP;
            default -> throw new IllegalStateException("Unexpected value: " + instruction);
        };
    }
}
