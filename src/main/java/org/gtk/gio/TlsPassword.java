package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Holds a password used in TLS.
 */
public class TlsPassword extends org.gtk.gobject.Object {

    public TlsPassword(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TlsPassword */
    public static TlsPassword castFrom(org.gtk.gobject.Object gobject) {
        return new TlsPassword(gobject.refcounted());
    }
    
    static final MethodHandle g_tls_password_new = Interop.downcallHandle(
        "g_tls_password_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(TlsPasswordFlags flags, java.lang.String description) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_tls_password_new.invokeExact(flags.getValue(), Interop.allocateNativeString(description).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new {@link TlsPassword} object.
     */
    public TlsPassword(TlsPasswordFlags flags, java.lang.String description) {
        super(constructNew(flags, description));
    }
    
    static final MethodHandle g_tls_password_get_description = Interop.downcallHandle(
        "g_tls_password_get_description",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get a description string about what the password will be used for.
     */
    public java.lang.String getDescription() {
        try {
            var RESULT = (MemoryAddress) g_tls_password_get_description.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_password_get_flags = Interop.downcallHandle(
        "g_tls_password_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Get flags about the password.
     */
    public TlsPasswordFlags getFlags() {
        try {
            var RESULT = (int) g_tls_password_get_flags.invokeExact(handle());
            return new TlsPasswordFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_password_get_value = Interop.downcallHandle(
        "g_tls_password_get_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the password value. If {@code length} is not {@code null} then it will be
     * filled in with the length of the password value. (Note that the
     * password value is not nul-terminated, so you can only pass {@code null}
     * for {@code length} in contexts where you know the password will have a
     * certain fixed length.)
     */
    public PointerByte getValue(PointerLong length) {
        try {
            var RESULT = (MemoryAddress) g_tls_password_get_value.invokeExact(handle(), length.handle());
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_password_get_warning = Interop.downcallHandle(
        "g_tls_password_get_warning",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get a user readable translated warning. Usually this warning is a
     * representation of the password flags returned from
     * g_tls_password_get_flags().
     */
    public java.lang.String getWarning() {
        try {
            var RESULT = (MemoryAddress) g_tls_password_get_warning.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_password_set_description = Interop.downcallHandle(
        "g_tls_password_set_description",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set a description string about what the password will be used for.
     */
    public void setDescription(java.lang.String description) {
        try {
            g_tls_password_set_description.invokeExact(handle(), Interop.allocateNativeString(description).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_password_set_flags = Interop.downcallHandle(
        "g_tls_password_set_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set flags about the password.
     */
    public void setFlags(TlsPasswordFlags flags) {
        try {
            g_tls_password_set_flags.invokeExact(handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_password_set_value = Interop.downcallHandle(
        "g_tls_password_set_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Set the value for this password. The {@code value} will be copied by the password
     * object.
     * <p>
     * Specify the {@code length}, for a non-nul-terminated password. Pass -1 as
     * {@code length} if using a nul-terminated password, and {@code length} will be
     * calculated automatically. (Note that the terminating nul is not
     * considered part of the password in this case.)
     */
    public void setValue(byte[] value, long length) {
        try {
            g_tls_password_set_value.invokeExact(handle(), Interop.allocateNativeArray(value).handle(), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_password_set_warning = Interop.downcallHandle(
        "g_tls_password_set_warning",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set a user readable translated warning. Usually this warning is a
     * representation of the password flags returned from
     * g_tls_password_get_flags().
     */
    public void setWarning(java.lang.String warning) {
        try {
            g_tls_password_set_warning.invokeExact(handle(), Interop.allocateNativeString(warning).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
