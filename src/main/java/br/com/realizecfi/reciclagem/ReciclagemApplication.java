package br.com.realizecfi.reciclagem;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class ReciclagemApplication implements CommandLineRunner {

    private static final int LIMITE = 1000;

    public static void main(String[] args) {
        SpringApplication.run(ReciclagemApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        final File theFile = new File("C:/Users/006152/Documents/projetos/otp/reciclagem/PRD/BASE_OTP_0103.txt");
        LineIterator it = FileUtils.lineIterator(theFile, "UTF-8");
        int count = 0;
        int i = 1;
        String nameFile = new String("C:/Users/006152/Documents/projetos/otp/reciclagem/PRD/" + i + ".txt");
        StringBuffer cont = new StringBuffer();
        String comeco = "[";
        cont.append(comeco);
        cont.append(System.lineSeparator());
        try {
            while (it.hasNext()) {
                String line = it.nextLine();
                String cpf = "\"" + line + "\"" + ",";
                cont.append(cpf);
                cont.append(System.lineSeparator());
                count++;
                if (count == LIMITE) {
                    cont.append("]");
                    final File fileWrite = new File(nameFile);
                    FileUtils.write(fileWrite, cont.toString(), "UTF-8");
                    count = 0;
                    i++;
                    nameFile = new String("C:/Users/006152/Documents/projetos/otp/reciclagem/PRD" + i + ".txt");
                    System.out.println(nameFile);
                    cont = new StringBuffer();
                    String comeco2 = "[";
                    cont.append(comeco2);
                    cont.append(System.lineSeparator());
                }
            }
            cont.append("]");
            final File fileWrite = new File(nameFile);
            FileUtils.write(fileWrite, cont.toString(), "UTF-8");

        } finally {
            System.out.println("FIM");
        }
    }
}
