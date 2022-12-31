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
    protected CustomLayout(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CustomLayout> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CustomLayout(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.CustomRequestModeFunc requestMode, org.gtk.gtk.CustomMeasureFunc measure, org.gtk.gtk.CustomAllocateFunc allocate) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_custom_layout_new.invokeExact(
                    (Addressable) (requestMode == null ? MemoryAddress.NULL : (Addressable) requestMode.toCallback()),
                    (Addressable) measure.toCallback(),
                    (Addressable) allocate.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
    public CustomLayout(@Nullable org.gtk.gtk.CustomRequestModeFunc requestMode, org.gtk.gtk.CustomMeasureFunc measure, org.gtk.gtk.CustomAllocateFunc allocate) {
        super(constructNew(requestMode, measure, allocate), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_custom_layout_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CustomLayout.Builder} object constructs a {@link CustomLayout} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CustomLayout.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.LayoutManager.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CustomLayout} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CustomLayout}.
         * @return A new instance of {@code CustomLayout} with the properties 
         *         that were set in the Builder object.
         */
        public CustomLayout build() {
            return (CustomLayout) org.gtk.gobject.GObject.newWithProperties(
                CustomLayout.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
