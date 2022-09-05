package org.gtk.glib;

/**
 * Error codes returned by spawning processes.
 */
public enum SpawnError {

    /**
     * Fork failed due to lack of memory.
     */
    FORK,
    
    /**
     * Read or select on pipes failed.
     */
    READ,
    
    /**
     * Changing to working directory failed.
     */
    CHDIR,
    
    /**
     * execv() returned `EACCES`
     */
    ACCES,
    
    /**
     * execv() returned `EPERM`
     */
    PERM,
    
    /**
     * execv() returned `E2BIG`
     */
    TOO_BIG,
    
    /**
     * deprecated alias for %G_SPAWN_ERROR_TOO_BIG (deprecated since GLib 2.32)
     */
    _2BIG,
    
    /**
     * execv() returned `ENOEXEC`
     */
    NOEXEC,
    
    /**
     * execv() returned `ENAMETOOLONG`
     */
    NAMETOOLONG,
    
    /**
     * execv() returned `ENOENT`
     */
    NOENT,
    
    /**
     * execv() returned `ENOMEM`
     */
    NOMEM,
    
    /**
     * execv() returned `ENOTDIR`
     */
    NOTDIR,
    
    /**
     * execv() returned `ELOOP`
     */
    LOOP,
    
    /**
     * execv() returned `ETXTBUSY`
     */
    TXTBUSY,
    
    /**
     * execv() returned `EIO`
     */
    IO,
    
    /**
     * execv() returned `ENFILE`
     */
    NFILE,
    
    /**
     * execv() returned `EMFILE`
     */
    MFILE,
    
    /**
     * execv() returned `EINVAL`
     */
    INVAL,
    
    /**
     * execv() returned `EISDIR`
     */
    ISDIR,
    
    /**
     * execv() returned `ELIBBAD`
     */
    LIBBAD,
    
    /**
     * Some other fatal failure,
     *   `error->message` should explain.
     */
    FAILED;
    
    public static SpawnError fromValue(int value) {
        return switch(value) {
            case 0 -> FORK;
            case 1 -> READ;
            case 2 -> CHDIR;
            case 3 -> ACCES;
            case 4 -> PERM;
            case 5 -> TOO_BIG;
            case 6 -> NOEXEC;
            case 7 -> NAMETOOLONG;
            case 8 -> NOENT;
            case 9 -> NOMEM;
            case 10 -> NOTDIR;
            case 11 -> LOOP;
            case 12 -> TXTBUSY;
            case 13 -> IO;
            case 14 -> NFILE;
            case 15 -> MFILE;
            case 16 -> INVAL;
            case 17 -> ISDIR;
            case 18 -> LIBBAD;
            case 19 -> FAILED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FORK -> 0;
            case READ -> 1;
            case CHDIR -> 2;
            case ACCES -> 3;
            case PERM -> 4;
            case TOO_BIG -> 5;
            case _2BIG -> 5;
            case NOEXEC -> 6;
            case NAMETOOLONG -> 7;
            case NOENT -> 8;
            case NOMEM -> 9;
            case NOTDIR -> 10;
            case LOOP -> 11;
            case TXTBUSY -> 12;
            case IO -> 13;
            case NFILE -> 14;
            case MFILE -> 15;
            case INVAL -> 16;
            case ISDIR -> 17;
            case LIBBAD -> 18;
            case FAILED -> 19;
        };
    }

}
