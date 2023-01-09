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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        FileList newInstance = new FileList(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a FileList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FileList(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileList> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FileList(input);
    
    private static MemoryAddress constructNewFromArray(org.gtk.gio.File[] files, long nFiles) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gdk_file_list_new_from_array.invokeExact(
                        Interop.allocateNativeArray(files, false, SCOPE),
                        nFiles);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@code GdkFileList} for the given array of files.
     * <p>
     * This function is meant to be used by language bindings.
     * @param files the files to add to the list
     * @param nFiles the number of files in the array
     * @return the newly create files list
     */
    public static FileList newFromArray(org.gtk.gio.File[] files, long nFiles) {
        var RESULT = constructNewFromArray(files, nFiles);
        var OBJECT = org.gtk.gdk.FileList.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromList(org.gtk.glib.SList files) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_file_list_new_from_list.invokeExact(files.handle());
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
    public static FileList newFromList(org.gtk.glib.SList files) {
        var RESULT = constructNewFromList(files);
        var OBJECT = org.gtk.gdk.FileList.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Retrieves the list of files inside a {@code GdkFileList}.
     * <p>
     * This function is meant for language bindings.
     * @return the files inside the list
     */
    public org.gtk.glib.SList getFiles() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_file_list_get_files.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
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
