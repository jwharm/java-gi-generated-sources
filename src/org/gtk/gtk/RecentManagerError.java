package org.gtk.gtk;

/**
 * Error codes for {@code GtkRecentManager} operations
 */
public class RecentManagerError {

    /**
     * the URI specified does not exists in
     *   the recently used resources list.
     */
    public static final RecentManagerError NOT_FOUND = new RecentManagerError(0);
    
    /**
     * the URI specified is not valid.
     */
    public static final RecentManagerError INVALID_URI = new RecentManagerError(1);
    
    /**
     * the supplied string is not
     *   UTF-8 encoded.
     */
    public static final RecentManagerError INVALID_ENCODING = new RecentManagerError(2);
    
    /**
     * no application has registered
     *   the specified item.
     */
    public static final RecentManagerError NOT_REGISTERED = new RecentManagerError(3);
    
    /**
     * failure while reading the recently used
     *   resources file.
     */
    public static final RecentManagerError READ = new RecentManagerError(4);
    
    /**
     * failure while writing the recently used
     *   resources file.
     */
    public static final RecentManagerError WRITE = new RecentManagerError(5);
    
    /**
     * unspecified error.
     */
    public static final RecentManagerError UNKNOWN = new RecentManagerError(6);
    
    private int value;
    
    public RecentManagerError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(RecentManagerError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
