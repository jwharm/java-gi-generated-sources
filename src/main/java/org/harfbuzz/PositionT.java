package org.harfbuzz;

/**
 * Data type for holding a single coordinate value.
 * Contour points and other multi-dimensional data are
 * stored as tuples of {@link PositionT}'s.
 */
public class PositionT extends io.github.jwharm.javagi.Alias<Integer> {
    
    public PositionT(int value) {
        super(value);
    }
}
