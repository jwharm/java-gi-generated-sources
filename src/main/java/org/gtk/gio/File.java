package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>Entity Tags # {#gfile-etag}</strong><br/>
 * One notable feature of {@code GFiles} are entity tags, or "etags" for
 * short. Entity tags are somewhat like a more abstract version of the
 * traditional mtime, and can be used to quickly determine if the file
 * has been modified from the version on the file system. See the
 * HTTP 1.1
 * <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html">specification</a>
 * for HTTP Etag headers, which are a very similar concept.
 */
public interface File extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to File if its GType is a (or inherits from) "GFile".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "File" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GFile", a ClassCastException will be thrown.
     */
    public static File castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GFile"))) {
            return new FileImpl(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GFile");
        }
    }
    
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
     * @param flags a set of {@link FileCreateFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return a {@link FileOutputStream}, or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileOutputStream appendTo(@NotNull org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_append_to.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileOutputStream(Refcounted.get(RESULT, true));
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
     * @param flags a set of {@link FileCreateFlags}
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void appendToAsync(@NotNull org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_append_to_async.invokeExact(
                    handle(),
                    flags.getValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous file append operation started with
     * g_file_append_to_async().
     * @param res {@link AsyncResult}
     * @return a valid {@link FileOutputStream}
     *   or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileOutputStream appendToFinish(@NotNull org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_append_to_finish.invokeExact(
                    handle(),
                    res.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileOutputStream(Refcounted.get(RESULT, true));
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
     * @param flags a set of {@link FileCopyFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return an attribute query string for g_file_query_info(),
     *   or {@code null} if an error occurs.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull java.lang.String buildAttributeListForCopy(@NotNull org.gtk.gio.FileCopyFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_build_attribute_list_for_copy.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Interop.getStringFrom(RESULT);
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
     * @param destination destination {@link File}
     * @param flags set of {@link FileCopyFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param progressCallback function to callback with
     *   progress information, or {@code null} if progress information is not needed
     * @return {@code true} on success, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean copy(@NotNull org.gtk.gio.File destination, @NotNull org.gtk.gio.FileCopyFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileProgressCallback progressCallback) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(destination, "Parameter 'destination' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_copy.invokeExact(
                    handle(),
                    destination.handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbFileProgressCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : Interop.registerCallback(progressCallback)), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
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
     * @param destination destination {@link File}
     * @param flags set of {@link FileCopyFlags}
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param progressCallback function to callback with progress
     *   information, or {@code null} if progress information is not needed
     * @param callback a {@link AsyncReadyCallback} to call when the request is satisfied
     */
    default void copyAsync(@NotNull org.gtk.gio.File destination, @NotNull org.gtk.gio.FileCopyFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileProgressCallback progressCallback, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(destination, "Parameter 'destination' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_copy_async.invokeExact(
                    handle(),
                    destination.handle(),
                    flags.getValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbFileProgressCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : Interop.registerCallback(progressCallback)),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : Interop.registerCallback(progressCallback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     * @param destination a {@link File} to copy attributes to
     * @param flags a set of {@link FileCopyFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code true} if the attributes were copied successfully,
     *   {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean copyAttributes(@NotNull org.gtk.gio.File destination, @NotNull org.gtk.gio.FileCopyFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(destination, "Parameter 'destination' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_copy_attributes.invokeExact(
                    handle(),
                    destination.handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Finishes copying the file started with g_file_copy_async().
     * @param res a {@link AsyncResult}
     * @return a {@code true} on success, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean copyFinish(@NotNull org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_copy_finish.invokeExact(
                    handle(),
                    res.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
     * @param flags a set of {@link FileCreateFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return a {@link FileOutputStream} for the newly created
     *   file, or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileOutputStream create(@NotNull org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_create.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileOutputStream(Refcounted.get(RESULT, true));
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
     * @param flags a set of {@link FileCreateFlags}
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void createAsync(@NotNull org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_create_async.invokeExact(
                    handle(),
                    flags.getValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous file create operation started with
     * g_file_create_async().
     * @param res a {@link AsyncResult}
     * @return a {@link FileOutputStream} or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileOutputStream createFinish(@NotNull org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_create_finish.invokeExact(
                    handle(),
                    res.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileOutputStream(Refcounted.get(RESULT, true));
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
     * @param flags a set of {@link FileCreateFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return a {@link FileIOStream} for the newly created
     *   file, or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileIOStream createReadwrite(@NotNull org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_create_readwrite.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileIOStream(Refcounted.get(RESULT, true));
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
     * @param flags a set of {@link FileCreateFlags}
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void createReadwriteAsync(@NotNull org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_create_readwrite_async.invokeExact(
                    handle(),
                    flags.getValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous file create operation started with
     * g_file_create_readwrite_async().
     * @param res a {@link AsyncResult}
     * @return a {@link FileIOStream} or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileIOStream createReadwriteFinish(@NotNull org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_create_readwrite_finish.invokeExact(
                    handle(),
                    res.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileIOStream(Refcounted.get(RESULT, true));
    }
    
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
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code true} if the file was deleted. {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean delete(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_delete.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Asynchronously delete a file. If the {@code file} is a directory, it will
     * only be deleted if it is empty.  This has the same semantics as
     * g_unlink().
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void deleteAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_file_delete_async.invokeExact(
                    handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes deleting a file started with g_file_delete_async().
     * @param result a {@link AsyncResult}
     * @return {@code true} if the file was deleted. {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean deleteFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_delete_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
     * @return a new {@link File} that is a duplicate
     *   of the given {@link File}.
     */
    default @NotNull org.gtk.gio.File dup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_dup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Starts an asynchronous eject on a mountable.
     * When this operation has completed, {@code callback} will be called with
     * {@code user_user} data, and the operation can be finalized with
     * g_file_eject_mountable_finish().
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param flags flags affecting the operation
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied, or {@code null}
     * @deprecated Use g_file_eject_mountable_with_operation() instead.
     */
    @Deprecated
    default void ejectMountable(@NotNull org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_eject_mountable.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous eject operation started by
     * g_file_eject_mountable().
     * @param result a {@link AsyncResult}
     * @return {@code true} if the {@code file} was ejected successfully.
     *   {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use g_file_eject_mountable_with_operation_finish()
     *   instead.
     */
    @Deprecated
    default boolean ejectMountableFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_eject_mountable_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Starts an asynchronous eject on a mountable.
     * When this operation has completed, {@code callback} will be called with
     * {@code user_user} data, and the operation can be finalized with
     * g_file_eject_mountable_with_operation_finish().
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param flags flags affecting the operation
     * @param mountOperation a {@link MountOperation},
     *   or {@code null} to avoid user interaction
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied, or {@code null}
     */
    default void ejectMountableWithOperation(@NotNull org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_eject_mountable_with_operation.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (mountOperation == null ? MemoryAddress.NULL : mountOperation.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous eject operation started by
     * g_file_eject_mountable_with_operation().
     * @param result a {@link AsyncResult}
     * @return {@code true} if the {@code file} was ejected successfully.
     *   {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean ejectMountableWithOperationFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_eject_mountable_with_operation_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link IOErrorEnum#CANCELLED} will be
     * returned.
     * <p>
     * If the file does not exist, the {@link IOErrorEnum#NOT_FOUND} error will
     * be returned. If the file is not a directory, the {@link IOErrorEnum#NOT_DIRECTORY}
     * error will be returned. Other errors are possible too.
     * @param attributes an attribute query string
     * @param flags a set of {@link FileQueryInfoFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return A {@link FileEnumerator} if successful,
     *   {@code null} on error. Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileEnumerator enumerateChildren(@NotNull java.lang.String attributes, @NotNull org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(attributes, "Parameter 'attributes' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_enumerate_children.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attributes),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileEnumerator(Refcounted.get(RESULT, true));
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
     * @param attributes an attribute query string
     * @param flags a set of {@link FileQueryInfoFlags}
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call when the
     *   request is satisfied
     */
    default void enumerateChildrenAsync(@NotNull java.lang.String attributes, @NotNull org.gtk.gio.FileQueryInfoFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(attributes, "Parameter 'attributes' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_enumerate_children_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attributes),
                    flags.getValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an async enumerate children operation.
     * See g_file_enumerate_children_async().
     * @param res a {@link AsyncResult}
     * @return a {@link FileEnumerator} or {@code null}
     *   if an error occurred.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileEnumerator enumerateChildrenFinish(@NotNull org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_enumerate_children_finish.invokeExact(
                    handle(),
                    res.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileEnumerator(Refcounted.get(RESULT, true));
    }
    
    /**
     * Checks if the two given {@code GFiles} refer to the same file.
     * <p>
     * Note that two {@code GFiles} that differ can still refer to the same
     * file on the filesystem due to various forms of filename
     * aliasing.
     * <p>
     * This call does no blocking I/O.
     * @param file2 the second {@link File}
     * @return {@code true} if {@code file1} and {@code file2} are equal.
     */
    default boolean equal(@NotNull org.gtk.gio.File file2) {
        java.util.Objects.requireNonNull(file2, "Parameter 'file2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_equal.invokeExact(
                    handle(),
                    file2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return a {@link Mount} where the {@code file} is located
     *   or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.Mount findEnclosingMount(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_find_enclosing_mount.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.Mount.MountImpl(Refcounted.get(RESULT, true));
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
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void findEnclosingMountAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_file_find_enclosing_mount_async.invokeExact(
                    handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous find mount request.
     * See g_file_find_enclosing_mount_async().
     * @param res a {@link AsyncResult}
     * @return {@link Mount} for given {@code file} or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.Mount findEnclosingMountFinish(@NotNull org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_find_enclosing_mount_finish.invokeExact(
                    handle(),
                    res.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.Mount.MountImpl(Refcounted.get(RESULT, true));
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
     * @return string containing the {@link File}'s
     *   base name, or {@code null} if given {@link File} is invalid. The returned string
     *   should be freed with g_free() when no longer needed.
     */
    default @Nullable java.lang.String getBasename() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_get_basename.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets a child of {@code file} with basename equal to {@code name}.
     * <p>
     * Note that the file with that specific name might not exist, but
     * you can still have a {@link File} that points to it. You can use this
     * for instance to create that file.
     * <p>
     * This call does no blocking I/O.
     * @param name string containing the child's basename
     * @return a {@link File} to a child specified by {@code name}.
     *   Free the returned object with g_object_unref().
     */
    default @NotNull org.gtk.gio.File getChild(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_get_child.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the child of {@code file} for a given {@code display_name} (i.e. a UTF-8
     * version of the name). If this function fails, it returns {@code null}
     * and {@code error} will be set. This is very useful when constructing a
     * {@link File} for a new file and the user entered the filename in the
     * user interface, for instance when you select a directory and
     * type a filename in the file selector.
     * <p>
     * This call does no blocking I/O.
     * @param displayName string to a possible child
     * @return a {@link File} to the specified child, or
     *   {@code null} if the display name couldn't be converted.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.File getChildForDisplayName(@NotNull java.lang.String displayName) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(displayName, "Parameter 'displayName' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_get_child_for_display_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(displayName), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the parent directory for the {@code file}.
     * If the {@code file} represents the root directory of the
     * file system, then {@code null} will be returned.
     * <p>
     * This call does no blocking I/O.
     * @return a {@link File} structure to the
     *   parent of the given {@link File} or {@code null} if there is no parent. Free
     *   the returned object with g_object_unref().
     */
    default @Nullable org.gtk.gio.File getParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_get_parent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
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
     * @return a string containing the {@link File}'s parse name.
     *   The returned string should be freed with g_free()
     *   when no longer needed.
     */
    default @NotNull java.lang.String getParseName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_get_parse_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the local pathname for {@link File}, if one exists. If non-{@code null}, this is
     * guaranteed to be an absolute, canonical path. It might contain symlinks.
     * <p>
     * This call does no blocking I/O.
     * @return string containing the {@link File}'s path,
     *   or {@code null} if no such path exists. The returned string should be freed
     *   with g_free() when no longer needed.
     */
    default @Nullable java.lang.String getPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_get_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the path for {@code descendant} relative to {@code parent}.
     * <p>
     * This call does no blocking I/O.
     * @param descendant input {@link File}
     * @return string with the relative path from
     *   {@code descendant} to {@code parent}, or {@code null} if {@code descendant} doesn't have {@code parent} as
     *   prefix. The returned string should be freed with g_free() when
     *   no longer needed.
     */
    default @Nullable java.lang.String getRelativePath(@NotNull org.gtk.gio.File descendant) {
        java.util.Objects.requireNonNull(descendant, "Parameter 'descendant' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_get_relative_path.invokeExact(
                    handle(),
                    descendant.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the URI for the {@code file}.
     * <p>
     * This call does no blocking I/O.
     * @return a string containing the {@link File}'s URI. If the {@link File} was constructed
     *   with an invalid URI, an invalid URI is returned.
     *   The returned string should be freed with g_free()
     *   when no longer needed.
     */
    default @NotNull java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_get_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
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
     * @return a string containing the URI scheme for the given
     *   {@link File} or {@code null} if the {@link File} was constructed with an invalid URI. The
     *   returned string should be freed with g_free() when no longer needed.
     */
    default @Nullable java.lang.String getUriScheme() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_get_uri_scheme.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Checks if {@code file} has a parent, and optionally, if it is {@code parent}.
     * <p>
     * If {@code parent} is {@code null} then this function returns {@code true} if {@code file} has any
     * parent at all.  If {@code parent} is non-{@code null} then {@code true} is only returned
     * if {@code file} is an immediate child of {@code parent}.
     * @param parent the parent to check for, or {@code null}
     * @return {@code true} if {@code file} is an immediate child of {@code parent} (or any parent in
     *   the case that {@code parent} is {@code null}).
     */
    default boolean hasParent(@Nullable org.gtk.gio.File parent) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_has_parent.invokeExact(
                    handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
     * sometimes return {@code false} even if {@code file} is inside a {@code prefix} (from a
     * filesystem point of view), because the prefix of {@code file} is an alias
     * of {@code prefix}.
     * @param prefix input {@link File}
     * @return {@code true} if the {@code file}'s parent, grandparent, etc is {@code prefix},
     *   {@code false} otherwise.
     */
    default boolean hasPrefix(@NotNull org.gtk.gio.File prefix) {
        java.util.Objects.requireNonNull(prefix, "Parameter 'prefix' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_has_prefix.invokeExact(
                    handle(),
                    prefix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks to see if a {@link File} has a given URI scheme.
     * <p>
     * This call does no blocking I/O.
     * @param uriScheme a string containing a URI scheme
     * @return {@code true} if {@link File}'s backend supports the
     *   given URI scheme, {@code false} if URI scheme is {@code null},
     *   not supported, or {@link File} is invalid.
     */
    default boolean hasUriScheme(@NotNull java.lang.String uriScheme) {
        java.util.Objects.requireNonNull(uriScheme, "Parameter 'uriScheme' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_has_uri_scheme.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uriScheme));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates a hash value for a {@link File}.
     * <p>
     * This call does no blocking I/O.
     * @return 0 if {@code file} is not a valid {@link File}, otherwise an
     *   integer that can be used as hash value for the {@link File}.
     *   This function is intended for easily hashing a {@link File} to
     *   add to a {@link org.gtk.glib.HashTable} or similar data structure.
     */
    default int hash() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_hash.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * will return {@code false}, but g_file_get_path() will still return a native path.
     * <p>
     * This call does no blocking I/O.
     * @return {@code true} if {@code file} is native
     */
    default boolean isNative() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_is_native.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @param cancellable a {@link Cancellable} or {@code null}
     * @param etagOut a location to place the current
     *   entity tag for the file, or {@code null} if the entity tag is not needed
     * @return a {@link org.gtk.glib.Bytes} or {@code null} and {@code error} is set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.glib.Bytes loadBytes(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable Out<java.lang.String> etagOut) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment etagOutPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_load_bytes.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (etagOut == null ? MemoryAddress.NULL : (Addressable) etagOutPOINTER.address()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        if (etagOut != null) etagOut.set(Interop.getStringFrom(etagOutPOINTER.get(ValueLayout.ADDRESS, 0)));
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
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
     * @param cancellable a {@link Cancellable} or {@code null}
     * @param callback a {@link AsyncReadyCallback} to call when the
     *   request is satisfied
     */
    default void loadBytesAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_file_load_bytes_async.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param result a {@link AsyncResult} provided to the callback
     * @param etagOut a location to place the current
     *   entity tag for the file, or {@code null} if the entity tag is not needed
     * @return a {@link org.gtk.glib.Bytes} or {@code null} and {@code error} is set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.glib.Bytes loadBytesFinish(@NotNull org.gtk.gio.AsyncResult result, @Nullable Out<java.lang.String> etagOut) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment etagOutPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_load_bytes_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) (etagOut == null ? MemoryAddress.NULL : (Addressable) etagOutPOINTER.address()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        if (etagOut != null) etagOut.set(Interop.getStringFrom(etagOutPOINTER.get(ValueLayout.ADDRESS, 0)));
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
    }
    
    /**
     * Loads the content of the file into memory. The data is always
     * zero-terminated, but this is not included in the resultant {@code length}.
     * The returned {@code contents} should be freed with g_free() when no longer
     * needed.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param contents a location to place the contents of the file
     * @param length a location to place the length of the contents of the file,
     *   or {@code null} if the length is not needed
     * @param etagOut a location to place the current entity tag for the file,
     *   or {@code null} if the entity tag is not needed
     * @return {@code true} if the {@code file}'s contents were successfully loaded.
     *   {@code false} if there were errors.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean loadContents(@Nullable org.gtk.gio.Cancellable cancellable, Out<byte[]> contents, Out<Long> length, @Nullable Out<java.lang.String> etagOut) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(contents, "Parameter 'contents' must not be null");
        java.util.Objects.requireNonNull(length, "Parameter 'length' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment contentsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemorySegment etagOutPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_load_contents.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) contentsPOINTER.address(),
                    (Addressable) lengthPOINTER.address(),
                    (Addressable) (etagOut == null ? MemoryAddress.NULL : (Addressable) etagOutPOINTER.address()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (etagOut != null) etagOut.set(Interop.getStringFrom(etagOutPOINTER.get(ValueLayout.ADDRESS, 0)));
        contents.set(MemorySegment.ofAddress(contentsPOINTER.get(ValueLayout.ADDRESS, 0), length.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE));
        return RESULT != 0;
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call when the request is satisfied
     */
    default void loadContentsAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_file_load_contents_async.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous load of the {@code file}'s contents.
     * The contents are placed in {@code contents}, and {@code length} is set to the
     * size of the {@code contents} string. The {@code contents} should be freed with
     * g_free() when no longer needed. If {@code etag_out} is present, it will be
     * set to the new entity tag for the {@code file}.
     * @param res a {@link AsyncResult}
     * @param contents a location to place the contents of the file
     * @param length a location to place the length of the contents of the file,
     *   or {@code null} if the length is not needed
     * @param etagOut a location to place the current entity tag for the file,
     *   or {@code null} if the entity tag is not needed
     * @return {@code true} if the load was successful. If {@code false} and {@code error} is
     *   present, it will be set appropriately.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean loadContentsFinish(@NotNull org.gtk.gio.AsyncResult res, Out<byte[]> contents, Out<Long> length, @Nullable Out<java.lang.String> etagOut) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        java.util.Objects.requireNonNull(contents, "Parameter 'contents' must not be null");
        java.util.Objects.requireNonNull(length, "Parameter 'length' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment contentsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemorySegment etagOutPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_load_contents_finish.invokeExact(
                    handle(),
                    res.handle(),
                    (Addressable) contentsPOINTER.address(),
                    (Addressable) lengthPOINTER.address(),
                    (Addressable) (etagOut == null ? MemoryAddress.NULL : (Addressable) etagOutPOINTER.address()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (etagOut != null) etagOut.set(Interop.getStringFrom(etagOutPOINTER.get(ValueLayout.ADDRESS, 0)));
        contents.set(MemorySegment.ofAddress(contentsPOINTER.get(ValueLayout.ADDRESS, 0), length.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE));
        return RESULT != 0;
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param readMoreCallback a
     *   {@link FileReadMoreCallback} to receive partial data
     *   and to specify whether further data should be read
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void loadPartialContentsAsync(@Nullable org.gtk.gio.Cancellable cancellable, @NotNull org.gtk.gio.FileReadMoreCallback readMoreCallback, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(readMoreCallback, "Parameter 'readMoreCallback' must not be null");
        try {
            DowncallHandles.g_file_load_partial_contents_async.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbFileReadMoreCallback",
                            MethodType.methodType(int.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(int.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (Interop.registerCallback(readMoreCallback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous partial load operation that was started
     * with g_file_load_partial_contents_async(). The data is always
     * zero-terminated, but this is not included in the resultant {@code length}.
     * The returned {@code contents} should be freed with g_free() when no longer
     * needed.
     * @param res a {@link AsyncResult}
     * @param contents a location to place the contents of the file
     * @param length a location to place the length of the contents of the file,
     *   or {@code null} if the length is not needed
     * @param etagOut a location to place the current entity tag for the file,
     *   or {@code null} if the entity tag is not needed
     * @return {@code true} if the load was successful. If {@code false} and {@code error} is
     *   present, it will be set appropriately.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean loadPartialContentsFinish(@NotNull org.gtk.gio.AsyncResult res, Out<byte[]> contents, Out<Long> length, @Nullable Out<java.lang.String> etagOut) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        java.util.Objects.requireNonNull(contents, "Parameter 'contents' must not be null");
        java.util.Objects.requireNonNull(length, "Parameter 'length' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment contentsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemorySegment etagOutPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_load_partial_contents_finish.invokeExact(
                    handle(),
                    res.handle(),
                    (Addressable) contentsPOINTER.address(),
                    (Addressable) lengthPOINTER.address(),
                    (Addressable) (etagOut == null ? MemoryAddress.NULL : (Addressable) etagOutPOINTER.address()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (etagOut != null) etagOut.set(Interop.getStringFrom(etagOutPOINTER.get(ValueLayout.ADDRESS, 0)));
        contents.set(MemorySegment.ofAddress(contentsPOINTER.get(ValueLayout.ADDRESS, 0), length.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE));
        return RESULT != 0;
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code true} on successful creation, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean makeDirectory(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_make_directory.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Asynchronously creates a directory.
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void makeDirectoryAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_file_make_directory_async.invokeExact(
                    handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous directory creation, started with
     * g_file_make_directory_async().
     * @param result a {@link AsyncResult}
     * @return {@code true} on successful directory creation, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean makeDirectoryFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_make_directory_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code true} if all directories have been successfully created, {@code false}
     * otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean makeDirectoryWithParents(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_make_directory_with_parents.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates a symbolic link named {@code file} which contains the string
     * {@code symlink_value}.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param symlinkValue a string with the path for the target
     *   of the new symlink
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code true} on the creation of a new symlink, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean makeSymbolicLink(@NotNull java.lang.String symlinkValue, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(symlinkValue, "Parameter 'symlinkValue' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_make_symbolic_link.invokeExact(
                    handle(),
                    Interop.allocateNativeString(symlinkValue),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
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
     * @param flags {@link FileMeasureFlags}
     * @param cancellable optional {@link Cancellable}
     * @param progressCallback a {@link FileMeasureProgressCallback}
     * @param diskUsage the number of bytes of disk space used
     * @param numDirs the number of directories encountered
     * @param numFiles the number of non-directories encountered
     * @return {@code true} if successful, with the out parameters set.
     *   {@code false} otherwise, with {@code error} set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean measureDiskUsage(@NotNull org.gtk.gio.FileMeasureFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileMeasureProgressCallback progressCallback, Out<Long> diskUsage, Out<Long> numDirs, Out<Long> numFiles) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(diskUsage, "Parameter 'diskUsage' must not be null");
        java.util.Objects.requireNonNull(numDirs, "Parameter 'numDirs' must not be null");
        java.util.Objects.requireNonNull(numFiles, "Parameter 'numFiles' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment diskUsagePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemorySegment numDirsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemorySegment numFilesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_measure_disk_usage.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbFileMeasureProgressCallback",
                            MethodType.methodType(void.class, int.class, long.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : Interop.registerCallback(progressCallback)),
                    (Addressable) diskUsagePOINTER.address(),
                    (Addressable) numDirsPOINTER.address(),
                    (Addressable) numFilesPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        diskUsage.set(diskUsagePOINTER.get(ValueLayout.JAVA_LONG, 0));
        numDirs.set(numDirsPOINTER.get(ValueLayout.JAVA_LONG, 0));
        numFiles.set(numFilesPOINTER.get(ValueLayout.JAVA_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Recursively measures the disk usage of {@code file}.
     * <p>
     * This is the asynchronous version of g_file_measure_disk_usage().  See
     * there for more information.
     * @param flags {@link FileMeasureFlags}
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable}
     * @param progressCallback a {@link FileMeasureProgressCallback}
     * @param callback a {@link AsyncReadyCallback} to call when complete
     */
    default void measureDiskUsageAsync(@NotNull org.gtk.gio.FileMeasureFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileMeasureProgressCallback progressCallback, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_measure_disk_usage_async.invokeExact(
                    handle(),
                    flags.getValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbFileMeasureProgressCallback",
                            MethodType.methodType(void.class, int.class, long.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : Interop.registerCallback(progressCallback)),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, int.class, long.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : Interop.registerCallback(progressCallback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Collects the results from an earlier call to
     * g_file_measure_disk_usage_async().  See g_file_measure_disk_usage() for
     * more information.
     * @param result the {@link AsyncResult} passed to your {@link AsyncReadyCallback}
     * @param diskUsage the number of bytes of disk space used
     * @param numDirs the number of directories encountered
     * @param numFiles the number of non-directories encountered
     * @return {@code true} if successful, with the out parameters set.
     *   {@code false} otherwise, with {@code error} set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean measureDiskUsageFinish(@NotNull org.gtk.gio.AsyncResult result, Out<Long> diskUsage, Out<Long> numDirs, Out<Long> numFiles) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        java.util.Objects.requireNonNull(diskUsage, "Parameter 'diskUsage' must not be null");
        java.util.Objects.requireNonNull(numDirs, "Parameter 'numDirs' must not be null");
        java.util.Objects.requireNonNull(numFiles, "Parameter 'numFiles' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment diskUsagePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemorySegment numDirsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemorySegment numFilesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_measure_disk_usage_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) diskUsagePOINTER.address(),
                    (Addressable) numDirsPOINTER.address(),
                    (Addressable) numFilesPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        diskUsage.set(diskUsagePOINTER.get(ValueLayout.JAVA_LONG, 0));
        numDirs.set(numDirsPOINTER.get(ValueLayout.JAVA_LONG, 0));
        numFiles.set(numFilesPOINTER.get(ValueLayout.JAVA_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Obtains a file or directory monitor for the given file,
     * depending on the type of the file.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param flags a set of {@link FileMonitorFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return a {@link FileMonitor} for the given {@code file},
     *   or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileMonitor monitor(@NotNull org.gtk.gio.FileMonitorFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_monitor.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileMonitor(Refcounted.get(RESULT, true));
    }
    
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
     * @param flags a set of {@link FileMonitorFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return a {@link FileMonitor} for the given {@code file},
     *   or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileMonitor monitorDirectory(@NotNull org.gtk.gio.FileMonitorFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_monitor_directory.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileMonitor(Refcounted.get(RESULT, true));
    }
    
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
     * @param flags a set of {@link FileMonitorFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return a {@link FileMonitor} for the given {@code file},
     *   or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileMonitor monitorFile(@NotNull org.gtk.gio.FileMonitorFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_monitor_file.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileMonitor(Refcounted.get(RESULT, true));
    }
    
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
     * @param flags flags affecting the operation
     * @param mountOperation a {@link MountOperation}
     *   or {@code null} to avoid user interaction
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied, or {@code null}
     */
    default void mountEnclosingVolume(@NotNull org.gtk.gio.MountMountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_mount_enclosing_volume.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (mountOperation == null ? MemoryAddress.NULL : mountOperation.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes a mount operation started by g_file_mount_enclosing_volume().
     * @param result a {@link AsyncResult}
     * @return {@code true} if successful. If an error has occurred,
     *   this function will return {@code false} and set {@code error}
     *   appropriately if present.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean mountEnclosingVolumeFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_mount_enclosing_volume_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
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
     * @param flags flags affecting the operation
     * @param mountOperation a {@link MountOperation},
     *   or {@code null} to avoid user interaction
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied, or {@code null}
     */
    default void mountMountable(@NotNull org.gtk.gio.MountMountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_mount_mountable.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (mountOperation == null ? MemoryAddress.NULL : mountOperation.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes a mount operation. See g_file_mount_mountable() for details.
     * <p>
     * Finish an asynchronous mount operation that was started
     * with g_file_mount_mountable().
     * @param result a {@link AsyncResult}
     * @return a {@link File} or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.File mountMountableFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_mount_mountable_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
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
     * @param destination {@link File} pointing to the destination location
     * @param flags set of {@link FileCopyFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param progressCallback {@link FileProgressCallback}
     *   function for updates
     * @return {@code true} on successful move, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean move(@NotNull org.gtk.gio.File destination, @NotNull org.gtk.gio.FileCopyFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileProgressCallback progressCallback) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(destination, "Parameter 'destination' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_move.invokeExact(
                    handle(),
                    destination.handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbFileProgressCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : Interop.registerCallback(progressCallback)), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
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
     * @param destination {@link File} pointing to the destination location
     * @param flags set of {@link FileCopyFlags}
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param progressCallback {@link FileProgressCallback}
     *   function for updates
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void moveAsync(@NotNull org.gtk.gio.File destination, @NotNull org.gtk.gio.FileCopyFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.FileProgressCallback progressCallback, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(destination, "Parameter 'destination' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_move_async.invokeExact(
                    handle(),
                    destination.handle(),
                    flags.getValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbFileProgressCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : Interop.registerCallback(progressCallback)),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, long.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (progressCallback == null ? MemoryAddress.NULL : Interop.registerCallback(progressCallback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous file movement, started with
     * g_file_move_async().
     * @param result a {@link AsyncResult}
     * @return {@code true} on successful file move, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean moveFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_move_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
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
     * @param cancellable a {@link Cancellable}
     * @return {@link FileIOStream} or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileIOStream openReadwrite(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_open_readwrite.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileIOStream(Refcounted.get(RESULT, true));
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
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void openReadwriteAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_file_open_readwrite_async.invokeExact(
                    handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous file read operation started with
     * g_file_open_readwrite_async().
     * @param res a {@link AsyncResult}
     * @return a {@link FileIOStream} or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileIOStream openReadwriteFinish(@NotNull org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_open_readwrite_finish.invokeExact(
                    handle(),
                    res.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileIOStream(Refcounted.get(RESULT, true));
    }
    
    /**
     * Exactly like g_file_get_path(), but caches the result via
     * g_object_set_qdata_full().  This is useful for example in C
     * applications which mix {@code g_file_*} APIs with native ones.  It
     * also avoids an extra duplicated string when possible, so will be
     * generally more efficient.
     * <p>
     * This call does no blocking I/O.
     * @return string containing the {@link File}'s path,
     *   or {@code null} if no such path exists. The returned string is owned by {@code file}.
     */
    default @Nullable java.lang.String peekPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_peek_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
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
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied, or {@code null}
     */
    default void pollMountable(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_file_poll_mountable.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes a poll operation. See g_file_poll_mountable() for details.
     * <p>
     * Finish an asynchronous poll operation that was polled
     * with g_file_poll_mountable().
     * @param result a {@link AsyncResult}
     * @return {@code true} if the operation finished successfully. {@code false}
     * otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean pollMountableFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_poll_mountable_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the {@link AppInfo} that is registered as the default
     * application to handle the file specified by {@code file}.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @return a {@link AppInfo} if the handle was found,
     *   {@code null} if there were errors.
     *   When you are done with it, release it with g_object_unref()
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.AppInfo queryDefaultHandler(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_query_default_handler.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.AppInfo.AppInfoImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Async version of g_file_query_default_handler().
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call when the request is done
     */
    default void queryDefaultHandlerAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_file_query_default_handler_async.invokeExact(
                    handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes a g_file_query_default_handler_async() operation.
     * @param result a {@link AsyncResult}
     * @return a {@link AppInfo} if the handle was found,
     *   {@code null} if there were errors.
     *   When you are done with it, release it with g_object_unref()
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.AppInfo queryDefaultHandlerFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_query_default_handler_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.AppInfo.AppInfoImpl(Refcounted.get(RESULT, true));
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
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code true} if the file exists (and can be detected without error),
     *   {@code false} otherwise (or if cancelled).
     */
    default boolean queryExists(@Nullable org.gtk.gio.Cancellable cancellable) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_query_exists.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Utility function to inspect the {@link FileType} of a file. This is
     * implemented using g_file_query_info() and as such does blocking I/O.
     * <p>
     * The primary use case of this method is to check if a file is
     * a regular file, directory, or symlink.
     * @param flags a set of {@link FileQueryInfoFlags} passed to g_file_query_info()
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return The {@link FileType} of the file and {@link FileType#UNKNOWN}
     *   if the file does not exist
     */
    default @NotNull org.gtk.gio.FileType queryFileType(@NotNull org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_query_file_type.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.FileType(RESULT);
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled
     * by triggering the cancellable object from another thread. If the
     * operation was cancelled, the error {@link IOErrorEnum#CANCELLED} will be
     * returned.
     * <p>
     * If the file does not exist, the {@link IOErrorEnum#NOT_FOUND} error will
     * be returned. Other errors are possible too, and depend on what
     * kind of filesystem the file is on.
     * @param attributes an attribute query string
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return a {@link FileInfo} or {@code null} if there was an error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileInfo queryFilesystemInfo(@NotNull java.lang.String attributes, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(attributes, "Parameter 'attributes' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_query_filesystem_info.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attributes),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileInfo(Refcounted.get(RESULT, true));
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
     * @param attributes an attribute query string
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void queryFilesystemInfoAsync(@NotNull java.lang.String attributes, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(attributes, "Parameter 'attributes' must not be null");
        try {
            DowncallHandles.g_file_query_filesystem_info_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attributes),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous filesystem info query.
     * See g_file_query_filesystem_info_async().
     * @param res a {@link AsyncResult}
     * @return {@link FileInfo} for given {@code file}
     *   or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileInfo queryFilesystemInfoFinish(@NotNull org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_query_filesystem_info_finish.invokeExact(
                    handle(),
                    res.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileInfo(Refcounted.get(RESULT, true));
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
     * @param attributes an attribute query string
     * @param flags a set of {@link FileQueryInfoFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return a {@link FileInfo} for the given {@code file}, or {@code null}
     *   on error. Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileInfo queryInfo(@NotNull java.lang.String attributes, @NotNull org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(attributes, "Parameter 'attributes' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_query_info.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attributes),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileInfo(Refcounted.get(RESULT, true));
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
     * @param attributes an attribute query string
     * @param flags a set of {@link FileQueryInfoFlags}
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call when the
     *   request is satisfied
     */
    default void queryInfoAsync(@NotNull java.lang.String attributes, @NotNull org.gtk.gio.FileQueryInfoFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(attributes, "Parameter 'attributes' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_query_info_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attributes),
                    flags.getValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous file info query.
     * See g_file_query_info_async().
     * @param res a {@link AsyncResult}
     * @return {@link FileInfo} for given {@code file}
     *   or {@code null} on error. Free the returned object with
     *   g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileInfo queryInfoFinish(@NotNull org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_query_info_finish.invokeExact(
                    handle(),
                    res.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileInfo(Refcounted.get(RESULT, true));
    }
    
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
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return a {@link FileAttributeInfoList} describing the settable attributes.
     *   When you are done with it, release it with
     *   g_file_attribute_info_list_unref()
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileAttributeInfoList querySettableAttributes(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_query_settable_attributes.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileAttributeInfoList(Refcounted.get(RESULT, true));
    }
    
    /**
     * Obtain the list of attribute namespaces where new attributes
     * can be created by a user. An example of this is extended
     * attributes (in the "xattr" namespace).
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return a {@link FileAttributeInfoList} describing the writable namespaces.
     *   When you are done with it, release it with
     *   g_file_attribute_info_list_unref()
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileAttributeInfoList queryWritableNamespaces(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_query_writable_namespaces.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileAttributeInfoList(Refcounted.get(RESULT, true));
    }
    
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
     * @param cancellable a {@link Cancellable}
     * @return {@link FileInputStream} or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileInputStream read(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_read.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileInputStream(Refcounted.get(RESULT, true));
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
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void readAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_file_read_async.invokeExact(
                    handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous file read operation started with
     * g_file_read_async().
     * @param res a {@link AsyncResult}
     * @return a {@link FileInputStream} or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileInputStream readFinish(@NotNull org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_read_finish.invokeExact(
                    handle(),
                    res.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileInputStream(Refcounted.get(RESULT, true));
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
     * @param etag an optional [entity tag][gfile-etag]
     *   for the current {@link File}, or {@code NULL} to ignore
     * @param makeBackup {@code true} if a backup should be created
     * @param flags a set of {@link FileCreateFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return a {@link FileOutputStream} or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileOutputStream replace(@Nullable java.lang.String etag, boolean makeBackup, @NotNull org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_replace.invokeExact(
                    handle(),
                    (Addressable) (etag == null ? MemoryAddress.NULL : Interop.allocateNativeString(etag)),
                    makeBackup ? 1 : 0,
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileOutputStream(Refcounted.get(RESULT, true));
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
     * @param etag an [entity tag][gfile-etag] for the current {@link File},
     *   or {@code null} to ignore
     * @param makeBackup {@code true} if a backup should be created
     * @param flags a set of {@link FileCreateFlags}
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void replaceAsync(@Nullable java.lang.String etag, boolean makeBackup, @NotNull org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_replace_async.invokeExact(
                    handle(),
                    (Addressable) (etag == null ? MemoryAddress.NULL : Interop.allocateNativeString(etag)),
                    makeBackup ? 1 : 0,
                    flags.getValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param contents a string containing the new contents for {@code file}
     * @param length the length of {@code contents} in bytes
     * @param etag the old [entity-tag][gfile-etag] for the document,
     *   or {@code null}
     * @param makeBackup {@code true} if a backup should be created
     * @param flags a set of {@link FileCreateFlags}
     * @param newEtag a location to a new [entity tag][gfile-etag]
     *   for the document. This should be freed with g_free() when no longer
     *   needed, or {@code null}
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @return {@code true} if successful. If an error has occurred, this function
     *   will return {@code false} and set {@code error} appropriately if present.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean replaceContents(byte[] contents, long length, @Nullable java.lang.String etag, boolean makeBackup, @NotNull org.gtk.gio.FileCreateFlags flags, @Nullable Out<java.lang.String> newEtag, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(contents, "Parameter 'contents' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment newEtagPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_replace_contents.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(contents, false),
                    length,
                    (Addressable) (etag == null ? MemoryAddress.NULL : Interop.allocateNativeString(etag)),
                    makeBackup ? 1 : 0,
                    flags.getValue(),
                    (Addressable) (newEtag == null ? MemoryAddress.NULL : (Addressable) newEtagPOINTER.address()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        if (newEtag != null) newEtag.set(Interop.getStringFrom(newEtagPOINTER.get(ValueLayout.ADDRESS, 0)));
        return RESULT != 0;
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
     * @param contents string of contents to replace the file with
     * @param length the length of {@code contents} in bytes
     * @param etag a new [entity tag][gfile-etag] for the {@code file}, or {@code null}
     * @param makeBackup {@code true} if a backup should be created
     * @param flags a set of {@link FileCreateFlags}
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call when the request is satisfied
     */
    default void replaceContentsAsync(byte[] contents, long length, @Nullable java.lang.String etag, boolean makeBackup, @NotNull org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(contents, "Parameter 'contents' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_replace_contents_async.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(contents, false),
                    length,
                    (Addressable) (etag == null ? MemoryAddress.NULL : Interop.allocateNativeString(etag)),
                    makeBackup ? 1 : 0,
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     * @param contents a {@link org.gtk.glib.Bytes}
     * @param etag a new [entity tag][gfile-etag] for the {@code file}, or {@code null}
     * @param makeBackup {@code true} if a backup should be created
     * @param flags a set of {@link FileCreateFlags}
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call when the request is satisfied
     */
    default void replaceContentsBytesAsync(@NotNull org.gtk.glib.Bytes contents, @Nullable java.lang.String etag, boolean makeBackup, @NotNull org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(contents, "Parameter 'contents' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_replace_contents_bytes_async.invokeExact(
                    handle(),
                    contents.handle(),
                    (Addressable) (etag == null ? MemoryAddress.NULL : Interop.allocateNativeString(etag)),
                    makeBackup ? 1 : 0,
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous replace of the given {@code file}. See
     * g_file_replace_contents_async(). Sets {@code new_etag} to the new entity
     * tag for the document, if present.
     * @param res a {@link AsyncResult}
     * @param newEtag a location of a new [entity tag][gfile-etag]
     *   for the document. This should be freed with g_free() when it is no
     *   longer needed, or {@code null}
     * @return {@code true} on success, {@code false} on failure.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean replaceContentsFinish(@NotNull org.gtk.gio.AsyncResult res, @Nullable Out<java.lang.String> newEtag) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment newEtagPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_replace_contents_finish.invokeExact(
                    handle(),
                    res.handle(),
                    (Addressable) (newEtag == null ? MemoryAddress.NULL : (Addressable) newEtagPOINTER.address()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        if (newEtag != null) newEtag.set(Interop.getStringFrom(newEtagPOINTER.get(ValueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Finishes an asynchronous file replace operation started with
     * g_file_replace_async().
     * @param res a {@link AsyncResult}
     * @return a {@link FileOutputStream}, or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileOutputStream replaceFinish(@NotNull org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_replace_finish.invokeExact(
                    handle(),
                    res.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileOutputStream(Refcounted.get(RESULT, true));
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
     * @param etag an optional [entity tag][gfile-etag]
     *   for the current {@link File}, or {@code NULL} to ignore
     * @param makeBackup {@code true} if a backup should be created
     * @param flags a set of {@link FileCreateFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return a {@link FileIOStream} or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileIOStream replaceReadwrite(@Nullable java.lang.String etag, boolean makeBackup, @NotNull org.gtk.gio.FileCreateFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_replace_readwrite.invokeExact(
                    handle(),
                    (Addressable) (etag == null ? MemoryAddress.NULL : Interop.allocateNativeString(etag)),
                    makeBackup ? 1 : 0,
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileIOStream(Refcounted.get(RESULT, true));
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
     * @param etag an [entity tag][gfile-etag] for the current {@link File},
     *   or {@code null} to ignore
     * @param makeBackup {@code true} if a backup should be created
     * @param flags a set of {@link FileCreateFlags}
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void replaceReadwriteAsync(@Nullable java.lang.String etag, boolean makeBackup, @NotNull org.gtk.gio.FileCreateFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_replace_readwrite_async.invokeExact(
                    handle(),
                    (Addressable) (etag == null ? MemoryAddress.NULL : Interop.allocateNativeString(etag)),
                    makeBackup ? 1 : 0,
                    flags.getValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous file replace operation started with
     * g_file_replace_readwrite_async().
     * @param res a {@link AsyncResult}
     * @return a {@link FileIOStream}, or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.FileIOStream replaceReadwriteFinish(@NotNull org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_replace_readwrite_finish.invokeExact(
                    handle(),
                    res.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.FileIOStream(Refcounted.get(RESULT, true));
    }
    
    /**
     * Resolves a relative path for {@code file} to an absolute path.
     * <p>
     * This call does no blocking I/O.
     * <p>
     * If the {@code relative_path} is an absolute path name, the resolution
     * is done absolutely (without taking {@code file} path as base).
     * @param relativePath a given relative path string
     * @return a {@link File} for the resolved path.
     */
    default @NotNull org.gtk.gio.File resolveRelativePath(@NotNull java.lang.String relativePath) {
        java.util.Objects.requireNonNull(relativePath, "Parameter 'relativePath' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_resolve_relative_path.invokeExact(
                    handle(),
                    Interop.allocateNativeString(relativePath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Sets an attribute in the file with attribute name {@code attribute} to {@code value_p}.
     * <p>
     * Some attributes can be unset by setting {@code type} to
     * {@link FileAttributeType#INVALID} and {@code value_p} to {@code null}.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param attribute a string containing the attribute's name
     * @param type The type of the attribute
     * @param valueP a pointer to the value (or the pointer
     *   itself if the type is a pointer type)
     * @param flags a set of {@link FileQueryInfoFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code true} if the attribute was set, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setAttribute(@NotNull java.lang.String attribute, @NotNull org.gtk.gio.FileAttributeType type, @Nullable java.lang.foreign.MemoryAddress valueP, @NotNull org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(attribute, "Parameter 'attribute' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_set_attribute.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attribute),
                    type.getValue(),
                    (Addressable) (valueP == null ? MemoryAddress.NULL : valueP),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#BYTE_STRING} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail,
     * returning {@code false}.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a string containing the attribute's new value
     * @param flags a {@link FileQueryInfoFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code true} if the {@code attribute} was successfully set to {@code value}
     *   in the {@code file}, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setAttributeByteString(@NotNull java.lang.String attribute, @NotNull java.lang.String value, @NotNull org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(attribute, "Parameter 'attribute' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_set_attribute_byte_string.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attribute),
                    Interop.allocateNativeString(value),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#INT32} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a {@code gint32} containing the attribute's new value
     * @param flags a {@link FileQueryInfoFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code true} if the {@code attribute} was successfully set to {@code value}
     *   in the {@code file}, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setAttributeInt32(@NotNull java.lang.String attribute, int value, @NotNull org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(attribute, "Parameter 'attribute' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_set_attribute_int32.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attribute),
                    value,
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#INT64} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a {@code guint64} containing the attribute's new value
     * @param flags a {@link FileQueryInfoFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code true} if the {@code attribute} was successfully set, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setAttributeInt64(@NotNull java.lang.String attribute, long value, @NotNull org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(attribute, "Parameter 'attribute' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_set_attribute_int64.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attribute),
                    value,
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#STRING} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a string containing the attribute's value
     * @param flags {@link FileQueryInfoFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code true} if the {@code attribute} was successfully set, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setAttributeString(@NotNull java.lang.String attribute, @NotNull java.lang.String value, @NotNull org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(attribute, "Parameter 'attribute' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_set_attribute_string.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attribute),
                    Interop.allocateNativeString(value),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#UINT32} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a {@code guint32} containing the attribute's new value
     * @param flags a {@link FileQueryInfoFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code true} if the {@code attribute} was successfully set to {@code value}
     *   in the {@code file}, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setAttributeUint32(@NotNull java.lang.String attribute, int value, @NotNull org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(attribute, "Parameter 'attribute' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_set_attribute_uint32.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attribute),
                    value,
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code attribute} of type {@link FileAttributeType#UINT64} to {@code value}.
     * If {@code attribute} is of a different type, this operation will fail.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param attribute a string containing the attribute's name
     * @param value a {@code guint64} containing the attribute's new value
     * @param flags a {@link FileQueryInfoFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code true} if the {@code attribute} was successfully set to {@code value}
     *   in the {@code file}, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setAttributeUint64(@NotNull java.lang.String attribute, long value, @NotNull org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(attribute, "Parameter 'attribute' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_set_attribute_uint64.invokeExact(
                    handle(),
                    Interop.allocateNativeString(attribute),
                    value,
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
     * @param info a {@link FileInfo}
     * @param flags a {@link FileQueryInfoFlags}
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback}
     */
    default void setAttributesAsync(@NotNull org.gtk.gio.FileInfo info, @NotNull org.gtk.gio.FileQueryInfoFlags flags, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_set_attributes_async.invokeExact(
                    handle(),
                    info.handle(),
                    flags.getValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes setting an attribute started in g_file_set_attributes_async().
     * @param result a {@link AsyncResult}
     * @param info a {@link FileInfo}
     * @return {@code true} if the attributes were set correctly, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setAttributesFinish(@NotNull org.gtk.gio.AsyncResult result, @NotNull PointerProxy<org.gtk.gio.FileInfo> info) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_set_attributes_finish.invokeExact(
                    handle(),
                    result.handle(),
                    info.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param info a {@link FileInfo}
     * @param flags {@link FileQueryInfoFlags}
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code false} if there was any error, {@code true} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setAttributesFromInfo(@NotNull org.gtk.gio.FileInfo info, @NotNull org.gtk.gio.FileQueryInfoFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_set_attributes_from_info.invokeExact(
                    handle(),
                    info.handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param displayName a string
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return a {@link File} specifying what {@code file} was renamed to,
     *   or {@code null} if there was an error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.File setDisplayName(@NotNull java.lang.String displayName, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(displayName, "Parameter 'displayName' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_set_display_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(displayName),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
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
     * @param displayName a string
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void setDisplayNameAsync(@NotNull java.lang.String displayName, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(displayName, "Parameter 'displayName' must not be null");
        try {
            DowncallHandles.g_file_set_display_name_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(displayName),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes setting a display name started with
     * g_file_set_display_name_async().
     * @param res a {@link AsyncResult}
     * @return a {@link File} or {@code null} on error.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.File setDisplayNameFinish(@NotNull org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_set_display_name_finish.invokeExact(
                    handle(),
                    res.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
    }
    
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
     * @param flags flags affecting the operation
     * @param startOperation a {@link MountOperation}, or {@code null} to avoid user interaction
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call when the request is satisfied, or {@code null}
     */
    default void startMountable(@NotNull org.gtk.gio.DriveStartFlags flags, @Nullable org.gtk.gio.MountOperation startOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_start_mountable.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (startOperation == null ? MemoryAddress.NULL : startOperation.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes a start operation. See g_file_start_mountable() for details.
     * <p>
     * Finish an asynchronous start operation that was started
     * with g_file_start_mountable().
     * @param result a {@link AsyncResult}
     * @return {@code true} if the operation finished successfully. {@code false}
     * otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean startMountableFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_start_mountable_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
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
     * @param flags flags affecting the operation
     * @param mountOperation a {@link MountOperation},
     *   or {@code null} to avoid user interaction.
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied, or {@code null}
     */
    default void stopMountable(@NotNull org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_stop_mountable.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (mountOperation == null ? MemoryAddress.NULL : mountOperation.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes a stop operation, see g_file_stop_mountable() for details.
     * <p>
     * Finish an asynchronous stop operation that was started
     * with g_file_stop_mountable().
     * @param result a {@link AsyncResult}
     * @return {@code true} if the operation finished successfully.
     *   {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean stopMountableFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_stop_mountable_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code file} supports
     * [thread-default contexts][g-main-context-push-thread-default-context].
     * If this returns {@code false}, you cannot perform asynchronous operations on
     * {@code file} in a thread that has a thread-default context.
     * @return Whether or not {@code file} supports thread-default contexts.
     */
    default boolean supportsThreadContexts() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_supports_thread_contexts.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @return {@code true} on successful trash, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean trash(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_trash.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Asynchronously sends {@code file} to the Trash location, if possible.
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied
     */
    default void trashAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_file_trash_async.invokeExact(
                    handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous file trashing operation, started with
     * g_file_trash_async().
     * @param result a {@link AsyncResult}
     * @return {@code true} on successful trash, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean trashFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_trash_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Unmounts a file of type G_FILE_TYPE_MOUNTABLE.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_file_unmount_mountable_finish() to get
     * the result of the operation.
     * @param flags flags affecting the operation
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied, or {@code null}
     * @deprecated Use g_file_unmount_mountable_with_operation() instead.
     */
    @Deprecated
    default void unmountMountable(@NotNull org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_unmount_mountable.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an unmount operation, see g_file_unmount_mountable() for details.
     * <p>
     * Finish an asynchronous unmount operation that was started
     * with g_file_unmount_mountable().
     * @param result a {@link AsyncResult}
     * @return {@code true} if the operation finished successfully.
     *   {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use g_file_unmount_mountable_with_operation_finish()
     *   instead.
     */
    @Deprecated
    default boolean unmountMountableFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_unmount_mountable_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
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
     * @param flags flags affecting the operation
     * @param mountOperation a {@link MountOperation},
     *   or {@code null} to avoid user interaction
     * @param cancellable optional {@link Cancellable} object,
     *   {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback} to call
     *   when the request is satisfied, or {@code null}
     */
    default void unmountMountableWithOperation(@NotNull org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_file_unmount_mountable_with_operation.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (mountOperation == null ? MemoryAddress.NULL : mountOperation.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an unmount operation,
     * see g_file_unmount_mountable_with_operation() for details.
     * <p>
     * Finish an asynchronous unmount operation that was started
     * with g_file_unmount_mountable_with_operation().
     * @param result a {@link AsyncResult}
     * @return {@code true} if the operation finished successfully.
     *   {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean unmountMountableWithOperationFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_unmount_mountable_with_operation_finish.invokeExact(
                    handle(),
                    result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Constructs a {@link File} from a series of elements using the correct
     * separator for filenames.
     * <p>
     * Using this function is equivalent to calling g_build_filename(),
     * followed by g_file_new_for_path() on the result.
     * @param firstElement the first element in the path
     * @return a new {@link File}
     */
    public static @NotNull org.gtk.gio.File newBuildFilename(@NotNull java.lang.String firstElement) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
     * @param arg a command line string
     * @return a new {@link File}.
     *   Free the returned object with g_object_unref().
     */
    public static @NotNull org.gtk.gio.File newForCommandlineArg(@NotNull java.lang.String arg) {
        java.util.Objects.requireNonNull(arg, "Parameter 'arg' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_new_for_commandline_arg.invokeExact(
                    Interop.allocateNativeString(arg));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
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
     * @param arg a command line string
     * @param cwd the current working directory of the commandline
     * @return a new {@link File}
     */
    public static @NotNull org.gtk.gio.File newForCommandlineArgAndCwd(@NotNull java.lang.String arg, @NotNull java.lang.String cwd) {
        java.util.Objects.requireNonNull(arg, "Parameter 'arg' must not be null");
        java.util.Objects.requireNonNull(cwd, "Parameter 'cwd' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_new_for_commandline_arg_and_cwd.invokeExact(
                    Interop.allocateNativeString(arg),
                    Interop.allocateNativeString(cwd));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Constructs a {@link File} for a given path. This operation never
     * fails, but the returned object might not support any I/O
     * operation if {@code path} is malformed.
     * @param path a string containing a relative or absolute path.
     *   The string must be encoded in the glib filename encoding.
     * @return a new {@link File} for the given {@code path}.
     *   Free the returned object with g_object_unref().
     */
    public static @NotNull org.gtk.gio.File newForPath(@NotNull java.lang.String path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_new_for_path.invokeExact(
                    Interop.allocateNativeString(path));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Constructs a {@link File} for a given URI. This operation never
     * fails, but the returned object might not support any I/O
     * operation if {@code uri} is malformed or if the uri type is
     * not supported.
     * @param uri a UTF-8 string containing a URI
     * @return a new {@link File} for the given {@code uri}.
     *   Free the returned object with g_object_unref().
     */
    public static @NotNull org.gtk.gio.File newForUri(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_new_for_uri.invokeExact(
                    Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
    }
    
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
     * @param tmpl Template for the file
     *   name, as in g_file_open_tmp(), or {@code null} for a default template
     * @param iostream on return, a {@link FileIOStream} for the created file
     * @return a new {@link File}.
     *   Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @NotNull org.gtk.gio.File newTmp(@Nullable java.lang.String tmpl, @NotNull PointerProxy<org.gtk.gio.FileIOStream> iostream) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(iostream, "Parameter 'iostream' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_new_tmp.invokeExact(
                    (Addressable) (tmpl == null ? MemoryAddress.NULL : Interop.allocateNativeString(tmpl)),
                    iostream.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Constructs a {@link File} with the given {@code parse_name} (i.e. something
     * given by g_file_get_parse_name()). This operation never fails,
     * but the returned object might not support any I/O operation if
     * the {@code parse_name} cannot be parsed.
     * @param parseName a file name or path to be parsed
     * @return a new {@link File}.
     */
    public static @NotNull org.gtk.gio.File parseName(@NotNull java.lang.String parseName) {
        java.util.Objects.requireNonNull(parseName, "Parameter 'parseName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_parse_name.invokeExact(
                    Interop.allocateNativeString(parseName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_file_append_to = Interop.downcallHandle(
            "g_file_append_to",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_append_to_async = Interop.downcallHandle(
            "g_file_append_to_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_append_to_finish = Interop.downcallHandle(
            "g_file_append_to_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_build_attribute_list_for_copy = Interop.downcallHandle(
            "g_file_build_attribute_list_for_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_copy = Interop.downcallHandle(
            "g_file_copy",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_copy_async = Interop.downcallHandle(
            "g_file_copy_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_copy_attributes = Interop.downcallHandle(
            "g_file_copy_attributes",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_copy_finish = Interop.downcallHandle(
            "g_file_copy_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_create = Interop.downcallHandle(
            "g_file_create",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_create_async = Interop.downcallHandle(
            "g_file_create_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_create_finish = Interop.downcallHandle(
            "g_file_create_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_create_readwrite = Interop.downcallHandle(
            "g_file_create_readwrite",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_create_readwrite_async = Interop.downcallHandle(
            "g_file_create_readwrite_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_create_readwrite_finish = Interop.downcallHandle(
            "g_file_create_readwrite_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_delete = Interop.downcallHandle(
            "g_file_delete",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_delete_async = Interop.downcallHandle(
            "g_file_delete_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_delete_finish = Interop.downcallHandle(
            "g_file_delete_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_dup = Interop.downcallHandle(
            "g_file_dup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_eject_mountable = Interop.downcallHandle(
            "g_file_eject_mountable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_eject_mountable_finish = Interop.downcallHandle(
            "g_file_eject_mountable_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_eject_mountable_with_operation = Interop.downcallHandle(
            "g_file_eject_mountable_with_operation",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_eject_mountable_with_operation_finish = Interop.downcallHandle(
            "g_file_eject_mountable_with_operation_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_enumerate_children = Interop.downcallHandle(
            "g_file_enumerate_children",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_enumerate_children_async = Interop.downcallHandle(
            "g_file_enumerate_children_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_enumerate_children_finish = Interop.downcallHandle(
            "g_file_enumerate_children_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_equal = Interop.downcallHandle(
            "g_file_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_find_enclosing_mount = Interop.downcallHandle(
            "g_file_find_enclosing_mount",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_find_enclosing_mount_async = Interop.downcallHandle(
            "g_file_find_enclosing_mount_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_find_enclosing_mount_finish = Interop.downcallHandle(
            "g_file_find_enclosing_mount_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_get_basename = Interop.downcallHandle(
            "g_file_get_basename",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_get_child = Interop.downcallHandle(
            "g_file_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_get_child_for_display_name = Interop.downcallHandle(
            "g_file_get_child_for_display_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_get_parent = Interop.downcallHandle(
            "g_file_get_parent",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_get_parse_name = Interop.downcallHandle(
            "g_file_get_parse_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_get_path = Interop.downcallHandle(
            "g_file_get_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_get_relative_path = Interop.downcallHandle(
            "g_file_get_relative_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_get_uri = Interop.downcallHandle(
            "g_file_get_uri",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_get_uri_scheme = Interop.downcallHandle(
            "g_file_get_uri_scheme",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_has_parent = Interop.downcallHandle(
            "g_file_has_parent",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_has_prefix = Interop.downcallHandle(
            "g_file_has_prefix",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_has_uri_scheme = Interop.downcallHandle(
            "g_file_has_uri_scheme",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_hash = Interop.downcallHandle(
            "g_file_hash",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_is_native = Interop.downcallHandle(
            "g_file_is_native",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_load_bytes = Interop.downcallHandle(
            "g_file_load_bytes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_load_bytes_async = Interop.downcallHandle(
            "g_file_load_bytes_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_load_bytes_finish = Interop.downcallHandle(
            "g_file_load_bytes_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_load_contents = Interop.downcallHandle(
            "g_file_load_contents",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_load_contents_async = Interop.downcallHandle(
            "g_file_load_contents_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_load_contents_finish = Interop.downcallHandle(
            "g_file_load_contents_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_load_partial_contents_async = Interop.downcallHandle(
            "g_file_load_partial_contents_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_load_partial_contents_finish = Interop.downcallHandle(
            "g_file_load_partial_contents_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_make_directory = Interop.downcallHandle(
            "g_file_make_directory",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_make_directory_async = Interop.downcallHandle(
            "g_file_make_directory_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_make_directory_finish = Interop.downcallHandle(
            "g_file_make_directory_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_make_directory_with_parents = Interop.downcallHandle(
            "g_file_make_directory_with_parents",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_make_symbolic_link = Interop.downcallHandle(
            "g_file_make_symbolic_link",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_measure_disk_usage = Interop.downcallHandle(
            "g_file_measure_disk_usage",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_measure_disk_usage_async = Interop.downcallHandle(
            "g_file_measure_disk_usage_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_measure_disk_usage_finish = Interop.downcallHandle(
            "g_file_measure_disk_usage_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_monitor = Interop.downcallHandle(
            "g_file_monitor",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_monitor_directory = Interop.downcallHandle(
            "g_file_monitor_directory",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_monitor_file = Interop.downcallHandle(
            "g_file_monitor_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_mount_enclosing_volume = Interop.downcallHandle(
            "g_file_mount_enclosing_volume",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_mount_enclosing_volume_finish = Interop.downcallHandle(
            "g_file_mount_enclosing_volume_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_mount_mountable = Interop.downcallHandle(
            "g_file_mount_mountable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_mount_mountable_finish = Interop.downcallHandle(
            "g_file_mount_mountable_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_move = Interop.downcallHandle(
            "g_file_move",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_move_async = Interop.downcallHandle(
            "g_file_move_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_move_finish = Interop.downcallHandle(
            "g_file_move_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_open_readwrite = Interop.downcallHandle(
            "g_file_open_readwrite",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_open_readwrite_async = Interop.downcallHandle(
            "g_file_open_readwrite_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_open_readwrite_finish = Interop.downcallHandle(
            "g_file_open_readwrite_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_peek_path = Interop.downcallHandle(
            "g_file_peek_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_poll_mountable = Interop.downcallHandle(
            "g_file_poll_mountable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_poll_mountable_finish = Interop.downcallHandle(
            "g_file_poll_mountable_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_query_default_handler = Interop.downcallHandle(
            "g_file_query_default_handler",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_query_default_handler_async = Interop.downcallHandle(
            "g_file_query_default_handler_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_query_default_handler_finish = Interop.downcallHandle(
            "g_file_query_default_handler_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_query_exists = Interop.downcallHandle(
            "g_file_query_exists",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_query_file_type = Interop.downcallHandle(
            "g_file_query_file_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_query_filesystem_info = Interop.downcallHandle(
            "g_file_query_filesystem_info",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_query_filesystem_info_async = Interop.downcallHandle(
            "g_file_query_filesystem_info_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_query_filesystem_info_finish = Interop.downcallHandle(
            "g_file_query_filesystem_info_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_query_info = Interop.downcallHandle(
            "g_file_query_info",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_query_info_async = Interop.downcallHandle(
            "g_file_query_info_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_query_info_finish = Interop.downcallHandle(
            "g_file_query_info_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_query_settable_attributes = Interop.downcallHandle(
            "g_file_query_settable_attributes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_query_writable_namespaces = Interop.downcallHandle(
            "g_file_query_writable_namespaces",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_read = Interop.downcallHandle(
            "g_file_read",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_read_async = Interop.downcallHandle(
            "g_file_read_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_read_finish = Interop.downcallHandle(
            "g_file_read_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_replace = Interop.downcallHandle(
            "g_file_replace",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_replace_async = Interop.downcallHandle(
            "g_file_replace_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_replace_contents = Interop.downcallHandle(
            "g_file_replace_contents",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_replace_contents_async = Interop.downcallHandle(
            "g_file_replace_contents_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_replace_contents_bytes_async = Interop.downcallHandle(
            "g_file_replace_contents_bytes_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_replace_contents_finish = Interop.downcallHandle(
            "g_file_replace_contents_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_replace_finish = Interop.downcallHandle(
            "g_file_replace_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_replace_readwrite = Interop.downcallHandle(
            "g_file_replace_readwrite",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_replace_readwrite_async = Interop.downcallHandle(
            "g_file_replace_readwrite_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_replace_readwrite_finish = Interop.downcallHandle(
            "g_file_replace_readwrite_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_resolve_relative_path = Interop.downcallHandle(
            "g_file_resolve_relative_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_set_attribute = Interop.downcallHandle(
            "g_file_set_attribute",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_set_attribute_byte_string = Interop.downcallHandle(
            "g_file_set_attribute_byte_string",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_set_attribute_int32 = Interop.downcallHandle(
            "g_file_set_attribute_int32",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_set_attribute_int64 = Interop.downcallHandle(
            "g_file_set_attribute_int64",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_set_attribute_string = Interop.downcallHandle(
            "g_file_set_attribute_string",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_set_attribute_uint32 = Interop.downcallHandle(
            "g_file_set_attribute_uint32",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_set_attribute_uint64 = Interop.downcallHandle(
            "g_file_set_attribute_uint64",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_set_attributes_async = Interop.downcallHandle(
            "g_file_set_attributes_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_set_attributes_finish = Interop.downcallHandle(
            "g_file_set_attributes_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_set_attributes_from_info = Interop.downcallHandle(
            "g_file_set_attributes_from_info",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_set_display_name = Interop.downcallHandle(
            "g_file_set_display_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_set_display_name_async = Interop.downcallHandle(
            "g_file_set_display_name_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_set_display_name_finish = Interop.downcallHandle(
            "g_file_set_display_name_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_start_mountable = Interop.downcallHandle(
            "g_file_start_mountable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_start_mountable_finish = Interop.downcallHandle(
            "g_file_start_mountable_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_stop_mountable = Interop.downcallHandle(
            "g_file_stop_mountable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_stop_mountable_finish = Interop.downcallHandle(
            "g_file_stop_mountable_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_supports_thread_contexts = Interop.downcallHandle(
            "g_file_supports_thread_contexts",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_trash = Interop.downcallHandle(
            "g_file_trash",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_trash_async = Interop.downcallHandle(
            "g_file_trash_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_trash_finish = Interop.downcallHandle(
            "g_file_trash_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_unmount_mountable = Interop.downcallHandle(
            "g_file_unmount_mountable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_unmount_mountable_finish = Interop.downcallHandle(
            "g_file_unmount_mountable_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_unmount_mountable_with_operation = Interop.downcallHandle(
            "g_file_unmount_mountable_with_operation",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_unmount_mountable_with_operation_finish = Interop.downcallHandle(
            "g_file_unmount_mountable_with_operation_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_new_build_filename = Interop.downcallHandle(
            "g_file_new_build_filename",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_new_for_commandline_arg = Interop.downcallHandle(
            "g_file_new_for_commandline_arg",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_new_for_commandline_arg_and_cwd = Interop.downcallHandle(
            "g_file_new_for_commandline_arg_and_cwd",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_new_for_path = Interop.downcallHandle(
            "g_file_new_for_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_new_for_uri = Interop.downcallHandle(
            "g_file_new_for_uri",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_new_tmp = Interop.downcallHandle(
            "g_file_new_tmp",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_file_parse_name = Interop.downcallHandle(
            "g_file_parse_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    class FileImpl extends org.gtk.gobject.Object implements File {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public FileImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
