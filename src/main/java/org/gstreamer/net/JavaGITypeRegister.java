package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(NetClientClock.getType(), NetClientClock.fromAddress);
        Interop.typeRegister.put(NetTimeProvider.getType(), NetTimeProvider.fromAddress);
        Interop.typeRegister.put(NtpClock.getType(), NtpClock.fromAddress);
        Interop.typeRegister.put(PtpClock.getType(), PtpClock.fromAddress);
    }
}
