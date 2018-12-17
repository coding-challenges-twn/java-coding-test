package libs;

public class InputValues {

    /*
     * Assumptions for these functions (Average and MaxMin)
     *
     *   1. Input are all in the range of a byte size (-128 to 127).
     *      This also means that there is no way that a char can be an input.
     *
     *   2. Possible Exceptions such as ArithmeticExceptions and IndexOutOfBound Exceptions
     *      will be handled outside of the methods.
     *
     * */

    public static byte[] typicalValues = {10, 40, 0, -7, 20, 30, 7};
    public static byte[] allNegative = {-12, -30, -40, -20, -20, -7, -15};
    public static byte[] allPositive = {12, 30, 40, 20, 20, 7, 15, 24};
    public static byte[] emptyInput = {};

    public static byte[] bigData = {22, 7, 0, 23, 26, 22, 23, 26, 26, 26, -7, 7, 0,
                                    23, 26, 22, 23, 26, 26, 26, 23, 26, 22, 23, 26,
                                    26, 26, 3, 26, 22, 23, 26, 26, 26, 23, 26, 22,
                                    23, 26, 26, 26, 21, 23, 24, 18, 16, 14, 12, 23,
                                    26, 22, 23, 26, 26, 26, 23, 27, -8, 23, 26,
                                    26, 26, 3, 26, 22, 23, 26, 26, 26, 23, 26, 22,
                                    23, 26, 26, 26, 21, 23, 24, 18, 16, 14, 12};

    public static double typicalValuesAverage = 14.286;
    public static double bigDataValuesAverage = 21.253;

    public final static int TYPICAL_VALUES_MAX = 40;
    public final static int TYPICAL_VALUES_MIN = -7;

    public final static int ALL_NEGATIVE_MIN = -40;
    public final static int ALL_NEGATIVE_MAX = -7;

    public final static int ALL_POSITIVE_MIN = 7;
    public final static int ALL_POSITIVE_MAX = 40;

}