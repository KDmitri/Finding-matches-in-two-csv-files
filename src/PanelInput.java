import javax.swing.*;

public class PanelInput extends JFrame{
    //���� ��� �����
    /*JTextField inputFileOne;
    JTextField inputFileTwo;

    //������ ��� �����
    JButton button;

    //���������� ��� ���������� ��������� ������ � �������� � BufferedReader
    private static String filePathOne;
    private static String filePathTwo;

    public static String getFilePathOne() {return filePathOne;}
    public static String getFilePathTwo() {return filePathTwo;}

    public static void setFilePathOne(String filePathOne) {PanelInput.filePathOne = filePathOne;}
    public static void setFilePathTwo(String filePathTwo) {PanelInput.filePathTwo = filePathTwo;}
    PanelInput(String filePathOne, String filePathTwo){
        this.filePathOne =filePathOne;
        this.filePathTwo =filePathTwo;
    }

    //������� ���� �����
    public void windowInput() {
        //���� �����
        JFrame frame = new JFrame();
        //������������� ���������� � ������
        inputFileOne = new JTextField();
        inputFileTwo = new JTextField();
        button = new JButton("Data entry");
        //�������� �� ����� ���� � ������
        frame.getContentPane().add(BorderLayout.BEFORE_FIRST_LINE, inputFileOne);
        frame.getContentPane().add(BorderLayout.CENTER, inputFileTwo);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ���������� ������ ���� � ������� ��� �� �����
        frame.setSize(500, 200);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                filePathOne = inputFileOne.getText();
                filePathTwo = inputFileTwo.getText();
            }
        });
    }
    public static void main(String[] args) throws InterruptedException {
        PanelInput panelInput = new PanelInput(filePathOne,filePathTwo);
        panelInput.windowInput();
        //Thread.sleep(10000);
        System.out.println(panelInput.getFilePathOne());
        System.out.println(panelInput.getFilePathTwo());
    }*/
}
