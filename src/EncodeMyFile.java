import java.nio.charset.StandardCharsets;

public class EncodeMyFile {
    public void encodeBytes() {

        //we get the byte number
        byte[] bytes = "é".getBytes(StandardCharsets.UTF_8);

        String normal = new String(bytes, StandardCharsets.UTF_8);
        String utf16 = new String(bytes, StandardCharsets.UTF_16);
        String idk = new String(bytes, StandardCharsets.ISO_8859_1);

        System.out.println(normal);
        System.out.println(utf16);
        System.out.println(idk);
    }
}
