// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface pthread_atfork$__child {

    void apply();
    static MemorySegment allocate(pthread_atfork$__child fi, MemorySession session) {
        return RuntimeHelper.upcallStub(pthread_atfork$__child.class, fi, constants$369.pthread_atfork$__child$FUNC, session);
    }
    static pthread_atfork$__child ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$370.pthread_atfork$__child$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


