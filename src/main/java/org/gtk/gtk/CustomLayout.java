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
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCustomLayout"))) {
            return new CustomLayout(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCustomLayout");
        }
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_custom_layout_new = Interop.downcallHandle(
            "gtk_custom_layout_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
