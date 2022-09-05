package org.gtk.glib;

/**
 * These are logical ids for special directories which are defined
 * depending on the platform used. You should use g_get_user_special_dir()
 * to retrieve the full path associated to the logical id.
 * 
 * The #GUserDirectory enumeration can be extended at later date. Not
 * every platform has a directory for every logical id in this
 * enumeration.
 */
public enum UserDirectory {

    /**
     * the user's Desktop directory
     */
    DIRECTORY_DESKTOP,
    
    /**
     * the user's Documents directory
     */
    DIRECTORY_DOCUMENTS,
    
    /**
     * the user's Downloads directory
     */
    DIRECTORY_DOWNLOAD,
    
    /**
     * the user's Music directory
     */
    DIRECTORY_MUSIC,
    
    /**
     * the user's Pictures directory
     */
    DIRECTORY_PICTURES,
    
    /**
     * the user's shared directory
     */
    DIRECTORY_PUBLIC_SHARE,
    
    /**
     * the user's Templates directory
     */
    DIRECTORY_TEMPLATES,
    
    /**
     * the user's Movies directory
     */
    DIRECTORY_VIDEOS,
    
    /**
     * the number of enum values
     */
    N_DIRECTORIES;
    
    public static UserDirectory fromValue(int value) {
        return switch(value) {
            case 0 -> DIRECTORY_DESKTOP;
            case 1 -> DIRECTORY_DOCUMENTS;
            case 2 -> DIRECTORY_DOWNLOAD;
            case 3 -> DIRECTORY_MUSIC;
            case 4 -> DIRECTORY_PICTURES;
            case 5 -> DIRECTORY_PUBLIC_SHARE;
            case 6 -> DIRECTORY_TEMPLATES;
            case 7 -> DIRECTORY_VIDEOS;
            case 8 -> N_DIRECTORIES;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DIRECTORY_DESKTOP -> 0;
            case DIRECTORY_DOCUMENTS -> 1;
            case DIRECTORY_DOWNLOAD -> 2;
            case DIRECTORY_MUSIC -> 3;
            case DIRECTORY_PICTURES -> 4;
            case DIRECTORY_PUBLIC_SHARE -> 5;
            case DIRECTORY_TEMPLATES -> 6;
            case DIRECTORY_VIDEOS -> 7;
            case N_DIRECTORIES -> 8;
        };
    }

}
