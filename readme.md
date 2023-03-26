# Computer Emulator
## What is this?
This is a emulator for a made up computer architecture

## Way?
I was board

## List Of Instructions

| Assembly | Hex | Description                                                                        | Arguments                                                            |
|----------|-----|------------------------------------------------------------------------------------|----------------------------------------------------------------------|
| add      | 0   | Adds the A register and B register and puts the output in the C register           | None                                                                 |
| sub      | 1   | Subtracts the A register from the B register and puts the output in the C register | None                                                                 |
| div      | 2   | Divide The A register from the B register and puts the result in the C register    | None                                                                 |
| lda      | 3   | Load a number into A register                                                      | A Hex number                                                         |
| ldb      | 4   | Load a number into B register                                                      | A Hex number                                                         |
| sma      | 5   | Stores the A register on an address in memory                                      | A Hex address to point to an address in memory                       |
| smb      | 6   | Stores the B register on an address in memory                                      | A Hex address to point to an address in memory                       |
| smc      | 7   | Stores the C register on an address in memory                                      | A Hex address to point to an address in memory                       |
| lma      | 8   | Stores the data of an address of memory to the A register                          | A Hex address to point to an address in memory                       |
| lmb      | 9   | Stores the data of an address of memory to the B register                          | A Hex address to point to an address in memory                       |
| jmp      | A   | Jumps to an instruction address                                                    | A Hex number that is the address to jump too in the instruction list |
| jmz      | B   | Jumps to an instruction address if C register is zero                              | A Hex number that is the address to jump too in the instruction list |
| hlt      | C   | Halts the program counter which ends the program                                   | None                                                                 |
| nop      | D   | No Operation                                                                       | None                                                                 |

### Way can't i write to the C register?
You can't write to the C register since it's an output register<br>
If you wish to use the C register you can add X and 0, where X is the number you wish to store

### Way isn't multiplication added?
Idk

### 