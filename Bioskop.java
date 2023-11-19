/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bioskop.main;

/**
 *
 * @author Lenovo
 */
public class Bioskop {

    public static void main(String[] args) {
        register rg = new register();
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(register.EXIT_ON_CLOSE);
        
    }
}
