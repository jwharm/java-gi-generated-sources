package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 */
public class TlsInteraction extends org.gtk.gobject.Object {

    public TlsInteraction(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TlsInteraction */
    public static TlsInteraction castFrom(org.gtk.gobject.Object gobject) {
        return new TlsInteraction(gobject.refcounted());
    }
    
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
     */
    public TlsInteractionResult askPassword(TlsPassword password, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_interaction_ask_password(handle(), password.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new TlsInteractionResult(RESULT);
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
     */
    public void askPasswordAsync(TlsPassword password, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_tls_interaction_ask_password_async(handle(), password.handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
     */
    public TlsInteractionResult askPasswordFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_interaction_ask_password_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new TlsInteractionResult(RESULT);
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
     */
    public TlsInteractionResult invokeAskPassword(TlsPassword password, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_interaction_invoke_ask_password(handle(), password.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new TlsInteractionResult(RESULT);
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
     */
    public TlsInteractionResult invokeRequestCertificate(TlsConnection connection, TlsCertificateRequestFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_interaction_invoke_request_certificate(handle(), connection.handle(), flags.getValue(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new TlsInteractionResult(RESULT);
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
     */
    public TlsInteractionResult requestCertificate(TlsConnection connection, TlsCertificateRequestFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_interaction_request_certificate(handle(), connection.handle(), flags.getValue(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new TlsInteractionResult(RESULT);
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
     */
    public void requestCertificateAsync(TlsConnection connection, TlsCertificateRequestFlags flags, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_tls_interaction_request_certificate_async(handle(), connection.handle(), flags.getValue(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
     */
    public TlsInteractionResult requestCertificateFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_interaction_request_certificate_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new TlsInteractionResult(RESULT);
    }
    
}
