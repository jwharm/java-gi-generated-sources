package org.gtk.gtk;

/**
 * Specifies the side of the entry at which an icon is placed.
 */
public class EntryIconPosition extends io.github.jwharm.javagi.Enumeration {

    /**
     * At the beginning of the entry (depending on the text direction).
     */
    public static final EntryIconPosition PRIMARY = new EntryIconPosition(0);
    
    /**
     * At the end of the entry (depending on the text direction).
     */
    public static final EntryIconPosition SECONDARY = new EntryIconPosition(1);
    
    public EntryIconPosition(int value) {
        super(value);
    }
    
}
