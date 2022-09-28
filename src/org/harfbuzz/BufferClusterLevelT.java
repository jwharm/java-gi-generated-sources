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
public class BufferClusterLevelT {

    /**
     * Return cluster values grouped by graphemes into
     *   monotone order.
     */
    public static final BufferClusterLevelT MONOTONE_GRAPHEMES = new BufferClusterLevelT(0);
    
    /**
     * Return cluster values grouped into monotone order.
     */
    public static final BufferClusterLevelT MONOTONE_CHARACTERS = new BufferClusterLevelT(1);
    
    /**
     * Don't group cluster values.
     */
    public static final BufferClusterLevelT CHARACTERS = new BufferClusterLevelT(2);
    
    /**
     * Default cluster level,
     *   equal to {@code HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES}.
     */
    public static final BufferClusterLevelT DEFAULT = new BufferClusterLevelT(0);
    
    private int value;
    
    public BufferClusterLevelT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BufferClusterLevelT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
