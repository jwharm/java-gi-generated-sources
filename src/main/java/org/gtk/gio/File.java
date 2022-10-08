package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
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
public interface File extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle g_file_append_to = Interop.downcallHandle(
        "g_file_append_to",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets an output stream for appending data to the file.
     * If the file doesn't already exist it is created.
     * <p>
     * By default files created are generally readable by everyone,
     * but if you pass {@link FileCreateFlags#PRIVATE} in {@code flags} the file
     * will be made readable only to the current user, to the level that
     * is supported on the target filesystem.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link IOErrorEnum#CANCELLED} will be
     * returned.
     * <p>
     * Some file systems don't allow all file names, and may return an
     * {@link IOErrorEnum#INVALID_FILENAME} error. If the file is a directory the
     * {@link IOErrorEnum#IS_DIRECTORY} error will be returned. Other errors are
     * possible too, and depend on what kind of filesystem the file is on.
     */
    public default FileOutputStream appendTo(FileCreateFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_append_to.invokeExact(handle(), flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileOutputStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_append_to_async = Interop.downcallHandle(
        "g_file_append_to_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public default void appendToAsync(FileCreateFlags flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_append_to_async.invokeExact(handle(), flags.getValue(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_append_to_finish = Interop.downcallHandle(
        "g_file_append_to_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous file append operation started with
     * g_file_append_to_async().
     */
    public default FileOutputStream appendToFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_append_to_finish.invokeExact(handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileOutputStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_build_attribute_list_for_copy = Interop.downcallHandle(
        "g_file_build_attribute_list_for_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public default java.lang.String buildAttributeListForCopy(FileCopyFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_build_attribute_list_for_copy.invokeExact(handle(), flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_copy = Interop.downcallHandle(
        "g_file_copy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * If {@code progress_callback} is not {@code null}, then the operation can be monitored
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
    public default boolean copy(File destination, FileCopyFlags flags, Cancellable cancellable, FileProgressCallback progressCallback) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_copy.invokeExact(handle(), destination.handle(), flags.getValue(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbFileProgressCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_copy_async = Interop.downcallHandle(
        "g_file_copy_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies the file {@code source} to the location specified by {@code destination}
     * asynchronously. For details of the behaviour, see g_file_copy().
     * <p>
     * If {@code progress_callback} is not {@code null}, then that function that will be called
     * just like in g_file_copy(). The callback will run in the default main context
     * of the thread calling g_file_copy_async() — the same context as {@code callback} is
     * run in.
     * <p>
     * When the operation is finished, {@code callback} will be called. You can then call
     * g_file_copy_finish() to get the result of the operation.
     */
    public default void copyAsync(File destination, FileCopyFlags flags, int ioPriority, Cancellable cancellable, FileProgressCallback progressCallback, AsyncReadyCallback callback) {
        try {
            g_file_copy_async.invokeExact(handle(), destination.handle(), flags.getValue(), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbFileProgressCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_copy_attributes = Interop.downcallHandle(
        "g_file_copy_attributes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public default boolean copyAttributes(File destination, FileCopyFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_copy_attributes.invokeExact(handle(), destination.handle(), flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_copy_finish = Interop.downcallHandle(
        "g_file_copy_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes copying the file started with g_file_copy_async().
     */
    public default boolean copyFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_copy_finish.invokeExact(handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_create = Interop.downcallHandle(
        "g_file_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new file and returns an output stream for writing to it.
     * The file must not already exist.
     * <p>
     * By default files created are generally readable by everyone,
     * but if you pass {@link FileCreateFlags#PRIVATE} in {@code flags} the file
     * will be made readable only to the current user, to the level
     * that is supported on the target filesystem.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled
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
    public default FileOutputStream create(FileCreateFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_create.invokeExact(handle(), flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileOutputStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_create_async = Interop.downcallHandle(
        "g_file_create_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public default void createAsync(FileCreateFlags flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_create_async.invokeExact(handle(), flags.getValue(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_create_finish = Interop.downcallHandle(
        "g_file_create_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous file create operation started with
     * g_file_create_async().
     */
    public default FileOutputStream createFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_create_finish.invokeExact(handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileOutputStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_create_readwrite = Interop.downcallHandle(
        "g_file_create_readwrite",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new file and returns a stream for reading and
     * writing to it. The file must not already exist.
     * <p>
     * By default files created are generally readable by everyone,
     * but if you pass {@link FileCreateFlags#PRIVATE} in {@code flags} the file
     * will be made readable only to the current user, to the level
     * that is supported on the target filesystem.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled
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
    public default FileIOStream createReadwrite(FileCreateFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_create_readwrite.invokeExact(handle(), flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileIOStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_create_readwrite_async = Interop.downcallHandle(
        "g_file_create_readwrite_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public default void createReadwriteAsync(FileCreateFlags flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_create_readwrite_async.invokeExact(handle(), flags.getValue(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_create_readwrite_finish = Interop.downcallHandle(
        "g_file_create_readwrite_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous file create operation started with
     * g_file_create_readwrite_async().
     */
    public default FileIOStream createReadwriteFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_create_readwrite_finish.invokeExact(handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileIOStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_delete = Interop.downcallHandle(
        "g_file_delete",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Deletes a file. If the {@code file} is a directory, it will only be
     * deleted if it is empty. This has the same semantics as g_unlink().
     * <p>
     * If {@code file} doesn’t exist, {@link IOErrorEnum#NOT_FOUND} will be returned. This allows
     * for deletion to be implemented avoiding
     * <a href="https://en.wikipedia.org/wiki/Time-of-check_to_time-of-use">time-of-check to time-of-use races</a>:
     * <pre>{@code 
     * g_autoptr(GError) local_error = NULL;
     * if (!g_file_delete (my_file, my_cancellable, &local_error) &&
     *     !g_error_matches (local_error, G_IO_ERROR, G_IO_ERROR_NOT_FOUND))
     *   {
     *     // deletion failed for some reason other than the file not existing:
     *     // so report the error
     *     g_warning ("Failed to delete %s: %s",
     *                g_file_peek_path (my_file), local_error->message);
     *   }
     * }</pre>
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean delete(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_delete.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_delete_async = Interop.downcallHandle(
        "g_file_delete_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously delete a file. If the {@code file} is a directory, it will
     * only be deleted if it is empty.  This has the same semantics as
     * g_unlink().
     */
    public default void deleteAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_delete_async.invokeExact(handle(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_delete_finish = Interop.downcallHandle(
        "g_file_delete_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes deleting a file started with g_file_delete_async().
     */
    public default boolean deleteFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_delete_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_dup = Interop.downcallHandle(
        "g_file_dup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_file_dup.invokeExact(handle());
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_eject_mountable_with_operation = Interop.downcallHandle(
        "g_file_eject_mountable_with_operation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Starts an asynchronous eject on a mountable.
     * When this operation has completed, {@code callback} will be called with
     * {@code user_user} data, and the operation can be finalized with
     * g_file_eject_mountable_with_operation_finish().
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default void ejectMountableWithOperation(MountUnmountFlags flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_eject_mountable_with_operation.invokeExact(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
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
    
    static final MethodHandle g_file_eject_mountable_with_operation_finish = Interop.downcallHandle(
        "g_file_eject_mountable_with_operation_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous eject operation started by
     * g_file_eject_mountable_with_operation().
     */
    public default boolean ejectMountableWithOperationFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_eject_mountable_with_operation_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_enumerate_children = Interop.downcallHandle(
        "g_file_enumerate_children",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link IOErrorEnum#CANCELLED} will be
     * returned.
     * <p>
     * If the file does not exist, the {@link IOErrorEnum#NOT_FOUND} error will
     * be returned. If the file is not a directory, the {@link IOErrorEnum#NOT_DIRECTORY}
     * error will be returned. Other errors are possible too.
     */
    public default FileEnumerator enumerateChildren(java.lang.String attributes, FileQueryInfoFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_enumerate_children.invokeExact(handle(), Interop.allocateNativeString(attributes).handle(), flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileEnumerator(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_enumerate_children_async = Interop.downcallHandle(
        "g_file_enumerate_children_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public default void enumerateChildrenAsync(java.lang.String attributes, FileQueryInfoFlags flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_enumerate_children_async.invokeExact(handle(), Interop.allocateNativeString(attributes).handle(), flags.getValue(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_enumerate_children_finish = Interop.downcallHandle(
        "g_file_enumerate_children_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an async enumerate children operation.
     * See g_file_enumerate_children_async().
     */
    public default FileEnumerator enumerateChildrenFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_enumerate_children_finish.invokeExact(handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileEnumerator(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_equal = Interop.downcallHandle(
        "g_file_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) g_file_equal.invokeExact(handle(), file2.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_find_enclosing_mount = Interop.downcallHandle(
        "g_file_find_enclosing_mount",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a {@link Mount} for the {@link File}.
     * <p>
     * {@link Mount} is returned only for user interesting locations, see
     * {@link VolumeMonitor}. If the {@link FileIface} for {@code file} does not have a {@code mount},
     * {@code error} will be set to {@link IOErrorEnum#NOT_FOUND} and {@code null} {@code will} be returned.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default Mount findEnclosingMount(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_find_enclosing_mount.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new Mount.MountImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_find_enclosing_mount_async = Interop.downcallHandle(
        "g_file_find_enclosing_mount_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
            g_file_find_enclosing_mount_async.invokeExact(handle(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_find_enclosing_mount_finish = Interop.downcallHandle(
        "g_file_find_enclosing_mount_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous find mount request.
     * See g_file_find_enclosing_mount_async().
     */
    public default Mount findEnclosingMountFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_find_enclosing_mount_finish.invokeExact(handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new Mount.MountImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_get_basename = Interop.downcallHandle(
        "g_file_get_basename",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_file_get_basename.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_get_child = Interop.downcallHandle(
        "g_file_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_file_get_child.invokeExact(handle(), Interop.allocateNativeString(name).handle());
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_get_child_for_display_name = Interop.downcallHandle(
        "g_file_get_child_for_display_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child of {@code file} for a given {@code display_name} (i.e. a UTF-8
     * version of the name). If this function fails, it returns {@code null}
     * and {@code error} will be set. This is very useful when constructing a
     * {@link File} for a new file and the user entered the filename in the
     * user interface, for instance when you select a directory and
     * type a filename in the file selector.
     * <p>
     * This call does no blocking I/O.
     */
    public default File getChildForDisplayName(java.lang.String displayName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_get_child_for_display_name.invokeExact(handle(), Interop.allocateNativeString(displayName).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_get_parent = Interop.downcallHandle(
        "g_file_get_parent",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the parent directory for the {@code file}.
     * If the {@code file} represents the root directory of the
     * file system, then {@code null} will be returned.
     * <p>
     * This call does no blocking I/O.
     */
    public default File getParent() {
        try {
            var RESULT = (MemoryAddress) g_file_get_parent.invokeExact(handle());
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_get_parse_name = Interop.downcallHandle(
        "g_file_get_parse_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_file_get_parse_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_get_path = Interop.downcallHandle(
        "g_file_get_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the local pathname for {@link File}, if one exists. If non-{@code null}, this is
     * guaranteed to be an absolute, canonical path. It might contain symlinks.
     * <p>
     * This call does no blocking I/O.
     */
    public default java.lang.String getPath() {
        try {
            var RESULT = (MemoryAddress) g_file_get_path.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_get_relative_path = Interop.downcallHandle(
        "g_file_get_relative_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the path for {@code descendant} relative to {@code parent}.
     * <p>
     * This call does no blocking I/O.
     */
    public default java.lang.String getRelativePath(File descendant) {
        try {
            var RESULT = (MemoryAddress) g_file_get_relative_path.invokeExact(handle(), descendant.handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_get_uri = Interop.downcallHandle(
        "g_file_get_uri",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the URI for the {@code file}.
     * <p>
     * This call does no blocking I/O.
     */
    public default java.lang.String getUri() {
        try {
            var RESULT = (MemoryAddress) g_file_get_uri.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_get_uri_scheme = Interop.downcallHandle(
        "g_file_get_uri_scheme",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the URI scheme for a {@link File}.
     * RFC 3986 decodes the scheme as:
     * <pre>{@code 
     * URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
     * }</pre>
     * Common schemes include "file", "http", "ftp", etc.
     * <p>
     * The scheme can be different from the one used to construct the {@link File},
     * in that it might be replaced with one that is logically equivalent to the {@link File}.
     * <p>
     * This call does no blocking I/O.
     */
    public default java.lang.String getUriScheme() {
        try {
            var RESULT = (MemoryAddress) g_file_get_uri_scheme.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_has_parent = Interop.downcallHandle(
        "g_file_has_parent",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code file} has a parent, and optionally, if it is {@code parent}.
     * <p>
     * If {@code parent} is {@code null} then this function returns {@code true} if {@code file} has any
     * parent at all.  If {@code parent} is non-{@code null} then {@code true} is only returned
     * if {@code file} is an immediate child of {@code parent}.
     */
    public default boolean hasParent(File parent) {
        try {
            var RESULT = (int) g_file_has_parent.invokeExact(handle(), parent.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_has_prefix = Interop.downcallHandle(
        "g_file_has_prefix",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * sometimes return {@code false} even if {@code file} is inside a {@code prefix} (from a
     * filesystem point of view), because the prefix of {@code file} is an alias
     * of {@code prefix}.
     */
    public default boolean hasPrefix(File prefix) {
        try {
            var RESULT = (int) g_file_has_prefix.invokeExact(handle(), prefix.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_has_uri_scheme = Interop.downcallHandle(
        "g_file_has_uri_scheme",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks to see if a {@link File} has a given URI scheme.
     * <p>
     * This call does no blocking I/O.
     */
    public default boolean hasUriScheme(java.lang.String uriScheme) {
        try {
            var RESULT = (int) g_file_has_uri_scheme.invokeExact(handle(), Interop.allocateNativeString(uriScheme).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_hash = Interop.downcallHandle(
        "g_file_hash",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a hash value for a {@link File}.
     * <p>
     * This call does no blocking I/O.
     */
    public default int hash() {
        try {
            var RESULT = (int) g_file_hash.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_is_native = Interop.downcallHandle(
        "g_file_is_native",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks to see if a file is native to the platform.
     * <p>
     * A native file is one expressed in the platform-native filename format,
     * e.g. "C:\\Windows" or "/usr/bin/". This does not mean the file is local,
     * as it might be on a locally mounted remote filesystem.
     * <p>
     * On some systems non-native files may be available using the native
     * filesystem via a userspace filesystem (FUSE), in these cases this call
     * will return {@code false}, but g_file_get_path() will still return a native path.
     * <p>
     * This call does no blocking I/O.
     */
    public default boolean isNative() {
        try {
            var RESULT = (int) g_file_is_native.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_load_bytes = Interop.downcallHandle(
        "g_file_load_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads the contents of {@code file} and returns it as {@link org.gtk.glib.Bytes}.
     * <p>
     * If {@code file} is a resource:// based URI, the resulting bytes will reference the
     * embedded resource instead of a copy. Otherwise, this is equivalent to calling
     * g_file_load_contents() and g_bytes_new_take().
     * <p>
     * For resources, {@code etag_out} will be set to {@code null}.
     * <p>
     * The data contained in the resulting {@link org.gtk.glib.Bytes} is always zero-terminated, but
     * this is not included in the {@link org.gtk.glib.Bytes} length. The resulting {@link org.gtk.glib.Bytes} should be
     * freed with g_bytes_unref() when no longer in use.
     */
    public default org.gtk.glib.Bytes loadBytes(Cancellable cancellable, PointerString etagOut) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_load_bytes.invokeExact(handle(), cancellable.handle(), etagOut.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_load_bytes_async = Interop.downcallHandle(
        "g_file_load_bytes_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
            g_file_load_bytes_async.invokeExact(handle(), cancellable.handle(), 
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
    
    static final MethodHandle g_file_load_bytes_finish = Interop.downcallHandle(
        "g_file_load_bytes_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Completes an asynchronous request to g_file_load_bytes_async().
     * <p>
     * For resources, {@code etag_out} will be set to {@code null}.
     * <p>
     * The data contained in the resulting {@link org.gtk.glib.Bytes} is always zero-terminated, but
     * this is not included in the {@link org.gtk.glib.Bytes} length. The resulting {@link org.gtk.glib.Bytes} should be
     * freed with g_bytes_unref() when no longer in use.
     * <p>
     * See g_file_load_bytes() for more information.
     */
    public default org.gtk.glib.Bytes loadBytesFinish(AsyncResult result, PointerString etagOut) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_load_bytes_finish.invokeExact(handle(), result.handle(), etagOut.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_load_contents = Interop.downcallHandle(
        "g_file_load_contents",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads the content of the file into memory. The data is always
     * zero-terminated, but this is not included in the resultant {@code length}.
     * The returned {@code contents} should be freed with g_free() when no longer
     * needed.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean loadContents(Cancellable cancellable, PointerByte contents, PointerLong length, PointerString etagOut) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_load_contents.invokeExact(handle(), cancellable.handle(), contents.handle(), length.handle(), etagOut.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_load_contents_async = Interop.downcallHandle(
        "g_file_load_contents_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default void loadContentsAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_load_contents_async.invokeExact(handle(), cancellable.handle(), 
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
    
    static final MethodHandle g_file_load_contents_finish = Interop.downcallHandle(
        "g_file_load_contents_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous load of the {@code file}'s contents.
     * The contents are placed in {@code contents}, and {@code length} is set to the
     * size of the {@code contents} string. The {@code contents} should be freed with
     * g_free() when no longer needed. If {@code etag_out} is present, it will be
     * set to the new entity tag for the {@code file}.
     */
    public default boolean loadContentsFinish(AsyncResult res, PointerByte contents, PointerLong length, PointerString etagOut) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_load_contents_finish.invokeExact(handle(), res.handle(), contents.handle(), length.handle(), etagOut.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_load_partial_contents_async = Interop.downcallHandle(
        "g_file_load_partial_contents_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads the partial contents of a file. A {@link FileReadMoreCallback} should
     * be used to stop reading from the file when appropriate, else this
     * function will behave exactly as g_file_load_contents_async(). This
     * operation can be finished by g_file_load_partial_contents_finish().
     * <p>
     * Users of this function should be aware that {@code user_data} is passed to
     * both the {@code read_more_callback} and the {@code callback}.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default void loadPartialContentsAsync(Cancellable cancellable, FileReadMoreCallback readMoreCallback, AsyncReadyCallback callback) {
        try {
            g_file_load_partial_contents_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbFileReadMoreCallback",
                            MethodType.methodType(int.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(int.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(readMoreCallback.hashCode(), readMoreCallback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_load_partial_contents_finish = Interop.downcallHandle(
        "g_file_load_partial_contents_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous partial load operation that was started
     * with g_file_load_partial_contents_async(). The data is always
     * zero-terminated, but this is not included in the resultant {@code length}.
     * The returned {@code contents} should be freed with g_free() when no longer
     * needed.
     */
    public default boolean loadPartialContentsFinish(AsyncResult res, PointerByte contents, PointerLong length, PointerString etagOut) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_load_partial_contents_finish.invokeExact(handle(), res.handle(), contents.handle(), length.handle(), etagOut.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_make_directory = Interop.downcallHandle(
        "g_file_make_directory",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean makeDirectory(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_make_directory.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_make_directory_async = Interop.downcallHandle(
        "g_file_make_directory_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously creates a directory.
     */
    public default void makeDirectoryAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_make_directory_async.invokeExact(handle(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_make_directory_finish = Interop.downcallHandle(
        "g_file_make_directory_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous directory creation, started with
     * g_file_make_directory_async().
     */
    public default boolean makeDirectoryFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_make_directory_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_make_directory_with_parents = Interop.downcallHandle(
        "g_file_make_directory_with_parents",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean makeDirectoryWithParents(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_make_directory_with_parents.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_make_symbolic_link = Interop.downcallHandle(
        "g_file_make_symbolic_link",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a symbolic link named {@code file} which contains the string
     * {@code symlink_value}.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean makeSymbolicLink(java.lang.String symlinkValue, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_make_symbolic_link.invokeExact(handle(), Interop.allocateNativeString(symlinkValue).handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_measure_disk_usage = Interop.downcallHandle(
        "g_file_measure_disk_usage",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Recursively measures the disk usage of {@code file}.
     * <p>
     * This is essentially an analog of the 'du' command, but it also
     * reports the number of directories and non-directory files encountered
     * (including things like symbolic links).
     * <p>
     * By default, errors are only reported against the toplevel file
     * itself.  Errors found while recursing are silently ignored, unless
     * {@link FileMeasureFlags#REPORT_ANY_ERROR} is given in {@code flags}.
     * <p>
     * The returned size, {@code disk_usage}, is in bytes and should be formatted
     * with g_format_size() in order to get something reasonable for showing
     * in a user interface.
     * <p>
     * {@code progress_callback} and {@code progress_data} can be given to request
     * periodic progress updates while scanning.  See the documentation for
     * {@link FileMeasureProgressCallback} for information about when and how the
     * callback will be invoked.
     */
    public default boolean measureDiskUsage(FileMeasureFlags flags, Cancellable cancellable, FileMeasureProgressCallback progressCallback, PointerLong diskUsage, PointerLong numDirs, PointerLong numFiles) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_measure_disk_usage.invokeExact(handle(), flags.getValue(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbFileMeasureProgressCallback",
                            MethodType.methodType(void.class, int.class, long.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)), diskUsage.handle(), numDirs.handle(), numFiles.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_measure_disk_usage_async = Interop.downcallHandle(
        "g_file_measure_disk_usage_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Recursively measures the disk usage of {@code file}.
     * <p>
     * This is the asynchronous version of g_file_measure_disk_usage().  See
     * there for more information.
     */
    public default void measureDiskUsageAsync(FileMeasureFlags flags, int ioPriority, Cancellable cancellable, FileMeasureProgressCallback progressCallback, AsyncReadyCallback callback) {
        try {
            g_file_measure_disk_usage_async.invokeExact(handle(), flags.getValue(), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbFileMeasureProgressCallback",
                            MethodType.methodType(void.class, int.class, long.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, int.class, long.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_measure_disk_usage_finish = Interop.downcallHandle(
        "g_file_measure_disk_usage_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Collects the results from an earlier call to
     * g_file_measure_disk_usage_async().  See g_file_measure_disk_usage() for
     * more information.
     */
    public default boolean measureDiskUsageFinish(AsyncResult result, PointerLong diskUsage, PointerLong numDirs, PointerLong numFiles) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_measure_disk_usage_finish.invokeExact(handle(), result.handle(), diskUsage.handle(), numDirs.handle(), numFiles.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_monitor = Interop.downcallHandle(
        "g_file_monitor",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains a file or directory monitor for the given file,
     * depending on the type of the file.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default FileMonitor monitor(FileMonitorFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_monitor.invokeExact(handle(), flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileMonitor(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_monitor_directory = Interop.downcallHandle(
        "g_file_monitor_directory",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains a directory monitor for the given file.
     * This may fail if directory monitoring is not supported.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * It does not make sense for {@code flags} to contain
     * {@link FileMonitorFlags#WATCH_HARD_LINKS}, since hard links can not be made to
     * directories.  It is not possible to monitor all the files in a
     * directory for changes made via hard links; if you want to do this then
     * you must register individual watches with g_file_monitor().
     */
    public default FileMonitor monitorDirectory(FileMonitorFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_monitor_directory.invokeExact(handle(), flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileMonitor(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_monitor_file = Interop.downcallHandle(
        "g_file_monitor_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains a file monitor for the given file. If no file notification
     * mechanism exists, then regular polling of the file is used.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
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
    public default FileMonitor monitorFile(FileMonitorFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_monitor_file.invokeExact(handle(), flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileMonitor(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_mount_enclosing_volume = Interop.downcallHandle(
        "g_file_mount_enclosing_volume",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Starts a {@code mount_operation}, mounting the volume that contains
     * the file {@code location}.
     * <p>
     * When this operation has completed, {@code callback} will be called with
     * {@code user_user} data, and the operation can be finalized with
     * g_file_mount_enclosing_volume_finish().
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default void mountEnclosingVolume(MountMountFlags flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_mount_enclosing_volume.invokeExact(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
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
    
    static final MethodHandle g_file_mount_enclosing_volume_finish = Interop.downcallHandle(
        "g_file_mount_enclosing_volume_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes a mount operation started by g_file_mount_enclosing_volume().
     */
    public default boolean mountEnclosingVolumeFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_mount_enclosing_volume_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_mount_mountable = Interop.downcallHandle(
        "g_file_mount_mountable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Mounts a file of type G_FILE_TYPE_MOUNTABLE.
     * Using {@code mount_operation}, you can request callbacks when, for instance,
     * passwords are needed during authentication.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_mount_mountable_finish() to get
     * the result of the operation.
     */
    public default void mountMountable(MountMountFlags flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_mount_mountable.invokeExact(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
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
    
    static final MethodHandle g_file_mount_mountable_finish = Interop.downcallHandle(
        "g_file_mount_mountable_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes a mount operation. See g_file_mount_mountable() for details.
     * <p>
     * Finish an asynchronous mount operation that was started
     * with g_file_mount_mountable().
     */
    public default File mountMountableFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_mount_mountable_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_move = Interop.downcallHandle(
        "g_file_move",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * If {@code progress_callback} is not {@code null}, then the operation can be monitored
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
    public default boolean move(File destination, FileCopyFlags flags, Cancellable cancellable, FileProgressCallback progressCallback) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_move.invokeExact(handle(), destination.handle(), flags.getValue(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbFileProgressCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_move_async = Interop.downcallHandle(
        "g_file_move_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously moves a file {@code source} to the location of {@code destination}. For details of the behaviour, see g_file_move().
     * <p>
     * If {@code progress_callback} is not {@code null}, then that function that will be called
     * just like in g_file_move(). The callback will run in the default main context
     * of the thread calling g_file_move_async() — the same context as {@code callback} is
     * run in.
     * <p>
     * When the operation is finished, {@code callback} will be called. You can then call
     * g_file_move_finish() to get the result of the operation.
     */
    public default void moveAsync(File destination, FileCopyFlags flags, int ioPriority, Cancellable cancellable, FileProgressCallback progressCallback, AsyncReadyCallback callback) {
        try {
            g_file_move_async.invokeExact(handle(), destination.handle(), flags.getValue(), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbFileProgressCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(progressCallback.hashCode(), progressCallback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_move_finish = Interop.downcallHandle(
        "g_file_move_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous file movement, started with
     * g_file_move_async().
     */
    public default boolean moveFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_move_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_open_readwrite = Interop.downcallHandle(
        "g_file_open_readwrite",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Opens an existing file for reading and writing. The result is
     * a {@link FileIOStream} that can be used to read and write the contents
     * of the file.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled
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
        try {
            var RESULT = (MemoryAddress) g_file_open_readwrite.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileIOStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_open_readwrite_async = Interop.downcallHandle(
        "g_file_open_readwrite_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
            g_file_open_readwrite_async.invokeExact(handle(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_open_readwrite_finish = Interop.downcallHandle(
        "g_file_open_readwrite_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous file read operation started with
     * g_file_open_readwrite_async().
     */
    public default FileIOStream openReadwriteFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_open_readwrite_finish.invokeExact(handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileIOStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_peek_path = Interop.downcallHandle(
        "g_file_peek_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_file_peek_path.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_poll_mountable = Interop.downcallHandle(
        "g_file_poll_mountable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Polls a file of type {@link FileType#MOUNTABLE}.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_mount_mountable_finish() to get
     * the result of the operation.
     */
    public default void pollMountable(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_poll_mountable.invokeExact(handle(), cancellable.handle(), 
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
    
    static final MethodHandle g_file_poll_mountable_finish = Interop.downcallHandle(
        "g_file_poll_mountable_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes a poll operation. See g_file_poll_mountable() for details.
     * <p>
     * Finish an asynchronous poll operation that was polled
     * with g_file_poll_mountable().
     */
    public default boolean pollMountableFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_poll_mountable_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_query_default_handler = Interop.downcallHandle(
        "g_file_query_default_handler",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@link AppInfo} that is registered as the default
     * application to handle the file specified by {@code file}.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default AppInfo queryDefaultHandler(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_query_default_handler.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new AppInfo.AppInfoImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_query_default_handler_async = Interop.downcallHandle(
        "g_file_query_default_handler_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Async version of g_file_query_default_handler().
     */
    public default void queryDefaultHandlerAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_query_default_handler_async.invokeExact(handle(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_query_default_handler_finish = Interop.downcallHandle(
        "g_file_query_default_handler_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes a g_file_query_default_handler_async() operation.
     */
    public default AppInfo queryDefaultHandlerFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_query_default_handler_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new AppInfo.AppInfoImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_query_exists = Interop.downcallHandle(
        "g_file_query_exists",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) g_file_query_exists.invokeExact(handle(), cancellable.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_query_file_type = Interop.downcallHandle(
        "g_file_query_file_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Utility function to inspect the {@link FileType} of a file. This is
     * implemented using g_file_query_info() and as such does blocking I/O.
     * <p>
     * The primary use case of this method is to check if a file is
     * a regular file, directory, or symlink.
     */
    public default FileType queryFileType(FileQueryInfoFlags flags, Cancellable cancellable) {
        try {
            var RESULT = (int) g_file_query_file_type.invokeExact(handle(), flags.getValue(), cancellable.handle());
            return new FileType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_query_filesystem_info = Interop.downcallHandle(
        "g_file_query_filesystem_info",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled
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
        try {
            var RESULT = (MemoryAddress) g_file_query_filesystem_info.invokeExact(handle(), Interop.allocateNativeString(attributes).handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileInfo(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_query_filesystem_info_async = Interop.downcallHandle(
        "g_file_query_filesystem_info_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
            g_file_query_filesystem_info_async.invokeExact(handle(), Interop.allocateNativeString(attributes).handle(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_query_filesystem_info_finish = Interop.downcallHandle(
        "g_file_query_filesystem_info_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous filesystem info query.
     * See g_file_query_filesystem_info_async().
     */
    public default FileInfo queryFilesystemInfoFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_query_filesystem_info_finish.invokeExact(handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileInfo(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_query_info = Interop.downcallHandle(
        "g_file_query_info",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled
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
    public default FileInfo queryInfo(java.lang.String attributes, FileQueryInfoFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_query_info.invokeExact(handle(), Interop.allocateNativeString(attributes).handle(), flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileInfo(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_query_info_async = Interop.downcallHandle(
        "g_file_query_info_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public default void queryInfoAsync(java.lang.String attributes, FileQueryInfoFlags flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_query_info_async.invokeExact(handle(), Interop.allocateNativeString(attributes).handle(), flags.getValue(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_query_info_finish = Interop.downcallHandle(
        "g_file_query_info_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous file info query.
     * See g_file_query_info_async().
     */
    public default FileInfo queryInfoFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_query_info_finish.invokeExact(handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileInfo(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_query_settable_attributes = Interop.downcallHandle(
        "g_file_query_settable_attributes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtain the list of settable attributes for the file.
     * <p>
     * Returns the type and full attribute name of all the attributes
     * that can be set on this file. This doesn't mean setting it will
     * always succeed though, you might get an access failure, or some
     * specific file may not support a specific attribute.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default FileAttributeInfoList querySettableAttributes(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_query_settable_attributes.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileAttributeInfoList(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_query_writable_namespaces = Interop.downcallHandle(
        "g_file_query_writable_namespaces",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtain the list of attribute namespaces where new attributes
     * can be created by a user. An example of this is extended
     * attributes (in the "xattr" namespace).
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default FileAttributeInfoList queryWritableNamespaces(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_query_writable_namespaces.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileAttributeInfoList(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_read = Interop.downcallHandle(
        "g_file_read",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Opens a file for reading. The result is a {@link FileInputStream} that
     * can be used to read the contents of the file.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
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
        try {
            var RESULT = (MemoryAddress) g_file_read.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileInputStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_read_async = Interop.downcallHandle(
        "g_file_read_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
            g_file_read_async.invokeExact(handle(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_read_finish = Interop.downcallHandle(
        "g_file_read_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous file read operation started with
     * g_file_read_async().
     */
    public default FileInputStream readFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_read_finish.invokeExact(handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileInputStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_replace = Interop.downcallHandle(
        "g_file_replace",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link IOErrorEnum#CANCELLED} will be
     * returned.
     * <p>
     * If you pass in a non-{@code null} {@code etag} value and {@code file} already exists, then
     * this value is compared to the current entity tag of the file, and if
     * they differ an {@link IOErrorEnum#WRONG_ETAG} error is returned. This
     * generally means that the file has been changed since you last read
     * it. You can get the new etag from g_file_output_stream_get_etag()
     * after you've finished writing and closed the {@link FileOutputStream}. When
     * you load a new file you can use g_file_input_stream_query_info() to
     * get the etag of the file.
     * <p>
     * If {@code make_backup} is {@code true}, this function will attempt to make a
     * backup of the current file before overwriting it. If this fails
     * a {@link IOErrorEnum#CANT_CREATE_BACKUP} error will be returned. If you
     * want to replace anyway, try again with {@code make_backup} set to {@code false}.
     * <p>
     * If the file is a directory the {@link IOErrorEnum#IS_DIRECTORY} error will
     * be returned, and if the file is some other form of non-regular file
     * then a {@link IOErrorEnum#NOT_REGULAR_FILE} error will be returned. Some
     * file systems don't allow all file names, and may return an
     * {@link IOErrorEnum#INVALID_FILENAME} error, and if the name is to long
     * {@link IOErrorEnum#FILENAME_TOO_LONG} will be returned. Other errors are
     * possible too, and depend on what kind of filesystem the file is on.
     */
    public default FileOutputStream replace(java.lang.String etag, boolean makeBackup, FileCreateFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_replace.invokeExact(handle(), Interop.allocateNativeString(etag).handle(), makeBackup ? 1 : 0, flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileOutputStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_replace_async = Interop.downcallHandle(
        "g_file_replace_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public default void replaceAsync(java.lang.String etag, boolean makeBackup, FileCreateFlags flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_replace_async.invokeExact(handle(), Interop.allocateNativeString(etag).handle(), makeBackup ? 1 : 0, flags.getValue(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_replace_contents = Interop.downcallHandle(
        "g_file_replace_contents",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Replaces the contents of {@code file} with {@code contents} of {@code length} bytes.
     * <p>
     * If {@code etag} is specified (not {@code null}), any existing file must have that etag,
     * or the error {@link IOErrorEnum#WRONG_ETAG} will be returned.
     * <p>
     * If {@code make_backup} is {@code true}, this function will attempt to make a backup
     * of {@code file}. Internally, it uses g_file_replace(), so will try to replace the
     * file contents in the safest way possible. For example, atomic renames are
     * used when replacing local files’ contents.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * The returned {@code new_etag} can be used to verify that the file hasn't
     * changed the next time it is saved over.
     */
    public default boolean replaceContents(byte[] contents, long length, java.lang.String etag, boolean makeBackup, FileCreateFlags flags, PointerString newEtag, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_replace_contents.invokeExact(handle(), Interop.allocateNativeArray(contents).handle(), length, Interop.allocateNativeString(etag).handle(), makeBackup ? 1 : 0, flags.getValue(), newEtag.handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_replace_contents_async = Interop.downcallHandle(
        "g_file_replace_contents_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Starts an asynchronous replacement of {@code file} with the given
     * {@code contents} of {@code length} bytes. {@code etag} will replace the document's
     * current entity tag.
     * <p>
     * When this operation has completed, {@code callback} will be called with
     * {@code user_user} data, and the operation can be finalized with
     * g_file_replace_contents_finish().
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * If {@code make_backup} is {@code true}, this function will attempt to
     * make a backup of {@code file}.
     * <p>
     * Note that no copy of {@code contents} will be made, so it must stay valid
     * until {@code callback} is called. See g_file_replace_contents_bytes_async()
     * for a {@link org.gtk.glib.Bytes} version that will automatically hold a reference to the
     * contents (without copying) for the duration of the call.
     */
    public default void replaceContentsAsync(byte[] contents, long length, java.lang.String etag, boolean makeBackup, FileCreateFlags flags, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_replace_contents_async.invokeExact(handle(), Interop.allocateNativeArray(contents).handle(), length, Interop.allocateNativeString(etag).handle(), makeBackup ? 1 : 0, flags.getValue(), cancellable.handle(), 
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
    
    static final MethodHandle g_file_replace_contents_bytes_async = Interop.downcallHandle(
        "g_file_replace_contents_bytes_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public default void replaceContentsBytesAsync(org.gtk.glib.Bytes contents, java.lang.String etag, boolean makeBackup, FileCreateFlags flags, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_replace_contents_bytes_async.invokeExact(handle(), contents.handle(), Interop.allocateNativeString(etag).handle(), makeBackup ? 1 : 0, flags.getValue(), cancellable.handle(), 
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
    
    static final MethodHandle g_file_replace_contents_finish = Interop.downcallHandle(
        "g_file_replace_contents_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous replace of the given {@code file}. See
     * g_file_replace_contents_async(). Sets {@code new_etag} to the new entity
     * tag for the document, if present.
     */
    public default boolean replaceContentsFinish(AsyncResult res, PointerString newEtag) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_replace_contents_finish.invokeExact(handle(), res.handle(), newEtag.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_replace_finish = Interop.downcallHandle(
        "g_file_replace_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous file replace operation started with
     * g_file_replace_async().
     */
    public default FileOutputStream replaceFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_replace_finish.invokeExact(handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileOutputStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_replace_readwrite = Interop.downcallHandle(
        "g_file_replace_readwrite",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public default FileIOStream replaceReadwrite(java.lang.String etag, boolean makeBackup, FileCreateFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_replace_readwrite.invokeExact(handle(), Interop.allocateNativeString(etag).handle(), makeBackup ? 1 : 0, flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileIOStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_replace_readwrite_async = Interop.downcallHandle(
        "g_file_replace_readwrite_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public default void replaceReadwriteAsync(java.lang.String etag, boolean makeBackup, FileCreateFlags flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_replace_readwrite_async.invokeExact(handle(), Interop.allocateNativeString(etag).handle(), makeBackup ? 1 : 0, flags.getValue(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_replace_readwrite_finish = Interop.downcallHandle(
        "g_file_replace_readwrite_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous file replace operation started with
     * g_file_replace_readwrite_async().
     */
    public default FileIOStream replaceReadwriteFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_replace_readwrite_finish.invokeExact(handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new FileIOStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_resolve_relative_path = Interop.downcallHandle(
        "g_file_resolve_relative_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Resolves a relative path for {@code file} to an absolute path.
     * <p>
     * This call does no blocking I/O.
     * <p>
     * If the {@code relative_path} is an absolute path name, the resolution
     * is done absolutely (without taking {@code file} path as base).
     */
    public default File resolveRelativePath(java.lang.String relativePath) {
        try {
            var RESULT = (MemoryAddress) g_file_resolve_relative_path.invokeExact(handle(), Interop.allocateNativeString(relativePath).handle());
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_set_attribute = Interop.downcallHandle(
        "g_file_set_attribute",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets an attribute in the file with attribute name {@code attribute} to {@code value_p}.
     * <p>
     * Some attributes can be unset by setting {@code type} to
     * {@link FileAttributeType#INVALID} and {@code value_p} to {@code null}.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttribute(java.lang.String attribute, FileAttributeType type, java.lang.foreign.MemoryAddress valueP, FileQueryInfoFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_set_attribute.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), type.getValue(), valueP, flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_set_attribute_byte_string = Interop.downcallHandle(
        "g_file_set_attribute_byte_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#BYTE_STRING} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail,
     * returning {@code false}.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttributeByteString(java.lang.String attribute, java.lang.String value, FileQueryInfoFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_set_attribute_byte_string.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), Interop.allocateNativeString(value).handle(), flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_set_attribute_int32 = Interop.downcallHandle(
        "g_file_set_attribute_int32",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#INT32} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttributeInt32(java.lang.String attribute, int value, FileQueryInfoFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_set_attribute_int32.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), value, flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_set_attribute_int64 = Interop.downcallHandle(
        "g_file_set_attribute_int64",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#INT64} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttributeInt64(java.lang.String attribute, long value, FileQueryInfoFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_set_attribute_int64.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), value, flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_set_attribute_string = Interop.downcallHandle(
        "g_file_set_attribute_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#STRING} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttributeString(java.lang.String attribute, java.lang.String value, FileQueryInfoFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_set_attribute_string.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), Interop.allocateNativeString(value).handle(), flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_set_attribute_uint32 = Interop.downcallHandle(
        "g_file_set_attribute_uint32",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#UINT32} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttributeUint32(java.lang.String attribute, int value, FileQueryInfoFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_set_attribute_uint32.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), value, flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_set_attribute_uint64 = Interop.downcallHandle(
        "g_file_set_attribute_uint64",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#UINT64} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttributeUint64(java.lang.String attribute, long value, FileQueryInfoFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_set_attribute_uint64.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), value, flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_set_attributes_async = Interop.downcallHandle(
        "g_file_set_attributes_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public default void setAttributesAsync(FileInfo info, FileQueryInfoFlags flags, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_set_attributes_async.invokeExact(handle(), info.handle(), flags.getValue(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_set_attributes_finish = Interop.downcallHandle(
        "g_file_set_attributes_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes setting an attribute started in g_file_set_attributes_async().
     */
    public default boolean setAttributesFinish(AsyncResult result, PointerProxy<FileInfo> info) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_set_attributes_finish.invokeExact(handle(), result.handle(), info.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_set_attributes_from_info = Interop.downcallHandle(
        "g_file_set_attributes_from_info",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean setAttributesFromInfo(FileInfo info, FileQueryInfoFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_set_attributes_from_info.invokeExact(handle(), info.handle(), flags.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_set_display_name = Interop.downcallHandle(
        "g_file_set_display_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default File setDisplayName(java.lang.String displayName, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_set_display_name.invokeExact(handle(), Interop.allocateNativeString(displayName).handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_set_display_name_async = Interop.downcallHandle(
        "g_file_set_display_name_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
            g_file_set_display_name_async.invokeExact(handle(), Interop.allocateNativeString(displayName).handle(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_set_display_name_finish = Interop.downcallHandle(
        "g_file_set_display_name_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes setting a display name started with
     * g_file_set_display_name_async().
     */
    public default File setDisplayNameFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_set_display_name_finish.invokeExact(handle(), res.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_start_mountable = Interop.downcallHandle(
        "g_file_start_mountable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Starts a file of type {@link FileType#MOUNTABLE}.
     * Using {@code start_operation}, you can request callbacks when, for instance,
     * passwords are needed during authentication.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_mount_mountable_finish() to get
     * the result of the operation.
     */
    public default void startMountable(DriveStartFlags flags, MountOperation startOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_start_mountable.invokeExact(handle(), flags.getValue(), startOperation.handle(), cancellable.handle(), 
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
    
    static final MethodHandle g_file_start_mountable_finish = Interop.downcallHandle(
        "g_file_start_mountable_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes a start operation. See g_file_start_mountable() for details.
     * <p>
     * Finish an asynchronous start operation that was started
     * with g_file_start_mountable().
     */
    public default boolean startMountableFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_start_mountable_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_stop_mountable = Interop.downcallHandle(
        "g_file_stop_mountable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Stops a file of type {@link FileType#MOUNTABLE}.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_stop_mountable_finish() to get
     * the result of the operation.
     */
    public default void stopMountable(MountUnmountFlags flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_stop_mountable.invokeExact(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
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
    
    static final MethodHandle g_file_stop_mountable_finish = Interop.downcallHandle(
        "g_file_stop_mountable_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes a stop operation, see g_file_stop_mountable() for details.
     * <p>
     * Finish an asynchronous stop operation that was started
     * with g_file_stop_mountable().
     */
    public default boolean stopMountableFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_stop_mountable_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_supports_thread_contexts = Interop.downcallHandle(
        "g_file_supports_thread_contexts",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code file} supports
     * [thread-default contexts][g-main-context-push-thread-default-context].
     * If this returns {@code false}, you cannot perform asynchronous operations on
     * {@code file} in a thread that has a thread-default context.
     */
    public default boolean supportsThreadContexts() {
        try {
            var RESULT = (int) g_file_supports_thread_contexts.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_trash = Interop.downcallHandle(
        "g_file_trash",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sends {@code file} to the "Trashcan", if possible. This is similar to
     * deleting it, but the user can recover it before emptying the trashcan.
     * Not all file systems support trashing, so this call can return the
     * {@link IOErrorEnum#NOT_SUPPORTED} error. Since GLib 2.66, the {@code x-gvfs-notrash} unix
     * mount option can be used to disable g_file_trash() support for certain
     * mounts, the {@link IOErrorEnum#NOT_SUPPORTED} error will be returned in that case.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean trash(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_trash.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_trash_async = Interop.downcallHandle(
        "g_file_trash_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously sends {@code file} to the Trash location, if possible.
     */
    public default void trashAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_trash_async.invokeExact(handle(), ioPriority, cancellable.handle(), 
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
    
    static final MethodHandle g_file_trash_finish = Interop.downcallHandle(
        "g_file_trash_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous file trashing operation, started with
     * g_file_trash_async().
     */
    public default boolean trashFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_trash_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_unmount_mountable_with_operation = Interop.downcallHandle(
        "g_file_unmount_mountable_with_operation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unmounts a file of type {@link FileType#MOUNTABLE}.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_unmount_mountable_finish() to get
     * the result of the operation.
     */
    public default void unmountMountableWithOperation(MountUnmountFlags flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_file_unmount_mountable_with_operation.invokeExact(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
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
    
    static final MethodHandle g_file_unmount_mountable_with_operation_finish = Interop.downcallHandle(
        "g_file_unmount_mountable_with_operation_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an unmount operation,
     * see g_file_unmount_mountable_with_operation() for details.
     * <p>
     * Finish an asynchronous unmount operation that was started
     * with g_file_unmount_mountable_with_operation().
     */
    public default boolean unmountMountableWithOperationFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_unmount_mountable_with_operation_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_new_for_commandline_arg = Interop.downcallHandle(
        "g_file_new_for_commandline_arg",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_file_new_for_commandline_arg.invokeExact(Interop.allocateNativeString(arg).handle());
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_new_for_commandline_arg_and_cwd = Interop.downcallHandle(
        "g_file_new_for_commandline_arg_and_cwd",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_file_new_for_commandline_arg_and_cwd.invokeExact(Interop.allocateNativeString(arg).handle(), Interop.allocateNativeString(cwd).handle());
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_new_for_path = Interop.downcallHandle(
        "g_file_new_for_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Constructs a {@link File} for a given path. This operation never
     * fails, but the returned object might not support any I/O
     * operation if {@code path} is malformed.
     */
    public static File newForPath(java.lang.String path) {
        try {
            var RESULT = (MemoryAddress) g_file_new_for_path.invokeExact(Interop.allocateNativeString(path).handle());
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_new_for_uri = Interop.downcallHandle(
        "g_file_new_for_uri",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Constructs a {@link File} for a given URI. This operation never
     * fails, but the returned object might not support any I/O
     * operation if {@code uri} is malformed or if the uri type is
     * not supported.
     */
    public static File newForUri(java.lang.String uri) {
        try {
            var RESULT = (MemoryAddress) g_file_new_for_uri.invokeExact(Interop.allocateNativeString(uri).handle());
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_new_tmp = Interop.downcallHandle(
        "g_file_new_tmp",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Opens a file in the preferred directory for temporary files (as
     * returned by g_get_tmp_dir()) and returns a {@link File} and
     * {@link FileIOStream} pointing to it.
     * <p>
     * {@code tmpl} should be a string in the GLib file name encoding
     * containing a sequence of six 'X' characters, and containing no
     * directory components. If it is {@code null}, a default template is used.
     * <p>
     * Unlike the other {@link File} constructors, this will return {@code null} if
     * a temporary file could not be created.
     */
    public static File newTmp(java.lang.String tmpl, PointerProxy<FileIOStream> iostream) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_new_tmp.invokeExact(Interop.allocateNativeString(tmpl).handle(), iostream.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_parse_name = Interop.downcallHandle(
        "g_file_parse_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Constructs a {@link File} with the given {@code parse_name} (i.e. something
     * given by g_file_get_parse_name()). This operation never fails,
     * but the returned object might not support any I/O operation if
     * the {@code parse_name} cannot be parsed.
     */
    public static File parseName(java.lang.String parseName) {
        try {
            var RESULT = (MemoryAddress) g_file_parse_name.invokeExact(Interop.allocateNativeString(parseName).handle());
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class FileImpl extends org.gtk.gobject.Object implements File {
        public FileImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
