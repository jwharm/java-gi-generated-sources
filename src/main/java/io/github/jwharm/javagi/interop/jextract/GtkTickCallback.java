// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GtkTickCallback {

    int apply(java.lang.foreign.MemoryAddress widget, java.lang.foreign.MemoryAddress frame_clock, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(GtkTickCallback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GtkTickCallback.class, fi, constants$1712.GtkTickCallback$FUNC, session);
    }
    static GtkTickCallback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _widget, java.lang.foreign.MemoryAddress _frame_clock, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                return (int)constants$1712.GtkTickCallback$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_widget, (java.lang.foreign.Addressable)_frame_clock, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


