// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GdkContentSerializeFunc {

    void apply(java.lang.foreign.MemoryAddress serializer);
    static MemorySegment allocate(GdkContentSerializeFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GdkContentSerializeFunc.class, fi, constants$1352.GdkContentSerializeFunc$FUNC, session);
    }
    static GdkContentSerializeFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _serializer) -> {
            try {
                constants$1352.GdkContentSerializeFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_serializer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


