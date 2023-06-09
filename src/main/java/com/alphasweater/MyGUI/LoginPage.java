package com.alphasweater.MyGUI;
/* Author: Chad Fairlie
*  Pseudonym: AlphaSweater
*  Student Number: ST10269509
---------------------------------------------------------------------------------------------------------------------*/

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

public class LoginPage {
    // User interface components
    protected JLabel lblTitle;
    protected JPanel north;
    protected JLabel lblSubTitle;
    protected JTextField edtUsername;
    protected JPasswordField edtPassword;
    protected JLabel lblUsername;
    protected JLabel lblPassword;
    protected JButton btnLogin;
    protected JButton btnGoToRegister;
    protected JPanel panel;
    protected JTextArea lblStatus;
    protected JFrame loginFrame = new JFrame("Login");
    private MyLoginWorkerClass loginWorker;
    public MyLoginWorkerClass getLoginWorker() {
        return loginWorker;
    }
    public void setLoginWorker(MyLoginWorkerClass loginWorker) {
        this.loginWorker = loginWorker;
    }

    //----------------------------------------------------------------------------------------------------------------//
    public LoginPage() {

        // Event listener for the login button
        btnLogin.addActionListener(click -> {
            loginWorker.beginLoginHere();
        });

        // Event listener for the "Go to Register" button
        btnGoToRegister.addActionListener(click -> {
            loginWorker.swapPageRegister();
        });
    }

    //----------------------------------------------UI Designer Code--------------------------------------------------//

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
        panel.setLayout(new GridLayoutManager(11, 3, new Insets(0, 0, 0, 0), 10, -1));
        panel.setBackground(new Color(-13223617));
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        north = new JPanel();
        north.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), 10, -1));
        north.setBackground(new Color(-13223617));
        panel.add(north, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 120), new Dimension(-1, 165), 0, false));
        north.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        lblTitle = new JLabel();
        Font lblTitleFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, 24, lblTitle.getFont());
        if (lblTitleFont != null) lblTitle.setFont(lblTitleFont);
        lblTitle.setForeground(new Color(-1250067));
        lblTitle.setText("Welcome back!");
        north.add(lblTitle, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_SOUTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lblSubTitle = new JLabel();
        lblSubTitle.setForeground(new Color(-9275779));
        lblSubTitle.setText("We're so excited to see you again!");
        north.add(lblSubTitle, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        edtUsername = new JTextField();
        edtUsername.setBackground(new Color(-13618375));
        edtUsername.setCaretColor(new Color(-1250067));
        edtUsername.setFocusCycleRoot(false);
        Font edtUsernameFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, 16, edtUsername.getFont());
        if (edtUsernameFont != null) edtUsername.setFont(edtUsernameFont);
        edtUsername.setForeground(new Color(-1250067));
        edtUsername.setMargin(new Insets(2, 6, 2, 6));
        edtUsername.setRequestFocusEnabled(true);
        panel.add(edtUsername, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel.add(spacer1, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(-1, 40), null, 0, false));
        edtPassword = new JPasswordField();
        edtPassword.setBackground(new Color(-13618375));
        edtPassword.setCaretColor(new Color(-1250067));
        Font edtPasswordFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, 16, edtPassword.getFont());
        if (edtPasswordFont != null) edtPassword.setFont(edtPasswordFont);
        edtPassword.setForeground(new Color(-1250067));
        edtPassword.setMargin(new Insets(2, 6, 2, 6));
        panel.add(edtPassword, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        lblUsername = new JLabel();
        Font lblUsernameFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, -1, lblUsername.getFont());
        if (lblUsernameFont != null) lblUsername.setFont(lblUsernameFont);
        lblUsername.setForeground(new Color(-7433577));
        lblUsername.setText("Username");
        panel.add(lblUsername, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lblPassword = new JLabel();
        Font lblPasswordFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, -1, lblPassword.getFont());
        if (lblPasswordFont != null) lblPassword.setFont(lblPasswordFont);
        lblPassword.setForeground(new Color(-7433577));
        lblPassword.setText("Password");
        panel.add(lblPassword, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        panel.add(spacer2, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, new Dimension(50, -1), null, 0, false));
        final Spacer spacer3 = new Spacer();
        panel.add(spacer3, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, new Dimension(50, -1), null, 0, false));
        final Spacer spacer4 = new Spacer();
        panel.add(spacer4, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, new Dimension(50, -1), null, 0, false));
        final Spacer spacer5 = new Spacer();
        panel.add(spacer5, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, new Dimension(50, -1), null, 0, false));
        btnLogin = new JButton();
        btnLogin.setBackground(new Color(-9270822));
        btnLogin.setFocusPainted(true);
        btnLogin.setFocusable(true);
        Font btnLoginFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, 24, btnLogin.getFont());
        if (btnLoginFont != null) btnLogin.setFont(btnLoginFont);
        btnLogin.setForeground(new Color(-1250067));
        btnLogin.setHideActionText(false);
        btnLogin.setText("Login");
        panel.add(btnLogin, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 50), null, 0, false));
        final Spacer spacer6 = new Spacer();
        panel.add(spacer6, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer7 = new Spacer();
        panel.add(spacer7, new GridConstraints(10, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        btnGoToRegister = new JButton();
        btnGoToRegister.setBorderPainted(false);
        btnGoToRegister.setContentAreaFilled(false);
        btnGoToRegister.setFocusable(false);
        Font btnGoToRegisterFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, -1, btnGoToRegister.getFont());
        if (btnGoToRegisterFont != null) btnGoToRegister.setFont(btnGoToRegisterFont);
        btnGoToRegister.setForeground(new Color(-9270822));
        btnGoToRegister.setLabel("Need an account? Register");
        btnGoToRegister.setOpaque(false);
        btnGoToRegister.setSelected(false);
        btnGoToRegister.setText("Need an account? Register");
        panel.add(btnGoToRegister, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lblStatus = new JTextArea();
        lblStatus.setBackground(new Color(-13223617));
        lblStatus.setForeground(new Color(-1765847));
        lblStatus.setLineWrap(true);
        lblStatus.setText("");
        lblStatus.setVisible(false);
        lblStatus.setWrapStyleWord(true);
        panel.add(lblStatus, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        edtUsername.setNextFocusableComponent(edtPassword);
        edtPassword.setNextFocusableComponent(btnLogin);
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

    //----------------------------------------------UI Designer Code--------------------------------------------------//
}
//--------------------------------------------------------------------------------------------------------------------//
//--------------------------------------------------------EOF---------------------------------------------------------//