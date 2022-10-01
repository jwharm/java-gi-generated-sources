// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GLogWriterFunc {

    int apply(int log_level, java.lang.foreign.MemoryAddress fields, long n_fields, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(GLogWriterFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GLogWriterFunc.class, fi, constants$247.GLogWriterFunc$FUNC, session);
    }
    static GLogWriterFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _log_level, java.lang.foreign.MemoryAddress _fields, long _n_fields, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                return (int)constants$247.GLogWriterFunc$MH.invokeExact((Addressable)symbol, _log_level, (java.lang.foreign.Addressable)_fields, _n_fields, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


