package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called in gst_tag_list_foreach(). The function may
 * not modify the tag list.
 */
@FunctionalInterface
public interface TagForeachFunc {
    void run(org.gstreamer.gst.TagList list, java.lang.String tag);

    @ApiStatus.Internal default void upcall(MemoryAddress list, MemoryAddress tag, MemoryAddress userData) {
        run(org.gstreamer.gst.TagList.fromAddress.marshal(list, Ownership.NONE), Marshal.addressToString.marshal(tag, null));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TagForeachFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
