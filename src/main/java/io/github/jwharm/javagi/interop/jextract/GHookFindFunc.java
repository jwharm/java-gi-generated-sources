// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GHookFindFunc {

    int apply(java.lang.foreign.MemoryAddress hook, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(GHookFindFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GHookFindFunc.class, fi, constants$153.GHookFindFunc$FUNC, session);
    }
    static GHookFindFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hook, java.lang.foreign.MemoryAddress _data) -> {
            try {
                return (int)constants$153.GHookFindFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hook, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


