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
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.MenuAttributeIterPrivate.getMemoryLayout().withName("priv")
    ).withName("GMenuAttributeIter");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public MenuAttributeIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MenuAttributeIter */
    public static MenuAttributeIter castFrom(org.gtk.gobject.Object gobject) {
        return new MenuAttributeIter(gobject.refcounted());
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
            RESULT = (MemoryAddress) DowncallHandles.g_menu_attribute_iter_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
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
    public boolean getNext(@NotNull Out<java.lang.String> outName, @NotNull Out<org.gtk.glib.Variant> value) {
        java.util.Objects.requireNonNull(outName, "Parameter 'outName' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment outNamePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_menu_attribute_iter_get_next.invokeExact(handle(), (Addressable) outNamePOINTER.address(), (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outName.set(outNamePOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        value.set(new org.gtk.glib.Variant(Refcounted.get(valuePOINTER.get(ValueLayout.ADDRESS, 0), true)));
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
            RESULT = (MemoryAddress) DowncallHandles.g_menu_attribute_iter_get_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
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
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_menu_attribute_iter_get_name = Interop.downcallHandle(
            "g_menu_attribute_iter_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_attribute_iter_get_next = Interop.downcallHandle(
            "g_menu_attribute_iter_get_next",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_attribute_iter_get_value = Interop.downcallHandle(
            "g_menu_attribute_iter_get_value",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_attribute_iter_next = Interop.downcallHandle(
            "g_menu_attribute_iter_next",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
