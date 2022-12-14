package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for Drag-and-Drop destinations in {@code GtkTreeView}.
 */
public interface TreeDragSource extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeDragSourceImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TreeDragSourceImpl(input);
    
    /**
     * Asks the {@code GtkTreeDragSource} to delete the row at {@code path}, because
     * it was moved somewhere else via drag-and-drop. Returns {@code false}
     * if the deletion fails because {@code path} no longer exists, or for
     * some model-specific reason. Should robustly handle a {@code path} no
     * longer found in the model!
     * @param path row that was being dragged
     * @return {@code true} if the row was successfully deleted
     */
    default boolean dragDataDelete(org.gtk.gtk.TreePath path) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_drag_source_drag_data_delete.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Asks the {@code GtkTreeDragSource} to return a {@code GdkContentProvider} representing
     * the row at {@code path}. Should robustly handle a {@code path} no
     * longer found in the model!
     * @param path row that was dragged
     * @return a {@code GdkContentProvider} for the
     *    given {@code path}
     */
    default @Nullable org.gtk.gdk.ContentProvider dragDataGet(org.gtk.gtk.TreePath path) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_drag_source_drag_data_get.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gdk.ContentProvider) Interop.register(RESULT, org.gtk.gdk.ContentProvider.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Asks the {@code GtkTreeDragSource} whether a particular row can be used as
     * the source of a DND operation. If the source doesn???t implement
     * this interface, the row is assumed draggable.
     * @param path row on which user is initiating a drag
     * @return {@code true} if the row can be dragged
     */
    default boolean rowDraggable(org.gtk.gtk.TreePath path) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_drag_source_row_draggable.invokeExact(
                    handle(),
                    path.handle());
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
            RESULT = (long) DowncallHandles.gtk_tree_drag_source_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_drag_source_drag_data_delete = Interop.downcallHandle(
                "gtk_tree_drag_source_drag_data_delete",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_drag_source_drag_data_get = Interop.downcallHandle(
                "gtk_tree_drag_source_drag_data_get",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_drag_source_row_draggable = Interop.downcallHandle(
                "gtk_tree_drag_source_row_draggable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_drag_source_get_type = Interop.downcallHandle(
                "gtk_tree_drag_source_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The TreeDragSourceImpl type represents a native instance of the TreeDragSource interface.
     */
    class TreeDragSourceImpl extends org.gtk.gobject.GObject implements TreeDragSource {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of TreeDragSource for the provided memory address.
         * @param address the memory address of the instance
         */
        public TreeDragSourceImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_tree_drag_source_get_type != null;
    }
}
