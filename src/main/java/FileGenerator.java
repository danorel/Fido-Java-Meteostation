import java.io.*;

public class FileGenerator implements FileManager {
    private File file;
    private String filename;
    private BufferedReader reader;
    private BufferedWriter writer;

    public String readFile(String filename) {
        String content = "";
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while((line = reader.readLine()) != null){
                content += line + "\n";
            }
            reader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return content;
    }

    public boolean writeFile(String body) {
        try {
            writer = new BufferedWriter(new FileWriter(filename));
            writer.write(body);
            writer.close();
            return true;
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public void createFile(String filename) {
        try{
            this.filename = filename;
            file = new File(this.filename);
            file.createNewFile();
        } catch(IOException exception){
            exception.printStackTrace();
        }
    }

    public void createDirectory(String dirname) {
        File directory = new File(dirname);
        directory.mkdir();
    }
}
