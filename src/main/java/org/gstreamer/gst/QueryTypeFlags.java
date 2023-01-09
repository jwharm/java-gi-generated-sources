package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link QueryTypeFlags} indicate the aspects of the different {@link QueryType}
 * values. You can get the type flags of a {@link QueryType} with the
 * gst_query_type_get_flags() function.
 */
public class QueryTypeFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstQueryTypeFlags";
    
    /**
     * Set if the query can travel upstream.
     */
    public static final QueryTypeFlags UPSTREAM = new QueryTypeFlags(1);
    
    /**
     * Set if the query can travel downstream.
     */
    public static final QueryTypeFlags DOWNSTREAM = new QueryTypeFlags(2);
    
    /**
     * Set if the query should be serialized with data
     *                               flow.
     */
    public static final QueryTypeFlags SERIALIZED = new QueryTypeFlags(4);
    
    /**
     * Create a new QueryTypeFlags with the provided value
     */
    public QueryTypeFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public QueryTypeFlags or(QueryTypeFlags... masks) {
        int value = this.getValue();
        for (QueryTypeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new QueryTypeFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static QueryTypeFlags combined(QueryTypeFlags mask, QueryTypeFlags... masks) {
        int value = mask.getValue();
        for (QueryTypeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new QueryTypeFlags(value);
    }
}
