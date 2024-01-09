# Assembly programming Interpreter

## Overview
This project serves as a simple interpreter for an assembly-like language. The interpreter supports fundamental operations such as:
- **MV (Move)**: Assign a value to a specific register.
- **ADD (Addition)**: Combine values from different registers or constants.
- **SHOW**: Present the value stored in a designated register.

## Features
- **MV Operation**: Set a value to a register.
- **ADD Operation**: Sum values from either registers or constants.
- **SHOW Operation**: Retrieve and display a register's stored value.

## Technology Stack
- **Java**: Used as the primary programming language for the implementation.
- **File System**: Employed for persistent storage of register values across program executions.

## Project Structure
- **Main.java**: Serves as the program's entry point, managing user interactions.
- **AssemblyProgram.java**: Houses the primary logic for interpreting and executing assembly-like instructions.
- **Instruction.java**: Defines individual instructions along with their operands.
- **Operation.java**: Enumerates the available operations supported by the interpreter.

## Execution Steps
1. Ensure that Java is installed on your system.
2. Compile the Java source files by executing:
3. Run the compiled application with:
4. Follow the prompts displayed on the console to interact with the interpreter, executing MV, ADD, and SHOW commands.
5. To terminate the program, input `EXIT`.

## File Management
The interpreter employs file-based mechanisms to retain register values across multiple program invocations, facilitating a consistent state.
