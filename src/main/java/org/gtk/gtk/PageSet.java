package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See also gtk_print_job_set_page_set().
 */
public class PageSet extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
