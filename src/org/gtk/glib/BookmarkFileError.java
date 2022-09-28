package org.gtk.glib;

/**
 * Error codes returned by bookmark file parsing.
 */
public class BookmarkFileError {

    /**
     * URI was ill-formed
     */
    public static final BookmarkFileError INVALID_URI = new BookmarkFileError(0);
    
    /**
     * a requested field was not found
     */
    public static final BookmarkFileError INVALID_VALUE = new BookmarkFileError(1);
    
    /**
     * a requested application did
     *     not register a bookmark
     */
    public static final BookmarkFileError APP_NOT_REGISTERED = new BookmarkFileError(2);
    
    /**
     * a requested URI was not found
     */
    public static final BookmarkFileError URI_NOT_FOUND = new BookmarkFileError(3);
    
    /**
     * document was ill formed
     */
    public static final BookmarkFileError READ = new BookmarkFileError(4);
    
    /**
     * the text being parsed was
     *     in an unknown encoding
     */
    public static final BookmarkFileError UNKNOWN_ENCODING = new BookmarkFileError(5);
    
    /**
     * an error occurred while writing
     */
    public static final BookmarkFileError WRITE = new BookmarkFileError(6);
    
    /**
     * requested file was not found
     */
    public static final BookmarkFileError FILE_NOT_FOUND = new BookmarkFileError(7);
    
    private int value;
    
    public BookmarkFileError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BookmarkFileError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
