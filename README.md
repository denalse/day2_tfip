## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## COMPILE & RUN 
> 1. compiling (slide 8)
- javac --source-path src -d bin src/*
> 2. running the compiled classes (slide 9)
- java -cp bin App
> 3. packing to jar (slide 12)
- jar -c -v -f day2.jar -e App . (Do inside bin folder)
 -> day2.jar - can be any name
> 4. run the jar package (slide 12)
- java -cp bin/day2.jar App
- java -cp day2.jar App (run inside bin folder)





## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
