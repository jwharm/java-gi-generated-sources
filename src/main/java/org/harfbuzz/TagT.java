package org.harfbuzz;

/**
 * Data type for tag identifiers. Tags are four
 * byte integers, each byte representing a character.
 * <p>
 * Tags are used to identify tables, design-variation axes,
 * scripts, languages, font features, and baselines with
 * human-readable names.
 */
public class TagT extends io.github.jwharm.javagi.Alias<Integer> {
    
    public TagT(int value) {
        super(value);
    }
}
