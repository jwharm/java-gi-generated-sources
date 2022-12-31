package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkEveryFilter} matches an item when each of its filters matches.
 * <p>
 * To add filters to a {@code GtkEveryFilter}, use {@link MultiFilter#append}.
 */
public class EveryFilter extends org.gtk.gtk.MultiFilter implements org.gtk.gio.ListModel, org.gtk.gtk.Buildable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEveryFilter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EveryFilter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected EveryFilter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, EveryFilter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new EveryFilter(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_every_filter_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty "every" filter.
     * <p>
     * Use {@link MultiFilter#append} to add filters to it.
     * <p>
     * This filter matches an item if each of the filters added to it
     * matches the item. In particular, this means that if no filter
     * has been added to it, the filter matches every item.
     */
    public EveryFilter() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_every_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link EveryFilter.Builder} object constructs a {@link EveryFilter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EveryFilter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.MultiFilter.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link EveryFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EveryFilter}.
         * @return A new instance of {@code EveryFilter} with the properties 
         *         that were set in the Builder object.
         */
        public EveryFilter build() {
            return (EveryFilter) org.gtk.gobject.GObject.newWithProperties(
                EveryFilter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_every_filter_new = Interop.downcallHandle(
            "gtk_every_filter_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_every_filter_get_type = Interop.downcallHandle(
            "gtk_every_filter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
