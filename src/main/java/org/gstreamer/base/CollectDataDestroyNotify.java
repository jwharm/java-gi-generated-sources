package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called when the {@link CollectData} will be freed.
 * It is passed the pointer to the structure and should free any custom
 * memory and resources allocated for it.
 */
@FunctionalInterface
public interface CollectDataDestroyNotify {
    void run(org.gstreamer.base.CollectData data);

    @ApiStatus.Internal default void upcall(MemoryAddress data) {
        run(org.gstreamer.base.CollectData.fromAddress.marshal(data, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CollectDataDestroyNotify.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
