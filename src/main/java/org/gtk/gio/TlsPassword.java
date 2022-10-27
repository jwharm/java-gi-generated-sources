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
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.TlsPasswordPrivate.getMemoryLayout().withName("priv")
    ).withName("GTlsPassword");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TlsPassword(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TlsPassword */
    public static TlsPassword castFrom(org.gtk.gobject.Object gobject) {
        return new TlsPassword(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.TlsPasswordFlags flags, @NotNull java.lang.String description) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(description, "Parameter 'description' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_tls_password_new.invokeExact(flags.getValue(), Interop.allocateNativeString(description)), true);
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
        super(constructNew(flags, description));
    }
    
    /**
     * Get a description string about what the password will be used for.
     * @return The description of the password.
     */
    public @NotNull java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_password_get_description.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get flags about the password.
     * @return The flags about the password.
     */
    public @NotNull org.gtk.gio.TlsPasswordFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_password_get_flags.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_tls_password_get_value.invokeExact(handle(), (Addressable) lengthPOINTER.address());
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
            RESULT = (MemoryAddress) DowncallHandles.g_tls_password_get_warning.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Set a description string about what the password will be used for.
     * @param description The description of the password
     */
    public void setDescription(@NotNull java.lang.String description) {
        java.util.Objects.requireNonNull(description, "Parameter 'description' must not be null");
        try {
            DowncallHandles.g_tls_password_set_description.invokeExact(handle(), Interop.allocateNativeString(description));
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
            DowncallHandles.g_tls_password_set_flags.invokeExact(handle(), flags.getValue());
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
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.g_tls_password_set_value.invokeExact(handle(), Interop.allocateNativeArray(value, false), length);
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
            DowncallHandles.g_tls_password_set_warning.invokeExact(handle(), Interop.allocateNativeString(warning));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tls_password_new = Interop.downcallHandle(
            "g_tls_password_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_password_get_description = Interop.downcallHandle(
            "g_tls_password_get_description",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_password_get_flags = Interop.downcallHandle(
            "g_tls_password_get_flags",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_password_get_value = Interop.downcallHandle(
            "g_tls_password_get_value",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_password_get_warning = Interop.downcallHandle(
            "g_tls_password_get_warning",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_password_set_description = Interop.downcallHandle(
            "g_tls_password_set_description",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_password_set_flags = Interop.downcallHandle(
            "g_tls_password_set_flags",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_tls_password_set_value = Interop.downcallHandle(
            "g_tls_password_set_value",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_tls_password_set_value_full = Interop.downcallHandle(
            "g_tls_password_set_value_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_password_set_warning = Interop.downcallHandle(
            "g_tls_password_set_warning",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
