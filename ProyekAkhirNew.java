package praktikum;

import java.util.*;

public class ProyekAkhirNew {
    static String[][] ref = {
            { " AAA ", "BBBB ", " CCC ", "DDDD ", "EEEEE", "FFFFF", " GGG ", "H   H", "IIIII", "JJJJJ", "K   K",
                    "L    ", "M   M", "N   N", " OOO ", "PPPP ", " QQ  ", "RRRR ", " SSSS", "TTTTT", "U   U", "V   V",
                    "W   W", "X   X", "Y   Y", "ZZZZZ", "00000", "111  ", "2222 ", "3333 ", "4   4", "55555", "  6  ",
                    "77777", " 888 ", " 999 ", "     ", "     " },
            { "A   A", "B   B", "C   C", "D   D", "E    ", "F    ", "G    ", "H   H", "  I  ", "    J", "K  K ",
                    "L    ", "MM MM", "NN  N", "O   O", "P   P", "Q  Q ", "R   R", "S    ", "  T  ", "U   U", "V   V",
                    "W   W", " X X ", " Y Y ", "   Z ", "0  00", "  1  ", "    2", "    3", "4   4", "5    ", " 6   ",
                    "   7 ", "8   8", "9   9", "     ", " \\ / " },
            { "AAAAA", "BBBB ", "C    ", "D   D", "EEE  ", "FFF  ", "G GGG", "HHHHH", "  I  ", "    J", "KKK  ",
                    "L    ", "M M M", "N N N", "O   O", "PPPP ", "Q  Q ", "RRRR ", " SSS ", "  T  ", "U   U", "V   V",
                    "W W W", "  X  ", "  Y  ", "  Z  ", "0 0 0", "  1  ", " 222 ", "  333", "44444", "5555 ", "6666 ",
                    "  7  ", " 888 ", " 9999", "     ", "  ?  " },
            { "A   A", "B   B", "C   C", "D   D", "E    ", "F    ", "G   G", "H   H", "  I  ", "J   J", "K  K ",
                    "L    ", "M   M", "N  NN", "O   O", "P    ", "Q  Q ", "R   R", "    S", "  T  ", "U   U", " V V ",
                    "W W W", " X X ", "  Y  ", " Z   ", "00  0", "  1  ", "2    ", "    3", "    4", "    5", "6   6",
                    " 7   ", "8   8", "   9 ", "     ", " / \\ " },
            { "A   A", "BBBB ", " CCC ", "DDDD ", "EEEEE", "F    ", " GGG ", "H   H", "IIIII", " JJJ ", "K   K",
                    "LLLLL", "M   M", "N   N", " OOO ", "P    ", " QQ Q", "R   R", "SSSS ", "  T  ", " UUU ", "  V  ",
                    " W W ", "X   X", "  Y  ", "ZZZZZ", "00000", "11111", "22222", "3333 ", "    4", "5555 ", " 666 ",
                    "7    ", " 888 ", "  9  ", "     ", "     " }
    };

    public static void main(String[] args) {
        String choice, displayable;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Message (Alphanumerical only): ");
        displayable = input.nextLine();
        do {
            System.out.print("Choose a print mode - (H)orizontal / (V)ertical : ");
            choice = input.nextLine();
        } while (!(choice.equalsIgnoreCase("H") || choice.equalsIgnoreCase("V")));
        System.out.println();
        if (choice.equalsIgnoreCase("H"))
            ResizeNPrint(displayable, 0);
        else
            ResizeNPrint(displayable, 1);
    }

    public static void ResizeNPrint(String in, int mode) {
        String[] tmp = { "", "", "", "", "" };
        int targ;
        for (int i = 0; i < in.length(); i++) {
            switch (in.substring(i, i + 1).toUpperCase()) {
                case "A" -> targ = 0;
                case "B" -> targ = 1;
                case "C" -> targ = 2;
                case "D" -> targ = 3;
                case "E" -> targ = 4;
                case "F" -> targ = 5;
                case "G" -> targ = 6;
                case "H" -> targ = 7;
                case "I" -> targ = 8;
                case "J" -> targ = 9;
                case "K" -> targ = 10;
                case "L" -> targ = 11;
                case "M" -> targ = 12;
                case "N" -> targ = 13;
                case "O" -> targ = 14;
                case "P" -> targ = 15;
                case "Q" -> targ = 16;
                case "R" -> targ = 17;
                case "S" -> targ = 18;
                case "T" -> targ = 19;
                case "U" -> targ = 20;
                case "V" -> targ = 21;
                case "W" -> targ = 22;
                case "X" -> targ = 23;
                case "Y" -> targ = 24;
                case "Z" -> targ = 25;
                case "0" -> targ = 26;
                case "1" -> targ = 27;
                case "2" -> targ = 28;
                case "3" -> targ = 29;
                case "4" -> targ = 30;
                case "5" -> targ = 31;
                case "6" -> targ = 32;
                case "7" -> targ = 33;
                case "8" -> targ = 34;
                case "9" -> targ = 35;
                case " " -> targ = 36;
                default -> targ = 37;
            }
            if (mode == 0)
                for (int j = 0; j < 5; j++)
                    tmp[j] += ref[j][targ] + "  ";
            else {
                for (int j = 0; j < 5; j++)
                    System.out.println(ref[j][targ]);
                System.out.println();
            }
        }
        if (mode == 0)
            for (int i = 0; i < 5; i++)
                System.out.println(tmp[i]);
    }

}
