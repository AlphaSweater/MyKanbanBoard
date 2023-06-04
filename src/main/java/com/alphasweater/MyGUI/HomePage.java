package com.alphasweater.MyGUI;
/* Author: Chad Fairlie
*  Pseudonym: AlphaSweater
*  Student Number: ST********
---------------------------------------------------------------------------------------------------------------------*/

import com.alphasweater.MyUser.MyUserClass;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

public class HomePage {
    private JPanel panel;
    private JButton btnLogOut;
    private JLabel lblWelcome;

    private static final JFrame home = new JFrame("Home Page");

    /**
     * Summons the home page GUI.
     */
    public static void createHomePage() {
        // Set the content pane of the home JFrame to the panel of the HomePage instance
        home.setContentPane(new HomePage().panel);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.pack();
        home.setLocationRelativeTo(null);
        home.setVisible(true);
    }

    public HomePage() {
        // Set the welcome label text to display the user's first and last name
        lblWelcome.setText("Welcome " + MyUserClass.currentUser.getUserFirstName() + " " + MyUserClass.currentUser.getUserLastName() + ", it is great to see you.");

        // Add an ActionListener to the log-out button
        btnLogOut.addActionListener(actionEvent -> {
            // Dispose the home JFrame
            home.dispose();
            // Create and display the login page
            LoginPage.createLoginPage();
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel = new JPanel();
        panel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel.setBackground(new Color(-13223617));
        panel.setPreferredSize(new Dimension(500, 500));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(6, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-13223617));
        panel.add(panel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setForeground(new Color(-1250067));
        label1.setText("Home Page");
        panel1.add(label1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setForeground(new Color(-1250067));
        label2.setText("This is currently a work in progress");
        panel1.add(label2, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        btnLogOut = new JButton();
        btnLogOut.setActionCommand("");
        Font btnLogOutFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, 20, btnLogOut.getFont());
        if (btnLogOutFont != null) btnLogOut.setFont(btnLogOutFont);
        btnLogOut.setText("Logout");
        panel1.add(btnLogOut, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        panel1.add(spacer2, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        lblWelcome = new JLabel();
        Font lblWelcomeFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, 20, lblWelcome.getFont());
        if (lblWelcomeFont != null) lblWelcome.setFont(lblWelcomeFont);
        lblWelcome.setForeground(new Color(-1250067));
        lblWelcome.setText("");
        panel1.add(lblWelcome, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }

}
//--------------------------------------------------------------------------------------------------------------------//
//--------------------------------------------------------EOF---------------------------------------------------------//