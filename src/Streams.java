import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
public class Streams {
    public String readStream(String filePathIn) throws IOException {
        String str = null;
        try (FileChannel inputChannel = FileChannel.open(Path.of(filePathIn))) {
            ByteBuffer buf = ByteBuffer.allocate((int) inputChannel.size());
            inputChannel.read(buf);
            if (buf.hasArray()) {
                str = new String(buf.array(), Charset.forName("windows-1251"));
            }
        }
        return str;
    }
    public void writeStream(String filePathOut, String text, int key, int modifier) throws IOException {
        try (FileChannel outputChannel = FileChannel.open(Path.of(filePathOut), StandardOpenOption.READ, StandardOpenOption.WRITE)) {
            ByteBuffer buf;
            Methods method = new Methods();
            char[] codedText = method.coding(text, key, modifier);
            String codedTextStr = String.valueOf(codedText);
            buf = ByteBuffer.wrap(codedTextStr.getBytes());
            outputChannel.write(buf);
        }
    }
    public void writeStreamDecodingBF(String filePathOut, String text) throws IOException {
        try (FileChannel outputChannel = FileChannel.open(Path.of(filePathOut), StandardOpenOption.READ, StandardOpenOption.WRITE)) {
            ByteBuffer buf;
            Methods method = new Methods();
            char[] codedText = method.brutForce(text);
            String codedTextStr = String.valueOf(codedText);
            buf = ByteBuffer.wrap(codedTextStr.getBytes());
            outputChannel.write(buf);
        }
    }
    public void createDecodedTextFile (String filePathOut) throws IOException{
        Path path = Path.of(filePathOut);
        if (!Files.exists(path)){
            Files.createFile(path);
        }
    }
}