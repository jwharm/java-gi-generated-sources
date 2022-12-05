package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding HarfBuzz's clustering behavior options. The cluster level
 * dictates one aspect of how HarfBuzz will treat non-base characters
 * during shaping.
 * <p>
 * In {@code HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES}, non-base
 * characters are merged into the cluster of the base character that precedes them.
 * <p>
 * In {@code HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS}, non-base characters are initially
 * assigned their own cluster values, which are not merged into preceding base
 * clusters. This allows HarfBuzz to perform additional operations like reorder
 * sequences of adjacent marks.
 * <p>
 * {@code HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES} is the default, because it maintains
 * backward compatibility with older versions of HarfBuzz. New client programs that
 * do not need to maintain such backward compatibility are recommended to use
 * {@code HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS} instead of the default.
 * @version 0.9.42
 */
public enum BufferClusterLevelT implements io.github.jwharm.javagi.Enumeration {
    /**
     * Return cluster values grouped by graphemes into
     *   monotone order.
     */
    MONOTONE_GRAPHEMES(0),
    /**
     * Return cluster values grouped into monotone order.
     */
    MONOTONE_CHARACTERS(1),
    /**
     * Don't group cluster values.
     */
    CHARACTERS(2);
    public static final BufferClusterLevelT DEFAULT = MONOTONE_GRAPHEMES;
    
    private static final java.lang.String C_TYPE_NAME = "hb_buffer_cluster_level_t";
    
    private final int value;
    BufferClusterLevelT(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static BufferClusterLevelT of(int value) {
        return switch (value) {
            case 0 -> MONOTONE_GRAPHEMES;
            case 1 -> MONOTONE_CHARACTERS;
            case 2 -> CHARACTERS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
