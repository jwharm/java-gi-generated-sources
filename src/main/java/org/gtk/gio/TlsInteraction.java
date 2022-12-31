package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link TlsInteraction} provides a mechanism for the TLS connection and database
 * code to interact with the user. It can be used to ask the user for passwords.
 * <p>
 * To use a {@link TlsInteraction} with a TLS connection use
 * g_tls_connection_set_interaction().
 * <p>
 * Callers should instantiate a derived class that implements the various
 * interaction methods to show the required dialogs.
 * <p>
 * Callers should use the 'invoke' functions like
 * g_tls_interaction_invoke_ask_password() to run interaction methods. These
 * functions make sure that the interaction is invoked in the main loop
 * and not in the current thread, if the current thread is not running the
 * main loop.
 * <p>
 * Derived classes can choose to implement whichever interactions methods they'd
 * like to support by overriding those virtual methods in their class
 * initialization function. Any interactions not implemented will return
 * {@link TlsInteractionResult#UNHANDLED}. If a derived class implements an async method,
 * it must also implement the corresponding finish method.
 * @version 2.30
 */
public class TlsInteraction extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsInteraction";
    
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
     * Create a TlsInteraction proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TlsInteraction(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsInteraction> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TlsInteraction(input, ownership);
    
    /**
     * Run synchronous interaction to ask the user for a password. In general,
     * g_tls_interaction_invoke_ask_password() should be used instead of this
     * function.
     * <p>
     * Derived subclasses usually implement a password prompt, although they may
     * also choose to provide a password from elsewhere. The {@code password} value will
     * be filled in and then {@code callback} will be called. Alternatively the user may
     * abort this password request, which will usually abort the TLS connection.
     * <p>
     * If the interaction is cancelled by the cancellation object, or by the
     * user then {@link TlsInteractionResult#FAILED} will be returned with an error that
     * contains a {@link IOErrorEnum#CANCELLED} error code. Certain implementations may
     * not support immediate cancellation.
     * @param password a {@link TlsPassword} object
     * @param cancellable an optional {@link Cancellable} cancellation object
     * @return The status of the ask password interaction.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.TlsInteractionResult askPassword(org.gtk.gio.TlsPassword password, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_interaction_ask_password.invokeExact(
                    handle(),
                    password.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return org.gtk.gio.TlsInteractionResult.of(RESULT);
    }
    
    /**
     * Run asynchronous interaction to ask the user for a password. In general,
     * g_tls_interaction_invoke_ask_password() should be used instead of this
     * function.
     * <p>
     * Derived subclasses usually implement a password prompt, although they may
     * also choose to provide a password from elsewhere. The {@code password} value will
     * be filled in and then {@code callback} will be called. Alternatively the user may
     * abort this password request, which will usually abort the TLS connection.
     * <p>
     * If the interaction is cancelled by the cancellation object, or by the
     * user then {@link TlsInteractionResult#FAILED} will be returned with an error that
     * contains a {@link IOErrorEnum#CANCELLED} error code. Certain implementations may
     * not support immediate cancellation.
     * <p>
     * Certain implementations may not support immediate cancellation.
     * @param password a {@link TlsPassword} object
     * @param cancellable an optional {@link Cancellable} cancellation object
     * @param callback will be called when the interaction completes
     */
    public void askPasswordAsync(org.gtk.gio.TlsPassword password, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_tls_interaction_ask_password_async.invokeExact(
                    handle(),
                    password.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Complete an ask password user interaction request. This should be once
     * the g_tls_interaction_ask_password_async() completion callback is called.
     * <p>
     * If {@link TlsInteractionResult#HANDLED} is returned, then the {@link TlsPassword} passed
     * to g_tls_interaction_ask_password() will have its password filled in.
     * <p>
     * If the interaction is cancelled by the cancellation object, or by the
     * user then {@link TlsInteractionResult#FAILED} will be returned with an error that
     * contains a {@link IOErrorEnum#CANCELLED} error code.
     * @param result the result passed to the callback
     * @return The status of the ask password interaction.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.TlsInteractionResult askPasswordFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_interaction_ask_password_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return org.gtk.gio.TlsInteractionResult.of(RESULT);
    }
    
    /**
     * Invoke the interaction to ask the user for a password. It invokes this
     * interaction in the main loop, specifically the {@link org.gtk.glib.MainContext} returned by
     * g_main_context_get_thread_default() when the interaction is created. This
     * is called by called by {@link TlsConnection} or {@link TlsDatabase} to ask the user
     * for a password.
     * <p>
     * Derived subclasses usually implement a password prompt, although they may
     * also choose to provide a password from elsewhere. The {@code password} value will
     * be filled in and then {@code callback} will be called. Alternatively the user may
     * abort this password request, which will usually abort the TLS connection.
     * <p>
     * The implementation can either be a synchronous (eg: modal dialog) or an
     * asynchronous one (eg: modeless dialog). This function will take care of
     * calling which ever one correctly.
     * <p>
     * If the interaction is cancelled by the cancellation object, or by the
     * user then {@link TlsInteractionResult#FAILED} will be returned with an error that
     * contains a {@link IOErrorEnum#CANCELLED} error code. Certain implementations may
     * not support immediate cancellation.
     * @param password a {@link TlsPassword} object
     * @param cancellable an optional {@link Cancellable} cancellation object
     * @return The status of the ask password interaction.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.TlsInteractionResult invokeAskPassword(org.gtk.gio.TlsPassword password, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_interaction_invoke_ask_password.invokeExact(
                    handle(),
                    password.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return org.gtk.gio.TlsInteractionResult.of(RESULT);
    }
    
    /**
     * Invoke the interaction to ask the user to choose a certificate to
     * use with the connection. It invokes this interaction in the main
     * loop, specifically the {@link org.gtk.glib.MainContext} returned by
     * g_main_context_get_thread_default() when the interaction is
     * created. This is called by called by {@link TlsConnection} when the peer
     * requests a certificate during the handshake.
     * <p>
     * Derived subclasses usually implement a certificate selector,
     * although they may also choose to provide a certificate from
     * elsewhere. Alternatively the user may abort this certificate
     * request, which may or may not abort the TLS connection.
     * <p>
     * The implementation can either be a synchronous (eg: modal dialog) or an
     * asynchronous one (eg: modeless dialog). This function will take care of
     * calling which ever one correctly.
     * <p>
     * If the interaction is cancelled by the cancellation object, or by the
     * user then {@link TlsInteractionResult#FAILED} will be returned with an error that
     * contains a {@link IOErrorEnum#CANCELLED} error code. Certain implementations may
     * not support immediate cancellation.
     * @param connection a {@link TlsConnection} object
     * @param flags flags providing more information about the request
     * @param cancellable an optional {@link Cancellable} cancellation object
     * @return The status of the certificate request interaction.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.TlsInteractionResult invokeRequestCertificate(org.gtk.gio.TlsConnection connection, org.gtk.gio.TlsCertificateRequestFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_interaction_invoke_request_certificate.invokeExact(
                    handle(),
                    connection.handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return org.gtk.gio.TlsInteractionResult.of(RESULT);
    }
    
    /**
     * Run synchronous interaction to ask the user to choose a certificate to use
     * with the connection. In general, g_tls_interaction_invoke_request_certificate()
     * should be used instead of this function.
     * <p>
     * Derived subclasses usually implement a certificate selector, although they may
     * also choose to provide a certificate from elsewhere. Alternatively the user may
     * abort this certificate request, which will usually abort the TLS connection.
     * <p>
     * If {@link TlsInteractionResult#HANDLED} is returned, then the {@link TlsConnection}
     * passed to g_tls_interaction_request_certificate() will have had its
     * {@link TlsConnection}:certificate filled in.
     * <p>
     * If the interaction is cancelled by the cancellation object, or by the
     * user then {@link TlsInteractionResult#FAILED} will be returned with an error that
     * contains a {@link IOErrorEnum#CANCELLED} error code. Certain implementations may
     * not support immediate cancellation.
     * @param connection a {@link TlsConnection} object
     * @param flags flags providing more information about the request
     * @param cancellable an optional {@link Cancellable} cancellation object
     * @return The status of the request certificate interaction.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.TlsInteractionResult requestCertificate(org.gtk.gio.TlsConnection connection, org.gtk.gio.TlsCertificateRequestFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_interaction_request_certificate.invokeExact(
                    handle(),
                    connection.handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return org.gtk.gio.TlsInteractionResult.of(RESULT);
    }
    
    /**
     * Run asynchronous interaction to ask the user for a certificate to use with
     * the connection. In general, g_tls_interaction_invoke_request_certificate() should
     * be used instead of this function.
     * <p>
     * Derived subclasses usually implement a certificate selector, although they may
     * also choose to provide a certificate from elsewhere. {@code callback} will be called
     * when the operation completes. Alternatively the user may abort this certificate
     * request, which will usually abort the TLS connection.
     * @param connection a {@link TlsConnection} object
     * @param flags flags providing more information about the request
     * @param cancellable an optional {@link Cancellable} cancellation object
     * @param callback will be called when the interaction completes
     */
    public void requestCertificateAsync(org.gtk.gio.TlsConnection connection, org.gtk.gio.TlsCertificateRequestFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_tls_interaction_request_certificate_async.invokeExact(
                    handle(),
                    connection.handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Complete a request certificate user interaction request. This should be once
     * the g_tls_interaction_request_certificate_async() completion callback is called.
     * <p>
     * If {@link TlsInteractionResult#HANDLED} is returned, then the {@link TlsConnection}
     * passed to g_tls_interaction_request_certificate_async() will have had its
     * {@link TlsConnection}:certificate filled in.
     * <p>
     * If the interaction is cancelled by the cancellation object, or by the
     * user then {@link TlsInteractionResult#FAILED} will be returned with an error that
     * contains a {@link IOErrorEnum#CANCELLED} error code.
     * @param result the result passed to the callback
     * @return The status of the request certificate interaction.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.TlsInteractionResult requestCertificateFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_interaction_request_certificate_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return org.gtk.gio.TlsInteractionResult.of(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_interaction_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TlsInteraction.Builder} object constructs a {@link TlsInteraction} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TlsInteraction.Builder#build()}. 
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
         * Finish building the {@link TlsInteraction} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TlsInteraction}.
         * @return A new instance of {@code TlsInteraction} with the properties 
         *         that were set in the Builder object.
         */
        public TlsInteraction build() {
            return (TlsInteraction) org.gtk.gobject.GObject.newWithProperties(
                TlsInteraction.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tls_interaction_ask_password = Interop.downcallHandle(
            "g_tls_interaction_ask_password",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_interaction_ask_password_async = Interop.downcallHandle(
            "g_tls_interaction_ask_password_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_interaction_ask_password_finish = Interop.downcallHandle(
            "g_tls_interaction_ask_password_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_interaction_invoke_ask_password = Interop.downcallHandle(
            "g_tls_interaction_invoke_ask_password",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_interaction_invoke_request_certificate = Interop.downcallHandle(
            "g_tls_interaction_invoke_request_certificate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_interaction_request_certificate = Interop.downcallHandle(
            "g_tls_interaction_request_certificate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_interaction_request_certificate_async = Interop.downcallHandle(
            "g_tls_interaction_request_certificate_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_interaction_request_certificate_finish = Interop.downcallHandle(
            "g_tls_interaction_request_certificate_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_interaction_get_type = Interop.downcallHandle(
            "g_tls_interaction_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
