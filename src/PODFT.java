import javax.swing.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class PODFT {
    // Личный проект Косягина Дмитрия Сергеевича ksjagin@gmail.com
    public static void main(String[] args) throws IOException {
        LinkedHashSet<String> listBD = new LinkedHashSet<>();
        List<String> listPFM = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        String lineBD;
        String linePFM;
        FileWriter fileWriter = new FileWriter("C:\\Users\\Отчет по сверкам с РФМ.txt", true);

        BufferedReader readerBD = new BufferedReader(new FileReader("C:\\Users\\BD.csv"));
        BufferedReader readerPFM = new BufferedReader(new FileReader("C:\\Users\\RFM.csv"));

        while ((lineBD = readerBD.readLine()) != null) {
            listBD.add(lineBD.toLowerCase());
        }readerBD.close();
        while ((linePFM = readerPFM.readLine()) != null) {
            listPFM.add(linePFM.toLowerCase());
        } readerPFM.close();

        for(int i = 0; i < listPFM.size(); i++) {
            if(listBD.contains(listPFM.get(i))) {
                result.add(listPFM.get(i));
            }
        }
        Calendar calendar = Calendar.getInstance();
        DateFormat formaData = new SimpleDateFormat("dd MMMM yyy");
        if (result.size() != 0) {
            JOptionPane.showMessageDialog(null, "Готово");
            fileWriter.write("\n");
            fileWriter.write(formaData.format(calendar.getTime()) + " найдено совпадений: " + result.size());
            fileWriter.write("\n");
            for (String q : result) {
                fileWriter.write(q);
                fileWriter.write("\n");
            }
            fileWriter.close();
        }else {
            JOptionPane.showMessageDialog(null, "Произошла ошибка");
        }
    }
}
