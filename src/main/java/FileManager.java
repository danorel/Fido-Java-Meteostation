public interface FileManager {
    String readFile(String filename);
    boolean writeFile(String body);
    void createFile(String filename);
}
