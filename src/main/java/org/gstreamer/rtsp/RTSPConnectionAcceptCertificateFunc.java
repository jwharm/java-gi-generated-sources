package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface RTSPConnectionAcceptCertificateFunc {
        boolean onRTSPConnectionAcceptCertificateFunc(@NotNull org.gtk.gio.TlsConnection conn, @NotNull org.gtk.gio.TlsCertificate peerCert, @NotNull org.gtk.gio.TlsCertificateFlags errors);
}
