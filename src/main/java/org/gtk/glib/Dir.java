package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure representing an opened directory.
 */
public class Dir extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDir";
    
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
     * Allocate a new {@link Dir}
     * @return A new, uninitialized @{link Dir}
     */
    public static Dir allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Dir newInstance = new Dir(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Dir proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Dir(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Closes the directory and deallocates all related resources.
     */
    public void close() {
        try {
            DowncallHandles.g_dir_close.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the name of another entry in the directory, or {@code null}.
     * The order of entries returned from this function is not defined,
     * and may vary by file system or other operating-system dependent
     * factors.
     * <p>
     * {@code null} may also be returned in case of errors. On Unix, you can
     * check {@code errno} to find out if {@code null} was returned because of an error.
     * <p>
     * On Unix, the '.' and '..' entries are omitted, and the returned
     * name is in the on-disk encoding.
     * <p>
     * On Windows, as is true of all GLib functions which operate on
     * filenames, the returned name is in UTF-8.
     * @return The entry's name or {@code null} if there are no
     *   more entries. The return value is owned by GLib and
     *   must not be modified or freed.
     */
    public @NotNull java.lang.String readName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dir_read_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Resets the given directory. The next call to g_dir_read_name()
     * will return the first entry again.
     */
    public void rewind() {
        try {
            DowncallHandles.g_dir_rewind.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a subdirectory in the preferred directory for temporary
     * files (as returned by g_get_tmp_dir()).
     * <p>
     * {@code tmpl} should be a string in the GLib file name encoding containing
     * a sequence of six 'X' characters, as the parameter to g_mkstemp().
     * However, unlike these functions, the template should only be a
     * basename, no directory components are allowed. If template is
     * {@code null}, a default template is used.
     * <p>
     * Note that in contrast to g_mkdtemp() (and mkdtemp()) {@code tmpl} is not
     * modified, and might thus be a read-only literal string.
     * @param tmpl Template for directory name,
     *     as in g_mkdtemp(), basename only, or {@code null} for a default template
     * @return The actual name used. This string
     *     should be freed with g_free() when not needed any longer and is
     *     is in the GLib file name encoding. In case of errors, {@code null} is
     *     returned and {@code error} will be set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @NotNull java.lang.String makeTmp(@Nullable java.lang.String tmpl) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dir_make_tmp.invokeExact(
                    (Addressable) (tmpl == null ? MemoryAddress.NULL : Interop.allocateNativeString(tmpl)),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Opens a directory for reading. The names of the files in the
     * directory can then be retrieved using g_dir_read_name().  Note
     * that the ordering is not defined.
     * @param path the path to the directory you are interested in. On Unix
     *         in the on-disk encoding. On Windows in UTF-8
     * @param flags Currently must be set to 0. Reserved for future use.
     * @return a newly allocated {@link Dir} on success, {@code null} on failure.
     *   If non-{@code null}, you must free the result with g_dir_close()
     *   when you are finished with it.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @NotNull org.gtk.glib.Dir open(@NotNull java.lang.String path, int flags) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dir_open.invokeExact(
                    Interop.allocateNativeString(path),
                    flags,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Dir(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dir_close = Interop.downcallHandle(
            "g_dir_close",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dir_read_name = Interop.downcallHandle(
            "g_dir_read_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dir_rewind = Interop.downcallHandle(
            "g_dir_rewind",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dir_make_tmp = Interop.downcallHandle(
            "g_dir_make_tmp",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dir_open = Interop.downcallHandle(
            "g_dir_open",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Dir struct;
        
         /**
         * A {@link Dir.Build} object constructs a {@link Dir} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Dir.allocate();
        }
        
         /**
         * Finish building the {@link Dir} struct.
         * @return A new instance of {@code Dir} with the fields 
         *         that were set in the Build object.
         */
        public Dir construct() {
            return struct;
        }
    }
}
