package org.harfbuzz;

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
 */
public enum BufferClusterLevelT {

    /**
     * Return cluster values grouped by graphemes into
     *   monotone order.
     */
    MONOTONE_GRAPHEMES,
    
    /**
     * Return cluster values grouped into monotone order.
     */
    MONOTONE_CHARACTERS,
    
    /**
     * Don't group cluster values.
     */
    CHARACTERS,
    
    /**
     * Default cluster level,
     *   equal to {@code HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES}.
     */
    DEFAULT;
    
    public static BufferClusterLevelT fromValue(int value) {
        return switch(value) {
            case 0 -> MONOTONE_GRAPHEMES;
            case 1 -> MONOTONE_CHARACTERS;
            case 2 -> CHARACTERS;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case MONOTONE_GRAPHEMES -> 0;
            case MONOTONE_CHARACTERS -> 1;
            case CHARACTERS -> 2;
            case DEFAULT -> 0;
        };
    }

}
