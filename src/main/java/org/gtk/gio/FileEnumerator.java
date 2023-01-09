package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link FileEnumerator} allows you to operate on a set of {@code GFiles},
 * returning a {@link FileInfo} structure for each file enumerated (e.g.
 * g_file_enumerate_children() will return a {@link FileEnumerator} for each
 * of the children within a directory).
 * <p>
 * To get the next file's information from a {@link FileEnumerator}, use
 * g_file_enumerator_next_file() or its asynchronous version,
 * g_file_enumerator_next_files_async(). Note that the asynchronous
 * version will return a list of {@code GFileInfos}, whereas the
 * synchronous will only return the next file in the enumerator.
 * <p>
 * The ordering of returned files is unspecified for non-Unix
 * platforms; for more information, see g_dir_read_name().  On Unix,
 * when operating on local files, returned files will be sorted by
 * inode number.  Effectively you can assume that the ordering of
 * returned files will be stable between successive calls (and
 * applications) assuming the directory is unchanged.
 * <p>
 * If your application needs a specific ordering, such as by name or
 * modification time, you will have to implement that in your
 * application code.
 * <p>
 * To close a {@link FileEnumerator}, use g_file_enumerator_close(), or
 * its asynchronous version, g_file_enumerator_close_async(). Once
 * a {@link FileEnumerator} is closed, no further actions may be performed
 * on it, and it should be freed with g_object_unref().
 */
