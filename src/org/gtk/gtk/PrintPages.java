package org.gtk.gtk;

/**
 * See also gtk_print_job_set_pages()
 */
public class PrintPages {

    /**
     * All pages.
     */
    public static final PrintPages ALL = new PrintPages(0);
    
    /**
     * Current page.
     */
    public static final PrintPages CURRENT = new PrintPages(1);
    
    /**
     * Range of pages.
     */
    public static final PrintPages RANGES = new PrintPages(2);
    
    /**
     * Selected pages.
     */
    public static final PrintPages SELECTION = new PrintPages(3);
    
    private int value;
    
    public PrintPages(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PrintPages[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
