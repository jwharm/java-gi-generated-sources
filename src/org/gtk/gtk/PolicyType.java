package org.gtk.gtk;

/**
 * Determines how the size should be computed to achieve the one of the
 * visibility mode for the scrollbars.
 */
public class PolicyType extends io.github.jwharm.javagi.Enumeration {

    /**
     * The scrollbar is always visible. The view size is
     *   independent of the content.
     */
    public static final PolicyType ALWAYS = new PolicyType(0);
    
    /**
     * The scrollbar will appear and disappear as necessary.
     *   For example, when all of a {@code GtkTreeView} can not be seen.
     */
    public static final PolicyType AUTOMATIC = new PolicyType(1);
    
    /**
     * The scrollbar should never appear. In this mode the
     *   content determines the size.
     */
    public static final PolicyType NEVER = new PolicyType(2);
    
    /**
     * Don't show a scrollbar, but don't force the
     *   size to follow the content. This can be used e.g. to make multiple
     *   scrolled windows share a scrollbar.
     */
    public static final PolicyType EXTERNAL = new PolicyType(3);
    
    public PolicyType(int value) {
        super(value);
    }
    
}
