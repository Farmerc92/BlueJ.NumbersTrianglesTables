 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String row = "";
        for (int i = 1; i <= numberOfStars; i++) {
            row += "*";
        }
        return row;
    }
    
    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }


    public static String getSmallTriangle() {
        String triangle = "";
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String getLargeTriangle() {
        String triangle = "";
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }
}
