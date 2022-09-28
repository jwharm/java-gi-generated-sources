package org.gtk.gio;

/**
 * Flags describing the behavior of a {@link DBusInterfaceSkeleton} instance.
 */
public class DBusInterfaceSkeletonFlags {

    /**
     * No flags set.
     */
    public static final DBusInterfaceSkeletonFlags NONE = new DBusInterfaceSkeletonFlags(0);
    
    /**
     * Each method invocation is handled in
     *   a thread dedicated to the invocation. This means that the method implementation can use blocking IO
     *   without blocking any other part of the process. It also means that the method implementation must
     *   use locking to access data structures used by other threads.
     */
    public static final DBusInterfaceSkeletonFlags HANDLE_METHOD_INVOCATIONS_IN_THREAD = new DBusInterfaceSkeletonFlags(1);
    
    private int value;
    
    public DBusInterfaceSkeletonFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DBusInterfaceSkeletonFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public DBusInterfaceSkeletonFlags combined(DBusInterfaceSkeletonFlags mask) {
        return new DBusInterfaceSkeletonFlags(this.getValue() | mask.getValue());
    }
    
    public static DBusInterfaceSkeletonFlags combined(DBusInterfaceSkeletonFlags mask, DBusInterfaceSkeletonFlags... masks) {
        int value = mask.getValue();
        for (DBusInterfaceSkeletonFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusInterfaceSkeletonFlags(value);
    }
    
}
