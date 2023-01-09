package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These are logical ids for special directories which are defined
 * depending on the platform used. You should use g_get_user_special_dir()
 * to retrieve the full path associated to the logical id.
 * <p>
 * The {@link UserDirectory} enumeration can be extended at later date. Not
 * every platform has a directory for every logical id in this
 * enumeration.
 * @version 2.14
 */
public enum UserDirectory implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * the user's Desktop directory
     */
    DIRECTORY_DESKTOP(0),
    
    /**
     * the user's Documents directory
     */
    DIRECTORY_DOCUMENTS(1),
    
    /**
     * the user's Downloads directory
     */
    DIRECTORY_DOWNLOAD(2),
    
    /**
     * the user's Music directory
     */
    DIRECTORY_MUSIC(3),
    
    /**
     * the user's Pictures directory
     */
    DIRECTORY_PICTURES(4),
    
    /**
     * the user's shared directory
     */
    DIRECTORY_PUBLIC_SHARE(5),
    
    /**
     * the user's Templates directory
     */
    DIRECTORY_TEMPLATES(6),
    
    /**
     * the user's Movies directory
     */
    DIRECTORY_VIDEOS(7),
    
    /**
     * the number of enum values
     */
    N_DIRECTORIES(8);
    
    private static final java.lang.String C_TYPE_NAME = "GUserDirectory";
    
    private final int value;
    
    /**
     * Create a new UserDirectory for the provided value
     * @param numeric value the enum value
     */
    UserDirectory(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new UserDirectory for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static UserDirectory of(int value) {
        return switch (value) {
            case 0 -> DIRECTORY_DESKTOP;
            case 1 -> DIRECTORY_DOCUMENTS;
            case 2 -> DIRECTORY_DOWNLOAD;
            case 3 -> DIRECTORY_MUSIC;
            case 4 -> DIRECTORY_PICTURES;
            case 5 -> DIRECTORY_PUBLIC_SHARE;
            case 6 -> DIRECTORY_TEMPLATES;
            case 7 -> DIRECTORY_VIDEOS;
            case 8 -> N_DIRECTORIES;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
