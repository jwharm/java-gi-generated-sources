package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Values corresponding to {@code errno} codes returned from file operations
 * on UNIX. Unlike {@code errno} codes, GFileError values are available on
 * all systems, even Windows. The exact meaning of each code depends
 * on what sort of file operation you were performing; the UNIX
 * documentation gives more details. The following error code descriptions
 * come from the GNU C Library manual, and are under the copyright
 * of that manual.
 * <p>
 * It's not very portable to make detailed assumptions about exactly
 * which errors will be returned from a given operation. Some errors
 * don't occur on some systems, etc., sometimes there are subtle
 * differences in when a system will report a given error, etc.
 */
public class FileError extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Operation not permitted; only the owner of
     *     the file (or other resource) or processes with special privileges
     *     can perform the operation.
     */
    public static final FileError EXIST = new FileError(0);
    
    /**
     * File is a directory; you cannot open a directory
     *     for writing, or create or remove hard links to it.
     */
    public static final FileError ISDIR = new FileError(1);
    
    /**
     * Permission denied; the file permissions do not
     *     allow the attempted operation.
     */
    public static final FileError ACCES = new FileError(2);
    
    /**
     * Filename too long.
     */
    public static final FileError NAMETOOLONG = new FileError(3);
    
    /**
     * No such file or directory. This is a "file
     *     doesn't exist" error for ordinary files that are referenced in
     *     contexts where they are expected to already exist.
     */
    public static final FileError NOENT = new FileError(4);
    
    /**
     * A file that isn't a directory was specified when
     *     a directory is required.
     */
    public static final FileError NOTDIR = new FileError(5);
    
    /**
     * No such device or address. The system tried to
     *     use the device represented by a file you specified, and it
     *     couldn't find the device. This can mean that the device file was
     *     installed incorrectly, or that the physical device is missing or
     *     not correctly attached to the computer.
     */
    public static final FileError NXIO = new FileError(6);
    
    /**
     * The underlying file system of the specified file
     *     does not support memory mapping.
     */
    public static final FileError NODEV = new FileError(7);
    
    /**
     * The directory containing the new link can't be
     *     modified because it's on a read-only file system.
     */
    public static final FileError ROFS = new FileError(8);
    
    /**
     * Text file busy.
     */
    public static final FileError TXTBSY = new FileError(9);
    
    /**
     * You passed in a pointer to bad memory.
     *     (GLib won't reliably return this, don't pass in pointers to bad
     *     memory.)
     */
    public static final FileError FAULT = new FileError(10);
    
    /**
     * Too many levels of symbolic links were encountered
     *     in looking up a file name. This often indicates a cycle of symbolic
     *     links.
     */
    public static final FileError LOOP = new FileError(11);
    
    /**
     * No space left on device; write operation on a
     *     file failed because the disk is full.
     */
    public static final FileError NOSPC = new FileError(12);
    
    /**
     * No memory available. The system cannot allocate
     *     more virtual memory because its capacity is full.
     */
    public static final FileError NOMEM = new FileError(13);
    
    /**
     * The current process has too many files open and
     *     can't open any more. Duplicate descriptors do count toward this
     *     limit.
     */
    public static final FileError MFILE = new FileError(14);
    
    /**
     * There are too many distinct file openings in the
     *     entire system.
     */
    public static final FileError NFILE = new FileError(15);
    
    /**
     * Bad file descriptor; for example, I/O on a
     *     descriptor that has been closed or reading from a descriptor open
     *     only for writing (or vice versa).
     */
    public static final FileError BADF = new FileError(16);
    
    /**
     * Invalid argument. This is used to indicate
     *     various kinds of problems with passing the wrong argument to a
     *     library function.
     */
    public static final FileError INVAL = new FileError(17);
    
    /**
     * Broken pipe; there is no process reading from the
     *     other end of a pipe. Every library function that returns this
     *     error code also generates a 'SIGPIPE' signal; this signal
     *     terminates the program if not handled or blocked. Thus, your
     *     program will never actually see this code unless it has handled
     *     or blocked 'SIGPIPE'.
     */
    public static final FileError PIPE = new FileError(18);
    
    /**
     * Resource temporarily unavailable; the call might
     *     work if you try again later.
     */
    public static final FileError AGAIN = new FileError(19);
    
    /**
     * Interrupted function call; an asynchronous signal
     *     occurred and prevented completion of the call. When this
     *     happens, you should try the call again.
     */
    public static final FileError INTR = new FileError(20);
    
    /**
     * Input/output error; usually used for physical read
     *    or write errors. i.e. the disk or other physical device hardware
     *    is returning errors.
     */
    public static final FileError IO = new FileError(21);
    
    /**
     * Operation not permitted; only the owner of the
     *    file (or other resource) or processes with special privileges can
     *    perform the operation.
     */
    public static final FileError PERM = new FileError(22);
    
    /**
     * Function not implemented; this indicates that
     *    the system is missing some functionality.
     */
    public static final FileError NOSYS = new FileError(23);
    
    /**
     * Does not correspond to a UNIX error code; this
     *    is the standard "failed for unspecified reason" error code present
     *    in all {@link Error} error code enumerations. Returned if no specific
     *    code applies.
     */
    public static final FileError FAILED = new FileError(24);
    
    public FileError(int value) {
        super(value);
    }
}
