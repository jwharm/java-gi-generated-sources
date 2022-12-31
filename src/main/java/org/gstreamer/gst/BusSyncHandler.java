package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Handler will be invoked synchronously, when a new message has been injected
 * into the bus. This function is mostly used internally. Only one sync handler
 * can be attached to a given bus.
 * <p>
 * If the handler returns {@link BusSyncReply#DROP}, it should unref the message, else the
 * message should not be unreffed by the sync handler.
 */
@FunctionalInterface
public interface BusSyncHandler {
    org.gstreamer.gst.BusSyncReply run(org.gstreamer.gst.Bus bus, org.gstreamer.gst.Message message);

    @ApiStatus.Internal default int upcall(MemoryAddress bus, MemoryAddress message, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.Bus) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(bus)), org.gstreamer.gst.Bus.fromAddress).marshal(bus, Ownership.NONE), org.gstreamer.gst.Message.fromAddress.marshal(message, Ownership.NONE));
        return RESULT.getValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BusSyncHandler.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
