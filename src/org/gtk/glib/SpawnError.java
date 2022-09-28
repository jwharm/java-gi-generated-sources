package org.gtk.glib;

/**
 * Error codes returned by spawning processes.
 */
public class SpawnError {

    /**
     * Fork failed due to lack of memory.
     */
    public static final SpawnError FORK = new SpawnError(0);
    
    /**
     * Read or select on pipes failed.
     */
    public static final SpawnError READ = new SpawnError(1);
    
    /**
     * Changing to working directory failed.
     */
    public static final SpawnError CHDIR = new SpawnError(2);
    
    /**
     * execv() returned {@code EACCES}
     */
    public static final SpawnError ACCES = new SpawnError(3);
    
    /**
     * execv() returned {@code EPERM}
     */
    public static final SpawnError PERM = new SpawnError(4);
    
    /**
     * execv() returned {@code E2BIG}
     */
    public static final SpawnError TOO_BIG = new SpawnError(5);
    
    /**
     * deprecated alias for {@link SpawnError#TOO_BIG} (deprecated since GLib 2.32)
     */
    public static final SpawnError _2BIG = new SpawnError(5);
    
    /**
     * execv() returned {@code ENOEXEC}
     */
    public static final SpawnError NOEXEC = new SpawnError(6);
    
    /**
     * execv() returned {@code ENAMETOOLONG}
     */
    public static final SpawnError NAMETOOLONG = new SpawnError(7);
    
    /**
     * execv() returned {@code ENOENT}
     */
    public static final SpawnError NOENT = new SpawnError(8);
    
    /**
     * execv() returned {@code ENOMEM}
     */
    public static final SpawnError NOMEM = new SpawnError(9);
    
    /**
     * execv() returned {@code ENOTDIR}
     */
    public static final SpawnError NOTDIR = new SpawnError(10);
    
    /**
     * execv() returned {@code ELOOP}
     */
    public static final SpawnError LOOP = new SpawnError(11);
    
    /**
     * execv() returned {@code ETXTBUSY}
     */
    public static final SpawnError TXTBUSY = new SpawnError(12);
    
    /**
     * execv() returned {@code EIO}
     */
    public static final SpawnError IO = new SpawnError(13);
    
    /**
     * execv() returned {@code ENFILE}
     */
    public static final SpawnError NFILE = new SpawnError(14);
    
    /**
     * execv() returned {@code EMFILE}
     */
    public static final SpawnError MFILE = new SpawnError(15);
    
    /**
     * execv() returned {@code EINVAL}
     */
    public static final SpawnError INVAL = new SpawnError(16);
    
    /**
     * execv() returned {@code EISDIR}
     */
    public static final SpawnError ISDIR = new SpawnError(17);
    
    /**
     * execv() returned {@code ELIBBAD}
     */
    public static final SpawnError LIBBAD = new SpawnError(18);
    
    /**
     * Some other fatal failure,
     *   {@code error->message} should explain.
     */
    public static final SpawnError FAILED = new SpawnError(19);
    
    private int value;
    
    public SpawnError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SpawnError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
