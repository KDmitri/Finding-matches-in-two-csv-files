import javax.swing.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
public class PODFT{
    // Проект был выполнен ksjagin@gmail.com
    public static void main(String[] args) throws IOException {
        //Передаем полученный из main адресс
        Main.InputFiles resultInputFiles = Main.getFilenames();
        //Переносим данные в списке
        LinkedHashSet<String> listBD = new LinkedHashSet<>();
        List<String> listPFM = new ArrayList<>();
        //Записываем результат
        LinkedHashSet<String> result = new LinkedHashSet<>();
        // Переменные для перебора данных
        String lineBD;
        String linePFM;
        //Создаем файл
        FileWriter fileWriter = new FileWriter("C:\\Users\\d.kosyagin\\Documents\\Отчет по сверкам с РФМ.txt", true);

        BufferedReader readerBD = new BufferedReader(new FileReader(resultInputFiles.fileOne()));// C:\\Users\\d.kosyagin\\Documents\\BD.csv
        BufferedReader readerPFM = new BufferedReader(new FileReader(resultInputFiles.fileTwo()));// C:\\Users\\d.kosyagin\\Documents\\RFM.csv
        // C:\\Users\\p.katashinsky\\Documents\\BD.csv
        //Записываем в список
        while ((lineBD = readerBD.readLine()) != null) {
            listBD.add(lineBD.toLowerCase());
        }
        while ((linePFM = readerPFM.readLine()) != null) {
            listPFM.add(linePFM.toLowerCase());
        }
        // Ищем совпадения и записываем результат
        for (int i = 0; i < listPFM.size(); i++) {
            if (listBD.contains(listPFM.get(i))) {
                result.add(listPFM.get(i));
            }
        }
        // Формируем дату
        Calendar calendar = Calendar.getInstance();
        DateFormat formaData = new SimpleDateFormat("dd.MM.yyyy");
        // Записываем результат
        fileWriter.write("\n");
        fileWriter.write("Проведено " + formaData.format(calendar.getTime()) + ", " + "найдено совпадений (детально ниже): " + result.size());
        fileWriter.write("\n");
        for (String q : result) {
            fileWriter.write(q);
            fileWriter.write("\n");
        }
        //Выводим сообщение о Готовности
        JOptionPane.showMessageDialog(null, "Готово");
        fileWriter.close();
        readerPFM.close();
        readerBD.close();
    }
}
