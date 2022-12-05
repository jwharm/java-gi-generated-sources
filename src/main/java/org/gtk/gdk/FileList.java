package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque type representing a list of files.
 * @version 4.6
 */
public class FileList extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkFileList";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FileList}
     * @return A new, uninitialized @{link FileList}
     */
    public static FileList allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FileList newInstance = new FileList(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a FileList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FileList(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNewFromArray(@NotNull org.gtk.gio.File[] files, long nFiles) {
        java.util.Objects.requireNonNull(files, "Parameter 'files' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_file_list_new_from_array.invokeExact(
                    Interop.allocateNativeArray(files, false),
                    nFiles);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GdkFileList} for the given array of files.
     * <p>
     * This function is meant to be used by language bindings.
     * @param files the files to add to the list
     * @param nFiles the number of files in the array
     * @return the newly create files list
     */
    public static FileList newFromArray(@NotNull org.gtk.gio.File[] files, long nFiles) {
        return new FileList(constructNewFromArray(files, nFiles), Ownership.FULL);
    }
    
    private static Addressable constructNewFromList(@NotNull org.gtk.glib.SList files) {
        java.util.Objects.requireNonNull(files, "Parameter 'files' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_file_list_new_from_list.invokeExact(
                    files.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new files list container from a singly linked list of
     * {@code GFile} instances.
     * <p>
     * This function is meant to be used by language bindings
     * @param files a list of files
     * @return the newly created files list
     */
    public static FileList newFromList(@NotNull org.gtk.glib.SList files) {
        return new FileList(constructNewFromList(files), Ownership.FULL);
    }
    
    /**
     * Retrieves the list of files inside a {@code GdkFileList}.
     * <p>
     * This function is meant for language bindings.
     * @return the files inside the list
     */
    public @NotNull org.gtk.glib.SList getFiles() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_file_list_get_files.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(RESULT, Ownership.CONTAINER);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_file_list_new_from_array = Interop.downcallHandle(
            "gdk_file_list_new_from_array",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gdk_file_list_new_from_list = Interop.downcallHandle(
            "gdk_file_list_new_from_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_file_list_get_files = Interop.downcallHandle(
            "gdk_file_list_get_files",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
