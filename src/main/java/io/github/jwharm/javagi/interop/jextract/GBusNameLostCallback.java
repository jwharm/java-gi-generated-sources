// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GBusNameLostCallback {

    void apply(java.lang.foreign.MemoryAddress connection, java.lang.foreign.MemoryAddress name, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(GBusNameLostCallback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GBusNameLostCallback.class, fi, constants$628.GBusNameLostCallback$FUNC, session);
    }
    static GBusNameLostCallback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _connection, java.lang.foreign.MemoryAddress _name, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                constants$628.GBusNameLostCallback$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_connection, (java.lang.foreign.Addressable)_name, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


