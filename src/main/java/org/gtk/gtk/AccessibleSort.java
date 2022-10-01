package org.gtk.gtk;

/**
 * The possible values for the {@link AccessibleProperty#SORT}
 * accessible property.
 */
public class AccessibleSort extends io.github.jwharm.javagi.Enumeration {

    /**
     * There is no defined sort applied to the column.
     */
    public static final AccessibleSort NONE = new AccessibleSort(0);
    
    /**
     * Items are sorted in ascending order by this column.
     */
    public static final AccessibleSort ASCENDING = new AccessibleSort(1);
    
    /**
     * Items are sorted in descending order by this column.
     */
    public static final AccessibleSort DESCENDING = new AccessibleSort(2);
    
    /**
     * A sort algorithm other than ascending or
     *    descending has been applied.
     */
    public static final AccessibleSort OTHER = new AccessibleSort(3);
    
    public AccessibleSort(int value) {
        super(value);
    }
    
}
