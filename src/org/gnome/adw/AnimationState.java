package org.gnome.adw;

/**
 * Describes the possible states of an {@link Animation}.
 * <p>
 * The state can be controlled with {@link Animation#play},
 * {@code Animation.resume},
 * {@code Animation.skip}.
 */
public class AnimationState {

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
    
    private int value;
    
    public AnimationState(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(AnimationState[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
