package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called in gst_tag_list_foreach(). The function may
 * not modify the tag list.
 */
/**
 * Functional interface declaration of the {@code TagForeachFunc} callback.
 */
@FunctionalInterface
public interface TagForeachFunc {

    /**
     * A function that will be called in gst_tag_list_foreach(). The function may
     * not modify the tag list.
     */
    void run(org.gstreamer.gst.TagList list, java.lang.String tag);
    
    @ApiStatus.Internal default void upcall(MemoryAddress list, MemoryAddress tag, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run(org.gstreamer.gst.TagList.fromAddress.marshal(list, null), Marshal.addressToString.marshal(tag, null));
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TagForeachFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
