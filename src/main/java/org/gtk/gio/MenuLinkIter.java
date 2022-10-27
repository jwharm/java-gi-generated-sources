package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link MenuLinkIter} is an opaque structure type.  You must access it using
 * the functions below.
 * @version 2.32
 */
public class MenuLinkIter extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.MenuLinkIterPrivate.getMemoryLayout().withName("priv")
    ).withName("GMenuLinkIter");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public MenuLinkIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MenuLinkIter */
    public static MenuLinkIter castFrom(org.gtk.gobject.Object gobject) {
        return new MenuLinkIter(gobject.refcounted());
    }
    
    /**
     * Gets the name of the link at the current iterator position.
     * <p>
     * The iterator is not advanced.
     * @return the type of the link
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_menu_link_iter_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
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
     * @param outLink the name of the link
     * @param value the linked {@link MenuModel}
     * @return {@code true} on success, or {@code false} if there is no additional link
     */
    public boolean getNext(@NotNull Out<java.lang.String> outLink, @NotNull Out<org.gtk.gio.MenuModel> value) {
        java.util.Objects.requireNonNull(outLink, "Parameter 'outLink' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment outLinkPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_menu_link_iter_get_next.invokeExact(handle(), (Addressable) outLinkPOINTER.address(), (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outLink.set(outLinkPOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        value.set(new org.gtk.gio.MenuModel(Refcounted.get(valuePOINTER.get(ValueLayout.ADDRESS, 0), true)));
        return RESULT != 0;
    }
    
    /**
     * Gets the linked {@link MenuModel} at the current iterator position.
     * <p>
     * The iterator is not advanced.
     * @return the {@link MenuModel} that is linked to
     */
    public @NotNull org.gtk.gio.MenuModel getValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_menu_link_iter_get_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, true));
    }
    
    /**
     * Attempts to advance the iterator to the next (possibly first)
     * link.
     * <p>
     * {@code true} is returned on success, or {@code false} if there are no more links.
     * <p>
     * You must call this function when you first acquire the iterator to
     * advance it to the first link (and determine if the first link exists
     * at all).
     * @return {@code true} on success, or {@code false} when there are no more links
     */
    public boolean next() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_menu_link_iter_next.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_menu_link_iter_get_name = Interop.downcallHandle(
            "g_menu_link_iter_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_link_iter_get_next = Interop.downcallHandle(
            "g_menu_link_iter_get_next",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_link_iter_get_value = Interop.downcallHandle(
            "g_menu_link_iter_get_value",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_link_iter_next = Interop.downcallHandle(
            "g_menu_link_iter_next",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
