package org.gtk.gio;

/**
 * Return value for various IO operations that signal errors via the
 * return value and not necessarily via a {@link org.gtk.glib.Error}.
 * <p>
 * This enum exists to be able to return errors to callers without having to
 * allocate a {@link org.gtk.glib.Error}. Allocating {@code GErrors} can be quite expensive for
 * regularly happening errors like {@link IOErrorEnum#WOULD_BLOCK}.
 * <p>
 * In case of {@link PollableReturn#FAILED} a {@link org.gtk.glib.Error} should be set for the
 * operation to give details about the error that happened.
 */
public class PollableReturn {

    /**
     * Generic error condition for when an operation fails.
     */
    public static final PollableReturn FAILED = new PollableReturn(0);
    
    /**
     * The operation was successfully finished.
     */
    public static final PollableReturn OK = new PollableReturn(1);
    
    /**
     * The operation would block.
     */
    public static final PollableReturn WOULD_BLOCK = new PollableReturn(-27);
    
    private int value;
    
    public PollableReturn(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PollableReturn[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
