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
public class LayoutChild extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkLayoutChild";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a LayoutChild proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected LayoutChild(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, LayoutChild> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new LayoutChild(input, ownership);
    
    /**
     * Retrieves the {@code GtkWidget} associated to the given {@code layout_child}.
     * @return a {@code GtkWidget}
     */
    public org.gtk.gtk.Widget getChildWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_layout_child_get_child_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the {@code GtkLayoutManager} instance that created the
     * given {@code layout_child}.
     * @return a {@code GtkLayoutManager}
     */
    public org.gtk.gtk.LayoutManager getLayoutManager() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_layout_child_get_layout_manager.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.LayoutManager) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.LayoutManager.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_layout_child_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link LayoutChild.Builder} object constructs a {@link LayoutChild} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link LayoutChild.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link LayoutChild} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link LayoutChild}.
         * @return A new instance of {@code LayoutChild} with the properties 
         *         that were set in the Builder object.
         */
        public LayoutChild build() {
            return (LayoutChild) org.gtk.gobject.GObject.newWithProperties(
                LayoutChild.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The widget that is associated to the {@code GtkLayoutChild} instance.
         * @param childWidget The value for the {@code child-widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChildWidget(org.gtk.gtk.Widget childWidget) {
            names.add("child-widget");
            values.add(org.gtk.gobject.Value.create(childWidget));
            return this;
        }
        
        /**
         * The layout manager that created the {@code GtkLayoutChild} instance.
         * @param layoutManager The value for the {@code layout-manager} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLayoutManager(org.gtk.gtk.LayoutManager layoutManager) {
            names.add("layout-manager");
            values.add(org.gtk.gobject.Value.create(layoutManager));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_layout_child_get_child_widget = Interop.downcallHandle(
            "gtk_layout_child_get_child_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_layout_child_get_layout_manager = Interop.downcallHandle(
            "gtk_layout_child_get_layout_manager",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_layout_child_get_type = Interop.downcallHandle(
            "gtk_layout_child_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
