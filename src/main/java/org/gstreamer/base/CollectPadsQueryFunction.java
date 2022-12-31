package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called while processing a query. It takes
 * ownership of the query and is responsible for chaining up (to
 * events downstream (with gst_pad_event_default()).
 */
@FunctionalInterface
public interface CollectPadsQueryFunction {
    boolean run(org.gstreamer.base.CollectPads pads, org.gstreamer.base.CollectData pad, org.gstreamer.gst.Query query);

    @ApiStatus.Internal default int upcall(MemoryAddress pads, MemoryAddress pad, MemoryAddress query, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.base.CollectPads) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pads)), org.gstreamer.base.CollectPads.fromAddress).marshal(pads, Ownership.NONE), org.gstreamer.base.CollectData.fromAddress.marshal(pad, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CollectPadsQueryFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
