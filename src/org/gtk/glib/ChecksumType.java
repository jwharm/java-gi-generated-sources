package org.gtk.glib;

/**
 * The hashing algorithm to be used by {@link org.gtk.glib.Checksum} when performing the
 * digest of some data.
 * 
 * Note that the {@link org.gtk.glib.ChecksumType} enumeration may be extended at a later
 * date to include new hashing algorithm types.
 */
public enum ChecksumType {

    /**
     * Use the MD5 hashing algorithm
     */
    MD5,
    
    /**
     * Use the SHA-1 hashing algorithm
     */
    SHA1,
    
    /**
     * Use the SHA-256 hashing algorithm
     */
    SHA256,
    
    /**
     * Use the SHA-512 hashing algorithm (Since: 2.36)
     */
    SHA512,
    
    /**
     * Use the SHA-384 hashing algorithm (Since: 2.51)
     */
    SHA384;
    
    public static ChecksumType fromValue(int value) {
        return switch(value) {
            case 0 -> MD5;
            case 1 -> SHA1;
            case 2 -> SHA256;
            case 3 -> SHA512;
            case 4 -> SHA384;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case MD5 -> 0;
            case SHA1 -> 1;
            case SHA256 -> 2;
            case SHA512 -> 3;
            case SHA384 -> 4;
        };
    }

}
