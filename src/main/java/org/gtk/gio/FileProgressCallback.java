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
/**
 * Functional interface declaration of the {@code FileProgressCallback} callback.
 */
@FunctionalInterface
public interface FileProgressCallback {

    /**
     * When doing file operations that may take a while, such as moving
     * a file or copying a file, a progress callback is used to pass how
     * far along that operation is to the application.
     */
    void run(long currentNumBytes, long totalNumBytes);
    
    @ApiStatus.Internal default void upcall(long currentNumBytes, long totalNumBytes, MemoryAddress userData) {
        run(currentNumBytes, totalNumBytes);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FileProgressCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
