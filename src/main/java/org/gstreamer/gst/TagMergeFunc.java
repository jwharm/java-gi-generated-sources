package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function for merging multiple values of a tag used when registering
 * tags.
 */
@FunctionalInterface
public interface TagMergeFunc {
    void run(org.gtk.gobject.Value dest, org.gtk.gobject.Value src);

    @ApiStatus.Internal default void upcall(MemoryAddress dest, MemoryAddress src) {
        run(org.gtk.gobject.Value.fromAddress.marshal(dest, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(src, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TagMergeFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
