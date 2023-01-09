package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This callback type is used by g_file_measure_disk_usage() to make
 * periodic progress reports when measuring the amount of disk spaced
 * used by a directory.
 * <p>
 * These calls are made on a best-effort basis and not all types of
 * {@link File} will support them.  At the minimum, however, one call will
 * always be made immediately.
 * <p>
 * In the case that there is no support, {@code reporting} will be set to
 * {@code false} (and the other values undefined) and no further calls will be
 * made.  Otherwise, the {@code reporting} will be {@code true} and the other values
 * all-zeros during the first (immediate) call.  In this way, you can
 * know which type of progress UI to show without a delay.
 * <p>
 * For g_file_measure_disk_usage() the callback is made directly.  For
 * g_file_measure_disk_usage_async() the callback is made via the
 * default main context of the calling thread (ie: the same way that the
 * final async result would be reported).
 * <p>
 * {@code current_size} is in the same units as requested by the operation (see
 * {@link FileMeasureFlags#APPARENT_SIZE}).
 * <p>
 * The frequency of the updates is implementation defined, but is
 * ideally about once every 200ms.
 * <p>
 * The last progress callback may or may not be equal to the final
 * result.  Always check the async result to get the final value.
 * @version 2.38
 */
/**
 * Functional interface declaration of the {@code FileMeasureProgressCallback} callback.
 */
@FunctionalInterface
public interface FileMeasureProgressCallback {

    /**
     * This callback type is used by g_file_measure_disk_usage() to make
     * periodic progress reports when measuring the amount of disk spaced
     * used by a directory.
     * <p>
     * These calls are made on a best-effort basis and not all types of
     * {@link File} will support them.  At the minimum, however, one call will
     * always be made immediately.
     * <p>
     * In the case that there is no support, {@code reporting} will be set to
     * {@code false} (and the other values undefined) and no further calls will be
     * made.  Otherwise, the {@code reporting} will be {@code true} and the other values
     * all-zeros during the first (immediate) call.  In this way, you can
     * know which type of progress UI to show without a delay.
     * <p>
     * For g_file_measure_disk_usage() the callback is made directly.  For
     * g_file_measure_disk_usage_async() the callback is made via the
     * default main context of the calling thread (ie: the same way that the
     * final async result would be reported).
     * <p>
     * {@code current_size} is in the same units as requested by the operation (see
     * {@link FileMeasureFlags#APPARENT_SIZE}).
     * <p>
     * The frequency of the updates is implementation defined, but is
     * ideally about once every 200ms.
     * <p>
     * The last progress callback may or may not be equal to the final
     * result.  Always check the async result to get the final value.
     * @version 2.38
     */
    void run(boolean reporting, long currentSize, long numDirs, long numFiles);
    
    @ApiStatus.Internal default void upcall(int reporting, long currentSize, long numDirs, long numFiles, MemoryAddress userData) {
        run(Marshal.integerToBoolean.marshal(reporting, null).booleanValue(), currentSize, numDirs, numFiles);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FileMeasureProgressCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
