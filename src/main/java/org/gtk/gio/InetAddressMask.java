package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link InetAddressMask} represents a range of IPv4 or IPv6 addresses
 * described by a base address and a length indicating how many bits
 * of the base address are relevant for matching purposes. These are
 * often given in string form. Eg, "10.0.0.0/8", or "fe80::/10".
 * @version 2.32
 */
public class InetAddressMask extends org.gtk.gobject.Object implements org.gtk.gio.Initable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInetAddressMask";
    
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
     * Create a InetAddressMask proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InetAddressMask(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to InetAddressMask if its GType is a (or inherits from) "GInetAddressMask".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "InetAddressMask" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GInetAddressMask", a ClassCastException will be thrown.
     */
    public static InetAddressMask castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GInetAddressMask"))) {
            return new InetAddressMask(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GInetAddressMask");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.InetAddress addr, int length) throws GErrorException {
        java.util.Objects.requireNonNull(addr, "Parameter 'addr' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_address_mask_new.invokeExact(
                    addr.handle(),
                    length,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link InetAddressMask} representing all addresses whose
     * first {@code length} bits match {@code addr}.
     * @param addr a {@link InetAddress}
     * @param length number of bits of {@code addr} to use
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public InetAddressMask(@NotNull org.gtk.gio.InetAddress addr, int length) throws GErrorException {
        super(constructNew(addr, length), Ownership.FULL);
    }
    
    private static Addressable constructNewFromString(@NotNull java.lang.String maskString) throws GErrorException {
        java.util.Objects.requireNonNull(maskString, "Parameter 'maskString' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_address_mask_new_from_string.invokeExact(
                    Interop.allocateNativeString(maskString),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Parses {@code mask_string} as an IP address and (optional) length, and
     * creates a new {@link InetAddressMask}. The length, if present, is
     * delimited by a "/". If it is not present, then the length is
     * assumed to be the full length of the address.
     * @param maskString an IP address or address/length string
     * @return a new {@link InetAddressMask} corresponding to {@code string}, or {@code null}
     * on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static InetAddressMask newFromString(@NotNull java.lang.String maskString) throws GErrorException {
        return new InetAddressMask(constructNewFromString(maskString), Ownership.FULL);
    }
    
    /**
     * Tests if {@code mask} and {@code mask2} are the same mask.
     * @param mask2 another {@link InetAddressMask}
     * @return whether {@code mask} and {@code mask2} are the same mask
     */
    public boolean equal(@NotNull org.gtk.gio.InetAddressMask mask2) {
        java.util.Objects.requireNonNull(mask2, "Parameter 'mask2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_mask_equal.invokeExact(
                    handle(),
                    mask2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets {@code mask}'s base address
     * @return {@code mask}'s base address
     */
    public @NotNull org.gtk.gio.InetAddress getAddress() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_address_mask_get_address.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.InetAddress(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@link SocketFamily} of {@code mask}'s address
     * @return the {@link SocketFamily} of {@code mask}'s address
     */
    public @NotNull org.gtk.gio.SocketFamily getFamily() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_mask_get_family.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SocketFamily(RESULT);
    }
    
    /**
     * Gets {@code mask}'s length
     * @return {@code mask}'s length
     */
    public int getLength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_mask_get_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tests if {@code address} falls within the range described by {@code mask}.
     * @param address a {@link InetAddress}
     * @return whether {@code address} falls within the range described by
     * {@code mask}.
     */
    public boolean matches(@NotNull org.gtk.gio.InetAddress address) {
        java.util.Objects.requireNonNull(address, "Parameter 'address' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_mask_matches.invokeExact(
                    handle(),
                    address.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Converts {@code mask} back to its corresponding string form.
     * @return a string corresponding to {@code mask}.
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_address_mask_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_inet_address_mask_new = Interop.downcallHandle(
            "g_inet_address_mask_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_mask_new_from_string = Interop.downcallHandle(
            "g_inet_address_mask_new_from_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_mask_equal = Interop.downcallHandle(
            "g_inet_address_mask_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_mask_get_address = Interop.downcallHandle(
            "g_inet_address_mask_get_address",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_mask_get_family = Interop.downcallHandle(
            "g_inet_address_mask_get_family",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_mask_get_length = Interop.downcallHandle(
            "g_inet_address_mask_get_length",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_mask_matches = Interop.downcallHandle(
            "g_inet_address_mask_matches",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_mask_to_string = Interop.downcallHandle(
            "g_inet_address_mask_to_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
