package org.gtk.gtk;

/**
 * See also gtk_print_job_set_page_set().
 */
public class PageSet {

    /**
     * All pages.
     */
    public static final PageSet ALL = new PageSet(0);
    
    /**
     * Even pages.
     */
    public static final PageSet EVEN = new PageSet(1);
    
    /**
     * Odd pages.
     */
    public static final PageSet ODD = new PageSet(2);
    
    private int value;
    
    public PageSet(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PageSet[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
