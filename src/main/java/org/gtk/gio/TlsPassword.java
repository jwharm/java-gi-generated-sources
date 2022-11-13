package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Holds a password used in TLS.
 * @version 2.30
 */
public class TlsPassword extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsPassword";
    
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
     * Create a TlsPassword proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TlsPassword(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TlsPassword if its GType is a (or inherits from) "GTlsPassword".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TlsPassword} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GTlsPassword", a ClassCastException will be thrown.
     */
    public static TlsPassword castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GTlsPassword"))) {
            return new TlsPassword(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GTlsPassword");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.TlsPasswordFlags flags, @NotNull java.lang.String description) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(description, "Parameter 'description' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_password_new.invokeExact(
                    flags.getValue(),
                    Interop.allocateNativeString(description));
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
    public TlsPassword(@NotNull org.gtk.gio.TlsPasswordFlags flags, @NotNull java.lang.String description) {
        super(constructNew(flags, description), Ownership.FULL);
    }
    
    /**
     * Get a description string about what the password will be used for.
     * @return The description of the password.
     */
    public @NotNull java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_password_get_description.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get flags about the password.
     * @return The flags about the password.
     */
    public @NotNull org.gtk.gio.TlsPasswordFlags getFlags() {
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
    public @NotNull byte[] getValue(Out<Long> length) {
        java.util.Objects.requireNonNull(length, "Parameter 'length' must not be null");
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_password_get_value.invokeExact(
                    handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        return MemorySegment.ofAddress(RESULT.get(ValueLayout.ADDRESS, 0), length.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE);
    }
    
    /**
     * Get a user readable translated warning. Usually this warning is a
     * representation of the password flags returned from
     * g_tls_password_get_flags().
     * @return The warning.
     */
    public @NotNull java.lang.String getWarning() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_password_get_warning.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Set a description string about what the password will be used for.
     * @param description The description of the password
     */
    public void setDescription(@NotNull java.lang.String description) {
        java.util.Objects.requireNonNull(description, "Parameter 'description' must not be null");
        try {
            DowncallHandles.g_tls_password_set_description.invokeExact(
                    handle(),
                    Interop.allocateNativeString(description));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set flags about the password.
     * @param flags The flags about the password
     */
    public void setFlags(@NotNull org.gtk.gio.TlsPasswordFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
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
    public void setValue(@NotNull byte[] value, long length) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
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
    public void setValueFull(@NotNull byte[] value, long length, @Nullable org.gtk.glib.DestroyNotify destroy) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Set a user readable translated warning. Usually this warning is a
     * representation of the password flags returned from
     * g_tls_password_get_flags().
     * @param warning The user readable warning
     */
    public void setWarning(@NotNull java.lang.String warning) {
        java.util.Objects.requireNonNull(warning, "Parameter 'warning' must not be null");
        try {
            DowncallHandles.g_tls_password_set_warning.invokeExact(
                    handle(),
                    Interop.allocateNativeString(warning));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tls_password_new = Interop.downcallHandle(
            "g_tls_password_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_get_description = Interop.downcallHandle(
            "g_tls_password_get_description",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_get_flags = Interop.downcallHandle(
            "g_tls_password_get_flags",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_get_value = Interop.downcallHandle(
            "g_tls_password_get_value",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_get_warning = Interop.downcallHandle(
            "g_tls_password_get_warning",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_set_description = Interop.downcallHandle(
            "g_tls_password_set_description",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_set_flags = Interop.downcallHandle(
            "g_tls_password_set_flags",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_tls_password_set_value = Interop.downcallHandle(
            "g_tls_password_set_value",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle g_tls_password_set_value_full = Interop.downcallHandle(
            "g_tls_password_set_value_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_password_set_warning = Interop.downcallHandle(
            "g_tls_password_set_warning",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
