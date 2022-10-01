// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GdkPixbufSaveFunc {

    int apply(java.lang.foreign.MemoryAddress buf, long count, java.lang.foreign.MemoryAddress error, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(GdkPixbufSaveFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GdkPixbufSaveFunc.class, fi, constants$1305.GdkPixbufSaveFunc$FUNC, session);
    }
    static GdkPixbufSaveFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _buf, long _count, java.lang.foreign.MemoryAddress _error, java.lang.foreign.MemoryAddress _data) -> {
            try {
                return (int)constants$1305.GdkPixbufSaveFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_buf, _count, (java.lang.foreign.Addressable)_error, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


