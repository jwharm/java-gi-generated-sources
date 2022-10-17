package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link MenuAttributeIter} is an opaque structure type.  You must access it
 * using the functions below.
 */
public class MenuAttributeIter extends org.gtk.gobject.Object {

    public MenuAttributeIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MenuAttributeIter */
    public static MenuAttributeIter castFrom(org.gtk.gobject.Object gobject) {
        return new MenuAttributeIter(gobject.refcounted());
    }
    
    private static final MethodHandle g_menu_attribute_iter_get_name = Interop.downcallHandle(
        "g_menu_attribute_iter_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the attribute at the current iterator position, as
     * a string.
     * <p>
     * The iterator is not advanced.
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_menu_attribute_iter_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_menu_attribute_iter_get_next = Interop.downcallHandle(
        "g_menu_attribute_iter_get_next",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean getNext(@NotNull Out<java.lang.String> outName, @NotNull Out<org.gtk.glib.Variant> value) {
        MemorySegment outNamePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_menu_attribute_iter_get_next.invokeExact(handle(), (Addressable) outNamePOINTER.address(), (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outName.set(outNamePOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        value.set(new org.gtk.glib.Variant(Refcounted.get(valuePOINTER.get(ValueLayout.ADDRESS, 0), true)));
        return RESULT != 0;
    }
    
    private static final MethodHandle g_menu_attribute_iter_get_value = Interop.downcallHandle(
        "g_menu_attribute_iter_get_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of the attribute at the current iterator position.
     * <p>
     * The iterator is not advanced.
     */
    public @NotNull org.gtk.glib.Variant getValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_menu_attribute_iter_get_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_menu_attribute_iter_next = Interop.downcallHandle(
        "g_menu_attribute_iter_next",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean next() {
        int RESULT;
        try {
            RESULT = (int) g_menu_attribute_iter_next.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
}
