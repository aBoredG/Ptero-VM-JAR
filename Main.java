import java.io.File;

class Main {
    public static void main(String[] args) { 
            File installerFile = new File("boredom.sh");
            boolean installerExists = installerFile.exists();

            if (installerExists) {
                // do nothing and just continue.
            } else {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println((char) 27 + "[31m" + "An error has occurred whilst trying to download Installer.sh.");
                    System.out.println("\n\n");
                    System.out.println("  The host you are currently using has blocked the boredom.sh download link.");
                    System.out.println();
                    System.out.println("  Make sure you got boredom.sh ");
             }
            String[] installer_cmd = {"bash", "boredom.sh"};
            ProcessBuilder installer = new ProcessBuilder(installer_cmd);
            installer.inheritIO();

            System.out.print("\033[H\033[2J");
            System.out.flush();

            installer.start().waitFor();
         } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
