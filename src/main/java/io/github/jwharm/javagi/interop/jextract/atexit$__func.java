// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface atexit$__func {

    void apply();
    static MemorySegment allocate(atexit$__func fi, MemorySession session) {
        return RuntimeHelper.upcallStub(atexit$__func.class, fi, constants$52.atexit$__func$FUNC, session);
    }
    static atexit$__func ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$52.atexit$__func$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


