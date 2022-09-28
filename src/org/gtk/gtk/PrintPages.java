package org.gtk.gtk;

/**
 * See also gtk_print_job_set_pages()
 */
public class PrintPages extends io.github.jwharm.javagi.Enumeration {

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
    
    public PrintPages(int value) {
        super(value);
    }
    
}
