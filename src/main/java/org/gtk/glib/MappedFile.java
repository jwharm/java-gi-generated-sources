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

    public MappedFile(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_mapped_file_new = Interop.downcallHandle(
        "g_mapped_file_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String filename, @NotNull boolean writable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_mapped_file_new.invokeExact(Interop.allocateNativeString(filename), writable ? 1 : 0, (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public MappedFile(@NotNull java.lang.String filename, @NotNull boolean writable) throws GErrorException {
        super(constructNew(filename, writable));
    }
    
    private static final MethodHandle g_mapped_file_new_from_fd = Interop.downcallHandle(
        "g_mapped_file_new_from_fd",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromFd(@NotNull int fd, @NotNull boolean writable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_mapped_file_new_from_fd.invokeExact(fd, writable ? 1 : 0, (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static MappedFile newFromFd(@NotNull int fd, @NotNull boolean writable) throws GErrorException {
        return new MappedFile(constructNewFromFd(fd, writable));
    }
    
    private static final MethodHandle g_mapped_file_get_bytes = Interop.downcallHandle(
        "g_mapped_file_get_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link Bytes} which references the data mapped from {@code file}.
     * The mapped contents of the file must not be modified after creating this
     * bytes object, because a {@link Bytes} should be immutable.
     */
    public @NotNull Bytes getBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mapped_file_get_bytes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Bytes(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_mapped_file_get_contents = Interop.downcallHandle(
        "g_mapped_file_get_contents",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the contents of a {@link MappedFile}.
     * <p>
     * Note that the contents may not be zero-terminated,
     * even if the {@link MappedFile} is backed by a text file.
     * <p>
     * If the file is empty then {@code null} is returned.
     */
    public @NotNull java.lang.String getContents() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mapped_file_get_contents.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_mapped_file_get_length = Interop.downcallHandle(
        "g_mapped_file_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the length of the contents of a {@link MappedFile}.
     */
    public long getLength() {
        long RESULT;
        try {
            RESULT = (long) g_mapped_file_get_length.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_mapped_file_ref = Interop.downcallHandle(
        "g_mapped_file_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increments the reference count of {@code file} by one.  It is safe to call
     * this function from any thread.
     */
    public @NotNull MappedFile ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mapped_file_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new MappedFile(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_mapped_file_unref = Interop.downcallHandle(
        "g_mapped_file_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the reference count of {@code file} by one.  If the reference count
     * drops to 0, unmaps the buffer of {@code file} and frees it.
     * <p>
     * It is safe to call this function from any thread.
     * <p>
     * Since 2.22
     */
    public @NotNull void unref() {
        try {
            g_mapped_file_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
