package org.gtk.glib;

/**
 * Values corresponding to @errno codes returned from file operations
 * on UNIX. Unlike @errno codes, GFileError values are available on
 * all systems, even Windows. The exact meaning of each code depends
 * on what sort of file operation you were performing; the UNIX
 * documentation gives more details. The following error code descriptions
 * come from the GNU C Library manual, and are under the copyright
 * of that manual.
 * 
 * It&#39;s not very portable to make detailed assumptions about exactly
 * which errors will be returned from a given operation. Some errors
 * don&#39;t occur on some systems, etc., sometimes there are subtle
 * differences in when a system will report a given error, etc.
 */
public enum FileError {

    /**
     * Operation not permitted; only the owner of
     *     the file (or other resource) or processes with special privileges
     *     can perform the operation.
     */
    EXIST,
    
    /**
     * File is a directory; you cannot open a directory
     *     for writing, or create or remove hard links to it.
     */
    ISDIR,
    
    /**
     * Permission denied; the file permissions do not
     *     allow the attempted operation.
     */
    ACCES,
    
    /**
     * Filename too long.
     */
    NAMETOOLONG,
    
    /**
     * No such file or directory. This is a &#34;file
     *     doesn&#39;t exist&#34; error for ordinary files that are referenced in
     *     contexts where they are expected to already exist.
     */
    NOENT,
    
    /**
     * A file that isn&#39;t a directory was specified when
     *     a directory is required.
     */
    NOTDIR,
    
    /**
     * No such device or address. The system tried to
     *     use the device represented by a file you specified, and it
     *     couldn&#39;t find the device. This can mean that the device file was
     *     installed incorrectly, or that the physical device is missing or
     *     not correctly attached to the computer.
     */
    NXIO,
    
    /**
     * The underlying file system of the specified file
     *     does not support memory mapping.
     */
    NODEV,
    
    /**
     * The directory containing the new link can&#39;t be
     *     modified because it&#39;s on a read-only file system.
     */
    ROFS,
    
    /**
     * Text file busy.
     */
    TXTBSY,
    
    /**
     * You passed in a pointer to bad memory.
     *     (GLib won&#39;t reliably return this, don&#39;t pass in pointers to bad
     *     memory.)
     */
    FAULT,
    
    /**
     * Too many levels of symbolic links were encountered
     *     in looking up a file name. This often indicates a cycle of symbolic
     *     links.
     */
    LOOP,
    
    /**
     * No space left on device; write operation on a
     *     file failed because the disk is full.
     */
    NOSPC,
    
    /**
     * No memory available. The system cannot allocate
     *     more virtual memory because its capacity is full.
     */
    NOMEM,
    
    /**
     * The current process has too many files open and
     *     can&#39;t open any more. Duplicate descriptors do count toward this
     *     limit.
     */
    MFILE,
    
    /**
     * There are too many distinct file openings in the
     *     entire system.
     */
    NFILE,
    
    /**
     * Bad file descriptor; for example, I/O on a
     *     descriptor that has been closed or reading from a descriptor open
     *     only for writing (or vice versa).
     */
    BADF,
    
    /**
     * Invalid argument. This is used to indicate
     *     various kinds of problems with passing the wrong argument to a
     *     library function.
     */
    INVAL,
    
    /**
     * Broken pipe; there is no process reading from the
     *     other end of a pipe. Every library function that returns this
     *     error code also generates a &#39;SIGPIPE&#39; signal; this signal
     *     terminates the program if not handled or blocked. Thus, your
     *     program will never actually see this code unless it has handled
     *     or blocked &#39;SIGPIPE&#39;.
     */
    PIPE,
    
    /**
     * Resource temporarily unavailable; the call might
     *     work if you try again later.
     */
    AGAIN,
    
    /**
     * Interrupted function call; an asynchronous signal
     *     occurred and prevented completion of the call. When this
     *     happens, you should try the call again.
     */
    INTR,
    
    /**
     * Input/output error; usually used for physical read
     *    or write errors. i.e. the disk or other physical device hardware
     *    is returning errors.
     */
    IO,
    
    /**
     * Operation not permitted; only the owner of the
     *    file (or other resource) or processes with special privileges can
     *    perform the operation.
     */
    PERM,
    
    /**
     * Function not implemented; this indicates that
     *    the system is missing some functionality.
     */
    NOSYS,
    
    /**
     * Does not correspond to a UNIX error code; this
     *    is the standard &#34;failed for unspecified reason&#34; error code present
     *    in all #GError error code enumerations. Returned if no specific
     *    code applies.
     */
    FAILED;
    
    public static FileError fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case EXIST -> 0;
            case ISDIR -> 1;
            case ACCES -> 2;
            case NAMETOOLONG -> 3;
            case NOENT -> 4;
            case NOTDIR -> 5;
            case NXIO -> 6;
            case NODEV -> 7;
            case ROFS -> 8;
            case TXTBSY -> 9;
            case FAULT -> 10;
            case LOOP -> 11;
            case NOSPC -> 12;
            case NOMEM -> 13;
            case MFILE -> 14;
            case NFILE -> 15;
            case BADF -> 16;
            case INVAL -> 17;
            case PIPE -> 18;
            case AGAIN -> 19;
            case INTR -> 20;
            case IO -> 21;
            case PERM -> 22;
            case NOSYS -> 23;
            case FAILED -> 24;
        };
    }

}
