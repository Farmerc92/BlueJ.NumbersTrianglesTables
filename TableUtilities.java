 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = "";
        for (int row = 1; row <= 5; row++) {
            for (int i = 1; i <= 5; i ++) {
                if (i * row < 10) {
                    table += "  " + i * row + " |";
                }
                else {
                    table += " " + i * row + " |";
                }
            }
            table += "\n";
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table = "";
        for (int row = 1; row <= 10; row++) {
            for (int i = 1; i <= 10; i ++) {
                if (i * row < 10) {
                    table += "  " + i * row + " |";
                }
                else if ((i * row >= 10) && (i * row < 100)) {
                    table += " " + i * row + " |";
                }
                else {
                    table += i * row + " |";
                }
            }
            table += "\n";
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for (int row = 1; row <= tableSize; row++) {
            for (int i = 1; i <= tableSize; i ++) {
                if (i * row < 10) {
                    table += "  " + i * row + " |";
                }
                else if ((i * row >= 10) && (i * row < 100)) {
                    table += " " + i * row + " |";
                }
                else {
                    table += i * row + " |";
                }
            }
            table += "\n";
        }
        return table;
    }
}
