package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the possible states of an {@link Animation}.
 * <p>
 * The state can be controlled with {@code Animation#play},
 * {@code Animation.pause#], [method@Animation.resume},
 * {@code Animation.reset#] and [method@Animation.skip}.
 * @version 1.0
 */
public class AnimationState extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "AdwAnimationState";
    
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
