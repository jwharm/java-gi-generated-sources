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
public enum FileError implements io.github.jwharm.javagi.Enumeration {
    /**
     * Operation not permitted; only the owner of
     *     the file (or other resource) or processes with special privileges
     *     can perform the operation.
     */
    EXIST(0),
    /**
     * File is a directory; you cannot open a directory
     *     for writing, or create or remove hard links to it.
     */
    ISDIR(1),
    /**
     * Permission denied; the file permissions do not
     *     allow the attempted operation.
     */
    ACCES(2),
    /**
     * Filename too long.
     */
    NAMETOOLONG(3),
    /**
     * No such file or directory. This is a "file
     *     doesn't exist" error for ordinary files that are referenced in
     *     contexts where they are expected to already exist.
     */
    NOENT(4),
    /**
     * A file that isn't a directory was specified when
     *     a directory is required.
     */
    NOTDIR(5),
    /**
     * No such device or address. The system tried to
     *     use the device represented by a file you specified, and it
     *     couldn't find the device. This can mean that the device file was
     *     installed incorrectly, or that the physical device is missing or
     *     not correctly attached to the computer.
     */
    NXIO(6),
    /**
     * The underlying file system of the specified file
     *     does not support memory mapping.
     */
    NODEV(7),
    /**
     * The directory containing the new link can't be
     *     modified because it's on a read-only file system.
     */
    ROFS(8),
    /**
     * Text file busy.
     */
    TXTBSY(9),
    /**
     * You passed in a pointer to bad memory.
     *     (GLib won't reliably return this, don't pass in pointers to bad
     *     memory.)
     */
    FAULT(10),
    /**
     * Too many levels of symbolic links were encountered
     *     in looking up a file name. This often indicates a cycle of symbolic
     *     links.
     */
    LOOP(11),
    /**
     * No space left on device; write operation on a
     *     file failed because the disk is full.
     */
    NOSPC(12),
    /**
     * No memory available. The system cannot allocate
     *     more virtual memory because its capacity is full.
     */
    NOMEM(13),
    /**
     * The current process has too many files open and
     *     can't open any more. Duplicate descriptors do count toward this
     *     limit.
     */
    MFILE(14),
    /**
     * There are too many distinct file openings in the
     *     entire system.
     */
    NFILE(15),
    /**
     * Bad file descriptor; for example, I/O on a
     *     descriptor that has been closed or reading from a descriptor open
     *     only for writing (or vice versa).
     */
    BADF(16),
    /**
     * Invalid argument. This is used to indicate
     *     various kinds of problems with passing the wrong argument to a
     *     library function.
     */
    INVAL(17),
    /**
     * Broken pipe; there is no process reading from the
     *     other end of a pipe. Every library function that returns this
     *     error code also generates a 'SIGPIPE' signal; this signal
     *     terminates the program if not handled or blocked. Thus, your
     *     program will never actually see this code unless it has handled
     *     or blocked 'SIGPIPE'.
     */
    PIPE(18),
    /**
     * Resource temporarily unavailable; the call might
     *     work if you try again later.
     */
    AGAIN(19),
    /**
     * Interrupted function call; an asynchronous signal
     *     occurred and prevented completion of the call. When this
     *     happens, you should try the call again.
     */
    INTR(20),
    /**
     * Input/output error; usually used for physical read
     *    or write errors. i.e. the disk or other physical device hardware
     *    is returning errors.
     */
    IO(21),
    /**
     * Operation not permitted; only the owner of the
     *    file (or other resource) or processes with special privileges can
     *    perform the operation.
     */
    PERM(22),
    /**
     * Function not implemented; this indicates that
     *    the system is missing some functionality.
     */
    NOSYS(23),
    /**
     * Does not correspond to a UNIX error code; this
     *    is the standard "failed for unspecified reason" error code present
     *    in all {@link Error} error code enumerations. Returned if no specific
     *    code applies.
     */
    FAILED(24);
    
    private static final java.lang.String C_TYPE_NAME = "GFileError";
    
    private final int value;
    FileError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static FileError of(int value) {
        return switch (value) {
            case 0 -> EXIST;
            case 1 -> ISDIR;
            case 2 -> ACCES;
            case 3 -> NAMETOOLONG;
            case 4 -> NOENT;
            case 5 -> NOTDIR;
            case 6 -> NXIO;
            case 7 -> NODEV;
            case 8 -> ROFS;
            case 9 -> TXTBSY;
            case 10 -> FAULT;
            case 11 -> LOOP;
            case 12 -> NOSPC;
            case 13 -> NOMEM;
            case 14 -> MFILE;
            case 15 -> NFILE;
            case 16 -> BADF;
            case 17 -> INVAL;
            case 18 -> PIPE;
            case 19 -> AGAIN;
            case 20 -> INTR;
            case 21 -> IO;
            case 22 -> PERM;
            case 23 -> NOSYS;
            case 24 -> FAILED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
