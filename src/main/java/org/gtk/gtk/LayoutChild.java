package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkLayoutChild} is the base class for objects that are meant to hold
 * layout properties.
 * <p>
 * If a {@code GtkLayoutManager} has per-child properties, like their packing type,
 * or the horizontal and vertical span, or the icon name, then the layout
 * manager should use a {@code GtkLayoutChild} implementation to store those properties.
 * <p>
 * A {@code GtkLayoutChild} instance is only ever valid while a widget is part
 * of a layout.
 */
public class LayoutChild extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkLayoutChild";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public LayoutChild(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to LayoutChild if its GType is a (or inherits from) "GtkLayoutChild".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "LayoutChild" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkLayoutChild", a ClassCastException will be thrown.
     */
    public static LayoutChild castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkLayoutChild"))) {
            return new LayoutChild(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkLayoutChild");
        }
    }
    
    /**
     * Retrieves the {@code GtkWidget} associated to the given {@code layout_child}.
     * @return a {@code GtkWidget}
     */
    public @NotNull org.gtk.gtk.Widget getChildWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_layout_child_get_child_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the {@code GtkLayoutManager} instance that created the
     * given {@code layout_child}.
     * @return a {@code GtkLayoutManager}
     */
    public @NotNull org.gtk.gtk.LayoutManager getLayoutManager() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_layout_child_get_layout_manager.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.LayoutManager(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_layout_child_get_child_widget = Interop.downcallHandle(
            "gtk_layout_child_get_child_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_layout_child_get_layout_manager = Interop.downcallHandle(
            "gtk_layout_child_get_layout_manager",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
