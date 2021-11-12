# Ptero-VM in a JAR.
This project is a Java implementation of [Afnan's Ptero-VM](https://github.com/afnan007a/Ptero-vm) that was made for Pterodactyl.

### Compiling
1. Download all of the files in this repository.
2. Open a Terminal.
3. Run `javac Main.java`, it is suggested to use Java 8 for this process for compatibility purposes.
4. Afterwards, run `ls` or `dir` to make sure you have `Main.class` in the same folder as `manifest.txt`.
5. Now, run `cvfm server.jar manifest.txt Main.class` to compile into a jarfile and you're done!
