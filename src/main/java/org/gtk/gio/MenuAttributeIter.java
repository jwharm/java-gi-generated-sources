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
public class MenuAttributeIter extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMenuAttributeIter";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
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
     * Create a MenuAttributeIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MenuAttributeIter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MenuAttributeIter if its GType is a (or inherits from) "GMenuAttributeIter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MenuAttributeIter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GMenuAttributeIter", a ClassCastException will be thrown.
     */
    public static MenuAttributeIter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), MenuAttributeIter.getType())) {
            return new MenuAttributeIter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GMenuAttributeIter");
        }
    }
    
    /**
     * Gets the name of the attribute at the current iterator position, as
     * a string.
     * <p>
     * The iterator is not advanced.
     * @return the name of the attribute
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_menu_attribute_iter_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
    public boolean getNext(@NotNull Out<java.lang.String> outName, @NotNull PointerProxy<org.gtk.glib.Variant> value) {
        java.util.Objects.requireNonNull(outName, "Parameter 'outName' must not be null");
        MemorySegment outNamePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_menu_attribute_iter_get_next.invokeExact(
                    handle(),
                    (Addressable) outNamePOINTER.address(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outName.set(Interop.getStringFrom(outNamePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Gets the value of the attribute at the current iterator position.
     * <p>
     * The iterator is not advanced.
     * @return the value of the current attribute
     */
    public @NotNull org.gtk.glib.Variant getValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_menu_attribute_iter_get_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.FULL);
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
            RESULT = (int) DowncallHandles.g_menu_attribute_iter_next.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_menu_attribute_iter_get_type.invokeExact();
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
         * A {@link MenuAttributeIter.Build} object constructs a {@link MenuAttributeIter} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link MenuAttributeIter} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MenuAttributeIter} using {@link MenuAttributeIter#castFrom}.
         * @return A new instance of {@code MenuAttributeIter} with the properties 
         *         that were set in the Build object.
         */
        public MenuAttributeIter construct() {
            return MenuAttributeIter.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    MenuAttributeIter.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
