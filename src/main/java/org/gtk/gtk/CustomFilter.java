package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkCustomFilter} determines whether to include items with a callback.
 */
public class CustomFilter extends org.gtk.gtk.Filter {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCustomFilter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CustomFilter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CustomFilter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CustomFilter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CustomFilter(input);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.CustomFilterFunc matchFunc, org.gtk.glib.DestroyNotify userDestroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_custom_filter_new.invokeExact(
                    (Addressable) (matchFunc == null ? MemoryAddress.NULL : (Addressable) matchFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) userDestroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new filter using the given {@code match_func} to filter
     * items.
     * <p>
     * If {@code match_func} is {@code null}, the filter matches all items.
     * <p>
     * If the filter func changes its filtering behavior,
     * gtk_filter_changed() needs to be called.
     * @param matchFunc function to filter items
     * @param userDestroy destroy notify for {@code user_data}
     */
    public CustomFilter(@Nullable org.gtk.gtk.CustomFilterFunc matchFunc, org.gtk.glib.DestroyNotify userDestroy) {
        super(constructNew(matchFunc, userDestroy));
        this.takeOwnership();
    }
    
    /**
     * Sets the function used for filtering items.
     * <p>
     * If {@code match_func} is {@code null}, the filter matches all items.
     * <p>
     * If the filter func changes its filtering behavior,
     * gtk_filter_changed() needs to be called.
     * <p>
     * If a previous function was set, its {@code user_destroy} will be
     * called now.
     * @param matchFunc function to filter items
     * @param userDestroy destroy notify for {@code user_data}
     */
    public void setFilterFunc(@Nullable org.gtk.gtk.CustomFilterFunc matchFunc, org.gtk.glib.DestroyNotify userDestroy) {
        try {
            DowncallHandles.gtk_custom_filter_set_filter_func.invokeExact(
                    handle(),
                    (Addressable) (matchFunc == null ? MemoryAddress.NULL : (Addressable) matchFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) userDestroy.toCallback());
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
            RESULT = (long) DowncallHandles.gtk_custom_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CustomFilter.Builder} object constructs a {@link CustomFilter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CustomFilter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Filter.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CustomFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CustomFilter}.
         * @return A new instance of {@code CustomFilter} with the properties 
         *         that were set in the Builder object.
         */
        public CustomFilter build() {
            return (CustomFilter) org.gtk.gobject.GObject.newWithProperties(
                CustomFilter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_custom_filter_new = Interop.downcallHandle(
                "gtk_custom_filter_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_custom_filter_set_filter_func = Interop.downcallHandle(
                "gtk_custom_filter_set_filter_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_custom_filter_get_type = Interop.downcallHandle(
                "gtk_custom_filter_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_custom_filter_get_type != null;
    }
}
