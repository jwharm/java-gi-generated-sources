// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GHookFinalizeFunc {

    void apply(java.lang.foreign.MemoryAddress hook_list, java.lang.foreign.MemoryAddress hook);
    static MemorySegment allocate(GHookFinalizeFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GHookFinalizeFunc.class, fi, constants$154.GHookFinalizeFunc$FUNC, session);
    }
    static GHookFinalizeFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hook_list, java.lang.foreign.MemoryAddress _hook) -> {
            try {
                constants$154.GHookFinalizeFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hook_list, (java.lang.foreign.Addressable)_hook);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


