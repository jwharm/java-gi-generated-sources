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
public class MenuLinkIter extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMenuLinkIter";
    
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
     * Create a MenuLinkIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MenuLinkIter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MenuLinkIter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MenuLinkIter(input, ownership);
    
    /**
     * Gets the name of the link at the current iterator position.
     * <p>
     * The iterator is not advanced.
     * @return the type of the link
     */
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_menu_link_iter_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
    public boolean getNext(@Nullable Out<java.lang.String> outLink, @Nullable Out<org.gtk.gio.MenuModel> value) {
        MemorySegment outLinkPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_menu_link_iter_get_next.invokeExact(
                    handle(),
                    (Addressable) (outLink == null ? MemoryAddress.NULL : (Addressable) outLinkPOINTER.address()),
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) valuePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (outLink != null) outLink.set(Marshal.addressToString.marshal(outLinkPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        if (value != null) value.set((org.gtk.gio.MenuModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gio.MenuModel.fromAddress).marshal(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the linked {@link MenuModel} at the current iterator position.
     * <p>
     * The iterator is not advanced.
     * @return the {@link MenuModel} that is linked to
     */
    public org.gtk.gio.MenuModel getValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_menu_link_iter_get_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.MenuModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.MenuModel.fromAddress).marshal(RESULT, Ownership.FULL);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_menu_link_iter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link MenuLinkIter.Builder} object constructs a {@link MenuLinkIter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link MenuLinkIter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link MenuLinkIter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MenuLinkIter}.
         * @return A new instance of {@code MenuLinkIter} with the properties 
         *         that were set in the Builder object.
         */
        public MenuLinkIter build() {
            return (MenuLinkIter) org.gtk.gobject.GObject.newWithProperties(
                MenuLinkIter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_menu_link_iter_get_name = Interop.downcallHandle(
            "g_menu_link_iter_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_link_iter_get_next = Interop.downcallHandle(
            "g_menu_link_iter_get_next",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_link_iter_get_value = Interop.downcallHandle(
            "g_menu_link_iter_get_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_link_iter_next = Interop.downcallHandle(
            "g_menu_link_iter_next",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_link_iter_get_type = Interop.downcallHandle(
            "g_menu_link_iter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
