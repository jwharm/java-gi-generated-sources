package org.gtk.glib;

/**
 * Return values from {@code GLogWriterFuncs} to indicate whether the given log entry
 * was successfully handled by the writer, or whether there was an error in
 * handling it (and hence a fallback writer should be used).
 * <p>
 * If a {@link LogWriterFunc} ignores a log entry, it should return
 * {@link LogWriterOutput#HANDLED}.
 */
public class LogWriterOutput {

    /**
     * Log writer has handled the log entry.
     */
    public static final LogWriterOutput HANDLED = new LogWriterOutput(1);
    
    /**
     * Log writer could not handle the log entry.
     */
    public static final LogWriterOutput UNHANDLED = new LogWriterOutput(0);
    
    private int value;
    
    public LogWriterOutput(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(LogWriterOutput[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
