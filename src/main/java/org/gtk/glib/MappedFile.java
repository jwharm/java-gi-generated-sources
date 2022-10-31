package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link MappedFile} represents a file mapping created with
 * g_mapped_file_new(). It has only private members and should
 * not be accessed directly.
 */
public class MappedFile extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMappedFile";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static MappedFile allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MappedFile newInstance = new MappedFile(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public MappedFile(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String filename, boolean writable) throws GErrorException {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_mapped_file_new.invokeExact(
                    Interop.allocateNativeString(filename),
                    writable ? 1 : 0, (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Maps a file into memory. On UNIX, this is using the mmap() function.
     * <p>
     * If {@code writable} is {@code true}, the mapped buffer may be modified, otherwise
     * it is an error to modify the mapped buffer. Modifications to the buffer
     * are not visible to other processes mapping the same file, and are not
     * written back to the file.
     * <p>
     * Note that modifications of the underlying file might affect the contents
     * of the {@link MappedFile}. Therefore, mapping should only be used if the file
     * will not be modified, or if all modifications of the file are done
     * atomically (e.g. using g_file_set_contents()).
     * <p>
     * If {@code filename} is the name of an empty, regular file, the function
     * will successfully return an empty {@link MappedFile}. In other cases of
     * size 0 (e.g. device files such as /dev/null), {@code error} will be set
     * to the {@link FileError} value {@link FileError#INVAL}.
     * @param filename The path of the file to load, in the GLib
     *     filename encoding
     * @param writable whether the mapping should be writable
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public MappedFile(@NotNull java.lang.String filename, boolean writable) throws GErrorException {
        super(constructNew(filename, writable));
    }
    
    private static Refcounted constructNewFromFd(int fd, boolean writable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_mapped_file_new_from_fd.invokeExact(
                    fd,
                    writable ? 1 : 0, (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Maps a file into memory. On UNIX, this is using the mmap() function.
     * <p>
     * If {@code writable} is {@code true}, the mapped buffer may be modified, otherwise
     * it is an error to modify the mapped buffer. Modifications to the buffer
     * are not visible to other processes mapping the same file, and are not
     * written back to the file.
     * <p>
     * Note that modifications of the underlying file might affect the contents
     * of the {@link MappedFile}. Therefore, mapping should only be used if the file
     * will not be modified, or if all modifications of the file are done
     * atomically (e.g. using g_file_set_contents()).
     * @param fd The file descriptor of the file to load
     * @param writable whether the mapping should be writable
     * @return a newly allocated {@link MappedFile} which must be unref'd
     *    with g_mapped_file_unref(), or {@code null} if the mapping failed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static MappedFile newFromFd(int fd, boolean writable) throws GErrorException {
        return new MappedFile(constructNewFromFd(fd, writable));
    }
    
    /**
     * This call existed before {@link MappedFile} had refcounting and is currently
     * exactly the same as g_mapped_file_unref().
     * @deprecated Use g_mapped_file_unref() instead.
     */
    @Deprecated
    public void free() {
        try {
            DowncallHandles.g_mapped_file_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Bytes} which references the data mapped from {@code file}.
     * The mapped contents of the file must not be modified after creating this
     * bytes object, because a {@link Bytes} should be immutable.
     * @return A newly allocated {@link Bytes} referencing data
     *     from {@code file}
     */
    public @NotNull org.gtk.glib.Bytes getBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mapped_file_get_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns the contents of a {@link MappedFile}.
     * <p>
     * Note that the contents may not be zero-terminated,
     * even if the {@link MappedFile} is backed by a text file.
     * <p>
     * If the file is empty then {@code null} is returned.
     * @return the contents of {@code file}, or {@code null}.
     */
    public @NotNull java.lang.String getContents() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mapped_file_get_contents.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the length of the contents of a {@link MappedFile}.
     * @return the length of the contents of {@code file}.
     */
    public long getLength() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_mapped_file_get_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Increments the reference count of {@code file} by one.  It is safe to call
     * this function from any thread.
     * @return the passed in {@link MappedFile}.
     */
    public @NotNull org.gtk.glib.MappedFile ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mapped_file_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.MappedFile(Refcounted.get(RESULT, true));
    }
    
    /**
     * Decrements the reference count of {@code file} by one.  If the reference count
     * drops to 0, unmaps the buffer of {@code file} and frees it.
     * <p>
     * It is safe to call this function from any thread.
     * <p>
     * Since 2.22
     */
    public void unref() {
        try {
            DowncallHandles.g_mapped_file_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_mapped_file_new = Interop.downcallHandle(
            "g_mapped_file_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_mapped_file_new_from_fd = Interop.downcallHandle(
            "g_mapped_file_new_from_fd",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_mapped_file_free = Interop.downcallHandle(
            "g_mapped_file_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_mapped_file_get_bytes = Interop.downcallHandle(
            "g_mapped_file_get_bytes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_mapped_file_get_contents = Interop.downcallHandle(
            "g_mapped_file_get_contents",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_mapped_file_get_length = Interop.downcallHandle(
            "g_mapped_file_get_length",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_mapped_file_ref = Interop.downcallHandle(
            "g_mapped_file_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_mapped_file_unref = Interop.downcallHandle(
            "g_mapped_file_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
