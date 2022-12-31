package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface RTSPConnectionAcceptCertificateFunc {
    boolean run(org.gtk.gio.TlsConnection conn, org.gtk.gio.TlsCertificate peerCert, org.gtk.gio.TlsCertificateFlags errors);

    @ApiStatus.Internal default int upcall(MemoryAddress conn, MemoryAddress peerCert, int errors, MemoryAddress userData) {
        var RESULT = run((org.gtk.gio.TlsConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(conn)), org.gtk.gio.TlsConnection.fromAddress).marshal(conn, Ownership.NONE), (org.gtk.gio.TlsCertificate) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(peerCert)), org.gtk.gio.TlsCertificate.fromAddress).marshal(peerCert, Ownership.NONE), new org.gtk.gio.TlsCertificateFlags(errors));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RTSPConnectionAcceptCertificateFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
