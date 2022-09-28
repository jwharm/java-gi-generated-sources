package org.gtk.gtk;

/**
 * The result of a print operation.
 * <p>
 * A value of this type is returned by {@link PrintOperation#run}.
 */
public class PrintOperationResult {

    /**
     * An error has occurred.
     */
    public static final PrintOperationResult ERROR = new PrintOperationResult(0);
    
    /**
     * The print settings should be stored.
     */
    public static final PrintOperationResult APPLY = new PrintOperationResult(1);
    
    /**
     * The print operation has been canceled,
     *   the print settings should not be stored.
     */
    public static final PrintOperationResult CANCEL = new PrintOperationResult(2);
    
    /**
     * The print operation is not complete
     *   yet. This value will only be returned when running asynchronously.
     */
    public static final PrintOperationResult IN_PROGRESS = new PrintOperationResult(3);
    
    private int value;
    
    public PrintOperationResult(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PrintOperationResult[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
