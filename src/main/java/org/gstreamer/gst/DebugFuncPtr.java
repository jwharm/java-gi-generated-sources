package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * we define this to avoid a compiler warning regarding a cast from a function
 * pointer to a void pointer
 * (see https://bugzilla.gnome.org/show_bug.cgi?id=309253)
 */
@FunctionalInterface
public interface DebugFuncPtr {
    void run();

    @ApiStatus.Internal default void upcall() {
        run();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DebugFuncPtr.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
