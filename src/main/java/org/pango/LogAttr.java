package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoLogAttr} structure stores information about the attributes of a
 * single character.
 */
public class LogAttr extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("is_line_break"),
        ValueLayout.JAVA_INT.withName("is_mandatory_break"),
        ValueLayout.JAVA_INT.withName("is_char_break"),
        ValueLayout.JAVA_INT.withName("is_white"),
        ValueLayout.JAVA_INT.withName("is_cursor_position"),
        ValueLayout.JAVA_INT.withName("is_word_start"),
        ValueLayout.JAVA_INT.withName("is_word_end"),
        ValueLayout.JAVA_INT.withName("is_sentence_boundary"),
        ValueLayout.JAVA_INT.withName("is_sentence_start"),
        ValueLayout.JAVA_INT.withName("is_sentence_end"),
        ValueLayout.JAVA_INT.withName("backspace_deletes_character"),
        ValueLayout.JAVA_INT.withName("is_expandable_space"),
        ValueLayout.JAVA_INT.withName("is_word_boundary"),
        ValueLayout.JAVA_INT.withName("break_inserts_hyphen"),
        ValueLayout.JAVA_INT.withName("break_removes_preceding"),
        ValueLayout.JAVA_INT.withName("reserved")
    ).withName("PangoLogAttr");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public LogAttr(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
