package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link File} is a high level abstraction for manipulating files on a
 * virtual file system. {@code GFiles} are lightweight, immutable objects
 * that do no I/O upon creation. It is necessary to understand that
 * {@link File} objects do not represent files, merely an identifier for a
 * file. All file content I/O is implemented as streaming operations
 * (see {@link InputStream} and {@link OutputStream}).
 * <p>
 * To construct a {@link File}, you can use:
 * <ul>
 * <li>g_file_new_for_path() if you have a path.
 * <li>g_file_new_for_uri() if you have a URI.
 * <li>g_file_new_for_commandline_arg() for a command line argument.
 * <li>g_file_new_tmp() to create a temporary file from a template.
 * <li>g_file_parse_name() from a UTF-8 string gotten from g_file_get_parse_name().
 * <li>g_file_new_build_filename() to create a file from path elements.
 * </ul>
 * <p>
 * One way to think of a {@link File} is as an abstraction of a pathname. For
 * normal files the system pathname is what is stored internally, but as
 * {@code GFiles} are extensible it could also be something else that corresponds
 * to a pathname in a userspace implementation of a filesystem.
 * <p>
 * {@code GFiles} make up hierarchies of directories and files that correspond to
 * the files on a filesystem. You can move through the file system with
 * {@link File} using g_file_get_parent() to get an identifier for the parent
 * directory, g_file_get_child() to get a child within a directory,
 * g_file_resolve_relative_path() to resolve a relative path between two
 * {@code GFiles}. There can be multiple hierarchies, so you may not end up at
 * the same root if you repeatedly call g_file_get_parent() on two different
 * files.
 * <p>
 * All {@code GFiles} have a basename (get with g_file_get_basename()). These names
 * are byte strings that are used to identify the file on the filesystem
 * (relative to its parent directory) and there is no guarantees that they
 * have any particular charset encoding or even make any sense at all. If
 * you want to use filenames in a user interface you should use the display
 * name that you can get by requesting the
 * {@code G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME} attribute with g_file_query_info().
 * This is guaranteed to be in UTF-8 and can be used in a user interface.
 * But always store the real basename or the {@link File} to use to actually
 * access the file, because there is no way to go from a display name to
 * the actual name.
 * <p>
 * Using {@link File} as an identifier has the same weaknesses as using a path
 * in that there may be multiple aliases for the same file. For instance,
 * hard or soft links may cause two different {@code GFiles} to refer to the same
 * file. Other possible causes for aliases are: case insensitive filesystems,
 * short and long names on FAT/NTFS, or bind mounts in Linux. If you want to
 * check if two {@code GFiles} point to the same file you can query for the
 * {@code G_FILE_ATTRIBUTE_ID_FILE} attribute. Note that {@link File} does some trivial
 * canonicalization of pathnames passed in, so that trivial differences in
 * the path string used at creation (duplicated slashes, slash at end of
 * path, "." or ".." path segments, etc) does not create different {@code GFiles}.
 * <p>
 * Many {@link File} operations have both synchronous and asynchronous versions
 * to suit your application. Asynchronous versions of synchronous functions
 * simply have _async() appended to their function names. The asynchronous
 * I/O functions call a {@link AsyncReadyCallback} which is then used to finalize
 * the operation, producing a GAsyncResult which is then passed to the
 * function's matching _finish() operation.
 * <p>
 * It is highly recommended to use asynchronous calls when running within a
 * shared main loop, such as in the main thread of an application. This avoids
 * I/O operations blocking other sources on the main loop from being dispatched.
 * Synchronous I/O operations should be performed from worker threads. See the
 * [introduction to asynchronous programming section][async-programming] for
 * more.
 * <p>
 * Some {@link File} operations almost always take a noticeable amount of time, and
 * so do not have synchronous analogs. Notable cases include:
 * <ul>
 * <li>g_file_mount_mountable() to mount a mountable file.
 * <li>g_file_unmount_mountable_with_operation() to unmount a mountable file.
 * <li>g_file_eject_mountable_with_operation() to eject a mountable file.
 * </ul>
 * <p>
 * <h2>Entity Tags # {#gfile-etag}</h2>
 * <p>
 * One notable feature of {@code GFiles} are entity tags, or "etags" for
 * short. Entity tags are somewhat like a more abstract version of the
 * traditional mtime, and can be used to quickly determine if the file
 * has been modified from the version on the file system. See the
 * HTTP 1.1
 * <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html">specification</a>
 * for HTTP Etag headers, which are a very similar concept.
 */
