// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GLogFunc {

    void apply(java.lang.foreign.MemoryAddress log_domain, int log_level, java.lang.foreign.MemoryAddress message, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(GLogFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GLogFunc.class, fi, constants$245.GLogFunc$FUNC, session);
    }
    static GLogFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _log_domain, int _log_level, java.lang.foreign.MemoryAddress _message, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                constants$245.GLogFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_log_domain, _log_level, (java.lang.foreign.Addressable)_message, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


