package org.gtk.gtk;

/**
 * The parameter used in the action signals of {@code GtkNotebook}.
 */
public class NotebookTab extends io.github.jwharm.javagi.Enumeration {

    /**
     * the first tab in the notebook
     */
    public static final NotebookTab FIRST = new NotebookTab(0);
    
    /**
     * the last tab in the notebook
     */
    public static final NotebookTab LAST = new NotebookTab(1);
    
    public NotebookTab(int value) {
        super(value);
    }
    
}
