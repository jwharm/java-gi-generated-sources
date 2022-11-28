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
public class TagMergeMode extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstTagMergeMode";
    
    /**
     * undefined merge mode
     */
    public static final TagMergeMode UNDEFINED = new TagMergeMode(0);
    
    /**
     * replace all tags (clear list and append)
     */
    public static final TagMergeMode REPLACE_ALL = new TagMergeMode(1);
    
    /**
     * replace tags
     */
    public static final TagMergeMode REPLACE = new TagMergeMode(2);
    
    /**
     * append tags
     */
    public static final TagMergeMode APPEND = new TagMergeMode(3);
    
    /**
     * prepend tags
     */
    public static final TagMergeMode PREPEND = new TagMergeMode(4);
    
    /**
     * keep existing tags
     */
    public static final TagMergeMode KEEP = new TagMergeMode(5);
    
    /**
     * keep all existing tags
     */
    public static final TagMergeMode KEEP_ALL = new TagMergeMode(6);
    
    /**
     * the number of merge modes
     */
    public static final TagMergeMode COUNT = new TagMergeMode(7);
    
    public TagMergeMode(int value) {
        super(value);
    }
}
