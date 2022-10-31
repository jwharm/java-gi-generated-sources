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
    
    private static final java.lang.String C_TYPE_NAME = "PangoLogAttr";
    
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
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static LogAttr allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        LogAttr newInstance = new LogAttr(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code is_line_break}
     * @return The value of the field {@code is_line_break}
     */
    public int is_line_break$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_line_break"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_line_break}
     * @param is_line_break The new value of the field {@code is_line_break}
     */
    public void is_line_break$set(int is_line_break) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_line_break"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_line_break);
    }
    
    /**
     * Get the value of the field {@code is_mandatory_break}
     * @return The value of the field {@code is_mandatory_break}
     */
    public int is_mandatory_break$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_mandatory_break"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_mandatory_break}
     * @param is_mandatory_break The new value of the field {@code is_mandatory_break}
     */
    public void is_mandatory_break$set(int is_mandatory_break) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_mandatory_break"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_mandatory_break);
    }
    
    /**
     * Get the value of the field {@code is_char_break}
     * @return The value of the field {@code is_char_break}
     */
    public int is_char_break$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_char_break"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_char_break}
     * @param is_char_break The new value of the field {@code is_char_break}
     */
    public void is_char_break$set(int is_char_break) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_char_break"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_char_break);
    }
    
    /**
     * Get the value of the field {@code is_white}
     * @return The value of the field {@code is_white}
     */
    public int is_white$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_white"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_white}
     * @param is_white The new value of the field {@code is_white}
     */
    public void is_white$set(int is_white) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_white"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_white);
    }
    
    /**
     * Get the value of the field {@code is_cursor_position}
     * @return The value of the field {@code is_cursor_position}
     */
    public int is_cursor_position$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_cursor_position"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_cursor_position}
     * @param is_cursor_position The new value of the field {@code is_cursor_position}
     */
    public void is_cursor_position$set(int is_cursor_position) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_cursor_position"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_cursor_position);
    }
    
    /**
     * Get the value of the field {@code is_word_start}
     * @return The value of the field {@code is_word_start}
     */
    public int is_word_start$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_word_start"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_word_start}
     * @param is_word_start The new value of the field {@code is_word_start}
     */
    public void is_word_start$set(int is_word_start) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_word_start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_word_start);
    }
    
    /**
     * Get the value of the field {@code is_word_end}
     * @return The value of the field {@code is_word_end}
     */
    public int is_word_end$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_word_end"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_word_end}
     * @param is_word_end The new value of the field {@code is_word_end}
     */
    public void is_word_end$set(int is_word_end) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_word_end"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_word_end);
    }
    
    /**
     * Get the value of the field {@code is_sentence_boundary}
     * @return The value of the field {@code is_sentence_boundary}
     */
    public int is_sentence_boundary$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_boundary"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_sentence_boundary}
     * @param is_sentence_boundary The new value of the field {@code is_sentence_boundary}
     */
    public void is_sentence_boundary$set(int is_sentence_boundary) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_boundary"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_sentence_boundary);
    }
    
    /**
     * Get the value of the field {@code is_sentence_start}
     * @return The value of the field {@code is_sentence_start}
     */
    public int is_sentence_start$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_start"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_sentence_start}
     * @param is_sentence_start The new value of the field {@code is_sentence_start}
     */
    public void is_sentence_start$set(int is_sentence_start) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_sentence_start);
    }
    
    /**
     * Get the value of the field {@code is_sentence_end}
     * @return The value of the field {@code is_sentence_end}
     */
    public int is_sentence_end$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_end"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_sentence_end}
     * @param is_sentence_end The new value of the field {@code is_sentence_end}
     */
    public void is_sentence_end$set(int is_sentence_end) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_end"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_sentence_end);
    }
    
    /**
     * Get the value of the field {@code backspace_deletes_character}
     * @return The value of the field {@code backspace_deletes_character}
     */
    public int backspace_deletes_character$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("backspace_deletes_character"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code backspace_deletes_character}
     * @param backspace_deletes_character The new value of the field {@code backspace_deletes_character}
     */
    public void backspace_deletes_character$set(int backspace_deletes_character) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("backspace_deletes_character"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), backspace_deletes_character);
    }
    
    /**
     * Get the value of the field {@code is_expandable_space}
     * @return The value of the field {@code is_expandable_space}
     */
    public int is_expandable_space$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_expandable_space"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_expandable_space}
     * @param is_expandable_space The new value of the field {@code is_expandable_space}
     */
    public void is_expandable_space$set(int is_expandable_space) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_expandable_space"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_expandable_space);
    }
    
    /**
     * Get the value of the field {@code is_word_boundary}
     * @return The value of the field {@code is_word_boundary}
     */
    public int is_word_boundary$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_word_boundary"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_word_boundary}
     * @param is_word_boundary The new value of the field {@code is_word_boundary}
     */
    public void is_word_boundary$set(int is_word_boundary) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_word_boundary"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_word_boundary);
    }
    
    /**
     * Get the value of the field {@code break_inserts_hyphen}
     * @return The value of the field {@code break_inserts_hyphen}
     */
    public int break_inserts_hyphen$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("break_inserts_hyphen"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code break_inserts_hyphen}
     * @param break_inserts_hyphen The new value of the field {@code break_inserts_hyphen}
     */
    public void break_inserts_hyphen$set(int break_inserts_hyphen) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("break_inserts_hyphen"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), break_inserts_hyphen);
    }
    
    /**
     * Get the value of the field {@code break_removes_preceding}
     * @return The value of the field {@code break_removes_preceding}
     */
    public int break_removes_preceding$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("break_removes_preceding"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code break_removes_preceding}
     * @param break_removes_preceding The new value of the field {@code break_removes_preceding}
     */
    public void break_removes_preceding$set(int break_removes_preceding) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("break_removes_preceding"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), break_removes_preceding);
    }
    
    /**
     * Get the value of the field {@code reserved}
     * @return The value of the field {@code reserved}
     */
    public int reserved$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reserved"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code reserved}
     * @param reserved The new value of the field {@code reserved}
     */
    public void reserved$set(int reserved) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reserved"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), reserved);
    }
    
    @ApiStatus.Internal
    public LogAttr(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
