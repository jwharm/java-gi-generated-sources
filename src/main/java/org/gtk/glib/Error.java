package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GError} structure contains information about
 * an error that has occurred.
 */
public class Error extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GError";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("domain"),
            Interop.valueLayout.C_INT.withName("code"),
            Interop.valueLayout.ADDRESS.withName("message")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Error}
     * @return A new, uninitialized @{link Error}
     */
    public static Error allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Error newInstance = new Error(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code domain}
     * @return The value of the field {@code domain}
     */
    public org.gtk.glib.Quark getDomain() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("domain"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gtk.glib.Quark(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code domain}
     * @param domain The new value of the field {@code domain}
     */
    public void setDomain(org.gtk.glib.Quark domain) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("domain"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (domain == null ? MemoryAddress.NULL : domain.getValue().intValue()));
        }
    }
    
    /**
     * Get the value of the field {@code code}
     * @return The value of the field {@code code}
     */
    public int getCode() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("code"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code code}
     * @param code The new value of the field {@code code}
     */
    public void setCode(int code) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("code"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), code);
        }
    }
    
    /**
     * Get the value of the field {@code message}
     * @return The value of the field {@code message}
     */
    public java.lang.String getMessage() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("message"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code message}
     * @param message The new value of the field {@code message}
     */
    public void setMessage(java.lang.String message) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("message"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (message == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(message, SCOPE)));
        }
    }
    
    /**
     * Create a Error proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Error(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Error> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Error(input);
    
    private static MemoryAddress constructNew(org.gtk.glib.Quark domain, int code, java.lang.String format, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_error_new.invokeExact(
                        domain.getValue().intValue(),
                        code,
                        Marshal.stringToAddress.marshal(format, SCOPE),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@link Error} with the given {@code domain} and {@code code},
     * and a message formatted with {@code format}.
     * @param domain error domain
     * @param code error code
     * @param format printf()-style format for error message
     * @param varargs parameters for message format
     */
    public Error(org.gtk.glib.Quark domain, int code, java.lang.String format, java.lang.Object... varargs) {
        super(constructNew(domain, code, format, varargs));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewLiteral(org.gtk.glib.Quark domain, int code, java.lang.String message) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_error_new_literal.invokeExact(
                        domain.getValue().intValue(),
                        code,
                        Marshal.stringToAddress.marshal(message, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public static Error newLiteral(org.gtk.glib.Quark domain, int code, java.lang.String message) {
        var RESULT = constructNewLiteral(domain, code, message);
        var OBJECT = org.gtk.glib.Error.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewValist(org.gtk.glib.Quark domain, int code, java.lang.String format, VaList args) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_error_new_valist.invokeExact(
                        domain.getValue().intValue(),
                        code,
                        Marshal.stringToAddress.marshal(format, SCOPE),
                        args);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public static Error newValist(org.gtk.glib.Quark domain, int code, java.lang.String format, VaList args) {
        var RESULT = constructNewValist(domain, code, format, args);
        var OBJECT = org.gtk.glib.Error.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Makes a copy of {@code error}.
     * @return a new {@link Error}
     */
    public org.gtk.glib.Error copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_error_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Error.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Frees a {@link Error} and associated resources.
     */
    public void free() {
        try {
            DowncallHandles.g_error_free.invokeExact(handle());
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
    public boolean matches(org.gtk.glib.Quark domain, int code) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_error_matches.invokeExact(
                    handle(),
                    domain.getValue().intValue(),
                    code);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public static org.gtk.glib.Quark domainRegister(java.lang.String errorTypeName, long errorTypePrivateSize, org.gtk.glib.ErrorInitFunc errorTypeInit, org.gtk.glib.ErrorCopyFunc errorTypeCopy, org.gtk.glib.ErrorClearFunc errorTypeClear) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_error_domain_register.invokeExact(
                        Marshal.stringToAddress.marshal(errorTypeName, SCOPE),
                        errorTypePrivateSize,
                        (Addressable) errorTypeInit.toCallback(),
                        (Addressable) errorTypeCopy.toCallback(),
                        (Addressable) errorTypeClear.toCallback());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new org.gtk.glib.Quark(RESULT);
        }
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
    public static org.gtk.glib.Quark domainRegisterStatic(java.lang.String errorTypeName, long errorTypePrivateSize, org.gtk.glib.ErrorInitFunc errorTypeInit, org.gtk.glib.ErrorCopyFunc errorTypeCopy, org.gtk.glib.ErrorClearFunc errorTypeClear) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_error_domain_register_static.invokeExact(
                        Marshal.stringToAddress.marshal(errorTypeName, SCOPE),
                        errorTypePrivateSize,
                        (Addressable) errorTypeInit.toCallback(),
                        (Addressable) errorTypeCopy.toCallback(),
                        (Addressable) errorTypeClear.toCallback());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new org.gtk.glib.Quark(RESULT);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_error_new = Interop.downcallHandle(
                "g_error_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle g_error_new_literal = Interop.downcallHandle(
                "g_error_new_literal",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_error_new_valist = Interop.downcallHandle(
                "g_error_new_valist",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_error_copy = Interop.downcallHandle(
                "g_error_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_error_free = Interop.downcallHandle(
                "g_error_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_error_matches = Interop.downcallHandle(
                "g_error_matches",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_error_domain_register = Interop.downcallHandle(
                "g_error_domain_register",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_error_domain_register_static = Interop.downcallHandle(
                "g_error_domain_register_static",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Error.Builder} object constructs a {@link Error} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Error.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Error struct;
        
        private Builder() {
            struct = Error.allocate();
        }
        
        /**
         * Finish building the {@link Error} struct.
         * @return A new instance of {@code Error} with the fields 
         *         that were set in the Builder object.
         */
        public Error build() {
            return struct;
        }
        
        /**
         * error domain, e.g. {@code G_FILE_ERROR}
         * @param domain The value for the {@code domain} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDomain(org.gtk.glib.Quark domain) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("domain"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (domain == null ? MemoryAddress.NULL : domain.getValue().intValue()));
                return this;
            }
        }
        
        /**
         * error code, e.g. {@link FileError#NOENT}
         * @param code The value for the {@code code} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCode(int code) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("code"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), code);
                return this;
            }
        }
        
        /**
         * human-readable informative error message
         * @param message The value for the {@code message} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMessage(java.lang.String message) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("message"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (message == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(message, SCOPE)));
                return this;
            }
        }
    }
}
