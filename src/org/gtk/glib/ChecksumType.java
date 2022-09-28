package org.gtk.glib;

/**
 * The hashing algorithm to be used by {@link Checksum} when performing the
 * digest of some data.
 * <p>
 * Note that the {@link ChecksumType} enumeration may be extended at a later
 * date to include new hashing algorithm types.
 */
public class ChecksumType {

    /**
     * Use the MD5 hashing algorithm
     */
    public static final ChecksumType MD5 = new ChecksumType(0);
    
    /**
     * Use the SHA-1 hashing algorithm
     */
    public static final ChecksumType SHA1 = new ChecksumType(1);
    
    /**
     * Use the SHA-256 hashing algorithm
     */
    public static final ChecksumType SHA256 = new ChecksumType(2);
    
    /**
     * Use the SHA-512 hashing algorithm (Since: 2.36)
     */
    public static final ChecksumType SHA512 = new ChecksumType(3);
    
    /**
     * Use the SHA-384 hashing algorithm (Since: 2.51)
     */
    public static final ChecksumType SHA384 = new ChecksumType(4);
    
    private int value;
    
    public ChecksumType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ChecksumType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
