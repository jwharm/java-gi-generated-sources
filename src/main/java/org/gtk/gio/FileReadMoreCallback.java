package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * When loading the partial contents of a file with g_file_load_partial_contents_async(),
 * it may become necessary to determine if any more data from the file should be loaded.
 * A {@link FileReadMoreCallback} function facilitates this by returning {@code true} if more data
 * should be read, or {@code false} otherwise.
 */
/**
 * Functional interface declaration of the {@code FileReadMoreCallback} callback.
 */
@FunctionalInterface
public interface FileReadMoreCallback {

    /**
     * When loading the partial contents of a file with g_file_load_partial_contents_async(),
     * it may become necessary to determine if any more data from the file should be loaded.
     * A {@link FileReadMoreCallback} function facilitates this by returning {@code true} if more data
     * should be read, or {@code false} otherwise.
     */
    boolean run(java.lang.String fileContents, long fileSize);
    
    @ApiStatus.Internal default int upcall(MemoryAddress fileContents, long fileSize, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run(Marshal.addressToString.marshal(fileContents, null), fileSize);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FileReadMoreCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
