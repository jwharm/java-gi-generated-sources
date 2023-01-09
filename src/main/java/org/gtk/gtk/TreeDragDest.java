package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for Drag-and-Drop destinations in {@code GtkTreeView}.
 */
public interface TreeDragDest extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeDragDestImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TreeDragDestImpl(input);
    
    /**
     * Asks the {@code GtkTreeDragDest} to insert a row before the path {@code dest},
     * deriving the contents of the row from {@code value}. If {@code dest} is
     * outside the tree so that inserting before it is impossible, {@code false}
     * will be returned. Also, {@code false} may be returned if the new row is
     * not created for some model-specific reason.  Should robustly handle
     * a {@code dest} no longer found in the model!
     * @param dest row to drop in front of
     * @param value data to drop
     * @return whether a new row was created before position {@code dest}
     */
    default boolean dragDataReceived(org.gtk.gtk.TreePath dest, org.gtk.gobject.Value value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_drag_dest_drag_data_received.invokeExact(
                    handle(),
                    dest.handle(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines whether a drop is possible before the given {@code dest_path},
     * at the same depth as {@code dest_path}. i.e., can we drop the data in
     * {@code value} at that location. {@code dest_path} does not have to
     * exist; the return value will almost certainly be {@code false} if the
     * parent of {@code dest_path} doesn’t exist, though.
     * @param destPath destination row
     * @param value the data being dropped
     * @return {@code true} if a drop is possible before {@code dest_path}
     */
    default boolean rowDropPossible(org.gtk.gtk.TreePath destPath, org.gtk.gobject.Value value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_drag_dest_row_drop_possible.invokeExact(
                    handle(),
                    destPath.handle(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_tree_drag_dest_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_drag_dest_drag_data_received = Interop.downcallHandle(
                "gtk_tree_drag_dest_drag_data_received",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_drag_dest_row_drop_possible = Interop.downcallHandle(
                "gtk_tree_drag_dest_row_drop_possible",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_drag_dest_get_type = Interop.downcallHandle(
                "gtk_tree_drag_dest_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The TreeDragDestImpl type represents a native instance of the TreeDragDest interface.
     */
    class TreeDragDestImpl extends org.gtk.gobject.GObject implements TreeDragDest {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of TreeDragDest for the provided memory address.
         * @param address the memory address of the instance
         */
        public TreeDragDestImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_tree_drag_dest_get_type != null;
    }
}
