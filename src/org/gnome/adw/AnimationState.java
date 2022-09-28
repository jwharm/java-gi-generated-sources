package org.gnome.adw;

/**
 * Describes the possible states of an {@link Animation}.
 * <p>
 * The state can be controlled with {@link Animation#play},
 * {@code Animation.resume},
 * {@code Animation.skip}.
 */
public class AnimationState extends io.github.jwharm.javagi.Enumeration {

    /**
     * The animation hasn't started yet.
     */
    public static final AnimationState IDLE = new AnimationState(0);
    
    /**
     * The animation has been paused.
     */
    public static final AnimationState PAUSED = new AnimationState(1);
    
    /**
     * The animation is currently playing.
     */
    public static final AnimationState PLAYING = new AnimationState(2);
    
    /**
     * The animation has finished.
     */
    public static final AnimationState FINISHED = new AnimationState(3);
    
    public AnimationState(int value) {
        super(value);
    }
    
}