public interface File extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Gets an output stream for appending data to the file.
     * If the file doesn't already exist it is created.
     * <p>
     * By default files created are generally readable by everyone,
     * but if you pass {@link FileCreateFlags#PRIVATE} in {@code flags} the file
     * will be made readable only to the current user, to the level that
     * is supported on the target filesystem.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link IOErrorEnum#CANCELLED} will be
     * returned.
     * <p>
     * Some file systems don't allow all file names, and may return an
     * {@link IOErrorEnum#INVALID_FILENAME} error. If the file is a directory the
     * {@link IOErrorEnum#IS_DIRECTORY} error will be returned. Other errors are
     * possible too, and depend on what kind of filesystem the file is on.
     */
    public default FileOutputStream appendTo(int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_append_to(handle(), flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileOutputStream(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously opens {@code file} for appending.
     * <p>
     * For more details, see g_file_append_to() which is
     * the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_append_to_finish() to get the result
     * of the operation.
     */
    public default void appendToAsync(int flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_append_to_async(handle(), flags, ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous file append operation started with
     * g_file_append_to_async().
     */
    public default FileOutputStream appendToFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_append_to_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileOutputStream(References.get(RESULT, true));
    }
    
    /**
     * Prepares the file attribute query string for copying to {@code file}.
     * <p>
     * This function prepares an attribute query string to be
     * passed to g_file_query_info() to get a list of attributes
     * normally copied with the file (see g_file_copy_attributes()
     * for the detailed description). This function is used by the
     * implementation of g_file_copy_attributes() and is useful
     * when one needs to query and set the attributes in two
     * stages (e.g., for recursive move of a directory).
     */
    public default java.lang.String buildAttributeListForCopy(int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_build_attribute_list_for_copy(handle(), flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Copies the file {@code source} to the location specified by {@code destination}.
     * Can not handle recursive copies of directories.
     * <p>
     * If the flag {@link FileCopyFlags#OVERWRITE} is specified an already
     * existing {@code destination} file is overwritten.
     * <p>
     * If the flag {@link FileCopyFlags#NOFOLLOW_SYMLINKS} is specified then symlinks
     * will be copied as symlinks, otherwise the target of the
     * {@code source} symlink will be copied.
     * <p>
     * If the flag {@link FileCopyFlags#ALL_METADATA} is specified then all the metadata
     * that is possible to copy is copied, not just the default subset (which,
     * for instance, does not include the owner, see {@link FileInfo}).
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * If {@code progress_callback} is not <code>null</code>, then the operation can be monitored
     * by setting this to a {@link FileProgressCallback} function.
     * {@code progress_callback_data} will be passed to this function. It is guaranteed
     * that this callback will be called after all data has been transferred with
     * the total number of bytes copied during the operation.
     * <p>
     * If the {@code source} file does not exist, then the {@link IOErrorEnum#NOT_FOUND} error
     * is returned, independent on the status of the {@code destination}.
     * <p>
     * If {@link FileCopyFlags#OVERWRITE} is not specified and the target exists, then
     * the error {@link IOErrorEnum#EXISTS} is returned.
     * <p>
     * If trying to overwrite a file over a directory, the {@link IOErrorEnum#IS_DIRECTORY}
     * error is returned. If trying to overwrite a directory with a directory the
     * {@link IOErrorEnum#WOULD_MERGE} error is returned.
     * <p>
     * If the source is a directory and the target does not exist, or
     * {@link FileCopyFlags#OVERWRITE} is specified and the target is a file, then the
     * {@link IOErrorEnum#WOULD_RECURSE} error is returned.
     * <p>
     * If you are interested in copying the {@link File} object itself (not the on-disk
     * file), see g_file_dup().
     */
    public default boolean copy(File destination, int flags, Cancellable cancellable, FileProgressCallback progressCallback) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = gtk_h.g_file_copy(handle(), destination.handle(), flags, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFileProgressCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return (RESULT != 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Copies the file {@code source} to the location specified by {@code destination}
     * asynchronously. For details of the behaviour, see g_file_copy().
     * <p>
     * If {@code progress_callback} is not <code>null</code>, then that function that will be called
     * just like in g_file_copy(). The callback will run in the default main context
     * of the thread calling g_file_copy_async() — the same context as {@code callback} is
     * run in.
     * <p>
     * When the operation is finished, {@code callback} will be called. You can then call
     * g_file_copy_finish() to get the result of the operation.
     */
    public default void copyAsync(File destination, int flags, int ioPriority, Cancellable cancellable, FileProgressCallback progressCallback, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_copy_async(handle(), destination.handle(), flags, ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFileProgressCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Copies the file attributes from {@code source} to {@code destination}.
     * <p>
     * Normally only a subset of the file attributes are copied,
     * those that are copies in a normal file copy operation
     * (which for instance does not include e.g. owner). However
     * if {@link FileCopyFlags#ALL_METADATA} is specified in {@code flags}, then
     * all the metadata that is possible to copy is copied. This
     * is useful when implementing move by copy + delete source.
     */
    public default boolean copyAttributes(File destination, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_copy_attributes(handle(), destination.handle(), flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Finishes copying the file started with g_file_copy_async().
     */
    public default boolean copyFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_copy_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Creates a new file and returns an output stream for writing to it.
     * The file must not already exist.
     * <p>
     * By default files created are generally readable by everyone,
     * but if you pass {@link FileCreateFlags#PRIVATE} in {@code flags} the file
     * will be made readable only to the current user, to the level
     * that is supported on the target filesystem.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link IOErrorEnum#CANCELLED} will be
     * returned.
     * <p>
     * If a file or directory with this name already exists the
     * {@link IOErrorEnum#EXISTS} error will be returned. Some file systems don't
     * allow all file names, and may return an {@link IOErrorEnum#INVALID_FILENAME}
     * error, and if the name is to long {@link IOErrorEnum#FILENAME_TOO_LONG} will
     * be returned. Other errors are possible too, and depend on what kind
     * of filesystem the file is on.
     */
    public default FileOutputStream create(int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_create(handle(), flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileOutputStream(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously creates a new file and returns an output stream
     * for writing to it. The file must not already exist.
     * <p>
     * For more details, see g_file_create() which is
     * the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_create_finish() to get the result
     * of the operation.
     */
    public default void createAsync(int flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_create_async(handle(), flags, ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous file create operation started with
     * g_file_create_async().
     */
    public default FileOutputStream createFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_create_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileOutputStream(References.get(RESULT, true));
    }
    
    /**
     * Creates a new file and returns a stream for reading and
     * writing to it. The file must not already exist.
     * <p>
     * By default files created are generally readable by everyone,
     * but if you pass {@link FileCreateFlags#PRIVATE} in {@code flags} the file
     * will be made readable only to the current user, to the level
     * that is supported on the target filesystem.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link IOErrorEnum#CANCELLED} will be
     * returned.
     * <p>
     * If a file or directory with this name already exists, the
     * {@link IOErrorEnum#EXISTS} error will be returned. Some file systems don't
     * allow all file names, and may return an {@link IOErrorEnum#INVALID_FILENAME}
     * error, and if the name is too long, {@link IOErrorEnum#FILENAME_TOO_LONG}
     * will be returned. Other errors are possible too, and depend on what
     * kind of filesystem the file is on.
     * <p>
     * Note that in many non-local file cases read and write streams are
     * not supported, so make sure you really need to do read and write
     * streaming, rather than just opening for reading or writing.
     */
    public default FileIOStream createReadwrite(int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_create_readwrite(handle(), flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileIOStream(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously creates a new file and returns a stream
     * for reading and writing to it. The file must not already exist.
     * <p>
     * For more details, see g_file_create_readwrite() which is
     * the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_create_readwrite_finish() to get
     * the result of the operation.
     */
    public default void createReadwriteAsync(int flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_create_readwrite_async(handle(), flags, ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous file create operation started with
     * g_file_create_readwrite_async().
     */
    public default FileIOStream createReadwriteFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_create_readwrite_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileIOStream(References.get(RESULT, true));
    }
    
    /**
     * Deletes a file. If the {@code file} is a directory, it will only be
     * deleted if it is empty. This has the same semantics as g_unlink().
     * <p>
     * If {@code file} doesn’t exist, {@link IOErrorEnum#NOT_FOUND} will be returned. This allows
     * for deletion to be implemented avoiding
     * <a href="https://en.wikipedia.org/wiki/Time-of-check_to_time-of-use">time-of-check to time-of-use races</a>:
     * |[
     * g_autoptr(GError) local_error = NULL;
     * if (!g_file_delete (my_file, my_cancellable, &local_error) &&
     *     !g_error_matches (local_error, G_IO_ERROR, G_IO_ERROR_NOT_FOUND))
     *   {
     *     // deletion failed for some reason other than the file not existing:
     *     // so report the error
     *     g_warning ("Failed to delete {@code s}: {@code s}",
     *                g_file_peek_path (my_file), local_error->message);
     *   }
     * ]|
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean delete(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_delete(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously delete a file. If the {@code file} is a directory, it will
     * only be deleted if it is empty.  This has the same semantics as
     * g_unlink().
     */
    public default void deleteAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_delete_async(handle(), ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes deleting a file started with g_file_delete_async().
     */
    public default boolean deleteFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_delete_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Duplicates a {@link File} handle. This operation does not duplicate
     * the actual file or directory represented by the {@link File}; see
     * g_file_copy() if attempting to copy a file.
     * <p>
     * g_file_dup() is useful when a second handle is needed to the same underlying
     * file, for use in a separate thread ({@link File} is not thread-safe). For use
     * within the same thread, use g_object_ref() to increment the existing object’s
     * reference count.
     * <p>
     * This call does no blocking I/O.
     */
    public default File dup() {
        var RESULT = gtk_h.g_file_dup(handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Starts an asynchronous eject on a mountable.
     * When this operation has completed, {@code callback} will be called with
     * {@code user_user} data, and the operation can be finalized with
     * g_file_eject_mountable_with_operation_finish().
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default void ejectMountableWithOperation(int flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_eject_mountable_with_operation(handle(), flags, mountOperation.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous eject operation started by
     * g_file_eject_mountable_with_operation().
     */
    public default boolean ejectMountableWithOperationFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_eject_mountable_with_operation_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the requested information about the files in a directory.
     * The result is a {@link FileEnumerator} object that will give out
     * {@link FileInfo} objects for all the files in the directory.
     * <p>
     * The {@code attributes} value is a string that specifies the file
     * attributes that should be gathered. It is not an error if
     * it's not possible to read a particular requested attribute
     * from a file - it just won't be set. {@code attributes} should
     * be a comma-separated list of attributes or attribute wildcards.
     * The wildcard "*" means all attributes, and a wildcard like
     * "standard::*" means all attributes in the standard namespace.
     * An example attribute query be "standard::*,owner::user".
     * The standard attributes are available as defines, like
     * {@code G_FILE_ATTRIBUTE_STANDARD_NAME}. {@code G_FILE_ATTRIBUTE_STANDARD_NAME} should
     * always be specified if you plan to call g_file_enumerator_get_child() or
     * g_file_enumerator_iterate() on the returned enumerator.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link IOErrorEnum#CANCELLED} will be
     * returned.
     * <p>
     * If the file does not exist, the {@link IOErrorEnum#NOT_FOUND} error will
     * be returned. If the file is not a directory, the {@link IOErrorEnum#NOT_DIRECTORY}
     * error will be returned. Other errors are possible too.
     */
    public default FileEnumerator enumerateChildren(java.lang.String attributes, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_enumerate_children(handle(), Interop.allocateNativeString(attributes).handle(), flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileEnumerator(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously gets the requested information about the files
     * in a directory. The result is a {@link FileEnumerator} object that will
     * give out {@link FileInfo} objects for all the files in the directory.
     * <p>
     * For more details, see g_file_enumerate_children() which is
     * the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called. You can
     * then call g_file_enumerate_children_finish() to get the result of
     * the operation.
     */
    public default void enumerateChildrenAsync(java.lang.String attributes, int flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_enumerate_children_async(handle(), Interop.allocateNativeString(attributes).handle(), flags, ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an async enumerate children operation.
     * See g_file_enumerate_children_async().
     */
    public default FileEnumerator enumerateChildrenFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_enumerate_children_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileEnumerator(References.get(RESULT, true));
    }
    
    /**
     * Checks if the two given {@code GFiles} refer to the same file.
     * <p>
     * Note that two {@code GFiles} that differ can still refer to the same
     * file on the filesystem due to various forms of filename
     * aliasing.
     * <p>
     * This call does no blocking I/O.
     */
    public default boolean equal(File file2) {
        var RESULT = gtk_h.g_file_equal(handle(), file2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets a {@link Mount} for the {@link File}.
     * <p>
     * {@link Mount} is returned only for user interesting locations, see
     * {@link VolumeMonitor}. If the {@link FileIface} for {@code file} does not have a {@code mount},
     * {@code error} will be set to {@link IOErrorEnum#NOT_FOUND} and <code>null</code> {@code will} be returned.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default Mount findEnclosingMount(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_find_enclosing_mount(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Mount.MountImpl(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously gets the mount for the file.
     * <p>
     * For more details, see g_file_find_enclosing_mount() which is
     * the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_find_enclosing_mount_finish() to
     * get the result of the operation.
     */
    public default void findEnclosingMountAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_find_enclosing_mount_async(handle(), ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous find mount request.
     * See g_file_find_enclosing_mount_async().
     */
    public default Mount findEnclosingMountFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_find_enclosing_mount_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Mount.MountImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the base name (the last component of the path) for a given {@link File}.
     * <p>
     * If called for the top level of a system (such as the filesystem root
     * or a uri like sftp://host/) it will return a single directory separator
     * (and on Windows, possibly a drive letter).
     * <p>
     * The base name is a byte string (not UTF-8). It has no defined encoding
     * or rules other than it may not contain zero bytes.  If you want to use
     * filenames in a user interface you should use the display name that you
     * can get by requesting the {@code G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME}
     * attribute with g_file_query_info().
     * <p>
     * This call does no blocking I/O.
     */
    public default java.lang.String getBasename() {
        var RESULT = gtk_h.g_file_get_basename(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a child of {@code file} with basename equal to {@code name}.
     * <p>
     * Note that the file with that specific name might not exist, but
     * you can still have a {@link File} that points to it. You can use this
     * for instance to create that file.
     * <p>
     * This call does no blocking I/O.
     */
    public default File getChild(java.lang.String name) {
        var RESULT = gtk_h.g_file_get_child(handle(), Interop.allocateNativeString(name).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the child of {@code file} for a given {@code display_name} (i.e. a UTF-8
     * version of the name). If this function fails, it returns <code>null</code>
     * and {@code error} will be set. This is very useful when constructing a
     * {@link File} for a new file and the user entered the filename in the
     * user interface, for instance when you select a directory and
     * type a filename in the file selector.
     * <p>
     * This call does no blocking I/O.
     */
    public default File getChildForDisplayName(java.lang.String displayName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_get_child_for_display_name(handle(), Interop.allocateNativeString(displayName).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the parent directory for the {@code file}.
     * If the {@code file} represents the root directory of the
     * file system, then <code>null</code> will be returned.
     * <p>
     * This call does no blocking I/O.
     */
    public default File getParent() {
        var RESULT = gtk_h.g_file_get_parent(handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the parse name of the {@code file}.
     * A parse name is a UTF-8 string that describes the
     * file such that one can get the {@link File} back using
     * g_file_parse_name().
     * <p>
     * This is generally used to show the {@link File} as a nice
     * full-pathname kind of string in a user interface,
     * like in a location entry.
     * <p>
     * For local files with names that can safely be converted
     * to UTF-8 the pathname is used, otherwise the IRI is used
     * (a form of URI that allows UTF-8 characters unescaped).
     * <p>
     * This call does no blocking I/O.
     */
    public default java.lang.String getParseName() {
        var RESULT = gtk_h.g_file_get_parse_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the local pathname for {@link File}, if one exists. If non-<code>null</code>, this is
     * guaranteed to be an absolute, canonical path. It might contain symlinks.
     * <p>
     * This call does no blocking I/O.
     */
    public default java.lang.String getPath() {
        var RESULT = gtk_h.g_file_get_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the path for {@code descendant} relative to {@code parent}.
     * <p>
     * This call does no blocking I/O.
     */
    public default java.lang.String getRelativePath(File descendant) {
        var RESULT = gtk_h.g_file_get_relative_path(handle(), descendant.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the URI for the {@code file}.
     * <p>
     * This call does no blocking I/O.
     */
    public default java.lang.String getUri() {
        var RESULT = gtk_h.g_file_get_uri(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the URI scheme for a {@link File}.
     * RFC 3986 decodes the scheme as:
     * |[
     * URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
     * ]|
     * Common schemes include "file", "http", "ftp", etc.
     * <p>
     * The scheme can be different from the one used to construct the {@link File},
     * in that it might be replaced with one that is logically equivalent to the {@link File}.
     * <p>
     * This call does no blocking I/O.
     */
    public default java.lang.String getUriScheme() {
        var RESULT = gtk_h.g_file_get_uri_scheme(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks if {@code file} has a parent, and optionally, if it is {@code parent}.
     * <p>
     * If {@code parent} is <code>null</code> then this function returns <code>true</code> if {@code file} has any
     * parent at all.  If {@code parent} is non-<code>null</code> then <code>true</code> is only returned
     * if {@code file} is an immediate child of {@code parent}.
     */
    public default boolean hasParent(File parent) {
        var RESULT = gtk_h.g_file_has_parent(handle(), parent.handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether {@code file} has the prefix specified by {@code prefix}.
     * <p>
     * In other words, if the names of initial elements of {@code file}'s
     * pathname match {@code prefix}. Only full pathname elements are matched,
     * so a path like /foo is not considered a prefix of /foobar, only
     * of /foo/bar.
     * <p>
     * A {@link File} is not a prefix of itself. If you want to check for
     * equality, use g_file_equal().
     * <p>
     * This call does no I/O, as it works purely on names. As such it can
     * sometimes return <code>false</code> even if {@code file} is inside a {@code prefix} (from a
     * filesystem point of view), because the prefix of {@code file} is an alias
     * of {@code prefix}.
     */
    public default boolean hasPrefix(File prefix) {
        var RESULT = gtk_h.g_file_has_prefix(handle(), prefix.handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks to see if a {@link File} has a given URI scheme.
     * <p>
     * This call does no blocking I/O.
     */
    public default boolean hasUriScheme(java.lang.String uriScheme) {
        var RESULT = gtk_h.g_file_has_uri_scheme(handle(), Interop.allocateNativeString(uriScheme).handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates a hash value for a {@link File}.
     * <p>
     * This call does no blocking I/O.
     */
    public default int hash() {
        var RESULT = gtk_h.g_file_hash(handle());
        return RESULT;
    }
    
    /**
     * Checks to see if a file is native to the platform.
     * <p>
     * A native file is one expressed in the platform-native filename format,
     * e.g. "C:\\Windows" or "/usr/bin/". This does not mean the file is local,
     * as it might be on a locally mounted remote filesystem.
     * <p>
     * On some systems non-native files may be available using the native
     * filesystem via a userspace filesystem (FUSE), in these cases this call
     * will return <code>false</code>, but g_file_get_path() will still return a native path.
     * <p>
     * This call does no blocking I/O.
     */
    public default boolean isNative() {
        var RESULT = gtk_h.g_file_is_native(handle());
        return (RESULT != 0);
    }
    
    /**
     * Loads the contents of {@code file} and returns it as {@link org.gtk.glib.Bytes}.
     * <p>
     * If {@code file} is a resource:// based URI, the resulting bytes will reference the
     * embedded resource instead of a copy. Otherwise, this is equivalent to calling
     * g_file_load_contents() and g_bytes_new_take().
     * <p>
     * For resources, {@code etag_out} will be set to <code>null</code>.
     * <p>
     * The data contained in the resulting {@link org.gtk.glib.Bytes} is always zero-terminated, but
     * this is not included in the {@link org.gtk.glib.Bytes} length. The resulting {@link org.gtk.glib.Bytes} should be
     * freed with g_bytes_unref() when no longer in use.
     */
    public default org.gtk.glib.Bytes loadBytes(Cancellable cancellable, java.lang.String[] etagOut) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_load_bytes(handle(), cancellable.handle(), Interop.allocateNativeArray(etagOut).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously loads the contents of {@code file} as {@link org.gtk.glib.Bytes}.
     * <p>
     * If {@code file} is a resource:// based URI, the resulting bytes will reference the
     * embedded resource instead of a copy. Otherwise, this is equivalent to calling
     * g_file_load_contents_async() and g_bytes_new_take().
     * <p>
     * {@code callback} should call g_file_load_bytes_finish() to get the result of this
     * asynchronous operation.
     * <p>
     * See g_file_load_bytes() for more information.
     */
    public default void loadBytesAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_load_bytes_async(handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Completes an asynchronous request to g_file_load_bytes_async().
     * <p>
     * For resources, {@code etag_out} will be set to <code>null</code>.
     * <p>
     * The data contained in the resulting {@link org.gtk.glib.Bytes} is always zero-terminated, but
     * this is not included in the {@link org.gtk.glib.Bytes} length. The resulting {@link org.gtk.glib.Bytes} should be
     * freed with g_bytes_unref() when no longer in use.
     * <p>
     * See g_file_load_bytes() for more information.
     */
    public default org.gtk.glib.Bytes loadBytesFinish(AsyncResult result, java.lang.String[] etagOut) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_load_bytes_finish(handle(), result.handle(), Interop.allocateNativeArray(etagOut).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Starts an asynchronous load of the {@code file}'s contents.
     * <p>
     * For more details, see g_file_load_contents() which is
     * the synchronous version of this call.
     * <p>
     * When the load operation has completed, {@code callback} will be called
     * with {@code user} data. To finish the operation, call
     * g_file_load_contents_finish() with the {@link AsyncResult} returned by
     * the {@code callback}.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default void loadContentsAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_load_contents_async(handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Reads the partial contents of a file. A {@link FileReadMoreCallback} should
     * be used to stop reading from the file when appropriate, else this
     * function will behave exactly as g_file_load_contents_async(). This
     * operation can be finished by g_file_load_partial_contents_finish().
     * <p>
     * Users of this function should be aware that {@code user_data} is passed to
     * both the {@code read_more_callback} and the {@code callback}.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default void loadPartialContentsAsync(Cancellable cancellable, FileReadMoreCallback readMoreCallback, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_load_partial_contents_async(handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFileReadMoreCallback",
                            MethodType.methodType(boolean.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(boolean.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(readMoreCallback.hashCode(), readMoreCallback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a directory. Note that this will only create a child directory
     * of the immediate parent directory of the path or URI given by the {@link File}.
     * To recursively create directories, see g_file_make_directory_with_parents().
     * This function will fail if the parent directory does not exist, setting
     * {@code error} to {@link IOErrorEnum#NOT_FOUND}. If the file system doesn't support
     * creating directories, this function will fail, setting {@code error} to
     * {@link IOErrorEnum#NOT_SUPPORTED}.
     * <p>
     * For a local {@link File} the newly created directory will have the default
     * (current) ownership and permissions of the current process.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean makeDirectory(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_make_directory(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously creates a directory.
     */
    public default void makeDirectoryAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_make_directory_async(handle(), ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous directory creation, started with
     * g_file_make_directory_async().
     */
    public default boolean makeDirectoryFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_make_directory_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Creates a directory and any parent directories that may not
     * exist similar to 'mkdir -p'. If the file system does not support
     * creating directories, this function will fail, setting {@code error} to
     * {@link IOErrorEnum#NOT_SUPPORTED}. If the directory itself already exists,
     * this function will fail setting {@code error} to {@link IOErrorEnum#EXISTS}, unlike
     * the similar g_mkdir_with_parents().
     * <p>
     * For a local {@link File} the newly created directories will have the default
     * (current) ownership and permissions of the current process.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean makeDirectoryWithParents(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_make_directory_with_parents(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Creates a symbolic link named {@code file} which contains the string
     * {@code symlink_value}.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean makeSymbolicLink(java.lang.String symlinkValue, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_make_symbolic_link(handle(), Interop.allocateNativeString(symlinkValue).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Recursively measures the disk usage of {@code file}.
     * <p>
     * This is the asynchronous version of g_file_measure_disk_usage().  See
     * there for more information.
     */
    public default void measureDiskUsageAsync(int flags, int ioPriority, Cancellable cancellable, FileMeasureProgressCallback progressCallback, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_measure_disk_usage_async(handle(), flags, ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFileMeasureProgressCallback",
                            MethodType.methodType(void.class, boolean.class, long.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, boolean.class, long.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Obtains a file or directory monitor for the given file,
     * depending on the type of the file.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default FileMonitor monitor(int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_monitor(handle(), flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileMonitor(References.get(RESULT, true));
    }
    
    /**
     * Obtains a directory monitor for the given file.
     * This may fail if directory monitoring is not supported.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * It does not make sense for {@code flags} to contain
     * {@link FileMonitorFlags#WATCH_HARD_LINKS}, since hard links can not be made to
     * directories.  It is not possible to monitor all the files in a
     * directory for changes made via hard links; if you want to do this then
     * you must register individual watches with g_file_monitor().
     */
    public default FileMonitor monitorDirectory(int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_monitor_directory(handle(), flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileMonitor(References.get(RESULT, true));
    }
    
    /**
     * Obtains a file monitor for the given file. If no file notification
     * mechanism exists, then regular polling of the file is used.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * If {@code flags} contains {@link FileMonitorFlags#WATCH_HARD_LINKS} then the monitor
     * will also attempt to report changes made to the file via another
     * filename (ie, a hard link). Without this flag, you can only rely on
     * changes made through the filename contained in {@code file} to be
     * reported. Using this flag may result in an increase in resource
     * usage, and may not have any effect depending on the {@link FileMonitor}
     * backend and/or filesystem type.
     */
    public default FileMonitor monitorFile(int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_monitor_file(handle(), flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileMonitor(References.get(RESULT, true));
    }
    
    /**
     * Starts a {@code mount_operation}, mounting the volume that contains
     * the file {@code location}.
     * <p>
     * When this operation has completed, {@code callback} will be called with
     * {@code user_user} data, and the operation can be finalized with
     * g_file_mount_enclosing_volume_finish().
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default void mountEnclosingVolume(int flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_mount_enclosing_volume(handle(), flags, mountOperation.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes a mount operation started by g_file_mount_enclosing_volume().
     */
    public default boolean mountEnclosingVolumeFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_mount_enclosing_volume_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Mounts a file of type G_FILE_TYPE_MOUNTABLE.
     * Using {@code mount_operation}, you can request callbacks when, for instance,
     * passwords are needed during authentication.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_mount_mountable_finish() to get
     * the result of the operation.
     */
    public default void mountMountable(int flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_mount_mountable(handle(), flags, mountOperation.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes a mount operation. See g_file_mount_mountable() for details.
     * <p>
     * Finish an asynchronous mount operation that was started
     * with g_file_mount_mountable().
     */
    public default File mountMountableFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_mount_mountable_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Tries to move the file or directory {@code source} to the location specified
     * by {@code destination}. If native move operations are supported then this is
     * used, otherwise a copy + delete fallback is used. The native
     * implementation may support moving directories (for instance on moves
     * inside the same filesystem), but the fallback code does not.
     * <p>
     * If the flag {@link FileCopyFlags#OVERWRITE} is specified an already
     * existing {@code destination} file is overwritten.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * If {@code progress_callback} is not <code>null</code>, then the operation can be monitored
     * by setting this to a {@link FileProgressCallback} function.
     * {@code progress_callback_data} will be passed to this function. It is
     * guaranteed that this callback will be called after all data has been
     * transferred with the total number of bytes copied during the operation.
     * <p>
     * If the {@code source} file does not exist, then the {@link IOErrorEnum#NOT_FOUND}
     * error is returned, independent on the status of the {@code destination}.
     * <p>
     * If {@link FileCopyFlags#OVERWRITE} is not specified and the target exists,
     * then the error {@link IOErrorEnum#EXISTS} is returned.
     * <p>
     * If trying to overwrite a file over a directory, the {@link IOErrorEnum#IS_DIRECTORY}
     * error is returned. If trying to overwrite a directory with a directory the
     * {@link IOErrorEnum#WOULD_MERGE} error is returned.
     * <p>
     * If the source is a directory and the target does not exist, or
     * {@link FileCopyFlags#OVERWRITE} is specified and the target is a file, then
     * the {@link IOErrorEnum#WOULD_RECURSE} error may be returned (if the native
     * move operation isn't available).
     */
    public default boolean move(File destination, int flags, Cancellable cancellable, FileProgressCallback progressCallback) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = gtk_h.g_file_move(handle(), destination.handle(), flags, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFileProgressCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return (RESULT != 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Asynchronously moves a file {@code source} to the location of {@code destination}. For details of the behaviour, see g_file_move().
     * <p>
     * If {@code progress_callback} is not <code>null</code>, then that function that will be called
     * just like in g_file_move(). The callback will run in the default main context
     * of the thread calling g_file_move_async() — the same context as {@code callback} is
     * run in.
     * <p>
     * When the operation is finished, {@code callback} will be called. You can then call
     * g_file_move_finish() to get the result of the operation.
     */
    public default void moveAsync(File destination, int flags, int ioPriority, Cancellable cancellable, FileProgressCallback progressCallback, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_move_async(handle(), destination.handle(), flags, ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFileProgressCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous file movement, started with
     * g_file_move_async().
     */
    public default boolean moveFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_move_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Opens an existing file for reading and writing. The result is
     * a {@link FileIOStream} that can be used to read and write the contents
     * of the file.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link IOErrorEnum#CANCELLED} will be
     * returned.
     * <p>
     * If the file does not exist, the {@link IOErrorEnum#NOT_FOUND} error will
     * be returned. If the file is a directory, the {@link IOErrorEnum#IS_DIRECTORY}
     * error will be returned. Other errors are possible too, and depend on
     * what kind of filesystem the file is on. Note that in many non-local
     * file cases read and write streams are not supported, so make sure you
     * really need to do read and write streaming, rather than just opening
     * for reading or writing.
     */
    public default FileIOStream openReadwrite(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_open_readwrite(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileIOStream(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously opens {@code file} for reading and writing.
     * <p>
     * For more details, see g_file_open_readwrite() which is
     * the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_open_readwrite_finish() to get
     * the result of the operation.
     */
    public default void openReadwriteAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_open_readwrite_async(handle(), ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous file read operation started with
     * g_file_open_readwrite_async().
     */
    public default FileIOStream openReadwriteFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_open_readwrite_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileIOStream(References.get(RESULT, true));
    }
    
    /**
     * Exactly like g_file_get_path(), but caches the result via
     * g_object_set_qdata_full().  This is useful for example in C
     * applications which mix {@code g_file_*} APIs with native ones.  It
     * also avoids an extra duplicated string when possible, so will be
     * generally more efficient.
     * <p>
     * This call does no blocking I/O.
     */
    public default java.lang.String peekPath() {
        var RESULT = gtk_h.g_file_peek_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Polls a file of type {@link FileType#MOUNTABLE}.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_mount_mountable_finish() to get
     * the result of the operation.
     */
    public default void pollMountable(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_poll_mountable(handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes a poll operation. See g_file_poll_mountable() for details.
     * <p>
     * Finish an asynchronous poll operation that was polled
     * with g_file_poll_mountable().
     */
    public default boolean pollMountableFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_poll_mountable_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Returns the {@link AppInfo} that is registered as the default
     * application to handle the file specified by {@code file}.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default AppInfo queryDefaultHandler(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_query_default_handler(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new AppInfo.AppInfoImpl(References.get(RESULT, true));
    }
    
    /**
     * Async version of g_file_query_default_handler().
     */
    public default void queryDefaultHandlerAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_query_default_handler_async(handle(), ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes a g_file_query_default_handler_async() operation.
     */
    public default AppInfo queryDefaultHandlerFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_query_default_handler_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new AppInfo.AppInfoImpl(References.get(RESULT, true));
    }
    
    /**
     * Utility function to check if a particular file exists. This is
     * implemented using g_file_query_info() and as such does blocking I/O.
     * <p>
     * Note that in many cases it is <a href="https://en.wikipedia.org/wiki/Time_of_check_to_time_of_use">racy to first check for file existence</a>
     * and then execute something based on the outcome of that, because the
     * file might have been created or removed in between the operations. The
     * general approach to handling that is to not check, but just do the
     * operation and handle the errors as they come.
     * <p>
     * As an example of race-free checking, take the case of reading a file,
     * and if it doesn't exist, creating it. There are two racy versions: read
     * it, and on error create it; and: check if it exists, if not create it.
     * These can both result in two processes creating the file (with perhaps
     * a partially written file as the result). The correct approach is to
     * always try to create the file with g_file_create() which will either
     * atomically create the file or fail with a {@link IOErrorEnum#EXISTS} error.
     * <p>
     * However, in many cases an existence check is useful in a user interface,
     * for instance to make a menu item sensitive/insensitive, so that you don't
     * have to fool users that something is possible and then just show an error
     * dialog. If you do this, you should make sure to also handle the errors
     * that can happen due to races when you execute the operation.
     */
    public default boolean queryExists(Cancellable cancellable) {
        var RESULT = gtk_h.g_file_query_exists(handle(), cancellable.handle());
        return (RESULT != 0);
    }
    
    /**
     * Utility function to inspect the {@link FileType} of a file. This is
     * implemented using g_file_query_info() and as such does blocking I/O.
     * <p>
     * The primary use case of this method is to check if a file is
     * a regular file, directory, or symlink.
     */
    public default FileType queryFileType(int flags, Cancellable cancellable) {
        var RESULT = gtk_h.g_file_query_file_type(handle(), flags, cancellable.handle());
        return FileType.fromValue(RESULT);
    }
    
    /**
     * Similar to g_file_query_info(), but obtains information
     * about the filesystem the {@code file} is on, rather than the file itself.
     * For instance the amount of space available and the type of
     * the filesystem.
     * <p>
     * The {@code attributes} value is a string that specifies the attributes
     * that should be gathered. It is not an error if it's not possible
     * to read a particular requested attribute from a file - it just
     * won't be set. {@code attributes} should be a comma-separated list of
     * attributes or attribute wildcards. The wildcard "*" means all
     * attributes, and a wildcard like "filesystem::*" means all attributes
     * in the filesystem namespace. The standard namespace for filesystem
     * attributes is "filesystem". Common attributes of interest are
     * {@code G_FILE_ATTRIBUTE_FILESYSTEM_SIZE} (the total size of the filesystem
     * in bytes), {@code G_FILE_ATTRIBUTE_FILESYSTEM_FREE} (number of bytes available),
     * and {@code G_FILE_ATTRIBUTE_FILESYSTEM_TYPE} (type of the filesystem).
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link IOErrorEnum#CANCELLED} will be
     * returned.
     * <p>
     * If the file does not exist, the {@link IOErrorEnum#NOT_FOUND} error will
     * be returned. Other errors are possible too, and depend on what
     * kind of filesystem the file is on.
     */
    public default FileInfo queryFilesystemInfo(java.lang.String attributes, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_query_filesystem_info(handle(), Interop.allocateNativeString(attributes).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileInfo(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously gets the requested information about the filesystem
     * that the specified {@code file} is on. The result is a {@link FileInfo} object
     * that contains key-value attributes (such as type or size for the
     * file).
     * <p>
     * For more details, see g_file_query_filesystem_info() which is the
     * synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called. You can
     * then call g_file_query_info_finish() to get the result of the
     * operation.
     */
    public default void queryFilesystemInfoAsync(java.lang.String attributes, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_query_filesystem_info_async(handle(), Interop.allocateNativeString(attributes).handle(), ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous filesystem info query.
     * See g_file_query_filesystem_info_async().
     */
    public default FileInfo queryFilesystemInfoFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_query_filesystem_info_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileInfo(References.get(RESULT, true));
    }
    
    /**
     * Gets the requested information about specified {@code file}.
     * The result is a {@link FileInfo} object that contains key-value
     * attributes (such as the type or size of the file).
     * <p>
     * The {@code attributes} value is a string that specifies the file
     * attributes that should be gathered. It is not an error if
     * it's not possible to read a particular requested attribute
     * from a file - it just won't be set. {@code attributes} should be a
     * comma-separated list of attributes or attribute wildcards.
     * The wildcard "*" means all attributes, and a wildcard like
     * "standard::*" means all attributes in the standard namespace.
     * An example attribute query be "standard::*,owner::user".
     * The standard attributes are available as defines, like
     * {@code G_FILE_ATTRIBUTE_STANDARD_NAME}.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link IOErrorEnum#CANCELLED} will be
     * returned.
     * <p>
     * For symlinks, normally the information about the target of the
     * symlink is returned, rather than information about the symlink
     * itself. However if you pass {@link FileQueryInfoFlags#NOFOLLOW_SYMLINKS}
     * in {@code flags} the information about the symlink itself will be returned.
     * Also, for symlinks that point to non-existing files the information
     * about the symlink itself will be returned.
     * <p>
     * If the file does not exist, the {@link IOErrorEnum#NOT_FOUND} error will be
     * returned. Other errors are possible too, and depend on what kind of
     * filesystem the file is on.
     */
    public default FileInfo queryInfo(java.lang.String attributes, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_query_info(handle(), Interop.allocateNativeString(attributes).handle(), flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileInfo(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously gets the requested information about specified {@code file}.
     * The result is a {@link FileInfo} object that contains key-value attributes
     * (such as type or size for the file).
     * <p>
     * For more details, see g_file_query_info() which is the synchronous
     * version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called. You can
     * then call g_file_query_info_finish() to get the result of the operation.
     */
    public default void queryInfoAsync(java.lang.String attributes, int flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_query_info_async(handle(), Interop.allocateNativeString(attributes).handle(), flags, ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous file info query.
     * See g_file_query_info_async().
     */
    public default FileInfo queryInfoFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_query_info_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileInfo(References.get(RESULT, true));
    }
    
    /**
     * Obtain the list of settable attributes for the file.
     * <p>
     * Returns the type and full attribute name of all the attributes
     * that can be set on this file. This doesn't mean setting it will
     * always succeed though, you might get an access failure, or some
     * specific file may not support a specific attribute.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default FileAttributeInfoList querySettableAttributes(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_query_settable_attributes(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileAttributeInfoList(References.get(RESULT, true));
    }
    
    /**
     * Obtain the list of attribute namespaces where new attributes
     * can be created by a user. An example of this is extended
     * attributes (in the "xattr" namespace).
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default FileAttributeInfoList queryWritableNamespaces(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_query_writable_namespaces(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileAttributeInfoList(References.get(RESULT, true));
    }
    
    /**
     * Opens a file for reading. The result is a {@link FileInputStream} that
     * can be used to read the contents of the file.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * If the file does not exist, the {@link IOErrorEnum#NOT_FOUND} error will be
     * returned. If the file is a directory, the {@link IOErrorEnum#IS_DIRECTORY}
     * error will be returned. Other errors are possible too, and depend
     * on what kind of filesystem the file is on.
     */
    public default FileInputStream read(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_read(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileInputStream(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously opens {@code file} for reading.
     * <p>
     * For more details, see g_file_read() which is
     * the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_read_finish() to get the result
     * of the operation.
     */
    public default void readAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_read_async(handle(), ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous file read operation started with
     * g_file_read_async().
     */
    public default FileInputStream readFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_read_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileInputStream(References.get(RESULT, true));
    }
    
    /**
     * Returns an output stream for overwriting the file, possibly
     * creating a backup copy of the file first. If the file doesn't exist,
     * it will be created.
     * <p>
     * This will try to replace the file in the safest way possible so
     * that any errors during the writing will not affect an already
     * existing copy of the file. For instance, for local files it
     * may write to a temporary file and then atomically rename over
     * the destination when the stream is closed.
     * <p>
     * By default files created are generally readable by everyone,
     * but if you pass {@link FileCreateFlags#PRIVATE} in {@code flags} the file
     * will be made readable only to the current user, to the level that
     * is supported on the target filesystem.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link IOErrorEnum#CANCELLED} will be
     * returned.
     * <p>
     * If you pass in a non-<code>null</code> {@code etag} value and {@code file} already exists, then
     * this value is compared to the current entity tag of the file, and if
     * they differ an {@link IOErrorEnum#WRONG_ETAG} error is returned. This
     * generally means that the file has been changed since you last read
     * it. You can get the new etag from g_file_output_stream_get_etag()
     * after you've finished writing and closed the {@link FileOutputStream}. When
     * you load a new file you can use g_file_input_stream_query_info() to
     * get the etag of the file.
     * <p>
     * If {@code make_backup} is <code>true</code>, this function will attempt to make a
     * backup of the current file before overwriting it. If this fails
     * a {@link IOErrorEnum#CANT_CREATE_BACKUP} error will be returned. If you
     * want to replace anyway, try again with {@code make_backup} set to <code>false</code>.
     * <p>
     * If the file is a directory the {@link IOErrorEnum#IS_DIRECTORY} error will
     * be returned, and if the file is some other form of non-regular file
     * then a {@link IOErrorEnum#NOT_REGULAR_FILE} error will be returned. Some
     * file systems don't allow all file names, and may return an
     * {@link IOErrorEnum#INVALID_FILENAME} error, and if the name is to long
     * {@link IOErrorEnum#FILENAME_TOO_LONG} will be returned. Other errors are
     * possible too, and depend on what kind of filesystem the file is on.
     */
    public default FileOutputStream replace(java.lang.String etag, boolean makeBackup, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_replace(handle(), Interop.allocateNativeString(etag).handle(), makeBackup ? 1 : 0, flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileOutputStream(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously overwrites the file, replacing the contents,
     * possibly creating a backup copy of the file first.
     * <p>
     * For more details, see g_file_replace() which is
     * the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_replace_finish() to get the result
     * of the operation.
     */
    public default void replaceAsync(java.lang.String etag, boolean makeBackup, int flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_replace_async(handle(), Interop.allocateNativeString(etag).handle(), makeBackup ? 1 : 0, flags, ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Replaces the contents of {@code file} with {@code contents} of {@code length} bytes.
     * <p>
     * If {@code etag} is specified (not <code>null</code>), any existing file must have that etag,
     * or the error {@link IOErrorEnum#WRONG_ETAG} will be returned.
     * <p>
     * If {@code make_backup} is <code>true</code>, this function will attempt to make a backup
     * of {@code file}. Internally, it uses g_file_replace(), so will try to replace the
     * file contents in the safest way possible. For example, atomic renames are
     * used when replacing local files’ contents.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * The returned {@code new_etag} can be used to verify that the file hasn't
     * changed the next time it is saved over.
     */
    public default boolean replaceContents(byte[] contents, long length, java.lang.String etag, boolean makeBackup, int flags, java.lang.String[] newEtag, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_replace_contents(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, contents)).handle(), length, Interop.allocateNativeString(etag).handle(), makeBackup ? 1 : 0, flags, Interop.allocateNativeArray(newEtag).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Starts an asynchronous replacement of {@code file} with the given
     * {@code contents} of {@code length} bytes. {@code etag} will replace the document's
     * current entity tag.
     * <p>
     * When this operation has completed, {@code callback} will be called with
     * {@code user_user} data, and the operation can be finalized with
     * g_file_replace_contents_finish().
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * If {@code make_backup} is <code>true</code>, this function will attempt to
     * make a backup of {@code file}.
     * <p>
     * Note that no copy of {@code contents} will be made, so it must stay valid
     * until {@code callback} is called. See g_file_replace_contents_bytes_async()
     * for a {@link org.gtk.glib.Bytes} version that will automatically hold a reference to the
     * contents (without copying) for the duration of the call.
     */
    public default void replaceContentsAsync(byte[] contents, long length, java.lang.String etag, boolean makeBackup, int flags, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_replace_contents_async(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, contents)).handle(), length, Interop.allocateNativeString(etag).handle(), makeBackup ? 1 : 0, flags, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Same as g_file_replace_contents_async() but takes a {@link org.gtk.glib.Bytes} input instead.
     * This function will keep a ref on {@code contents} until the operation is done.
     * Unlike g_file_replace_contents_async() this allows forgetting about the
     * content without waiting for the callback.
     * <p>
     * When this operation has completed, {@code callback} will be called with
     * {@code user_user} data, and the operation can be finalized with
     * g_file_replace_contents_finish().
     */
    public default void replaceContentsBytesAsync(org.gtk.glib.Bytes contents, java.lang.String etag, boolean makeBackup, int flags, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_replace_contents_bytes_async(handle(), contents.handle(), Interop.allocateNativeString(etag).handle(), makeBackup ? 1 : 0, flags, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous replace of the given {@code file}. See
     * g_file_replace_contents_async(). Sets {@code new_etag} to the new entity
     * tag for the document, if present.
     */
    public default boolean replaceContentsFinish(AsyncResult res, java.lang.String[] newEtag) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_replace_contents_finish(handle(), res.handle(), Interop.allocateNativeArray(newEtag).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Finishes an asynchronous file replace operation started with
     * g_file_replace_async().
     */
    public default FileOutputStream replaceFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_replace_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileOutputStream(References.get(RESULT, true));
    }
    
    /**
     * Returns an output stream for overwriting the file in readwrite mode,
     * possibly creating a backup copy of the file first. If the file doesn't
     * exist, it will be created.
     * <p>
     * For details about the behaviour, see g_file_replace() which does the
     * same thing but returns an output stream only.
     * <p>
     * Note that in many non-local file cases read and write streams are not
     * supported, so make sure you really need to do read and write streaming,
     * rather than just opening for reading or writing.
     */
    public default FileIOStream replaceReadwrite(java.lang.String etag, boolean makeBackup, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_replace_readwrite(handle(), Interop.allocateNativeString(etag).handle(), makeBackup ? 1 : 0, flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileIOStream(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously overwrites the file in read-write mode,
     * replacing the contents, possibly creating a backup copy
     * of the file first.
     * <p>
     * For more details, see g_file_replace_readwrite() which is
     * the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_replace_readwrite_finish() to get
     * the result of the operation.
     */
    public default void replaceReadwriteAsync(java.lang.String etag, boolean makeBackup, int flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_replace_readwrite_async(handle(), Interop.allocateNativeString(etag).handle(), makeBackup ? 1 : 0, flags, ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous file replace operation started with
     * g_file_replace_readwrite_async().
     */
    public default FileIOStream replaceReadwriteFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_replace_readwrite_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new FileIOStream(References.get(RESULT, true));
    }
    
    /**
     * Resolves a relative path for {@code file} to an absolute path.
     * <p>
     * This call does no blocking I/O.
     * <p>
     * If the {@code relative_path} is an absolute path name, the resolution
     * is done absolutely (without taking {@code file} path as base).
     */
    public default File resolveRelativePath(java.lang.String relativePath) {
        var RESULT = gtk_h.g_file_resolve_relative_path(handle(), Interop.allocateNativeString(relativePath).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Sets an attribute in the file with attribute name {@code attribute} to {@code value_p}.
     * <p>
     * Some attributes can be unset by setting {@code type} to
     * {@link FileAttributeType#INVALID} and {@code value_p} to <code>null</code>.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttribute(java.lang.String attribute, FileAttributeType type, jdk.incubator.foreign.MemoryAddress valueP, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_set_attribute(handle(), Interop.allocateNativeString(attribute).handle(), type.getValue(), valueP, flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#BYTE_STRING} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail,
     * returning <code>false</code>.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttributeByteString(java.lang.String attribute, java.lang.String value, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_set_attribute_byte_string(handle(), Interop.allocateNativeString(attribute).handle(), Interop.allocateNativeString(value).handle(), flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#INT32} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttributeInt32(java.lang.String attribute, int value, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_set_attribute_int32(handle(), Interop.allocateNativeString(attribute).handle(), value, flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#INT64} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttributeInt64(java.lang.String attribute, long value, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_set_attribute_int64(handle(), Interop.allocateNativeString(attribute).handle(), value, flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#STRING} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttributeString(java.lang.String attribute, java.lang.String value, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_set_attribute_string(handle(), Interop.allocateNativeString(attribute).handle(), Interop.allocateNativeString(value).handle(), flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#UINT32} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttributeUint32(java.lang.String attribute, int value, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_set_attribute_uint32(handle(), Interop.allocateNativeString(attribute).handle(), value, flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#UINT64} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttributeUint64(java.lang.String attribute, long value, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_set_attribute_uint64(handle(), Interop.allocateNativeString(attribute).handle(), value, flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously sets the attributes of {@code file} with {@code info}.
     * <p>
     * For more details, see g_file_set_attributes_from_info(),
     * which is the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_set_attributes_finish() to get
     * the result of the operation.
     */
    public default void setAttributesAsync(FileInfo info, int flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_set_attributes_async(handle(), info.handle(), flags, ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes setting an attribute started in g_file_set_attributes_async().
     */
    public default boolean setAttributesFinish(AsyncResult result, FileInfo[] info) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_set_attributes_finish(handle(), result.handle(), Interop.allocateNativeArray(info).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Tries to set all attributes in the {@link FileInfo} on the target
     * values, not stopping on the first error.
     * <p>
     * If there is any error during this operation then {@code error} will
     * be set to the first error. Error on particular fields are flagged
     * by setting the "status" field in the attribute value to
     * {@link FileAttributeStatus#ERROR_SETTING}, which means you can
     * also detect further errors.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttributesFromInfo(FileInfo info, int flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_set_attributes_from_info(handle(), info.handle(), flags, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Renames {@code file} to the specified display name.
     * <p>
     * The display name is converted from UTF-8 to the correct encoding
     * for the target filesystem if possible and the {@code file} is renamed to this.
     * <p>
     * If you want to implement a rename operation in the user interface the
     * edit name ({@code G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME}) should be used as the
     * initial value in the rename widget, and then the result after editing
     * should be passed to g_file_set_display_name().
     * <p>
     * On success the resulting converted filename is returned.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default File setDisplayName(java.lang.String displayName, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_set_display_name(handle(), Interop.allocateNativeString(displayName).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously sets the display name for a given {@link File}.
     * <p>
     * For more details, see g_file_set_display_name() which is
     * the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_set_display_name_finish() to get
     * the result of the operation.
     */
    public default void setDisplayNameAsync(java.lang.String displayName, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_set_display_name_async(handle(), Interop.allocateNativeString(displayName).handle(), ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes setting a display name started with
     * g_file_set_display_name_async().
     */
    public default File setDisplayNameFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_set_display_name_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Starts a file of type {@link FileType#MOUNTABLE}.
     * Using {@code start_operation}, you can request callbacks when, for instance,
     * passwords are needed during authentication.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_mount_mountable_finish() to get
     * the result of the operation.
     */
    public default void startMountable(int flags, MountOperation startOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_start_mountable(handle(), flags, startOperation.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes a start operation. See g_file_start_mountable() for details.
     * <p>
     * Finish an asynchronous start operation that was started
     * with g_file_start_mountable().
     */
    public default boolean startMountableFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_start_mountable_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Stops a file of type {@link FileType#MOUNTABLE}.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_stop_mountable_finish() to get
     * the result of the operation.
     */
    public default void stopMountable(int flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_stop_mountable(handle(), flags, mountOperation.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes a stop operation, see g_file_stop_mountable() for details.
     * <p>
     * Finish an asynchronous stop operation that was started
     * with g_file_stop_mountable().
     */
    public default boolean stopMountableFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_stop_mountable_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Checks if {@code file} supports
     * [thread-default contexts][g-main-context-push-thread-default-context].
     * If this returns <code>false</code>, you cannot perform asynchronous operations on
     * {@code file} in a thread that has a thread-default context.
     */
    public default boolean supportsThreadContexts() {
        var RESULT = gtk_h.g_file_supports_thread_contexts(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sends {@code file} to the "Trashcan", if possible. This is similar to
     * deleting it, but the user can recover it before emptying the trashcan.
     * Not all file systems support trashing, so this call can return the
     * {@link IOErrorEnum#NOT_SUPPORTED} error. Since GLib 2.66, the {@code x-gvfs-notrash} unix
     * mount option can be used to disable g_file_trash() support for certain
     * mounts, the {@link IOErrorEnum#NOT_SUPPORTED} error will be returned in that case.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean trash(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_trash(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously sends {@code file} to the Trash location, if possible.
     */
    public default void trashAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_trash_async(handle(), ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous file trashing operation, started with
     * g_file_trash_async().
     */
    public default boolean trashFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_trash_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Unmounts a file of type {@link FileType#MOUNTABLE}.
     * <p>
     * If {@code cancellable} is not <code>null</code>, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_unmount_mountable_finish() to get
     * the result of the operation.
     */
    public default void unmountMountableWithOperation(int flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_file_unmount_mountable_with_operation(handle(), flags, mountOperation.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an unmount operation,
     * see g_file_unmount_mountable_with_operation() for details.
     * <p>
     * Finish an asynchronous unmount operation that was started
     * with g_file_unmount_mountable_with_operation().
     */
    public default boolean unmountMountableWithOperationFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_unmount_mountable_with_operation_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Creates a {@link File} with the given argument from the command line.
     * The value of {@code arg} can be either a URI, an absolute path or a
     * relative path resolved relative to the current working directory.
     * This operation never fails, but the returned object might not
     * support any I/O operation if {@code arg} points to a malformed path.
     * <p>
     * Note that on Windows, this function expects its argument to be in
     * UTF-8 -- not the system code page.  This means that you
     * should not use this function with string from argv as it is passed
     * to main().  g_win32_get_command_line() will return a UTF-8 version of
     * the commandline.  {@link Application} also uses UTF-8 but
     * g_application_command_line_create_file_for_arg() may be more useful
     * for you there.  It is also always possible to use this function with
     * {@link org.gtk.glib.OptionContext} arguments of type {@link org.gtk.glib.OptionArg#FILENAME}.
     */
    public static File newForCommandlineArg(java.lang.String arg) {
        var RESULT = gtk_h.g_file_new_for_commandline_arg(Interop.allocateNativeString(arg).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Creates a {@link File} with the given argument from the command line.
     * <p>
     * This function is similar to g_file_new_for_commandline_arg() except
     * that it allows for passing the current working directory as an
     * argument instead of using the current working directory of the
     * process.
     * <p>
     * This is useful if the commandline argument was given in a context
     * other than the invocation of the current process.
     * <p>
     * See also g_application_command_line_create_file_for_arg().
     */
    public static File newForCommandlineArgAndCwd(java.lang.String arg, java.lang.String cwd) {
        var RESULT = gtk_h.g_file_new_for_commandline_arg_and_cwd(Interop.allocateNativeString(arg).handle(), Interop.allocateNativeString(cwd).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Constructs a {@link File} for a given path. This operation never
     * fails, but the returned object might not support any I/O
     * operation if {@code path} is malformed.
     */
    public static File newForPath(java.lang.String path) {
        var RESULT = gtk_h.g_file_new_for_path(Interop.allocateNativeString(path).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Constructs a {@link File} for a given URI. This operation never
     * fails, but the returned object might not support any I/O
     * operation if {@code uri} is malformed or if the uri type is
     * not supported.
     */
    public static File newForUri(java.lang.String uri) {
        var RESULT = gtk_h.g_file_new_for_uri(Interop.allocateNativeString(uri).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Opens a file in the preferred directory for temporary files (as
     * returned by g_get_tmp_dir()) and returns a {@link File} and
     * {@link FileIOStream} pointing to it.
     * <p>
     * {@code tmpl} should be a string in the GLib file name encoding
     * containing a sequence of six 'X' characters, and containing no
     * directory components. If it is <code>null</code>, a default template is used.
     * <p>
     * Unlike the other {@link File} constructors, this will return <code>null</code> if
     * a temporary file could not be created.
     */
    public static File newTmp(java.lang.String tmpl, FileIOStream[] iostream) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_new_tmp(Interop.allocateNativeString(tmpl).handle(), Interop.allocateNativeArray(iostream).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Constructs a {@link File} with the given {@code parse_name} (i.e. something
     * given by g_file_get_parse_name()). This operation never fails,
     * but the returned object might not support any I/O operation if
     * the {@code parse_name} cannot be parsed.
     */
    public static File parseName(java.lang.String parseName) {
        var RESULT = gtk_h.g_file_parse_name(Interop.allocateNativeString(parseName).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    class FileImpl extends org.gtk.gobject.Object implements File {
        public FileImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
