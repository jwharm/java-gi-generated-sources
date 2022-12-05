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
     * Cast object to TreeDragDest if its GType is a (or inherits from) "GtkTreeDragDest".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TreeDragDest} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkTreeDragDest", a ClassCastException will be thrown.
     */
    public static TreeDragDest castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TreeDragDest.getType())) {
            return new TreeDragDestImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkTreeDragDest");
        }
    }
    
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
    default boolean dragDataReceived(@NotNull org.gtk.gtk.TreePath dest, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_drag_dest_drag_data_received.invokeExact(
                    handle(),
                    dest.handle(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    default boolean rowDropPossible(@NotNull org.gtk.gtk.TreePath destPath, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(destPath, "Parameter 'destPath' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_drag_dest_row_drop_possible.invokeExact(
                    handle(),
                    destPath.handle(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    
    class TreeDragDestImpl extends org.gtk.gobject.Object implements TreeDragDest {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public TreeDragDestImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
