package common;

import dao.PharmacyUtils;
import javax.swing.JOptionPane;
import java.io.File;

public class openPdf {

    public static void openById(String id) {
        try {
            File file = new File(PharmacyUtils.billPath + id + ".pdf");
            if (file.exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler " + file.getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