public class FileEnumerator extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileEnumerator";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a FileEnumerator proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FileEnumerator(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileEnumerator> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FileEnumerator(input);
    
    /**
     * Releases all resources used by this enumerator, making the
     * enumerator return {@link IOErrorEnum#CLOSED} on all calls.
     * <p>
     * This will be automatically called when the last reference
     * is dropped, but you might want to call this function to make
     * sure resources are released as early as possible.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code TRUE} on success or {@code FALSE} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean close(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_file_enumerator_close.invokeExact(
                        handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Asynchronously closes the file enumerator.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned in
     * g_file_enumerator_close_finish().
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback} to call when the request is satisfied
     */
    public void closeAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_file_enumerator_close_async.invokeExact(
                    handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes closing a file enumerator, started from g_file_enumerator_close_async().
     * <p>
     * If the file enumerator was already closed when g_file_enumerator_close_async()
     * was called, then this function will report {@link IOErrorEnum#CLOSED} in {@code error}, and
     * return {@code false}. If the file enumerator had pending operation when the close
     * operation was started, then this function will report {@link IOErrorEnum#PENDING}, and
     * return {@code false}.  If {@code cancellable} was not {@code null}, then the operation may have been
     * cancelled by triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be set, and {@code false} will be
     * returned.
     * @param result a {@link AsyncResult}.
     * @return {@code true} if the close operation has finished successfully.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean closeFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_file_enumerator_close_finish.invokeExact(
                        handle(),
                        result.handle(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Return a new {@link File} which refers to the file named by {@code info} in the source
     * directory of {@code enumerator}.  This function is primarily intended to be used
     * inside loops with g_file_enumerator_next_file().
     * <p>
     * To use this, {@code G_FILE_ATTRIBUTE_STANDARD_NAME} must have been listed in the
     * attributes list used when creating the {@link FileEnumerator}.
     * <p>
     * This is a convenience method that's equivalent to:
     * <pre>{@code <!-- language="C" -->
     *   gchar *name = g_file_info_get_name (info);
     *   GFile *child = g_file_get_child (g_file_enumerator_get_container (enumr),
     *                                    name);
     * }</pre>
     * @param info a {@link FileInfo} gotten from g_file_enumerator_next_file()
     *   or the async equivalents.
     * @return a {@link File} for the {@link FileInfo} passed it.
     */
    public org.gtk.gio.File getChild(org.gtk.gio.FileInfo info) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_enumerator_get_child.invokeExact(
                    handle(),
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.File) Interop.register(RESULT, org.gtk.gio.File.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the {@link File} container which is being enumerated.
     * @return the {@link File} which is being enumerated.
     */
    public org.gtk.gio.File getContainer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_enumerator_get_container.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.File) Interop.register(RESULT, org.gtk.gio.File.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Checks if the file enumerator has pending operations.
     * @return {@code true} if the {@code enumerator} has pending operations.
     */
    public boolean hasPending() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_enumerator_has_pending.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if the file enumerator has been closed.
     * @return {@code true} if the {@code enumerator} is closed.
     */
    public boolean isClosed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_enumerator_is_closed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * This is a version of g_file_enumerator_next_file() that's easier to
     * use correctly from C programs.  With g_file_enumerator_next_file(),
     * the gboolean return value signifies "end of iteration or error", which
     * requires allocation of a temporary {@link org.gtk.glib.Error}.
     * <p>
     * In contrast, with this function, a {@code false} return from
     * g_file_enumerator_iterate() <em>always</em> means
     * "error".  End of iteration is signaled by {@code out_info} or {@code out_child} being {@code null}.
     * <p>
     * Another crucial difference is that the references for {@code out_info} and
     * {@code out_child} are owned by {@code direnum} (they are cached as hidden
     * properties).  You must not unref them in your own code.  This makes
     * memory management significantly easier for C code in combination
     * with loops.
     * <p>
     * Finally, this function optionally allows retrieving a {@link File} as
     * well.
     * <p>
     * You must specify at least one of {@code out_info} or {@code out_child}.
     * <p>
     * The code pattern for correctly using g_file_enumerator_iterate() from C
     * is:
     * <pre>{@code 
     * direnum = g_file_enumerate_children (file, ...);
     * while (TRUE)
     *   {
     *     GFileInfo *info;
     *     if (!g_file_enumerator_iterate (direnum, &info, NULL, cancellable, error))
     *       goto out;
     *     if (!info)
     *       break;
     *     ... do stuff with "info"; do not unref it! ...
     *   }
     * 
     * out:
     *   g_object_unref (direnum); // Note: frees the last @info
     * }</pre>
     * @param outInfo Output location for the next {@link FileInfo}, or {@code null}
     * @param outChild Output location for the next {@link File}, or {@code null}
     * @param cancellable a {@link Cancellable}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean iterate(@Nullable Out<org.gtk.gio.FileInfo> outInfo, @Nullable Out<org.gtk.gio.File> outChild, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment outInfoPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment outChildPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_file_enumerator_iterate.invokeExact(
                        handle(),
                        (Addressable) (outInfo == null ? MemoryAddress.NULL : (Addressable) outInfoPOINTER.address()),
                        (Addressable) (outChild == null ? MemoryAddress.NULL : (Addressable) outChildPOINTER.address()),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (outInfo != null) outInfo.set((org.gtk.gio.FileInfo) Interop.register(outInfoPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gtk.gio.FileInfo.fromAddress).marshal(outInfoPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (outChild != null) outChild.set((org.gtk.gio.File) Interop.register(outChildPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gtk.gio.File.fromAddress).marshal(outChildPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Returns information for the next file in the enumerated object.
     * Will block until the information is available. The {@link FileInfo}
     * returned from this function will contain attributes that match the
     * attribute string that was passed when the {@link FileEnumerator} was created.
     * <p>
     * See the documentation of {@link FileEnumerator} for information about the
     * order of returned files.
     * <p>
     * On error, returns {@code null} and sets {@code error} to the error. If the
     * enumerator is at the end, {@code null} will be returned and {@code error} will
     * be unset.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return A {@link FileInfo} or {@code null} on error
     *    or end of enumerator.  Free the returned object with
     *    g_object_unref() when no longer needed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @Nullable org.gtk.gio.FileInfo nextFile(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_file_enumerator_next_file.invokeExact(
                        handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gtk.gio.FileInfo) Interop.register(RESULT, org.gtk.gio.FileInfo.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Request information for a number of files from the enumerator asynchronously.
     * When all i/o for the operation is finished the {@code callback} will be called with
     * the requested information.
     * <p>
     * See the documentation of {@link FileEnumerator} for information about the
     * order of returned files.
     * <p>
     * The callback can be called with less than {@code num_files} files in case of error
     * or at the end of the enumerator. In case of a partial error the callback will
     * be called with any succeeding items and no error, and on the next request the
     * error will be reported. If a request is cancelled the callback will be called
     * with {@link IOErrorEnum#CANCELLED}.
     * <p>
     * During an async request no other sync and async calls are allowed, and will
     * result in {@link IOErrorEnum#PENDING} errors.
     * <p>
     * Any outstanding i/o request with higher priority (lower numerical value) will
     * be executed before an outstanding request with lower priority. Default
     * priority is {@code G_PRIORITY_DEFAULT}.
     * @param numFiles the number of file info objects to request
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback} to call when the request is satisfied
     */
    public void nextFilesAsync(int numFiles, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_file_enumerator_next_files_async.invokeExact(
                    handle(),
                    numFiles,
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes the asynchronous operation started with g_file_enumerator_next_files_async().
     * @param result a {@link AsyncResult}.
     * @return a {@link org.gtk.glib.List} of {@code GFileInfos}. You must free the list with
     *     g_list_free() and unref the infos with g_object_unref() when you're
     *     done with them.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.List nextFilesFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_file_enumerator_next_files_finish.invokeExact(
                        handle(),
                        result.handle(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Sets the file enumerator as having pending operations.
     * @param pending a boolean value.
     */
    public void setPending(boolean pending) {
        try {
            DowncallHandles.g_file_enumerator_set_pending.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(pending, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_file_enumerator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FileEnumerator.Builder} object constructs a {@link FileEnumerator} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FileEnumerator.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FileEnumerator} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FileEnumerator}.
         * @return A new instance of {@code FileEnumerator} with the properties 
         *         that were set in the Builder object.
         */
        public FileEnumerator build() {
            return (FileEnumerator) org.gtk.gobject.GObject.newWithProperties(
                FileEnumerator.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setContainer(org.gtk.gio.File container) {
            names.add("container");
            values.add(org.gtk.gobject.Value.create(container));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_file_enumerator_close = Interop.downcallHandle(
                "g_file_enumerator_close",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_enumerator_close_async = Interop.downcallHandle(
                "g_file_enumerator_close_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_enumerator_close_finish = Interop.downcallHandle(
                "g_file_enumerator_close_finish",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_enumerator_get_child = Interop.downcallHandle(
                "g_file_enumerator_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_enumerator_get_container = Interop.downcallHandle(
                "g_file_enumerator_get_container",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_enumerator_has_pending = Interop.downcallHandle(
                "g_file_enumerator_has_pending",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_enumerator_is_closed = Interop.downcallHandle(
                "g_file_enumerator_is_closed",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_enumerator_iterate = Interop.downcallHandle(
                "g_file_enumerator_iterate",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_enumerator_next_file = Interop.downcallHandle(
                "g_file_enumerator_next_file",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_enumerator_next_files_async = Interop.downcallHandle(
                "g_file_enumerator_next_files_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_enumerator_next_files_finish = Interop.downcallHandle(
                "g_file_enumerator_next_files_finish",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_file_enumerator_set_pending = Interop.downcallHandle(
                "g_file_enumerator_set_pending",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_file_enumerator_get_type = Interop.downcallHandle(
                "g_file_enumerator_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_file_enumerator_get_type != null;
    }
}
