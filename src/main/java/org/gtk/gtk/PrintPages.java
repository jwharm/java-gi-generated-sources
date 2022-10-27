package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See also gtk_print_job_set_pages()
 */
public class PrintPages extends io.github.jwharm.javagi.Enumeration {
    
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
