// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GErrorClearFunc {

    void apply(java.lang.foreign.MemoryAddress error);
    static MemorySegment allocate(GErrorClearFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GErrorClearFunc.class, fi, constants$32.GErrorClearFunc$FUNC, session);
    }
    static GErrorClearFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _error) -> {
            try {
                constants$33.GErrorClearFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_error);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


