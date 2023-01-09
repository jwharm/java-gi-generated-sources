package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function for merging multiple values of a tag used when registering
 * tags.
 */
/**
 * Functional interface declaration of the {@code TagMergeFunc} callback.
 */
@FunctionalInterface
public interface TagMergeFunc {

    /**
     * A function for merging multiple values of a tag used when registering
     * tags.
     */
    void run(org.gtk.gobject.Value dest, org.gtk.gobject.Value src);
    
    @ApiStatus.Internal default void upcall(MemoryAddress dest, MemoryAddress src) {
        run(org.gtk.gobject.Value.fromAddress.marshal(dest, null), org.gtk.gobject.Value.fromAddress.marshal(src, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TagMergeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
