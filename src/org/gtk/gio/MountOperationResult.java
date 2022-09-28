package org.gtk.gio;

/**
 * {@link MountOperationResult} is returned as a result when a request for
 * information is send by the mounting operation.
 */
public class MountOperationResult {

    /**
     * The request was fulfilled and the
     *     user specified data is now available
     */
    public static final MountOperationResult HANDLED = new MountOperationResult(0);
    
    /**
     * The user requested the mount operation
     *     to be aborted
     */
    public static final MountOperationResult ABORTED = new MountOperationResult(1);
    
    /**
     * The request was unhandled (i.e. not
     *     implemented)
     */
    public static final MountOperationResult UNHANDLED = new MountOperationResult(2);
    
    private int value;
    
    public MountOperationResult(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(MountOperationResult[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
