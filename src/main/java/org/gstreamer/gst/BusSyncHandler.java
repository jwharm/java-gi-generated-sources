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
/**
 * Functional interface declaration of the {@code BusSyncHandler} callback.
 */
@FunctionalInterface
public interface BusSyncHandler {

    /**
     * Handler will be invoked synchronously, when a new message has been injected
     * into the bus. This function is mostly used internally. Only one sync handler
     * can be attached to a given bus.
     * <p>
     * If the handler returns {@link BusSyncReply#DROP}, it should unref the message, else the
     * message should not be unreffed by the sync handler.
     */
    org.gstreamer.gst.BusSyncReply run(org.gstreamer.gst.Bus bus, org.gstreamer.gst.Message message);
    
    @ApiStatus.Internal default int upcall(MemoryAddress bus, MemoryAddress message, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.Bus) Interop.register(bus, org.gstreamer.gst.Bus.fromAddress).marshal(bus, null), org.gstreamer.gst.Message.fromAddress.marshal(message, null));
        return RESULT.getValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BusSyncHandler.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
