package school.project.securitybracelet.web.service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QRCodeGenerator {
    private static final String QR_CODE_IMAGE_PATH = "./%s.png";

    public void generateQRCodeImage(String text)
            throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode("http://sec-bracelet.jelastic.regruhosting.ru/patient?id=" + text, BarcodeFormat.QR_CODE, 350, 350);

        Path path = FileSystems.getDefault().getPath(String.format(QR_CODE_IMAGE_PATH, text));
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }
}
