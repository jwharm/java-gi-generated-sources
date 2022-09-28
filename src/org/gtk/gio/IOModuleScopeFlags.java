package org.gtk.gio;

/**
 * Flags for use with g_io_module_scope_new().
 */
public class IOModuleScopeFlags {

    /**
     * No module scan flags
     */
    public static final IOModuleScopeFlags NONE = new IOModuleScopeFlags(0);
    
    /**
     * When using this scope to load or
     *     scan modules, automatically block a modules which has the same base
     *     basename as previously loaded module.
     */
    public static final IOModuleScopeFlags BLOCK_DUPLICATES = new IOModuleScopeFlags(1);
    
    private int value;
    
    public IOModuleScopeFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(IOModuleScopeFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
