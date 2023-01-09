package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Functional interface declaration of the {@code RTSPConnectionAcceptCertificateFunc} callback.
 */
@FunctionalInterface
public interface RTSPConnectionAcceptCertificateFunc {

    boolean run(org.gtk.gio.TlsConnection conn, org.gtk.gio.TlsCertificate peerCert, org.gtk.gio.TlsCertificateFlags errors);
    
    @ApiStatus.Internal default int upcall(MemoryAddress conn, MemoryAddress peerCert, int errors, MemoryAddress userData) {
        var RESULT = run((org.gtk.gio.TlsConnection) Interop.register(conn, org.gtk.gio.TlsConnection.fromAddress).marshal(conn, null), (org.gtk.gio.TlsCertificate) Interop.register(peerCert, org.gtk.gio.TlsCertificate.fromAddress).marshal(peerCert, null), new org.gtk.gio.TlsCertificateFlags(errors));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RTSPConnectionAcceptCertificateFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
