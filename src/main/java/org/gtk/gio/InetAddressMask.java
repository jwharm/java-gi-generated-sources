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
public class InetAddressMask extends org.gtk.gobject.GObject implements org.gtk.gio.Initable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInetAddressMask";
    
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
     * Create a InetAddressMask proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected InetAddressMask(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, InetAddressMask> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new InetAddressMask(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.InetAddress addr, int length) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
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
    }
    
    /**
     * Creates a new {@link InetAddressMask} representing all addresses whose
     * first {@code length} bits match {@code addr}.
     * @param addr a {@link InetAddress}
     * @param length number of bits of {@code addr} to use
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public InetAddressMask(org.gtk.gio.InetAddress addr, int length) throws GErrorException {
        super(constructNew(addr, length));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFromString(java.lang.String maskString) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_inet_address_mask_new_from_string.invokeExact(Marshal.stringToAddress.marshal(maskString, SCOPE),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
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
    public static InetAddressMask newFromString(java.lang.String maskString) throws GErrorException {
        var RESULT = constructNewFromString(maskString);
        var OBJECT = (org.gtk.gio.InetAddressMask) Interop.register(RESULT, org.gtk.gio.InetAddressMask.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Tests if {@code mask} and {@code mask2} are the same mask.
     * @param mask2 another {@link InetAddressMask}
     * @return whether {@code mask} and {@code mask2} are the same mask
     */
    public boolean equal(org.gtk.gio.InetAddressMask mask2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_mask_equal.invokeExact(
                    handle(),
                    mask2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets {@code mask}'s base address
     * @return {@code mask}'s base address
     */
    public org.gtk.gio.InetAddress getAddress() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_address_mask_get_address.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.InetAddress) Interop.register(RESULT, org.gtk.gio.InetAddress.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the {@link SocketFamily} of {@code mask}'s address
     * @return the {@link SocketFamily} of {@code mask}'s address
     */
    public org.gtk.gio.SocketFamily getFamily() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_mask_get_family.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.SocketFamily.of(RESULT);
    }
    
    /**
     * Gets {@code mask}'s length
     * @return {@code mask}'s length
     */
    public int getLength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_mask_get_length.invokeExact(handle());
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
    public boolean matches(org.gtk.gio.InetAddress address) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_mask_matches.invokeExact(
                    handle(),
                    address.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Converts {@code mask} back to its corresponding string form.
     * @return a string corresponding to {@code mask}.
     */
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_address_mask_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_inet_address_mask_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link InetAddressMask.Builder} object constructs a {@link InetAddressMask} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link InetAddressMask.Builder#build()}. 
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
         * Finish building the {@link InetAddressMask} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link InetAddressMask}.
         * @return A new instance of {@code InetAddressMask} with the properties 
         *         that were set in the Builder object.
         */
        public InetAddressMask build() {
            return (InetAddressMask) org.gtk.gobject.GObject.newWithProperties(
                InetAddressMask.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setAddress(org.gtk.gio.InetAddress address) {
            names.add("address");
            values.add(org.gtk.gobject.Value.create(address));
            return this;
        }
        
        public Builder setFamily(org.gtk.gio.SocketFamily family) {
            names.add("family");
            values.add(org.gtk.gobject.Value.create(family));
            return this;
        }
        
        public Builder setLength(int length) {
            names.add("length");
            values.add(org.gtk.gobject.Value.create(length));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_inet_address_mask_new = Interop.downcallHandle(
                "g_inet_address_mask_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_inet_address_mask_new_from_string = Interop.downcallHandle(
                "g_inet_address_mask_new_from_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_inet_address_mask_equal = Interop.downcallHandle(
                "g_inet_address_mask_equal",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_inet_address_mask_get_address = Interop.downcallHandle(
                "g_inet_address_mask_get_address",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_inet_address_mask_get_family = Interop.downcallHandle(
                "g_inet_address_mask_get_family",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_inet_address_mask_get_length = Interop.downcallHandle(
                "g_inet_address_mask_get_length",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_inet_address_mask_matches = Interop.downcallHandle(
                "g_inet_address_mask_matches",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_inet_address_mask_to_string = Interop.downcallHandle(
                "g_inet_address_mask_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_inet_address_mask_get_type = Interop.downcallHandle(
                "g_inet_address_mask_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_inet_address_mask_get_type != null;
    }
}
