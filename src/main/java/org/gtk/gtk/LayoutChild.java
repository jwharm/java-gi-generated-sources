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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a LayoutChild proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public LayoutChild(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to LayoutChild if its GType is a (or inherits from) "GtkLayoutChild".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code LayoutChild} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkLayoutChild", a ClassCastException will be thrown.
     */
    public static LayoutChild castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), LayoutChild.getType())) {
            return new LayoutChild(gobject.handle(), gobject.yieldOwnership());
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
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
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
        return new org.gtk.gtk.LayoutManager(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_layout_child_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link LayoutChild.Build} object constructs a {@link LayoutChild} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link LayoutChild} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link LayoutChild} using {@link LayoutChild#castFrom}.
         * @return A new instance of {@code LayoutChild} with the properties 
         *         that were set in the Build object.
         */
        public LayoutChild construct() {
            return LayoutChild.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    LayoutChild.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The widget that is associated to the {@code GtkLayoutChild} instance.
         * @param childWidget The value for the {@code child-widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChildWidget(org.gtk.gtk.Widget childWidget) {
            names.add("child-widget");
            values.add(org.gtk.gobject.Value.create(childWidget));
            return this;
        }
        
        /**
         * The layout manager that created the {@code GtkLayoutChild} instance.
         * @param layoutManager The value for the {@code layout-manager} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLayoutManager(org.gtk.gtk.LayoutManager layoutManager) {
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
