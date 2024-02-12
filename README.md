# Chess System in Java
| ![Xadrez](https://cdn.discordapp.com/attachments/617549238246572063/1206694090008428604/image.png?ex=65dcf072&is=65ca7b72&hm=df123158cc96e2457532913d8e92a5d99031eef8c7bb8af7a1cf859a3edb8858&) | This is a basic chess system project implemented in Java. It was developed as part of personal learning about object-oriented programming and application of chess concepts. |
|---------------------------|--------------------------|

## Description

The project consists of a simplified implementation of a chess system, including classes to represent the pieces, the board, and the game logic. It does not include a graphical user interface and runs only in the console.

![photo_console](https://cdn.discordapp.com/attachments/617549238246572063/1206694210347081798/image.png?ex=65dcf08f&is=65ca7b8f&hm=d89e1c7f117a5fa459dad015df40ac30d545a30e9604482764381655fa3f0b15&)

| pieces |   |
|--------|---|
| King   | K |
| Queen  | Q |
| Bishop | B |
| Knight | N |
| Rook   | R |
| Pawn   | P |



## Project Structure

The project is structured as follows:

- `src/`: Folder containing the source files of the project.
  - `application/`: Folder containing the main application files.
  - `boardgame/`: Folder containing the chessboard files.
  - `chess/`: Folder containing chess business rule files, including pieces, moves, etc...
- `.gitignore`: File to specify which files and directories should be ignored by Git version control.

## Cloning the Repository

To clone the repository and have the project locally on your machine, you can use the following Git command:

```bash
git clone https://github.com/your_username/Chess-System-Java.git
```
Make sure to replace your_username with your GitHub username.

## Execution

To run the project, simply compile the source files and execute the `Main.java` class. Make sure you have the JDK (Java Development Kit) installed on your system.

```bash
javac src/application/Main.java
java src.application.Main
```

## Contributions

Contributions are welcome! If you'd like to contribute to this project, follow these steps:

1. Fork the project and clone it locally.
2. Create a new branch for your contribution:
   ```bash
   git checkout -b my-contribution
  ```