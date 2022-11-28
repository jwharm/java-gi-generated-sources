package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkCustomLayout} uses closures for size negotiation.
 * <p>
 * A {@code GtkCustomLayout }uses closures matching to the old {@code GtkWidget}
 * virtual functions for size negotiation, as a convenience API to
 * ease the porting towards the corresponding `GtkLayoutManager
 * virtual functions.
 */
public class CustomLayout extends org.gtk.gtk.LayoutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCustomLayout";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CustomLayout proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CustomLayout(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CustomLayout if its GType is a (or inherits from) "GtkCustomLayout".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CustomLayout} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCustomLayout", a ClassCastException will be thrown.
     */
    public static CustomLayout castFrom(org.gtk.gobject.Object gobject) {
            return new CustomLayout(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gtk.CustomRequestModeFunc requestMode, @NotNull org.gtk.gtk.CustomMeasureFunc measure, @NotNull org.gtk.gtk.CustomAllocateFunc allocate) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a new legacy layout manager.
     * <p>
     * Legacy layout managers map to the old {@code GtkWidget} size negotiation
     * virtual functions, and are meant to be used during the transition
     * from layout containers to layout manager delegates.
     * @param requestMode a function to retrieve
     *   the {@code GtkSizeRequestMode} of the widget using the layout; the
     *   default request mode is {@link SizeRequestMode#CONSTANT_SIZE}
     * @param measure a function to measure the widget using the layout manager
     * @param allocate a function to allocate the children of the widget using
     *   the layout manager
     */
    public CustomLayout(@Nullable org.gtk.gtk.CustomRequestModeFunc requestMode, @NotNull org.gtk.gtk.CustomMeasureFunc measure, @NotNull org.gtk.gtk.CustomAllocateFunc allocate) {
        this(null, null); // avoid compiler error
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_custom_layout_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.LayoutManager.Build {
        
         /**
         * A {@link CustomLayout.Build} object constructs a {@link CustomLayout} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CustomLayout} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CustomLayout} using {@link CustomLayout#castFrom}.
         * @return A new instance of {@code CustomLayout} with the properties 
         *         that were set in the Build object.
         */
        public CustomLayout construct() {
            return CustomLayout.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CustomLayout.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_custom_layout_new = Interop.downcallHandle(
            "gtk_custom_layout_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_custom_layout_get_type = Interop.downcallHandle(
            "gtk_custom_layout_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
