package org.gtk.glib;

/**
 * These are logical ids for special directories which are defined
 * depending on the platform used. You should use g_get_user_special_dir()
 * to retrieve the full path associated to the logical id.
 * <p>
 * The {@link UserDirectory} enumeration can be extended at later date. Not
 * every platform has a directory for every logical id in this
 * enumeration.
 */
public class UserDirectory {

    /**
     * the user's Desktop directory
     */
    public static final UserDirectory DIRECTORY_DESKTOP = new UserDirectory(0);
    
    /**
     * the user's Documents directory
     */
    public static final UserDirectory DIRECTORY_DOCUMENTS = new UserDirectory(1);
    
    /**
     * the user's Downloads directory
     */
    public static final UserDirectory DIRECTORY_DOWNLOAD = new UserDirectory(2);
    
    /**
     * the user's Music directory
     */
    public static final UserDirectory DIRECTORY_MUSIC = new UserDirectory(3);
    
    /**
     * the user's Pictures directory
     */
    public static final UserDirectory DIRECTORY_PICTURES = new UserDirectory(4);
    
    /**
     * the user's shared directory
     */
    public static final UserDirectory DIRECTORY_PUBLIC_SHARE = new UserDirectory(5);
    
    /**
     * the user's Templates directory
     */
    public static final UserDirectory DIRECTORY_TEMPLATES = new UserDirectory(6);
    
    /**
     * the user's Movies directory
     */
    public static final UserDirectory DIRECTORY_VIDEOS = new UserDirectory(7);
    
    /**
     * the number of enum values
     */
    public static final UserDirectory N_DIRECTORIES = new UserDirectory(8);
    
    private int value;
    
    public UserDirectory(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(UserDirectory[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
