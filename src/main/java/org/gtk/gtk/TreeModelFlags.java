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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
}
