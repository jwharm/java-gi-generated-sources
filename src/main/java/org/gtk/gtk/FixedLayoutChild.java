package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkLayoutChild} subclass for children in a {@code GtkFixedLayout}.
 */
public class FixedLayoutChild extends org.gtk.gtk.LayoutChild {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFixedLayoutChild";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FixedLayoutChild proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FixedLayoutChild(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FixedLayoutChild if its GType is a (or inherits from) "GtkFixedLayoutChild".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FixedLayoutChild} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFixedLayoutChild", a ClassCastException will be thrown.
     */
    public static FixedLayoutChild castFrom(org.gtk.gobject.Object gobject) {
            return new FixedLayoutChild(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Retrieves the transformation of the child.
     * @return a {@code GskTransform}
     */
    public @Nullable org.gtk.gsk.Transform getTransform() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_fixed_layout_child_get_transform.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.Transform(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the transformation of the child of a {@code GtkFixedLayout}.
     * @param transform a {@code GskTransform}
     */
    public void setTransform(@NotNull org.gtk.gsk.Transform transform) {
        java.util.Objects.requireNonNull(transform, "Parameter 'transform' must not be null");
        try {
            DowncallHandles.gtk_fixed_layout_child_set_transform.invokeExact(
                    handle(),
                    transform.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_fixed_layout_child_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.LayoutChild.Build {
        
         /**
         * A {@link FixedLayoutChild.Build} object constructs a {@link FixedLayoutChild} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link FixedLayoutChild} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FixedLayoutChild} using {@link FixedLayoutChild#castFrom}.
         * @return A new instance of {@code FixedLayoutChild} with the properties 
         *         that were set in the Build object.
         */
        public FixedLayoutChild construct() {
            return FixedLayoutChild.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    FixedLayoutChild.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The transform of the child.
         * @param transform The value for the {@code transform} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransform(org.gtk.gsk.Transform transform) {
            names.add("transform");
            values.add(org.gtk.gobject.Value.create(transform));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_fixed_layout_child_get_transform = Interop.downcallHandle(
            "gtk_fixed_layout_child_get_transform",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_fixed_layout_child_set_transform = Interop.downcallHandle(
            "gtk_fixed_layout_child_set_transform",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_fixed_layout_child_get_type = Interop.downcallHandle(
            "gtk_fixed_layout_child_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
