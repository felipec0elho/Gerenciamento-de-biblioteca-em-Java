import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public abstract class Salvar {
    private static File arquivo = new File("./src/log/biblioteca");

    public static void salvarArquivo(Object obj) {
        try {
            arquivo.getParentFile().mkdirs();
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
            out.writeObject(obj);
            out.close();
        } catch (IOException e) {
            System.out.println("Falha ao salvar arquivo: " + e.getMessage());
        }
    }

    public static Object lerArquivo() {
        try {
            if (arquivo.exists() && arquivo.isFile()) {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
                Object obj = in.readObject();
                in.close();
                return obj;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
        return null;
    }
}
