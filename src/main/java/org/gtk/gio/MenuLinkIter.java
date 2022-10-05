package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link MenuLinkIter} is an opaque structure type.  You must access it using
 * the functions below.
 */
public class MenuLinkIter extends org.gtk.gobject.Object {

    public MenuLinkIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MenuLinkIter */
    public static MenuLinkIter castFrom(org.gtk.gobject.Object gobject) {
        return new MenuLinkIter(gobject.refcounted());
    }
    
    static final MethodHandle g_menu_link_iter_get_name = Interop.downcallHandle(
        "g_menu_link_iter_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the link at the current iterator position.
     * <p>
     * The iterator is not advanced.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) g_menu_link_iter_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_menu_link_iter_get_next = Interop.downcallHandle(
        "g_menu_link_iter_get_next",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function combines g_menu_link_iter_next() with
     * g_menu_link_iter_get_name() and g_menu_link_iter_get_value().
     * <p>
     * First the iterator is advanced to the next (possibly first) link.
     * If that fails, then {@code false} is returned and there are no other effects.
     * <p>
     * If successful, {@code out_link} and {@code value} are set to the name and {@link MenuModel}
     * of the link that has just been advanced to.  At this point,
     * g_menu_link_iter_get_name() and g_menu_link_iter_get_value() will return the
     * same values again.
     * <p>
     * The value returned in {@code out_link} remains valid for as long as the iterator
     * remains at the current position.  The value returned in {@code value} must
     * be unreffed using g_object_unref() when it is no longer in use.
     */
    public boolean getNext(java.lang.String[] outLink, MenuModel[] value) {
        try {
            var RESULT = (int) g_menu_link_iter_get_next.invokeExact(handle(), Interop.allocateNativeArray(outLink).handle(), Interop.allocateNativeArray(value).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_menu_link_iter_get_value = Interop.downcallHandle(
        "g_menu_link_iter_get_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the linked {@link MenuModel} at the current iterator position.
     * <p>
     * The iterator is not advanced.
     */
    public MenuModel getValue() {
        try {
            var RESULT = (MemoryAddress) g_menu_link_iter_get_value.invokeExact(handle());
            return new MenuModel(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_menu_link_iter_next = Interop.downcallHandle(
        "g_menu_link_iter_next",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Attempts to advance the iterator to the next (possibly first)
     * link.
     * <p>
     * {@code true} is returned on success, or {@code false} if there are no more links.
     * <p>
     * You must call this function when you first acquire the iterator to
     * advance it to the first link (and determine if the first link exists
     * at all).
     */
    public boolean next() {
        try {
            var RESULT = (int) g_menu_link_iter_next.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
