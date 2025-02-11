import javax.swing.*;
public class Main {
    // кортеж-контейнер для данных, возвращаемых из диалога
   static class InputFiles {
        private final String fileOne, fileTwo;

        public InputFiles(String one, String two) {
            this.fileOne = one;
            this.fileTwo = two;
        }
        public String fileOne() { return fileOne; }
        public String fileTwo() { return fileTwo; }
    }

    /*public static void main(String[] args) {
        InputFiles result = getFilenames();
        if (null == result) {System.out.println("File data not entered, exiting...");
            System.exit(0);}    }*/
    public static InputFiles getFilenames() {
        JTextField pathOne = new JTextField();
        JTextField pathTwo = new JTextField();

        Object[] message = {
                "First file:  ", pathOne,
                "Second file: ", pathTwo
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Input file names", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            return new InputFiles(pathOne.getText(), pathTwo.getText());
        }
        return null;
    }
}
