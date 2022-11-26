package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoLogAttr} structure stores information about the attributes of a
 * single character.
 */
public class LogAttr extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoLogAttr";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("is_line_break"),
        Interop.valueLayout.C_INT.withName("is_mandatory_break"),
        Interop.valueLayout.C_INT.withName("is_char_break"),
        Interop.valueLayout.C_INT.withName("is_white"),
        Interop.valueLayout.C_INT.withName("is_cursor_position"),
        Interop.valueLayout.C_INT.withName("is_word_start"),
        Interop.valueLayout.C_INT.withName("is_word_end"),
        Interop.valueLayout.C_INT.withName("is_sentence_boundary"),
        Interop.valueLayout.C_INT.withName("is_sentence_start"),
        Interop.valueLayout.C_INT.withName("is_sentence_end"),
        Interop.valueLayout.C_INT.withName("backspace_deletes_character"),
        Interop.valueLayout.C_INT.withName("is_expandable_space"),
        Interop.valueLayout.C_INT.withName("is_word_boundary"),
        Interop.valueLayout.C_INT.withName("break_inserts_hyphen"),
        Interop.valueLayout.C_INT.withName("break_removes_preceding"),
        Interop.valueLayout.C_INT.withName("reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link LogAttr}
     * @return A new, uninitialized @{link LogAttr}
     */
    public static LogAttr allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        LogAttr newInstance = new LogAttr(segment.address(), Ownership.NONE);
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
    
    /**
     * Create a LogAttr proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public LogAttr(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private LogAttr struct;
        
         /**
         * A {@link LogAttr.Build} object constructs a {@link LogAttr} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = LogAttr.allocate();
        }
        
         /**
         * Finish building the {@link LogAttr} struct.
         * @return A new instance of {@code LogAttr} with the fields 
         *         that were set in the Build object.
         */
        public LogAttr construct() {
            return struct;
        }
        
        /**
         * if set, can break line in front of character
         * @param is_line_break The value for the {@code is_line_break} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsLineBreak(int is_line_break) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_line_break"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_line_break);
            return this;
        }
        
        /**
         * if set, must break line in front of character
         * @param is_mandatory_break The value for the {@code is_mandatory_break} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsMandatoryBreak(int is_mandatory_break) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_mandatory_break"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_mandatory_break);
            return this;
        }
        
        /**
         * if set, can break here when doing character wrapping
         * @param is_char_break The value for the {@code is_char_break} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsCharBreak(int is_char_break) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_char_break"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_char_break);
            return this;
        }
        
        /**
         * is whitespace character
         * @param is_white The value for the {@code is_white} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsWhite(int is_white) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_white"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_white);
            return this;
        }
        
        /**
         * if set, cursor can appear in front of character.
         *   i.e. this is a grapheme boundary, or the first character in the text.
         *   This flag implements Unicode's
         *   <a href="http://www.unicode.org/reports/tr29/">Grapheme Cluster Boundaries</a>
         *   semantics.
         * @param is_cursor_position The value for the {@code is_cursor_position} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsCursorPosition(int is_cursor_position) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_cursor_position"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_cursor_position);
            return this;
        }
        
        /**
         * is first character in a word
         * @param is_word_start The value for the {@code is_word_start} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsWordStart(int is_word_start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_word_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_word_start);
            return this;
        }
        
        /**
         * is first non-word char after a word
         *   Note that in degenerate cases, you could have both {@code is_word_start}
         *   and {@code is_word_end} set for some character.
         * @param is_word_end The value for the {@code is_word_end} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsWordEnd(int is_word_end) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_word_end"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_word_end);
            return this;
        }
        
        /**
         * is a sentence boundary.
         *   There are two ways to divide sentences. The first assigns all
         *   inter-sentence whitespace/control/format chars to some sentence,
         *   so all chars are in some sentence; {@code is_sentence_boundary} denotes
         *   the boundaries there. The second way doesn't assign
         *   between-sentence spaces, etc. to any sentence, so
         *   {@code is_sentence_start}/{@code is_sentence_end} mark the boundaries of those sentences.
         * @param is_sentence_boundary The value for the {@code is_sentence_boundary} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsSentenceBoundary(int is_sentence_boundary) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_boundary"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_sentence_boundary);
            return this;
        }
        
        /**
         * is first character in a sentence
         * @param is_sentence_start The value for the {@code is_sentence_start} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsSentenceStart(int is_sentence_start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_sentence_start);
            return this;
        }
        
        /**
         * is first char after a sentence.
         *   Note that in degenerate cases, you could have both {@code is_sentence_start}
         *   and {@code is_sentence_end} set for some character. (e.g. no space after a
         *   period, so the next sentence starts right away)
         * @param is_sentence_end The value for the {@code is_sentence_end} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsSentenceEnd(int is_sentence_end) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_end"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_sentence_end);
            return this;
        }
        
        /**
         * if set, backspace deletes one character
         *   rather than the entire grapheme cluster. This field is only meaningful
         *   on grapheme boundaries (where {@code is_cursor_position} is set). In some languages,
         *   the full grapheme (e.g. letter + diacritics) is considered a unit, while in
         *   others, each decomposed character in the grapheme is a unit. In the default
         *   implementation of {@link Pango#break_}, this bit is set on all grapheme boundaries
         *   except those following Latin, Cyrillic or Greek base characters.
         * @param backspace_deletes_character The value for the {@code backspace_deletes_character} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBackspaceDeletesCharacter(int backspace_deletes_character) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("backspace_deletes_character"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), backspace_deletes_character);
            return this;
        }
        
        /**
         * is a whitespace character that can possibly be
         *   expanded for justification purposes. (Since: 1.18)
         * @param is_expandable_space The value for the {@code is_expandable_space} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsExpandableSpace(int is_expandable_space) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_expandable_space"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_expandable_space);
            return this;
        }
        
        /**
         * is a word boundary, as defined by UAX{@code 29}.
         *   More specifically, means that this is not a position in the middle of a word.
         *   For example, both sides of a punctuation mark are considered word boundaries.
         *   This flag is particularly useful when selecting text word-by-word. This flag
         *   implements Unicode's <a href="http://www.unicode.org/reports/tr29/">Word Boundaries</a>
         *   semantics. (Since: 1.22)
         * @param is_word_boundary The value for the {@code is_word_boundary} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsWordBoundary(int is_word_boundary) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_word_boundary"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_word_boundary);
            return this;
        }
        
        /**
         * when breaking lines before this char, insert a hyphen.
         *   Since: 1.50
         * @param break_inserts_hyphen The value for the {@code break_inserts_hyphen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBreakInsertsHyphen(int break_inserts_hyphen) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("break_inserts_hyphen"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), break_inserts_hyphen);
            return this;
        }
        
        /**
         * when breaking lines before this char, remove the
         *   preceding char. Since 1.50
         * @param break_removes_preceding The value for the {@code break_removes_preceding} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBreakRemovesPreceding(int break_removes_preceding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("break_removes_preceding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), break_removes_preceding);
            return this;
        }
        
        public Build setReserved(int reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), reserved);
            return this;
        }
    }
}
