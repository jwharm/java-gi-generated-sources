package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These flags indicate various properties of a {@code GtkTreeModel}.
 * <p>
 * They are returned by {@link TreeModel#getFlags}, and must be
 * static for the lifetime of the object. A more complete description
 * of {@link TreeModelFlags#ITERS_PERSIST} can be found in the overview of
 * this section.
 */
public class TreeModelFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeModelFlags";
    
    /**
     * iterators survive all signals
     *   emitted by the tree
     */
    public static final TreeModelFlags ITERS_PERSIST = new TreeModelFlags(1);
    
    /**
     * the model is a list only, and never
     *   has children
     */
    public static final TreeModelFlags LIST_ONLY = new TreeModelFlags(2);
    
    public TreeModelFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TreeModelFlags or(TreeModelFlags... masks) {
        int value = this.getValue();
        for (TreeModelFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TreeModelFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TreeModelFlags combined(TreeModelFlags mask, TreeModelFlags... masks) {
        int value = mask.getValue();
        for (TreeModelFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TreeModelFlags(value);
    }
}
