package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GFile is a high level abstraction for manipulating files on a
 * virtual file system. #GFiles are lightweight, immutable objects
 * that do no I/O upon creation. It is necessary to understand that
 * #GFile objects do not represent files, merely an identifier for a
 * file. All file content I/O is implemented as streaming operations
 * (see #GInputStream and #GOutputStream).
 * 
 * To construct a #GFile, you can use:
 * - g_file_new_for_path() if you have a path.
 * - g_file_new_for_uri() if you have a URI.
 * - g_file_new_for_commandline_arg() for a command line argument.
 * - g_file_new_tmp() to create a temporary file from a template.
 * - g_file_parse_name() from a UTF-8 string gotten from g_file_get_parse_name().
 * - g_file_new_build_filename() to create a file from path elements.
 * 
 * One way to think of a #GFile is as an abstraction of a pathname. For
 * normal files the system pathname is what is stored internally, but as
 * #GFiles are extensible it could also be something else that corresponds
 * to a pathname in a userspace implementation of a filesystem.
 * 
 * #GFiles make up hierarchies of directories and files that correspond to
 * the files on a filesystem. You can move through the file system with
 * #GFile using g_file_get_parent() to get an identifier for the parent
 * directory, g_file_get_child() to get a child within a directory,
 * g_file_resolve_relative_path() to resolve a relative path between two
 * #GFiles. There can be multiple hierarchies, so you may not end up at
 * the same root if you repeatedly call g_file_get_parent() on two different
 * files.
 * 
 * All #GFiles have a basename (get with g_file_get_basename()). These names
 * are byte strings that are used to identify the file on the filesystem
 * (relative to its parent directory) and there is no guarantees that they
 * have any particular charset encoding or even make any sense at all. If
 * you want to use filenames in a user interface you should use the display
 * name that you can get by requesting the
 * <code>G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME</code> attribute with g_file_query_info().
 * This is guaranteed to be in UTF-8 and can be used in a user interface.
 * But always store the real basename or the #GFile to use to actually
 * access the file, because there is no way to go from a display name to
 * the actual name.
 * 
 * Using #GFile as an identifier has the same weaknesses as using a path
 * in that there may be multiple aliases for the same file. For instance,
 * hard or soft links may cause two different #GFiles to refer to the same
 * file. Other possible causes for aliases are: case insensitive filesystems,
 * short and long names on FAT/NTFS, or bind mounts in Linux. If you want to
 * check if two #GFiles point to the same file you can query for the
 * <code>G_FILE_ATTRIBUTE_ID_FILE</code> attribute. Note that #GFile does some trivial
 * canonicalization of pathnames passed in, so that trivial differences in
 * the path string used at creation (duplicated slashes, slash at end of
 * path, &#34;.&#34; or &#34;..&#34; path segments, etc) does not create different #GFiles.
 * 
 * Many #GFile operations have both synchronous and asynchronous versions
 * to suit your application. Asynchronous versions of synchronous functions
 * simply have _async() appended to their function names. The asynchronous
 * I/O functions call a #GAsyncReadyCallback which is then used to finalize
 * the operation, producing a GAsyncResult which is then passed to the
 * function&#39;s matching _finish() operation.
 * 
 * It is highly recommended to use asynchronous calls when running within a
 * shared main loop, such as in the main thread of an application. This avoids
 * I/O operations blocking other sources on the main loop from being dispatched.
 * Synchronous I/O operations should be performed from worker threads. See the
 * {@link [introduction to asynchronous programming section]}{@link [async-programming]} for
 * more.
 * 
 * Some #GFile operations almost always take a noticeable amount of time, and
 * so do not have synchronous analogs. Notable cases include:
 * - g_file_mount_mountable() to mount a mountable file.
 * - g_file_unmount_mountable_with_operation() to unmount a mountable file.
 * - g_file_eject_mountable_with_operation() to eject a mountable file.
 * 
 * ## Entity Tags # {#gfile-etag}
 * 
 * One notable feature of #GFiles are entity tags, or &#34;etags&#34; for
 * short. Entity tags are somewhat like a more abstract version of the
 * traditional mtime, and can be used to quickly determine if the file
 * has been modified from the version on the file system. See the
 * HTTP 1.1
 * {@link [specification]}(http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html)
 * for HTTP Etag headers, which are a very similar concept.
 */
public interface File extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Gets an output stream for appending data to the file.
     * If the file doesn&#39;t already exist it is created.
     * 
     * By default files created are generally readable by everyone,
     * but if you pass {@link org.gtk.gio.FileCreateFlags#PRIVATE} in @flags the file
     * will be made readable only to the current user, to the level that
     * is supported on the target filesystem.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be
     * returned.
     * 
     * Some file systems don&#39;t allow all file names, and may return an
     * {@link org.gtk.gio.IOErrorEnum#INVALID_FILENAME} error. If the file is a directory the
     * {@link org.gtk.gio.IOErrorEnum#IS_DIRECTORY} error will be returned. Other errors are
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
     * Asynchronously opens @file for appending.
     * 
     * For more details, see g_file_append_to() which is
     * the synchronous version of this call.
     * 
     * When the operation is finished, @callback will be called.
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
     * Prepares the file attribute query string for copying to @file.
     * 
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
     * Copies the file @source to the location specified by @destination.
     * Can not handle recursive copies of directories.
     * 
     * If the flag {@link org.gtk.gio.FileCopyFlags#OVERWRITE} is specified an already
     * existing @destination file is overwritten.
     * 
     * If the flag {@link org.gtk.gio.FileCopyFlags#NOFOLLOW_SYMLINKS} is specified then symlinks
     * will be copied as symlinks, otherwise the target of the
     * @source symlink will be copied.
     * 
     * If the flag {@link org.gtk.gio.FileCopyFlags#ALL_METADATA} is specified then all the metadata
     * that is possible to copy is copied, not just the default subset (which,
     * for instance, does not include the owner, see #GFileInfo).
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
     * 
     * If @progress_callback is not <code>NULL,</code> then the operation can be monitored
     * by setting this to a #GFileProgressCallback function.
     * @progress_callback_data will be passed to this function. It is guaranteed
     * that this callback will be called after all data has been transferred with
     * the total number of bytes copied during the operation.
     * 
     * If the @source file does not exist, then the {@link org.gtk.gio.IOErrorEnum#NOT_FOUND} error
     * is returned, independent on the status of the @destination.
     * 
     * If {@link org.gtk.gio.FileCopyFlags#OVERWRITE} is not specified and the target exists, then
     * the error {@link org.gtk.gio.IOErrorEnum#EXISTS} is returned.
     * 
     * If trying to overwrite a file over a directory, the <code>G_IO_ERROR_IS_DIRECTORY
     * error</code> is returned. If trying to overwrite a directory with a directory the
     * {@link org.gtk.gio.IOErrorEnum#WOULD_MERGE} error is returned.
     * 
     * If the source is a directory and the target does not exist, or
     * {@link org.gtk.gio.FileCopyFlags#OVERWRITE} is specified and the target is a file, then the
     * {@link org.gtk.gio.IOErrorEnum#WOULD_RECURSE} error is returned.
     * 
     * If you are interested in copying the #GFile object itself (not the on-disk
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
     * Copies the file @source to the location specified by @destination
     * asynchronously. For details of the behaviour, see g_file_copy().
     * 
     * If @progress_callback is not <code>NULL,</code> then that function that will be called
     * just like in g_file_copy(). The callback will run in the default main context
     * of the thread calling g_file_copy_async() &#8212; the same context as @callback is
     * run in.
     * 
     * When the operation is finished, @callback will be called. You can then call
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
     * Copies the file attributes from @source to @destination.
     * 
     * Normally only a subset of the file attributes are copied,
     * those that are copies in a normal file copy operation
     * (which for instance does not include e.g. owner). However
     * if {@link org.gtk.gio.FileCopyFlags#ALL_METADATA} is specified in @flags, then
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
     * 
     * By default files created are generally readable by everyone,
     * but if you pass {@link org.gtk.gio.FileCreateFlags#PRIVATE} in @flags the file
     * will be made readable only to the current user, to the level
     * that is supported on the target filesystem.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be
     * returned.
     * 
     * If a file or directory with this name already exists the
     * {@link org.gtk.gio.IOErrorEnum#EXISTS} error will be returned. Some file systems don&#39;t
     * allow all file names, and may return an <code>G_IO_ERROR_INVALID_FILENAME
     * error,</code> and if the name is to long {@link org.gtk.gio.IOErrorEnum#FILENAME_TOO_LONG} will
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
     * 
     * For more details, see g_file_create() which is
     * the synchronous version of this call.
     * 
     * When the operation is finished, @callback will be called.
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
     * 
     * By default files created are generally readable by everyone,
     * but if you pass {@link org.gtk.gio.FileCreateFlags#PRIVATE} in @flags the file
     * will be made readable only to the current user, to the level
     * that is supported on the target filesystem.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be
     * returned.
     * 
     * If a file or directory with this name already exists, the
     * {@link org.gtk.gio.IOErrorEnum#EXISTS} error will be returned. Some file systems don&#39;t
     * allow all file names, and may return an <code>G_IO_ERROR_INVALID_FILENAME
     * error,</code> and if the name is too long, <code>G_IO_ERROR_FILENAME_TOO_LONG
     * will</code> be returned. Other errors are possible too, and depend on what
     * kind of filesystem the file is on.
     * 
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
     * 
     * For more details, see g_file_create_readwrite() which is
     * the synchronous version of this call.
     * 
     * When the operation is finished, @callback will be called.
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
     * Deletes a file. If the @file is a directory, it will only be
     * deleted if it is empty. This has the same semantics as g_unlink().
     * 
     * If @file doesn&#8217;t exist, {@link org.gtk.gio.IOErrorEnum#NOT_FOUND} will be returned. This allows
     * for deletion to be implemented avoiding
     * {@link [time-of-check to time-of-use races]}(https://en.wikipedia.org/wiki/Time-of-check_to_time-of-use):
     * |{@link [
     * g_autoptr(GError) local_error = NULL;
     * if (!g_file_delete (my_file, my_cancellable, &#38;local_error) &#38;&#38;
     *     !g_error_matches (local_error, G_IO_ERROR, G_IO_ERROR_NOT_FOUND))
     *   {
     *     // deletion failed for some reason other than the file not existing:
     *     // so report the error
     *     g_warning (&#34;Failed to delete <code>s:</code> <code>s&#34;,
     * </code>               g_file_peek_path (my_file), local_error-&#62;message);
     *   }
     * ]}|
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Asynchronously delete a file. If the @file is a directory, it will
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
     * Duplicates a #GFile handle. This operation does not duplicate
     * the actual file or directory represented by the #GFile; see
     * g_file_copy() if attempting to copy a file.
     * 
     * g_file_dup() is useful when a second handle is needed to the same underlying
     * file, for use in a separate thread (#GFile is not thread-safe). For use
     * within the same thread, use g_object_ref() to increment the existing object&#8217;s
     * reference count.
     * 
     * This call does no blocking I/O.
     */
    public default File dup() {
        var RESULT = gtk_h.g_file_dup(handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Starts an asynchronous eject on a mountable.
     * When this operation has completed, @callback will be called with
     * @user_user data, and the operation can be finalized with
     * g_file_eject_mountable_with_operation_finish().
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * The result is a #GFileEnumerator object that will give out
     * #GFileInfo objects for all the files in the directory.
     * 
     * The @attributes value is a string that specifies the file
     * attributes that should be gathered. It is not an error if
     * it&#39;s not possible to read a particular requested attribute
     * from a file - it just won&#39;t be set. @attributes should
     * be a comma-separated list of attributes or attribute wildcards.
     * The wildcard &#34;*&#34; means all attributes, and a wildcard like
     * &#34;standard::*&#34; means all attributes in the standard namespace.
     * An example attribute query be &#34;standard::*,owner::user&#34;.
     * The standard attributes are available as defines, like
     * <code>G_FILE_ATTRIBUTE_STANDARD_NAME.</code> <code>G_FILE_ATTRIBUTE_STANDARD_NAME</code> should
     * always be specified if you plan to call g_file_enumerator_get_child() or
     * g_file_enumerator_iterate() on the returned enumerator.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be
     * returned.
     * 
     * If the file does not exist, the {@link org.gtk.gio.IOErrorEnum#NOT_FOUND} error will
     * be returned. If the file is not a directory, the <code>G_IO_ERROR_NOT_DIRECTORY
     * error</code> will be returned. Other errors are possible too.
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
     * in a directory. The result is a #GFileEnumerator object that will
     * give out #GFileInfo objects for all the files in the directory.
     * 
     * For more details, see g_file_enumerate_children() which is
     * the synchronous version of this call.
     * 
     * When the operation is finished, @callback will be called. You can
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
     * Checks if the two given #GFiles refer to the same file.
     * 
     * Note that two #GFiles that differ can still refer to the same
     * file on the filesystem due to various forms of filename
     * aliasing.
     * 
     * This call does no blocking I/O.
     */
    public default boolean equal(File file2) {
        var RESULT = gtk_h.g_file_equal(handle(), file2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets a #GMount for the #GFile.
     * 
     * #GMount is returned only for user interesting locations, see
     * #GVolumeMonitor. If the #GFileIface for @file does not have a #mount,
     * @error will be set to {@link org.gtk.gio.IOErrorEnum#NOT_FOUND} and <code>null</code> #will be returned.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * 
     * For more details, see g_file_find_enclosing_mount() which is
     * the synchronous version of this call.
     * 
     * When the operation is finished, @callback will be called.
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
     * Gets the base name (the last component of the path) for a given #GFile.
     * 
     * If called for the top level of a system (such as the filesystem root
     * or a uri like sftp://host/) it will return a single directory separator
     * (and on Windows, possibly a drive letter).
     * 
     * The base name is a byte string (not UTF-8). It has no defined encoding
     * or rules other than it may not contain zero bytes.  If you want to use
     * filenames in a user interface you should use the display name that you
     * can get by requesting the <code>G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME
     * attribute</code> with g_file_query_info().
     * 
     * This call does no blocking I/O.
     */
    public default java.lang.String getBasename() {
        var RESULT = gtk_h.g_file_get_basename(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a child of @file with basename equal to @name.
     * 
     * Note that the file with that specific name might not exist, but
     * you can still have a #GFile that points to it. You can use this
     * for instance to create that file.
     * 
     * This call does no blocking I/O.
     */
    public default File getChild(java.lang.String name) {
        var RESULT = gtk_h.g_file_get_child(handle(), Interop.allocateNativeString(name).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the child of @file for a given @display_name (i.e. a UTF-8
     * version of the name). If this function fails, it returns <code>NULL
     * and</code> @error will be set. This is very useful when constructing a
     * #GFile for a new file and the user entered the filename in the
     * user interface, for instance when you select a directory and
     * type a filename in the file selector.
     * 
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
     * Gets the parent directory for the @file.
     * If the @file represents the root directory of the
     * file system, then <code>null</code> will be returned.
     * 
     * This call does no blocking I/O.
     */
    public default File getParent() {
        var RESULT = gtk_h.g_file_get_parent(handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the parse name of the @file.
     * A parse name is a UTF-8 string that describes the
     * file such that one can get the #GFile back using
     * g_file_parse_name().
     * 
     * This is generally used to show the #GFile as a nice
     * full-pathname kind of string in a user interface,
     * like in a location entry.
     * 
     * For local files with names that can safely be converted
     * to UTF-8 the pathname is used, otherwise the IRI is used
     * (a form of URI that allows UTF-8 characters unescaped).
     * 
     * This call does no blocking I/O.
     */
    public default java.lang.String getParseName() {
        var RESULT = gtk_h.g_file_get_parse_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the local pathname for #GFile, if one exists. If non-<code>NULL,</code> this is
     * guaranteed to be an absolute, canonical path. It might contain symlinks.
     * 
     * This call does no blocking I/O.
     */
    public default java.lang.String getPath() {
        var RESULT = gtk_h.g_file_get_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the path for @descendant relative to @parent.
     * 
     * This call does no blocking I/O.
     */
    public default java.lang.String getRelativePath(File descendant) {
        var RESULT = gtk_h.g_file_get_relative_path(handle(), descendant.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the URI for the @file.
     * 
     * This call does no blocking I/O.
     */
    public default java.lang.String getUri() {
        var RESULT = gtk_h.g_file_get_uri(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the URI scheme for a #GFile.
     * RFC 3986 decodes the scheme as:
     * |{@link [
     * URI = scheme &#34;:&#34; hier-part [ &#34;?&#34; query ]} {@link [ &#34;#&#34; fragment ]}
     * ]|
     * Common schemes include &#34;file&#34;, &#34;http&#34;, &#34;ftp&#34;, etc.
     * 
     * The scheme can be different from the one used to construct the #GFile,
     * in that it might be replaced with one that is logically equivalent to the #GFile.
     * 
     * This call does no blocking I/O.
     */
    public default java.lang.String getUriScheme() {
        var RESULT = gtk_h.g_file_get_uri_scheme(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks if @file has a parent, and optionally, if it is @parent.
     * 
     * If @parent is <code>null</code> then this function returns <code>true</code> if @file has any
     * parent at all.  If @parent is non-<code>null</code> then <code>true</code> is only returned
     * if @file is an immediate child of @parent.
     */
    public default boolean hasParent(File parent) {
        var RESULT = gtk_h.g_file_has_parent(handle(), parent.handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether @file has the prefix specified by @prefix.
     * 
     * In other words, if the names of initial elements of @file&#39;s
     * pathname match @prefix. Only full pathname elements are matched,
     * so a path like /foo is not considered a prefix of /foobar, only
     * of /foo/bar.
     * 
     * A #GFile is not a prefix of itself. If you want to check for
     * equality, use g_file_equal().
     * 
     * This call does no I/O, as it works purely on names. As such it can
     * sometimes return <code>false</code> even if @file is inside a @prefix (from a
     * filesystem point of view), because the prefix of @file is an alias
     * of @prefix.
     */
    public default boolean hasPrefix(File prefix) {
        var RESULT = gtk_h.g_file_has_prefix(handle(), prefix.handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks to see if a #GFile has a given URI scheme.
     * 
     * This call does no blocking I/O.
     */
    public default boolean hasUriScheme(java.lang.String uriScheme) {
        var RESULT = gtk_h.g_file_has_uri_scheme(handle(), Interop.allocateNativeString(uriScheme).handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates a hash value for a #GFile.
     * 
     * This call does no blocking I/O.
     */
    public default int hash() {
        var RESULT = gtk_h.g_file_hash(handle());
        return RESULT;
    }
    
    /**
     * Checks to see if a file is native to the platform.
     * 
     * A native file is one expressed in the platform-native filename format,
     * e.g. &#34;C:\\Windows&#34; or &#34;/usr/bin/&#34;. This does not mean the file is local,
     * as it might be on a locally mounted remote filesystem.
     * 
     * On some systems non-native files may be available using the native
     * filesystem via a userspace filesystem (FUSE), in these cases this call
     * will return <code>FALSE,</code> but g_file_get_path() will still return a native path.
     * 
     * This call does no blocking I/O.
     */
    public default boolean isNative() {
        var RESULT = gtk_h.g_file_is_native(handle());
        return (RESULT != 0);
    }
    
    /**
     * Loads the contents of @file and returns it as #GBytes.
     * 
     * If @file is a resource:// based URI, the resulting bytes will reference the
     * embedded resource instead of a copy. Otherwise, this is equivalent to calling
     * g_file_load_contents() and g_bytes_new_take().
     * 
     * For resources, @etag_out will be set to <code>NULL.
     * 
     * The</code> data contained in the resulting #GBytes is always zero-terminated, but
     * this is not included in the #GBytes length. The resulting #GBytes should be
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
     * Asynchronously loads the contents of @file as #GBytes.
     * 
     * If @file is a resource:// based URI, the resulting bytes will reference the
     * embedded resource instead of a copy. Otherwise, this is equivalent to calling
     * g_file_load_contents_async() and g_bytes_new_take().
     * 
     * @callback should call g_file_load_bytes_finish() to get the result of this
     * asynchronous operation.
     * 
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
     * 
     * For resources, @etag_out will be set to <code>NULL.
     * 
     * The</code> data contained in the resulting #GBytes is always zero-terminated, but
     * this is not included in the #GBytes length. The resulting #GBytes should be
     * freed with g_bytes_unref() when no longer in use.
     * 
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
     * Starts an asynchronous load of the @file&#39;s contents.
     * 
     * For more details, see g_file_load_contents() which is
     * the synchronous version of this call.
     * 
     * When the load operation has completed, @callback will be called
     * with @user data. To finish the operation, call
     * g_file_load_contents_finish() with the #GAsyncResult returned by
     * the @callback.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Reads the partial contents of a file. A #GFileReadMoreCallback should
     * be used to stop reading from the file when appropriate, else this
     * function will behave exactly as g_file_load_contents_async(). This
     * operation can be finished by g_file_load_partial_contents_finish().
     * 
     * Users of this function should be aware that @user_data is passed to
     * both the @read_more_callback and the @callback.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * of the immediate parent directory of the path or URI given by the #GFile.
     * To recursively create directories, see g_file_make_directory_with_parents().
     * This function will fail if the parent directory does not exist, setting
     * @error to <code>G_IO_ERROR_NOT_FOUND.</code> If the file system doesn&#39;t support
     * creating directories, this function will fail, setting @error to
     * <code>G_IO_ERROR_NOT_SUPPORTED.
     * 
     * For</code> a local #GFile the newly created directory will have the default
     * (current) ownership and permissions of the current process.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * exist similar to &#39;mkdir -p&#39;. If the file system does not support
     * creating directories, this function will fail, setting @error to
     * <code>G_IO_ERROR_NOT_SUPPORTED.</code> If the directory itself already exists,
     * this function will fail setting @error to <code>G_IO_ERROR_EXISTS,</code> unlike
     * the similar g_mkdir_with_parents().
     * 
     * For a local #GFile the newly created directories will have the default
     * (current) ownership and permissions of the current process.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Creates a symbolic link named @file which contains the string
     * @symlink_value.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Recursively measures the disk usage of @file.
     * 
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
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
     * 
     * It does not make sense for @flags to contain
     * <code>G_FILE_MONITOR_WATCH_HARD_LINKS,</code> since hard links can not be made to
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
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
     * 
     * If @flags contains {@link org.gtk.gio.FileMonitorFlags#WATCH_HARD_LINKS} then the monitor
     * will also attempt to report changes made to the file via another
     * filename (ie, a hard link). Without this flag, you can only rely on
     * changes made through the filename contained in @file to be
     * reported. Using this flag may result in an increase in resource
     * usage, and may not have any effect depending on the #GFileMonitor
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
     * Starts a @mount_operation, mounting the volume that contains
     * the file @location.
     * 
     * When this operation has completed, @callback will be called with
     * @user_user data, and the operation can be finalized with
     * g_file_mount_enclosing_volume_finish().
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Using @mount_operation, you can request callbacks when, for instance,
     * passwords are needed during authentication.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
     * 
     * When the operation is finished, @callback will be called.
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
     * 
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
     * Tries to move the file or directory @source to the location specified
     * by @destination. If native move operations are supported then this is
     * used, otherwise a copy + delete fallback is used. The native
     * implementation may support moving directories (for instance on moves
     * inside the same filesystem), but the fallback code does not.
     * 
     * If the flag {@link org.gtk.gio.FileCopyFlags#OVERWRITE} is specified an already
     * existing @destination file is overwritten.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
     * 
     * If @progress_callback is not <code>NULL,</code> then the operation can be monitored
     * by setting this to a #GFileProgressCallback function.
     * @progress_callback_data will be passed to this function. It is
     * guaranteed that this callback will be called after all data has been
     * transferred with the total number of bytes copied during the operation.
     * 
     * If the @source file does not exist, then the <code>G_IO_ERROR_NOT_FOUND
     * error</code> is returned, independent on the status of the @destination.
     * 
     * If {@link org.gtk.gio.FileCopyFlags#OVERWRITE} is not specified and the target exists,
     * then the error {@link org.gtk.gio.IOErrorEnum#EXISTS} is returned.
     * 
     * If trying to overwrite a file over a directory, the <code>G_IO_ERROR_IS_DIRECTORY
     * error</code> is returned. If trying to overwrite a directory with a directory the
     * {@link org.gtk.gio.IOErrorEnum#WOULD_MERGE} error is returned.
     * 
     * If the source is a directory and the target does not exist, or
     * {@link org.gtk.gio.FileCopyFlags#OVERWRITE} is specified and the target is a file, then
     * the {@link org.gtk.gio.IOErrorEnum#WOULD_RECURSE} error may be returned (if the native
     * move operation isn&#39;t available).
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
     * Asynchronously moves a file @source to the location of @destination. For details of the behaviour, see g_file_move().
     * 
     * If @progress_callback is not <code>NULL,</code> then that function that will be called
     * just like in g_file_move(). The callback will run in the default main context
     * of the thread calling g_file_move_async() &#8212; the same context as @callback is
     * run in.
     * 
     * When the operation is finished, @callback will be called. You can then call
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
     * a #GFileIOStream that can be used to read and write the contents
     * of the file.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be
     * returned.
     * 
     * If the file does not exist, the {@link org.gtk.gio.IOErrorEnum#NOT_FOUND} error will
     * be returned. If the file is a directory, the <code>G_IO_ERROR_IS_DIRECTORY
     * error</code> will be returned. Other errors are possible too, and depend on
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
     * Asynchronously opens @file for reading and writing.
     * 
     * For more details, see g_file_open_readwrite() which is
     * the synchronous version of this call.
     * 
     * When the operation is finished, @callback will be called.
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
     * applications which mix <code>g_file_*</code> APIs with native ones.  It
     * also avoids an extra duplicated string when possible, so will be
     * generally more efficient.
     * 
     * This call does no blocking I/O.
     */
    public default java.lang.String peekPath() {
        var RESULT = gtk_h.g_file_peek_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Polls a file of type <code>G_FILE_TYPE_MOUNTABLE.
     * 
     * If</code> @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
     * 
     * When the operation is finished, @callback will be called.
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
     * 
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
     * Returns the #GAppInfo that is registered as the default
     * application to handle the file specified by @file.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * 
     * Note that in many cases it is {@link [racy to first check for file existence]}(https://en.wikipedia.org/wiki/Time_of_check_to_time_of_use)
     * and then execute something based on the outcome of that, because the
     * file might have been created or removed in between the operations. The
     * general approach to handling that is to not check, but just do the
     * operation and handle the errors as they come.
     * 
     * As an example of race-free checking, take the case of reading a file,
     * and if it doesn&#39;t exist, creating it. There are two racy versions: read
     * it, and on error create it; and: check if it exists, if not create it.
     * These can both result in two processes creating the file (with perhaps
     * a partially written file as the result). The correct approach is to
     * always try to create the file with g_file_create() which will either
     * atomically create the file or fail with a {@link org.gtk.gio.IOErrorEnum#EXISTS} error.
     * 
     * However, in many cases an existence check is useful in a user interface,
     * for instance to make a menu item sensitive/insensitive, so that you don&#39;t
     * have to fool users that something is possible and then just show an error
     * dialog. If you do this, you should make sure to also handle the errors
     * that can happen due to races when you execute the operation.
     */
    public default boolean queryExists(Cancellable cancellable) {
        var RESULT = gtk_h.g_file_query_exists(handle(), cancellable.handle());
        return (RESULT != 0);
    }
    
    /**
     * Utility function to inspect the #GFileType of a file. This is
     * implemented using g_file_query_info() and as such does blocking I/O.
     * 
     * The primary use case of this method is to check if a file is
     * a regular file, directory, or symlink.
     */
    public default FileType queryFileType(int flags, Cancellable cancellable) {
        var RESULT = gtk_h.g_file_query_file_type(handle(), flags, cancellable.handle());
        return FileType.fromValue(RESULT);
    }
    
    /**
     * Similar to g_file_query_info(), but obtains information
     * about the filesystem the @file is on, rather than the file itself.
     * For instance the amount of space available and the type of
     * the filesystem.
     * 
     * The @attributes value is a string that specifies the attributes
     * that should be gathered. It is not an error if it&#39;s not possible
     * to read a particular requested attribute from a file - it just
     * won&#39;t be set. @attributes should be a comma-separated list of
     * attributes or attribute wildcards. The wildcard &#34;*&#34; means all
     * attributes, and a wildcard like &#34;filesystem::*&#34; means all attributes
     * in the filesystem namespace. The standard namespace for filesystem
     * attributes is &#34;filesystem&#34;. Common attributes of interest are
     * <code>G_FILE_ATTRIBUTE_FILESYSTEM_SIZE</code> (the total size of the filesystem
     * in bytes), <code>G_FILE_ATTRIBUTE_FILESYSTEM_FREE</code> (number of bytes available),
     * and <code>G_FILE_ATTRIBUTE_FILESYSTEM_TYPE</code> (type of the filesystem).
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be
     * returned.
     * 
     * If the file does not exist, the {@link org.gtk.gio.IOErrorEnum#NOT_FOUND} error will
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
     * that the specified @file is on. The result is a #GFileInfo object
     * that contains key-value attributes (such as type or size for the
     * file).
     * 
     * For more details, see g_file_query_filesystem_info() which is the
     * synchronous version of this call.
     * 
     * When the operation is finished, @callback will be called. You can
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
     * Gets the requested information about specified @file.
     * The result is a #GFileInfo object that contains key-value
     * attributes (such as the type or size of the file).
     * 
     * The @attributes value is a string that specifies the file
     * attributes that should be gathered. It is not an error if
     * it&#39;s not possible to read a particular requested attribute
     * from a file - it just won&#39;t be set. @attributes should be a
     * comma-separated list of attributes or attribute wildcards.
     * The wildcard &#34;*&#34; means all attributes, and a wildcard like
     * &#34;standard::*&#34; means all attributes in the standard namespace.
     * An example attribute query be &#34;standard::*,owner::user&#34;.
     * The standard attributes are available as defines, like
     * <code>G_FILE_ATTRIBUTE_STANDARD_NAME.
     * 
     * If</code> @cancellable is not <code>NULL,</code> then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be
     * returned.
     * 
     * For symlinks, normally the information about the target of the
     * symlink is returned, rather than information about the symlink
     * itself. However if you pass <code>G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS
     * in</code> @flags the information about the symlink itself will be returned.
     * Also, for symlinks that point to non-existing files the information
     * about the symlink itself will be returned.
     * 
     * If the file does not exist, the {@link org.gtk.gio.IOErrorEnum#NOT_FOUND} error will be
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
     * Asynchronously gets the requested information about specified @file.
     * The result is a #GFileInfo object that contains key-value attributes
     * (such as type or size for the file).
     * 
     * For more details, see g_file_query_info() which is the synchronous
     * version of this call.
     * 
     * When the operation is finished, @callback will be called. You can
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
     * 
     * Returns the type and full attribute name of all the attributes
     * that can be set on this file. This doesn&#39;t mean setting it will
     * always succeed though, you might get an access failure, or some
     * specific file may not support a specific attribute.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * attributes (in the &#34;xattr&#34; namespace).
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Opens a file for reading. The result is a #GFileInputStream that
     * can be used to read the contents of the file.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
     * 
     * If the file does not exist, the {@link org.gtk.gio.IOErrorEnum#NOT_FOUND} error will be
     * returned. If the file is a directory, the <code>G_IO_ERROR_IS_DIRECTORY
     * error</code> will be returned. Other errors are possible too, and depend
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
     * Asynchronously opens @file for reading.
     * 
     * For more details, see g_file_read() which is
     * the synchronous version of this call.
     * 
     * When the operation is finished, @callback will be called.
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
     * creating a backup copy of the file first. If the file doesn&#39;t exist,
     * it will be created.
     * 
     * This will try to replace the file in the safest way possible so
     * that any errors during the writing will not affect an already
     * existing copy of the file. For instance, for local files it
     * may write to a temporary file and then atomically rename over
     * the destination when the stream is closed.
     * 
     * By default files created are generally readable by everyone,
     * but if you pass {@link org.gtk.gio.FileCreateFlags#PRIVATE} in @flags the file
     * will be made readable only to the current user, to the level that
     * is supported on the target filesystem.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be
     * returned.
     * 
     * If you pass in a non-<code>null</code> @etag value and @file already exists, then
     * this value is compared to the current entity tag of the file, and if
     * they differ an {@link org.gtk.gio.IOErrorEnum#WRONG_ETAG} error is returned. This
     * generally means that the file has been changed since you last read
     * it. You can get the new etag from g_file_output_stream_get_etag()
     * after you&#39;ve finished writing and closed the #GFileOutputStream. When
     * you load a new file you can use g_file_input_stream_query_info() to
     * get the etag of the file.
     * 
     * If @make_backup is <code>TRUE,</code> this function will attempt to make a
     * backup of the current file before overwriting it. If this fails
     * a {@link org.gtk.gio.IOErrorEnum#CANT_CREATE_BACKUP} error will be returned. If you
     * want to replace anyway, try again with @make_backup set to <code>FALSE.
     * 
     * If</code> the file is a directory the {@link org.gtk.gio.IOErrorEnum#IS_DIRECTORY} error will
     * be returned, and if the file is some other form of non-regular file
     * then a {@link org.gtk.gio.IOErrorEnum#NOT_REGULAR_FILE} error will be returned. Some
     * file systems don&#39;t allow all file names, and may return an
     * {@link org.gtk.gio.IOErrorEnum#INVALID_FILENAME} error, and if the name is to long
     * {@link org.gtk.gio.IOErrorEnum#FILENAME_TOO_LONG} will be returned. Other errors are
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
     * 
     * For more details, see g_file_replace() which is
     * the synchronous version of this call.
     * 
     * When the operation is finished, @callback will be called.
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
     * Replaces the contents of @file with @contents of @length bytes.
     * 
     * If @etag is specified (not <code>NULL),</code> any existing file must have that etag,
     * or the error {@link org.gtk.gio.IOErrorEnum#WRONG_ETAG} will be returned.
     * 
     * If @make_backup is <code>TRUE,</code> this function will attempt to make a backup
     * of @file. Internally, it uses g_file_replace(), so will try to replace the
     * file contents in the safest way possible. For example, atomic renames are
     * used when replacing local files&#8217; contents.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
     * 
     * The returned @new_etag can be used to verify that the file hasn&#39;t
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
     * Starts an asynchronous replacement of @file with the given
     * @contents of @length bytes. @etag will replace the document&#39;s
     * current entity tag.
     * 
     * When this operation has completed, @callback will be called with
     * @user_user data, and the operation can be finalized with
     * g_file_replace_contents_finish().
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
     * 
     * If @make_backup is <code>TRUE,</code> this function will attempt to
     * make a backup of @file.
     * 
     * Note that no copy of @contents will be made, so it must stay valid
     * until @callback is called. See g_file_replace_contents_bytes_async()
     * for a #GBytes version that will automatically hold a reference to the
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
     * Same as g_file_replace_contents_async() but takes a #GBytes input instead.
     * This function will keep a ref on @contents until the operation is done.
     * Unlike g_file_replace_contents_async() this allows forgetting about the
     * content without waiting for the callback.
     * 
     * When this operation has completed, @callback will be called with
     * @user_user data, and the operation can be finalized with
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
     * Finishes an asynchronous replace of the given @file. See
     * g_file_replace_contents_async(). Sets @new_etag to the new entity
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
     * possibly creating a backup copy of the file first. If the file doesn&#39;t
     * exist, it will be created.
     * 
     * For details about the behaviour, see g_file_replace() which does the
     * same thing but returns an output stream only.
     * 
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
     * 
     * For more details, see g_file_replace_readwrite() which is
     * the synchronous version of this call.
     * 
     * When the operation is finished, @callback will be called.
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
     * Resolves a relative path for @file to an absolute path.
     * 
     * This call does no blocking I/O.
     * 
     * If the @relative_path is an absolute path name, the resolution
     * is done absolutely (without taking @file path as base).
     */
    public default File resolveRelativePath(java.lang.String relativePath) {
        var RESULT = gtk_h.g_file_resolve_relative_path(handle(), Interop.allocateNativeString(relativePath).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Sets an attribute in the file with attribute name @attribute to @value_p.
     * 
     * Some attributes can be unset by setting @type to
     * {@link org.gtk.gio.FileAttributeType#INVALID} and @value_p to <code>NULL.
     * 
     * If</code> @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Sets @attribute of type {@link org.gtk.gio.FileAttributeType#BYTE_STRING} to @value.
     * If @attribute is of a different type, this operation will fail,
     * returning <code>FALSE.
     * 
     * If</code> @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Sets @attribute of type {@link org.gtk.gio.FileAttributeType#INT32} to @value.
     * If @attribute is of a different type, this operation will fail.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Sets @attribute of type {@link org.gtk.gio.FileAttributeType#INT64} to @value.
     * If @attribute is of a different type, this operation will fail.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Sets @attribute of type {@link org.gtk.gio.FileAttributeType#STRING} to @value.
     * If @attribute is of a different type, this operation will fail.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Sets @attribute of type {@link org.gtk.gio.FileAttributeType#UINT32} to @value.
     * If @attribute is of a different type, this operation will fail.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Sets @attribute of type {@link org.gtk.gio.FileAttributeType#UINT64} to @value.
     * If @attribute is of a different type, this operation will fail.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Asynchronously sets the attributes of @file with @info.
     * 
     * For more details, see g_file_set_attributes_from_info(),
     * which is the synchronous version of this call.
     * 
     * When the operation is finished, @callback will be called.
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
     * Tries to set all attributes in the #GFileInfo on the target
     * values, not stopping on the first error.
     * 
     * If there is any error during this operation then @error will
     * be set to the first error. Error on particular fields are flagged
     * by setting the &#34;status&#34; field in the attribute value to
     * <code>G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING,</code> which means you can
     * also detect further errors.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Renames @file to the specified display name.
     * 
     * The display name is converted from UTF-8 to the correct encoding
     * for the target filesystem if possible and the @file is renamed to this.
     * 
     * If you want to implement a rename operation in the user interface the
     * edit name (<code>G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME)</code> should be used as the
     * initial value in the rename widget, and then the result after editing
     * should be passed to g_file_set_display_name().
     * 
     * On success the resulting converted filename is returned.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Asynchronously sets the display name for a given #GFile.
     * 
     * For more details, see g_file_set_display_name() which is
     * the synchronous version of this call.
     * 
     * When the operation is finished, @callback will be called.
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
     * Starts a file of type <code>G_FILE_TYPE_MOUNTABLE.
     * Using</code> @start_operation, you can request callbacks when, for instance,
     * passwords are needed during authentication.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
     * 
     * When the operation is finished, @callback will be called.
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
     * 
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
     * Stops a file of type <code>G_FILE_TYPE_MOUNTABLE.
     * 
     * If</code> @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
     * 
     * When the operation is finished, @callback will be called.
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
     * 
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
     * Checks if @file supports
     * {@link [thread-default contexts]}{@link [g-main-context-push-thread-default-context]}.
     * If this returns <code>FALSE,</code> you cannot perform asynchronous operations on
     * @file in a thread that has a thread-default context.
     */
    public default boolean supportsThreadContexts() {
        var RESULT = gtk_h.g_file_supports_thread_contexts(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sends @file to the &#34;Trashcan&#34;, if possible. This is similar to
     * deleting it, but the user can recover it before emptying the trashcan.
     * Not all file systems support trashing, so this call can return the
     * {@link org.gtk.gio.IOErrorEnum#NOT_SUPPORTED} error. Since GLib 2.66, the <code>x-gvfs-notrash</code> unix
     * mount option can be used to disable g_file_trash() support for certain
     * mounts, the {@link org.gtk.gio.IOErrorEnum#NOT_SUPPORTED} error will be returned in that case.
     * 
     * If @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
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
     * Asynchronously sends @file to the Trash location, if possible.
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
     * Unmounts a file of type <code>G_FILE_TYPE_MOUNTABLE.
     * 
     * If</code> @cancellable is not <code>NULL,</code> then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link org.gtk.gio.IOErrorEnum#CANCELLED} will be returned.
     * 
     * When the operation is finished, @callback will be called.
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
     * 
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
     * Creates a #GFile with the given argument from the command line.
     * The value of @arg can be either a URI, an absolute path or a
     * relative path resolved relative to the current working directory.
     * This operation never fails, but the returned object might not
     * support any I/O operation if @arg points to a malformed path.
     * 
     * Note that on Windows, this function expects its argument to be in
     * UTF-8 -- not the system code page.  This means that you
     * should not use this function with string from argv as it is passed
     * to main().  g_win32_get_command_line() will return a UTF-8 version of
     * the commandline.  #GApplication also uses UTF-8 but
     * g_application_command_line_create_file_for_arg() may be more useful
     * for you there.  It is also always possible to use this function with
     * #GOptionContext arguments of type 
     *             
     *           
     *         
     *       
     *       
     *         Creates a #GFile with the given argument from the command line.
     * The value of @arg can be either a URI, an absolute path or a
     * relative path resolved relative to the current working directory.
     * This operation never fails, but the returned object might not
     * support any I/O operation if @arg points to a malformed path.
     * 
     * Note that on Windows, this function expects its argument to be in
     * UTF-8 -- not the system code page.  This means that you
     * should not use this function with string from argv as it is passed
     * to main().  g_win32_get_command_line() will return a UTF-8 version of
     * the commandline.  #GApplication also uses UTF-8 but
     * g_application_command_line_create_file_for_arg() may be more useful
     * for you there.  It is also always possible to use this function with
     * #GOptionContext arguments of type %G_OPTION_ARG_FILENAME.
     */
    public static File newForCommandlineArg(java.lang.String arg) {
        var RESULT = gtk_h.g_file_new_for_commandline_arg(Interop.allocateNativeString(arg).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Creates a #GFile with the given argument from the command line.
     * 
     * This function is similar to g_file_new_for_commandline_arg() except
     * that it allows for passing the current working directory as an
     * argument instead of using the current working directory of the
     * process.
     * 
     * This is useful if the commandline argument was given in a context
     * other than the invocation of the current process.
     * 
     * See also g_application_command_line_create_file_for_arg().
     */
    public static File newForCommandlineArgAndCwd(java.lang.String arg, java.lang.String cwd) {
        var RESULT = gtk_h.g_file_new_for_commandline_arg_and_cwd(Interop.allocateNativeString(arg).handle(), Interop.allocateNativeString(cwd).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Constructs a #GFile for a given path. This operation never
     * fails, but the returned object might not support any I/O
     * operation if @path is malformed.
     */
    public static File newForPath(java.lang.String path) {
        var RESULT = gtk_h.g_file_new_for_path(Interop.allocateNativeString(path).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Constructs a #GFile for a given URI. This operation never
     * fails, but the returned object might not support any I/O
     * operation if @uri is malformed or if the uri type is
     * not supported.
     */
    public static File newForUri(java.lang.String uri) {
        var RESULT = gtk_h.g_file_new_for_uri(Interop.allocateNativeString(uri).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Opens a file in the preferred directory for temporary files (as
     * returned by g_get_tmp_dir()) and returns a #GFile and
     * #GFileIOStream pointing to it.
     * 
     * @tmpl should be a string in the GLib file name encoding
     * containing a sequence of six &#39;X&#39; characters, and containing no
     * directory components. If it is <code>NULL,</code> a default template is used.
     * 
     * Unlike the other #GFile constructors, this will return <code>null</code> if
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
     * Constructs a #GFile with the given @parse_name (i.e. something
     * given by g_file_get_parse_name()). This operation never fails,
     * but the returned object might not support any I/O operation if
     * the @parse_name cannot be parsed.
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
