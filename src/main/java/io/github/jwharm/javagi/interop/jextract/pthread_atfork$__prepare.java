// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface pthread_atfork$__prepare {

    void apply();
    static MemorySegment allocate(pthread_atfork$__prepare fi, MemorySession session) {
        return RuntimeHelper.upcallStub(pthread_atfork$__prepare.class, fi, constants$369.pthread_atfork$__prepare$FUNC, session);
    }
    static pthread_atfork$__prepare ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$369.pthread_atfork$__prepare$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


