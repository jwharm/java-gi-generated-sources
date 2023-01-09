package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link MenuAttributeIter} is an opaque structure type.  You must access it
 * using the functions below.
 * @version 2.32
 */
public class MenuAttributeIter extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMenuAttributeIter";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a MenuAttributeIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MenuAttributeIter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MenuAttributeIter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MenuAttributeIter(input);
    
    /**
     * Gets the name of the attribute at the current iterator position, as
     * a string.
     * <p>
     * The iterator is not advanced.
     * @return the name of the attribute
     */
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_menu_attribute_iter_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * This function combines g_menu_attribute_iter_next() with
     * g_menu_attribute_iter_get_name() and g_menu_attribute_iter_get_value().
     * <p>
     * First the iterator is advanced to the next (possibly first) attribute.
     * If that fails, then {@code false} is returned and there are no other
     * effects.
     * <p>
     * If successful, {@code name} and {@code value} are set to the name and value of the
     * attribute that has just been advanced to.  At this point,
     * g_menu_attribute_iter_get_name() and g_menu_attribute_iter_get_value() will
     * return the same values again.
     * <p>
     * The value returned in {@code name} remains valid for as long as the iterator
     * remains at the current position.  The value returned in {@code value} must
     * be unreffed using g_variant_unref() when it is no longer in use.
     * @param outName the type of the attribute
     * @param value the attribute value
     * @return {@code true} on success, or {@code false} if there is no additional
     *     attribute
     */
    public boolean getNext(@Nullable Out<java.lang.String> outName, @Nullable Out<org.gtk.glib.Variant> value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment outNamePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment valuePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_menu_attribute_iter_get_next.invokeExact(
                        handle(),
                        (Addressable) (outName == null ? MemoryAddress.NULL : (Addressable) outNamePOINTER.address()),
                        (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) valuePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (outName != null) outName.set(Marshal.addressToString.marshal(outNamePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (value != null) value.set(org.gtk.glib.Variant.fromAddress.marshal(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Gets the value of the attribute at the current iterator position.
     * <p>
     * The iterator is not advanced.
     * @return the value of the current attribute
     */
    public org.gtk.glib.Variant getValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_menu_attribute_iter_get_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Variant.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Attempts to advance the iterator to the next (possibly first)
     * attribute.
     * <p>
     * {@code true} is returned on success, or {@code false} if there are no more
     * attributes.
     * <p>
     * You must call this function when you first acquire the iterator
     * to advance it to the first attribute (and determine if the first
     * attribute exists at all).
     * @return {@code true} on success, or {@code false} when there are no more attributes
     */
    public boolean next() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_menu_attribute_iter_next.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_menu_attribute_iter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link MenuAttributeIter.Builder} object constructs a {@link MenuAttributeIter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link MenuAttributeIter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link MenuAttributeIter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MenuAttributeIter}.
         * @return A new instance of {@code MenuAttributeIter} with the properties 
         *         that were set in the Builder object.
         */
        public MenuAttributeIter build() {
            return (MenuAttributeIter) org.gtk.gobject.GObject.newWithProperties(
                MenuAttributeIter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_menu_attribute_iter_get_name = Interop.downcallHandle(
                "g_menu_attribute_iter_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_menu_attribute_iter_get_next = Interop.downcallHandle(
                "g_menu_attribute_iter_get_next",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_menu_attribute_iter_get_value = Interop.downcallHandle(
                "g_menu_attribute_iter_get_value",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_menu_attribute_iter_next = Interop.downcallHandle(
                "g_menu_attribute_iter_next",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_menu_attribute_iter_get_type = Interop.downcallHandle(
                "g_menu_attribute_iter_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_menu_attribute_iter_get_type != null;
    }
}
