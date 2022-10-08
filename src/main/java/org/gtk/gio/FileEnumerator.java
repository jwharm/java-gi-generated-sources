package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
public class FileEnumerator extends org.gtk.gobject.Object {

    public FileEnumerator(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FileEnumerator */
    public static FileEnumerator castFrom(org.gtk.gobject.Object gobject) {
        return new FileEnumerator(gobject.refcounted());
    }
    
    static final MethodHandle g_file_enumerator_close = Interop.downcallHandle(
        "g_file_enumerator_close",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Releases all resources used by this enumerator, making the
     * enumerator return {@link IOErrorEnum#CLOSED} on all calls.
     * <p>
     * This will be automatically called when the last reference
     * is dropped, but you might want to call this function to make
     * sure resources are released as early as possible.
     */
    public boolean close(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_enumerator_close.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_enumerator_close_async = Interop.downcallHandle(
        "g_file_enumerator_close_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously closes the file enumerator.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned in
     * g_file_enumerator_close_finish().
     */
    public void closeAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_enumerator_close_async.invokeExact(handle(), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_enumerator_close_finish = Interop.downcallHandle(
        "g_file_enumerator_close_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean closeFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_enumerator_close_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_enumerator_get_child = Interop.downcallHandle(
        "g_file_enumerator_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public File getChild(FileInfo info) {
        try {
            var RESULT = (MemoryAddress) g_file_enumerator_get_child.invokeExact(handle(), info.handle());
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_enumerator_get_container = Interop.downcallHandle(
        "g_file_enumerator_get_container",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the {@link File} container which is being enumerated.
     */
    public File getContainer() {
        try {
            var RESULT = (MemoryAddress) g_file_enumerator_get_container.invokeExact(handle());
            return new File.FileImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_enumerator_has_pending = Interop.downcallHandle(
        "g_file_enumerator_has_pending",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the file enumerator has pending operations.
     */
    public boolean hasPending() {
        try {
            var RESULT = (int) g_file_enumerator_has_pending.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_enumerator_is_closed = Interop.downcallHandle(
        "g_file_enumerator_is_closed",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the file enumerator has been closed.
     */
    public boolean isClosed() {
        try {
            var RESULT = (int) g_file_enumerator_is_closed.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_enumerator_iterate = Interop.downcallHandle(
        "g_file_enumerator_iterate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This is a version of g_file_enumerator_next_file() that's easier to
     * use correctly from C programs.  With g_file_enumerator_next_file(),
     * the gboolean return value signifies "end of iteration or error", which
     * requires allocation of a temporary {@link org.gtk.glib.Error}.
     * <p>
     * In contrast, with this function, a {@code false} return from
     * g_file_enumerator_iterate() <strong>always</strong> means
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
     * <p>
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
     */
    public boolean iterate(PointerProxy<FileInfo> outInfo, PointerProxy<File> outChild, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_enumerator_iterate.invokeExact(handle(), outInfo.handle(), outChild.handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_enumerator_next_file = Interop.downcallHandle(
        "g_file_enumerator_next_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public FileInfo nextFile(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_enumerator_next_file.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileInfo(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_enumerator_next_files_async = Interop.downcallHandle(
        "g_file_enumerator_next_files_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void nextFilesAsync(int numFiles, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_enumerator_next_files_async.invokeExact(handle(), numFiles, ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_enumerator_next_files_finish = Interop.downcallHandle(
        "g_file_enumerator_next_files_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes the asynchronous operation started with g_file_enumerator_next_files_async().
     */
    public org.gtk.glib.List nextFilesFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_enumerator_next_files_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_enumerator_set_pending = Interop.downcallHandle(
        "g_file_enumerator_set_pending",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the file enumerator as having pending operations.
     */
    public void setPending(boolean pending) {
        try {
            g_file_enumerator_set_pending.invokeExact(handle(), pending ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
