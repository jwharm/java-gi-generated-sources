package org.gtk.gtk;

/**
 * See also gtk_print_job_set_page_set().
 */
public class PageSet extends io.github.jwharm.javagi.Enumeration {

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
    
    public PageSet(int value) {
        super(value);
    }
    
}
