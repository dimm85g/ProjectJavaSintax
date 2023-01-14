import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
public class Streams {
    public static String readStream(String filePathIn) throws IOException {
        String str = null;
        try (FileChannel inputChannel = FileChannel.open(Path.of(filePathIn))) {
            ByteBuffer buf = ByteBuffer.allocate((int) inputChannel.size());
            inputChannel.read(buf);
            if (buf.hasArray()) {
                str = new String(buf.array(), Charset.defaultCharset());
            }
        }
        return str;
    }
}