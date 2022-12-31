package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Holds a password used in TLS.
 * @version 2.30
 */
public class TlsPassword extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsPassword";
    
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
     * Create a TlsPassword proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TlsPassword(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsPassword> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TlsPassword(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gio.TlsPasswordFlags flags, java.lang.String description) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_password_new.invokeExact(
                    flags.getValue(),
                    Marshal.stringToAddress.marshal(description, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link TlsPassword} object.
     * @param flags the password flags
     * @param description description of what the password is for
     */
    public TlsPassword(org.gtk.gio.TlsPasswordFlags flags, java.lang.String description) {
        super(constructNew(flags, description), Ownership.FULL);
    }
    
    /**
     * Get a description string about what the password will be used for.
     * @return The description of the password.
     */
    public java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_password_get_description.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get flags about the password.
     * @return The flags about the password.
     */
    public org.gtk.gio.TlsPasswordFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_password_get_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsPasswordFlags(RESULT);
    }
    
    /**
     * Get the password value. If {@code length} is not {@code null} then it will be
     * filled in with the length of the password value. (Note that the
     * password value is not nul-terminated, so you can only pass {@code null}
     * for {@code length} in contexts where you know the password will have a
     * certain fixed length.)
     * @param length location to place the length of the password.
     * @return The password value (owned by the password object).
     */
    public byte[] getValue(Out<Long> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_password_get_value.invokeExact(
                    handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), length.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Get a user readable translated warning. Usually this warning is a
     * representation of the password flags returned from
     * g_tls_password_get_flags().
     * @return The warning.
     */
    public java.lang.String getWarning() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_password_get_warning.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Set a description string about what the password will be used for.
     * @param description The description of the password
     */
    public void setDescription(java.lang.String description) {
        try {
            DowncallHandles.g_tls_password_set_description.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(description, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set flags about the password.
     * @param flags The flags about the password
     */
    public void setFlags(org.gtk.gio.TlsPasswordFlags flags) {
        try {
            DowncallHandles.g_tls_password_set_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the value for this password. The {@code value} will be copied by the password
     * object.
     * <p>
     * Specify the {@code length}, for a non-nul-terminated password. Pass -1 as
     * {@code length} if using a nul-terminated password, and {@code length} will be
     * calculated automatically. (Note that the terminating nul is not
     * considered part of the password in this case.)
     * @param value the new password value
     * @param length the length of the password, or -1
     */
    public void setValue(byte[] value, long length) {
        try {
            DowncallHandles.g_tls_password_set_value.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(value, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Provide the value for this password.
     * <p>
     * The {@code value} will be owned by the password object, and later freed using
     * the {@code destroy} function callback.
     * <p>
     * Specify the {@code length}, for a non-nul-terminated password. Pass -1 as
     * {@code length} if using a nul-terminated password, and {@code length} will be
     * calculated automatically. (Note that the terminating nul is not
     * considered part of the password in this case.)
     * @param value the value for the password
     * @param length the length of the password, or -1
     * @param destroy a function to use to free the password.
     */
    public void setValueFull(byte[] value, long length, @Nullable org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.g_tls_password_set_value_full.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(value, false),
                    length,
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set a user readable translated warning. Usually this warning is a
     * representation of the password flags returned from
     * g_tls_password_get_flags().
     * @param warning The user readable warning
     */
    public void setWarning(java.lang.String warning) {
        try {
            DowncallHandles.g_tls_password_set_warning.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(warning, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_password_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TlsPassword.Builder} object constructs a {@link TlsPassword} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TlsPassword.Builder#build()}. 
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
         * Finish building the {@link TlsPassword} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TlsPassword}.
         * @return A new instance of {@code TlsPassword} with the properties 
         *         that were set in the Builder object.
         */
        public TlsPassword build() {
            return (TlsPassword) org.gtk.gobject.GObject.newWithProperties(
                TlsPassword.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setDescription(java.lang.String description) {
            names.add("description");
            values.add(org.gtk.gobject.Value.create(description));
            return this;
        }
        
        public Builder setFlags(org.gtk.gio.TlsPasswordFlags flags) {
            names.add("flags");
            values.add(org.gtk.gobject.Value.create(flags));
            return this;
        }
        
        public Builder setWarning(java.lang.String warning) {
            names.add("warning");
            values.add(org.gtk.gobject.Value.create(warning));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tls_password_new = Interop.downcallHandle(
            "g_tls_password_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_get_description = Interop.downcallHandle(
            "g_tls_password_get_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_get_flags = Interop.downcallHandle(
            "g_tls_password_get_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_get_value = Interop.downcallHandle(
            "g_tls_password_get_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_get_warning = Interop.downcallHandle(
            "g_tls_password_get_warning",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_set_description = Interop.downcallHandle(
            "g_tls_password_set_description",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_set_flags = Interop.downcallHandle(
            "g_tls_password_set_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_tls_password_set_value = Interop.downcallHandle(
            "g_tls_password_set_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_tls_password_set_value_full = Interop.downcallHandle(
            "g_tls_password_set_value_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_set_warning = Interop.downcallHandle(
            "g_tls_password_set_warning",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_get_type = Interop.downcallHandle(
            "g_tls_password_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
