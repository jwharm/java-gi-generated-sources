package org.gnome.adw;

/**
 * Describes the possible folding behavior of a {@link Flap} widget.
 */
public enum FlapFoldPolicy {

    /**
     * Disable folding, the flap cannot reach narrow
     *   sizes.
     */
    NEVER,
    
    /**
     * Keep the flap always folded.
     */
    ALWAYS,
    
    /**
     * Fold and unfold the flap based on available
     *   space.
     */
    AUTO;
    
    public static FlapFoldPolicy fromValue(int value) {
        return switch(value) {
            case 0 -> NEVER;
            case 1 -> ALWAYS;
            case 2 -> AUTO;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NEVER -> 0;
            case ALWAYS -> 1;
            case AUTO -> 2;
        };
    }

}
