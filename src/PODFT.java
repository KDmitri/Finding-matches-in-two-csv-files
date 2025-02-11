import javax.swing.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
public class PODFT{
    // ������ ��� �������� ksjagin@gmail.com
    public static void main(String[] args) throws IOException {
        //�������� ���������� �� main ������
        Main.InputFiles resultInputFiles = Main.getFilenames();
        //��������� ������ � ������
        LinkedHashSet<String> listBD = new LinkedHashSet<>();
        List<String> listPFM = new ArrayList<>();
        //���������� ���������
        LinkedHashSet<String> result = new LinkedHashSet<>();
        // ���������� ��� �������� ������
        String lineBD;
        String linePFM;
        //������� ����
        FileWriter fileWriter = new FileWriter("C:\\Users\\d.kosyagin\\Documents\\����� �� ������� � ���.txt", true);

        BufferedReader readerBD = new BufferedReader(new FileReader(resultInputFiles.fileOne()));// C:\\Users\\d.kosyagin\\Documents\\BD.csv
        BufferedReader readerPFM = new BufferedReader(new FileReader(resultInputFiles.fileTwo()));// C:\\Users\\d.kosyagin\\Documents\\RFM.csv
        // C:\\Users\\p.katashinsky\\Documents\\BD.csv
        //���������� � ������
        while ((lineBD = readerBD.readLine()) != null) {
            listBD.add(lineBD.toLowerCase());
        }
        while ((linePFM = readerPFM.readLine()) != null) {
            listPFM.add(linePFM.toLowerCase());
        }
        // ���� ���������� � ���������� ���������
        for (int i = 0; i < listPFM.size(); i++) {
            if (listBD.contains(listPFM.get(i))) {
                result.add(listPFM.get(i));
            }
        }
        // ��������� ����
        Calendar calendar = Calendar.getInstance();
        DateFormat formaData = new SimpleDateFormat("dd.MM.yyyy");
        // ���������� ���������
        fileWriter.write("\n");
        fileWriter.write("��������� " + formaData.format(calendar.getTime()) + ", " + "������� ���������� (�������� ����): " + result.size());
        fileWriter.write("\n");
        for (String q : result) {
            fileWriter.write(q);
            fileWriter.write("\n");
        }
        //������� ��������� � ����������
        JOptionPane.showMessageDialog(null, "������");
        fileWriter.close();
        readerPFM.close();
        readerBD.close();
    }
}
