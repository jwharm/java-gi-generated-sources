package org.gtk.gtk;

/**
 * Describes how {@link LevelBar} contents should be rendered.
 * <p>
 * Note that this enumeration could be extended with additional modes
 * in the future.
 */
public class LevelBarMode extends io.github.jwharm.javagi.Enumeration {

    /**
     * the bar has a continuous mode
     */
    public static final LevelBarMode CONTINUOUS = new LevelBarMode(0);
    
    /**
     * the bar has a discrete mode
     */
    public static final LevelBarMode DISCRETE = new LevelBarMode(1);
    
    public LevelBarMode(int value) {
        super(value);
    }
    
}
