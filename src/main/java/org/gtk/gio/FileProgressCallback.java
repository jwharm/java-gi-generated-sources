package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * When doing file operations that may take a while, such as moving
 * a file or copying a file, a progress callback is used to pass how
 * far along that operation is to the application.
 */
@FunctionalInterface
public interface FileProgressCallback {
    void run(long currentNumBytes, long totalNumBytes);

    @ApiStatus.Internal default void upcall(long currentNumBytes, long totalNumBytes, MemoryAddress userData) {
        run(currentNumBytes, totalNumBytes);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FileProgressCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
