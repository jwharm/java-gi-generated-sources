// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GSequenceIterCompareFunc {

    int apply(java.lang.foreign.MemoryAddress a, java.lang.foreign.MemoryAddress b, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(GSequenceIterCompareFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GSequenceIterCompareFunc.class, fi, constants$285.GSequenceIterCompareFunc$FUNC, session);
    }
    static GSequenceIterCompareFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _a, java.lang.foreign.MemoryAddress _b, java.lang.foreign.MemoryAddress _data) -> {
            try {
                return (int)constants$285.GSequenceIterCompareFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_a, (java.lang.foreign.Addressable)_b, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


