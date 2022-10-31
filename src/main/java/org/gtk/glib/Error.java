package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GError} structure contains information about
 * an error that has occurred.
 */
public class Error extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GError";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("domain"),
        ValueLayout.JAVA_INT.withName("code"),
        Interop.valueLayout.ADDRESS.withName("message")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Error allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Error newInstance = new Error(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code domain}
     * @return The value of the field {@code domain}
     */
    public org.gtk.glib.Quark domain$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("domain"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Change the value of the field {@code domain}
     * @param domain The new value of the field {@code domain}
     */
    public void domain$set(org.gtk.glib.Quark domain) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("domain"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), domain.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code code}
     * @return The value of the field {@code code}
     */
    public int code$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("code"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code code}
     * @param code The new value of the field {@code code}
     */
    public void code$set(int code) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("code"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), code);
    }
    
    /**
     * Get the value of the field {@code message}
     * @return The value of the field {@code message}
     */
    public java.lang.String message$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("message"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code message}
     * @param message The new value of the field {@code message}
     */
    public void message$set(java.lang.String message) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("message"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(message));
    }
    
    @ApiStatus.Internal
    public Error(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.glib.Quark domain, int code, @NotNull java.lang.String format) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a new {@link Error} with the given {@code domain} and {@code code},
     * and a message formatted with {@code format}.
     * @param domain error domain
     * @param code error code
     * @param format printf()-style format for error message
     */
    public Error(@NotNull org.gtk.glib.Quark domain, int code, @NotNull java.lang.String format) {
        this(Refcounted.get(null)); // avoid compiler error
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    private static Refcounted constructNewLiteral(@NotNull org.gtk.glib.Quark domain, int code, @NotNull java.lang.String message) {
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        java.util.Objects.requireNonNull(message, "Parameter 'message' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_error_new_literal.invokeExact(
                    domain.getValue().intValue(),
                    code,
                    Interop.allocateNativeString(message)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Error}; unlike g_error_new(), {@code message} is
     * not a printf()-style format string. Use this function if
     * {@code message} contains text you don't have control over,
     * that could include printf() escape sequences.
     * @param domain error domain
     * @param code error code
     * @param message error message
     * @return a new {@link Error}
     */
    public static Error newLiteral(@NotNull org.gtk.glib.Quark domain, int code, @NotNull java.lang.String message) {
        return new Error(constructNewLiteral(domain, code, message));
    }
    
    private static Refcounted constructNewValist(@NotNull org.gtk.glib.Quark domain, int code, @NotNull java.lang.String format, @NotNull VaList args) {
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_error_new_valist.invokeExact(
                    domain.getValue().intValue(),
                    code,
                    Interop.allocateNativeString(format),
                    args), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Error} with the given {@code domain} and {@code code},
     * and a message formatted with {@code format}.
     * @param domain error domain
     * @param code error code
     * @param format printf()-style format for error message
     * @param args {@code va_list} of parameters for the message format
     * @return a new {@link Error}
     */
    public static Error newValist(@NotNull org.gtk.glib.Quark domain, int code, @NotNull java.lang.String format, @NotNull VaList args) {
        return new Error(constructNewValist(domain, code, format, args));
    }
    
    /**
     * Makes a copy of {@code error}.
     * @return a new {@link Error}
     */
    public @NotNull org.gtk.glib.Error copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_error_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Error(Refcounted.get(RESULT, true));
    }
    
    /**
     * Frees a {@link Error} and associated resources.
     */
    public void free() {
        try {
            DowncallHandles.g_error_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns {@code true} if {@code error} matches {@code domain} and {@code code}, {@code false}
     * otherwise. In particular, when {@code error} is {@code null}, {@code false} will
     * be returned.
     * <p>
     * If {@code domain} contains a {@code FAILED} (or otherwise generic) error code,
     * you should generally not check for it explicitly, but should
     * instead treat any not-explicitly-recognized error code as being
     * equivalent to the {@code FAILED} code. This way, if the domain is
     * extended in the future to provide a more specific error code for
     * a certain case, your code will still work.
     * @param domain an error domain
     * @param code an error code
     * @return whether {@code error} has {@code domain} and {@code code}
     */
    public boolean matches(@NotNull org.gtk.glib.Quark domain, int code) {
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_error_matches.invokeExact(
                    handle(),
                    domain.getValue().intValue(),
                    code);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * This function registers an extended {@link Error} domain.
     * {@code error_type_name} will be duplicated. Otherwise does the same as
     * g_error_domain_register_static().
     * @param errorTypeName string to create a {@link Quark} from
     * @param errorTypePrivateSize size of the private error data in bytes
     * @param errorTypeInit function initializing fields of the private error data
     * @param errorTypeCopy function copying fields of the private error data
     * @param errorTypeClear function freeing fields of the private error data
     * @return {@link Quark} representing the error domain
     */
    public static @NotNull org.gtk.glib.Quark domainRegister(@NotNull java.lang.String errorTypeName, long errorTypePrivateSize, @NotNull org.gtk.glib.ErrorInitFunc errorTypeInit, @NotNull org.gtk.glib.ErrorCopyFunc errorTypeCopy, @NotNull org.gtk.glib.ErrorClearFunc errorTypeClear) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * This function registers an extended {@link Error} domain.
     * <p>
     * {@code error_type_name} should not be freed. {@code error_type_private_size} must
     * be greater than 0.
     * <p>
     * {@code error_type_init} receives an initialized {@link Error} and should then initialize
     * the private data.
     * <p>
     * {@code error_type_copy} is a function that receives both original and a copy
     * {@link Error} and should copy the fields of the private error data. The standard
     * {@link Error} fields are already handled.
     * <p>
     * {@code error_type_clear} receives the pointer to the error, and it should free the
     * fields of the private error data. It should not free the struct itself though.
     * <p>
     * Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
     * already takes care of passing valid information to this function.
     * @param errorTypeName static string to create a {@link Quark} from
     * @param errorTypePrivateSize size of the private error data in bytes
     * @param errorTypeInit function initializing fields of the private error data
     * @param errorTypeCopy function copying fields of the private error data
     * @param errorTypeClear function freeing fields of the private error data
     * @return {@link Quark} representing the error domain
     */
    public static @NotNull org.gtk.glib.Quark domainRegisterStatic(@NotNull java.lang.String errorTypeName, long errorTypePrivateSize, @NotNull org.gtk.glib.ErrorInitFunc errorTypeInit, @NotNull org.gtk.glib.ErrorCopyFunc errorTypeCopy, @NotNull org.gtk.glib.ErrorClearFunc errorTypeClear) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_error_new = Interop.downcallHandle(
            "g_error_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_error_new_literal = Interop.downcallHandle(
            "g_error_new_literal",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_error_new_valist = Interop.downcallHandle(
            "g_error_new_valist",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_error_copy = Interop.downcallHandle(
            "g_error_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_error_free = Interop.downcallHandle(
            "g_error_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_error_matches = Interop.downcallHandle(
            "g_error_matches",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_error_domain_register = Interop.downcallHandle(
            "g_error_domain_register",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_error_domain_register_static = Interop.downcallHandle(
            "g_error_domain_register_static",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
