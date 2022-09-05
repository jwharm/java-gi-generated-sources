package org.gtk.gio;

/**
 * Flags for use with g_io_module_scope_new().
 */
public enum IOModuleScopeFlags {

    /**
     * No module scan flags
     */
    NONE,
    
    /**
     * When using this scope to load or
     *     scan modules, automatically block a modules which has the same base
     *     basename as previously loaded module.
     */
    BLOCK_DUPLICATES;
    
    public static IOModuleScopeFlags fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> BLOCK_DUPLICATES;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case BLOCK_DUPLICATES -> 1;
        };
    }

}
