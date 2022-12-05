package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different tag merging modes are basically replace, overwrite and append,
 * but they can be seen from two directions. Given two taglists: (A) the tags
 * already in the element and (B) the ones that are supplied to the element (
 * e.g. via gst_tag_setter_merge_tags() / gst_tag_setter_add_tags() or a
 * {@link EventType#TAG}), how are these tags merged?
 * In the table below this is shown for the cases that a tag exists in the list
 * (A) or does not exists (!A) and combinations thereof.
 * <p>
 * | merge mode  | A + B | A + !B | !A + B | !A + !B |
 * | ----------- | ----- | ------ | ------ | ------- |
 * | REPLACE_ALL | B     | ø      | B      | ø       |
 * | REPLACE     | B     | A      | B      | ø       |
 * | APPEND      | A, B  | A      | B      | ø       |
 * | PREPEND     | B, A  | A      | B      | ø       |
 * | KEEP        | A     | A      | B      | ø       |
 * | KEEP_ALL    | A     | A      | ø      | ø       |
 */
public enum TagMergeMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * undefined merge mode
     */
    UNDEFINED(0),
    /**
     * replace all tags (clear list and append)
     */
    REPLACE_ALL(1),
    /**
     * replace tags
     */
    REPLACE(2),
    /**
     * append tags
     */
    APPEND(3),
    /**
     * prepend tags
     */
    PREPEND(4),
    /**
     * keep existing tags
     */
    KEEP(5),
    /**
     * keep all existing tags
     */
    KEEP_ALL(6),
    /**
     * the number of merge modes
     */
    COUNT(7);
    
    private static final java.lang.String C_TYPE_NAME = "GstTagMergeMode";
    
    private final int value;
    TagMergeMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TagMergeMode of(int value) {
        return switch (value) {
            case 0 -> UNDEFINED;
            case 1 -> REPLACE_ALL;
            case 2 -> REPLACE;
            case 3 -> APPEND;
            case 4 -> PREPEND;
            case 5 -> KEEP;
            case 6 -> KEEP_ALL;
            case 7 -> COUNT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
