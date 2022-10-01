package org.gtk.gtk;

/**
 * Represents the packing location of a children in its parent.
 * <p>
 * See {@link WindowControls} for example.
 */
public class PackType extends io.github.jwharm.javagi.Enumeration {

    /**
     * The child is packed into the start of the widget
     */
    public static final PackType START = new PackType(0);
    
    /**
     * The child is packed into the end of the widget
     */
    public static final PackType END = new PackType(1);
    
    public PackType(int value) {
        super(value);
    }
    
}
