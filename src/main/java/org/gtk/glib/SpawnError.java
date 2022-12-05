package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by spawning processes.
 */
public enum SpawnError implements io.github.jwharm.javagi.Enumeration {
    /**
     * Fork failed due to lack of memory.
     */
    FORK(0),
    /**
     * Read or select on pipes failed.
     */
    READ(1),
    /**
     * Changing to working directory failed.
     */
    CHDIR(2),
    /**
     * execv() returned {@code EACCES}
     */
    ACCES(3),
    /**
     * execv() returned {@code EPERM}
     */
    PERM(4),
    /**
     * execv() returned {@code E2BIG}
     */
    TOO_BIG(5),
    /**
     * execv() returned {@code ENOEXEC}
     */
    NOEXEC(6),
    /**
     * execv() returned {@code ENAMETOOLONG}
     */
    NAMETOOLONG(7),
    /**
     * execv() returned {@code ENOENT}
     */
    NOENT(8),
    /**
     * execv() returned {@code ENOMEM}
     */
    NOMEM(9),
    /**
     * execv() returned {@code ENOTDIR}
     */
    NOTDIR(10),
    /**
     * execv() returned {@code ELOOP}
     */
    LOOP(11),
    /**
     * execv() returned {@code ETXTBUSY}
     */
    TXTBUSY(12),
    /**
     * execv() returned {@code EIO}
     */
    IO(13),
    /**
     * execv() returned {@code ENFILE}
     */
    NFILE(14),
    /**
     * execv() returned {@code EMFILE}
     */
    MFILE(15),
    /**
     * execv() returned {@code EINVAL}
     */
    INVAL(16),
    /**
     * execv() returned {@code EISDIR}
     */
    ISDIR(17),
    /**
     * execv() returned {@code ELIBBAD}
     */
    LIBBAD(18),
    /**
     * Some other fatal failure,
     *   {@code error->message} should explain.
     */
    FAILED(19);
    public static final SpawnError _2BIG = TOO_BIG;
    
    private static final java.lang.String C_TYPE_NAME = "GSpawnError";
    
    private final int value;
    SpawnError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SpawnError of(int value) {
        return switch (value) {
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
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
