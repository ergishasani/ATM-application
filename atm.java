package Projektet;

import javax.swing.JOptionPane;

public class atm {
    public static void main(String[] args) {
        String username, password, shuma_e_shtuar, opsionet, balanca;
        double shtimi, terheqja, opsioni;
        int pin, pinin = 123123, leket = 500, shuma_minimale;

        username = JOptionPane.showInputDialog(null, "Jepni Username-in tuaj :", "User_Name Dialog",
                JOptionPane.INFORMATION_MESSAGE);
        password = JOptionPane.showInputDialog(null, "Jepni pinin tuaj " + username, "Password Dialog",
                JOptionPane.INFORMATION_MESSAGE);
        pin = (int) Double.parseDouble(password);

        if (pin == pinin) {
            opsionet = JOptionPane
                    .showInputDialog("Shtypni nr 1 per te treguar balancen tuaj" + "\nShtypni nr 2 per te terhequr para"
                            + "\nShtypni nr 3 per te shtuar para" + "\nShtypni nr 4 per te dal nga programi");
            opsioni = Double.parseDouble(opsionet);
            if (opsioni == 1) {
                JOptionPane.showMessageDialog(null, "Balanca juaj eshte " + leket + "$");
            }
            if (opsioni == 2) {
                balanca = JOptionPane.showInputDialog(null,
                        "Balanca juaj eshte " + leket + "\nJu lutem vendosni shumen qe doni te terhiqni :");
                terheqja = (int) Double.parseDouble(balanca);
                boolean f = terheqja > 500;

                if (f) {
                    JOptionPane.showMessageDialog(null, "Ju nuk keni kredit te mjaftueshem");
                } else {
                    double c = leket - terheqja;
                    int p = 0;
                    boolean l = c == p;
                    if (l) {
                        JOptionPane.showMessageDialog(null, "Terheqja u krye me sukses!" + "\nKrediti juaj eshte 0");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Terheqja u krye me sukses!" + "\nShuma juaj e re eshte: " + c + "$");
                    }
                }

            }
            if (opsioni == 3) {
                shuma_e_shtuar = JOptionPane.showInputDialog(null, "Jepni shumen qe doni te shtoni", "Shtim Balance",
                        JOptionPane.INFORMATION_MESSAGE);
                shtimi = Double.parseDouble(shuma_e_shtuar);
                boolean q = shtimi >= 5000;
                if (q) {
                    JOptionPane.showMessageDialog(null, "Shuma e lejuar e depozitimit duhet te jete me pak se 5000$");
                    System.exit(0);
                }

                shuma_minimale = (int) Double.parseDouble(shuma_e_shtuar);
                int d = leket + shuma_minimale;
                JOptionPane.showMessageDialog(null, "Shuma juaj e re eshte " + d + "$");
            }
            if (opsioni == 4) {
                System.exit(0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Passwordi qe ju vendoset eshte i gabuar! ");
            System.exit(0);
        }

    }
}