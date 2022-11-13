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
    
    private static final java.lang.String C_TYPE_NAME = "GMenuLinkIter";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Create a MenuLinkIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MenuLinkIter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MenuLinkIter if its GType is a (or inherits from) "GMenuLinkIter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MenuLinkIter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GMenuLinkIter", a ClassCastException will be thrown.
     */
    public static MenuLinkIter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GMenuLinkIter"))) {
            return new MenuLinkIter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GMenuLinkIter");
        }
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
            RESULT = (MemoryAddress) DowncallHandles.g_menu_link_iter_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
    public boolean getNext(@NotNull Out<java.lang.String> outLink, @NotNull PointerProxy<org.gtk.gio.MenuModel> value) {
        java.util.Objects.requireNonNull(outLink, "Parameter 'outLink' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment outLinkPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_menu_link_iter_get_next.invokeExact(
                    handle(),
                    (Addressable) outLinkPOINTER.address(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outLink.set(Interop.getStringFrom(outLinkPOINTER.get(ValueLayout.ADDRESS, 0)));
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
            RESULT = (MemoryAddress) DowncallHandles.g_menu_link_iter_get_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(RESULT, Ownership.FULL);
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
            RESULT = (int) DowncallHandles.g_menu_link_iter_next.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_menu_link_iter_get_name = Interop.downcallHandle(
            "g_menu_link_iter_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_link_iter_get_next = Interop.downcallHandle(
            "g_menu_link_iter_get_next",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_link_iter_get_value = Interop.downcallHandle(
            "g_menu_link_iter_get_value",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_link_iter_next = Interop.downcallHandle(
            "g_menu_link_iter_next",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
}
