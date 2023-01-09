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
     */
    protected FixedLayoutChild(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FixedLayoutChild> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FixedLayoutChild(input);
    
    /**
     * Retrieves the transformation of the child.
     * @return a {@code GskTransform}
     */
    public @Nullable org.gtk.gsk.Transform getTransform() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_fixed_layout_child_get_transform.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gsk.Transform.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Sets the transformation of the child of a {@code GtkFixedLayout}.
     * @param transform a {@code GskTransform}
     */
    public void setTransform(org.gtk.gsk.Transform transform) {
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_fixed_layout_child_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FixedLayoutChild.Builder} object constructs a {@link FixedLayoutChild} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FixedLayoutChild.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.LayoutChild.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FixedLayoutChild} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FixedLayoutChild}.
         * @return A new instance of {@code FixedLayoutChild} with the properties 
         *         that were set in the Builder object.
         */
        public FixedLayoutChild build() {
            return (FixedLayoutChild) org.gtk.gobject.GObject.newWithProperties(
                FixedLayoutChild.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The transform of the child.
         * @param transform The value for the {@code transform} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransform(org.gtk.gsk.Transform transform) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_fixed_layout_child_get_type != null;
    }
}
