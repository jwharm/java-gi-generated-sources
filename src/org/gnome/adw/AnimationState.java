package org.gnome.adw;

/**
 * Describes the possible states of an {@link Animation}.
 * <p>
 * The state can be controlled with {@link animation.play#null},
 * {@code Animation.resume},
 * {@code Animation.skip}.
 */
public enum AnimationState {

    /**
     * The animation hasn't started yet.
     */
    IDLE,
    
    /**
     * The animation has been paused.
     */
    PAUSED,
    
    /**
     * The animation is currently playing.
     */
    PLAYING,
    
    /**
     * The animation has finished.
     */
    FINISHED;
    
    public static AnimationState fromValue(int value) {
        return switch(value) {
            case 0 -> IDLE;
            case 1 -> PAUSED;
            case 2 -> PLAYING;
            case 3 -> FINISHED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case IDLE -> 0;
            case PAUSED -> 1;
            case PLAYING -> 2;
            case FINISHED -> 3;
        };
    }

}
