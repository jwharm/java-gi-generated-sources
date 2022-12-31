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
@FunctionalInterface
public interface FileReadMoreCallback {
    boolean run(java.lang.String fileContents, long fileSize);

    @ApiStatus.Internal default int upcall(MemoryAddress fileContents, long fileSize, MemoryAddress userData) {
        var RESULT = run(Marshal.addressToString.marshal(fileContents, null), fileSize);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FileReadMoreCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
