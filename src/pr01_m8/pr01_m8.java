/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr01_m8;

import java.io.*;
public class pr01_m8 {
public static void main(String[] args) throws IOException {
File f = new File("fitxer.html");
try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
bw.write("<html>");bw.newLine();
bw.write(" <head>");bw.newLine();
bw.write(" <title>");bw.newLine();
bw.write(" Nova p&agrave;gina web");
bw.newLine();
bw.write(" </title>");
bw.newLine();
bw.write(" </head>");
bw.newLine();
bw.write(" <body>");
bw.newLine();
bw.write(" Nova p&agrave;gina web");
bw.newLine();
bw.write(" </body>");
bw.newLine();
bw.write("</html>");
bw.newLine();
bw.close();
}
}
}