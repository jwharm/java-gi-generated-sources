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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link LogAttr}
     * @return A new, uninitialized @{link LogAttr}
     */
    public static LogAttr allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        LogAttr newInstance = new LogAttr(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code is_line_break}
     * @return The value of the field {@code is_line_break}
     */
    public int getIsLineBreak() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_line_break"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_line_break}
     * @param isLineBreak The new value of the field {@code is_line_break}
     */
    public void setIsLineBreak(int isLineBreak) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_line_break"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isLineBreak);
        }
    }
    
    /**
     * Get the value of the field {@code is_mandatory_break}
     * @return The value of the field {@code is_mandatory_break}
     */
    public int getIsMandatoryBreak() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_mandatory_break"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_mandatory_break}
     * @param isMandatoryBreak The new value of the field {@code is_mandatory_break}
     */
    public void setIsMandatoryBreak(int isMandatoryBreak) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_mandatory_break"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isMandatoryBreak);
        }
    }
    
    /**
     * Get the value of the field {@code is_char_break}
     * @return The value of the field {@code is_char_break}
     */
    public int getIsCharBreak() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_char_break"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_char_break}
     * @param isCharBreak The new value of the field {@code is_char_break}
     */
    public void setIsCharBreak(int isCharBreak) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_char_break"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isCharBreak);
        }
    }
    
    /**
     * Get the value of the field {@code is_white}
     * @return The value of the field {@code is_white}
     */
    public int getIsWhite() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_white"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_white}
     * @param isWhite The new value of the field {@code is_white}
     */
    public void setIsWhite(int isWhite) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_white"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isWhite);
        }
    }
    
    /**
     * Get the value of the field {@code is_cursor_position}
     * @return The value of the field {@code is_cursor_position}
     */
    public int getIsCursorPosition() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_cursor_position"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_cursor_position}
     * @param isCursorPosition The new value of the field {@code is_cursor_position}
     */
    public void setIsCursorPosition(int isCursorPosition) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_cursor_position"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isCursorPosition);
        }
    }
    
    /**
     * Get the value of the field {@code is_word_start}
     * @return The value of the field {@code is_word_start}
     */
    public int getIsWordStart() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_word_start"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_word_start}
     * @param isWordStart The new value of the field {@code is_word_start}
     */
    public void setIsWordStart(int isWordStart) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_word_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isWordStart);
        }
    }
    
    /**
     * Get the value of the field {@code is_word_end}
     * @return The value of the field {@code is_word_end}
     */
    public int getIsWordEnd() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_word_end"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_word_end}
     * @param isWordEnd The new value of the field {@code is_word_end}
     */
    public void setIsWordEnd(int isWordEnd) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_word_end"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isWordEnd);
        }
    }
    
    /**
     * Get the value of the field {@code is_sentence_boundary}
     * @return The value of the field {@code is_sentence_boundary}
     */
    public int getIsSentenceBoundary() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_boundary"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_sentence_boundary}
     * @param isSentenceBoundary The new value of the field {@code is_sentence_boundary}
     */
    public void setIsSentenceBoundary(int isSentenceBoundary) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_boundary"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isSentenceBoundary);
        }
    }
    
    /**
     * Get the value of the field {@code is_sentence_start}
     * @return The value of the field {@code is_sentence_start}
     */
    public int getIsSentenceStart() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_start"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_sentence_start}
     * @param isSentenceStart The new value of the field {@code is_sentence_start}
     */
    public void setIsSentenceStart(int isSentenceStart) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isSentenceStart);
        }
    }
    
    /**
     * Get the value of the field {@code is_sentence_end}
     * @return The value of the field {@code is_sentence_end}
     */
    public int getIsSentenceEnd() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_end"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_sentence_end}
     * @param isSentenceEnd The new value of the field {@code is_sentence_end}
     */
    public void setIsSentenceEnd(int isSentenceEnd) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_end"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isSentenceEnd);
        }
    }
    
    /**
     * Get the value of the field {@code backspace_deletes_character}
     * @return The value of the field {@code backspace_deletes_character}
     */
    public int getBackspaceDeletesCharacter() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("backspace_deletes_character"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code backspace_deletes_character}
     * @param backspaceDeletesCharacter The new value of the field {@code backspace_deletes_character}
     */
    public void setBackspaceDeletesCharacter(int backspaceDeletesCharacter) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("backspace_deletes_character"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), backspaceDeletesCharacter);
        }
    }
    
    /**
     * Get the value of the field {@code is_expandable_space}
     * @return The value of the field {@code is_expandable_space}
     */
    public int getIsExpandableSpace() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_expandable_space"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_expandable_space}
     * @param isExpandableSpace The new value of the field {@code is_expandable_space}
     */
    public void setIsExpandableSpace(int isExpandableSpace) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_expandable_space"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isExpandableSpace);
        }
    }
    
    /**
     * Get the value of the field {@code is_word_boundary}
     * @return The value of the field {@code is_word_boundary}
     */
    public int getIsWordBoundary() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_word_boundary"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_word_boundary}
     * @param isWordBoundary The new value of the field {@code is_word_boundary}
     */
    public void setIsWordBoundary(int isWordBoundary) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_word_boundary"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isWordBoundary);
        }
    }
    
    /**
     * Get the value of the field {@code break_inserts_hyphen}
     * @return The value of the field {@code break_inserts_hyphen}
     */
    public int getBreakInsertsHyphen() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("break_inserts_hyphen"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code break_inserts_hyphen}
     * @param breakInsertsHyphen The new value of the field {@code break_inserts_hyphen}
     */
    public void setBreakInsertsHyphen(int breakInsertsHyphen) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("break_inserts_hyphen"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), breakInsertsHyphen);
        }
    }
    
    /**
     * Get the value of the field {@code break_removes_preceding}
     * @return The value of the field {@code break_removes_preceding}
     */
    public int getBreakRemovesPreceding() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("break_removes_preceding"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code break_removes_preceding}
     * @param breakRemovesPreceding The new value of the field {@code break_removes_preceding}
     */
    public void setBreakRemovesPreceding(int breakRemovesPreceding) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("break_removes_preceding"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), breakRemovesPreceding);
        }
    }
    
    /**
     * Create a LogAttr proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected LogAttr(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, LogAttr> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new LogAttr(input);
    
    /**
     * A {@link LogAttr.Builder} object constructs a {@link LogAttr} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link LogAttr.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final LogAttr struct;
        
        private Builder() {
            struct = LogAttr.allocate();
        }
        
        /**
         * Finish building the {@link LogAttr} struct.
         * @return A new instance of {@code LogAttr} with the fields 
         *         that were set in the Builder object.
         */
        public LogAttr build() {
            return struct;
        }
        
        /**
         * if set, can break line in front of character
         * @param isLineBreak The value for the {@code isLineBreak} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsLineBreak(int isLineBreak) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_line_break"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isLineBreak);
                return this;
            }
        }
        
        /**
         * if set, must break line in front of character
         * @param isMandatoryBreak The value for the {@code isMandatoryBreak} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsMandatoryBreak(int isMandatoryBreak) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_mandatory_break"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isMandatoryBreak);
                return this;
            }
        }
        
        /**
         * if set, can break here when doing character wrapping
         * @param isCharBreak The value for the {@code isCharBreak} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsCharBreak(int isCharBreak) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_char_break"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isCharBreak);
                return this;
            }
        }
        
        /**
         * is whitespace character
         * @param isWhite The value for the {@code isWhite} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsWhite(int isWhite) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_white"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isWhite);
                return this;
            }
        }
        
        /**
         * if set, cursor can appear in front of character.
         *   i.e. this is a grapheme boundary, or the first character in the text.
         *   This flag implements Unicode's
         *   <a href="http://www.unicode.org/reports/tr29/">Grapheme Cluster Boundaries</a>
         *   semantics.
         * @param isCursorPosition The value for the {@code isCursorPosition} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsCursorPosition(int isCursorPosition) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_cursor_position"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isCursorPosition);
                return this;
            }
        }
        
        /**
         * is first character in a word
         * @param isWordStart The value for the {@code isWordStart} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsWordStart(int isWordStart) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_word_start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isWordStart);
                return this;
            }
        }
        
        /**
         * is first non-word char after a word
         *   Note that in degenerate cases, you could have both {@code is_word_start}
         *   and {@code is_word_end} set for some character.
         * @param isWordEnd The value for the {@code isWordEnd} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsWordEnd(int isWordEnd) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_word_end"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isWordEnd);
                return this;
            }
        }
        
        /**
         * is a sentence boundary.
         *   There are two ways to divide sentences. The first assigns all
         *   inter-sentence whitespace/control/format chars to some sentence,
         *   so all chars are in some sentence; {@code is_sentence_boundary} denotes
         *   the boundaries there. The second way doesn't assign
         *   between-sentence spaces, etc. to any sentence, so
         *   {@code is_sentence_start}/{@code is_sentence_end} mark the boundaries of those sentences.
         * @param isSentenceBoundary The value for the {@code isSentenceBoundary} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsSentenceBoundary(int isSentenceBoundary) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_boundary"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isSentenceBoundary);
                return this;
            }
        }
        
        /**
         * is first character in a sentence
         * @param isSentenceStart The value for the {@code isSentenceStart} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsSentenceStart(int isSentenceStart) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isSentenceStart);
                return this;
            }
        }
        
        /**
         * is first char after a sentence.
         *   Note that in degenerate cases, you could have both {@code is_sentence_start}
         *   and {@code is_sentence_end} set for some character. (e.g. no space after a
         *   period, so the next sentence starts right away)
         * @param isSentenceEnd The value for the {@code isSentenceEnd} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsSentenceEnd(int isSentenceEnd) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_sentence_end"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isSentenceEnd);
                return this;
            }
        }
        
        /**
         * if set, backspace deletes one character
         *   rather than the entire grapheme cluster. This field is only meaningful
         *   on grapheme boundaries (where {@code is_cursor_position} is set). In some languages,
         *   the full grapheme (e.g. letter + diacritics) is considered a unit, while in
         *   others, each decomposed character in the grapheme is a unit. In the default
         *   implementation of {@link Pango#break_}, this bit is set on all grapheme boundaries
         *   except those following Latin, Cyrillic or Greek base characters.
         * @param backspaceDeletesCharacter The value for the {@code backspaceDeletesCharacter} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBackspaceDeletesCharacter(int backspaceDeletesCharacter) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("backspace_deletes_character"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), backspaceDeletesCharacter);
                return this;
            }
        }
        
        /**
         * is a whitespace character that can possibly be
         *   expanded for justification purposes. (Since: 1.18)
         * @param isExpandableSpace The value for the {@code isExpandableSpace} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsExpandableSpace(int isExpandableSpace) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_expandable_space"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isExpandableSpace);
                return this;
            }
        }
        
        /**
         * is a word boundary, as defined by UAX{@code 29}.
         *   More specifically, means that this is not a position in the middle of a word.
         *   For example, both sides of a punctuation mark are considered word boundaries.
         *   This flag is particularly useful when selecting text word-by-word. This flag
         *   implements Unicode's <a href="http://www.unicode.org/reports/tr29/">Word Boundaries</a>
         *   semantics. (Since: 1.22)
         * @param isWordBoundary The value for the {@code isWordBoundary} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsWordBoundary(int isWordBoundary) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_word_boundary"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isWordBoundary);
                return this;
            }
        }
        
        /**
         * when breaking lines before this char, insert a hyphen.
         *   Since: 1.50
         * @param breakInsertsHyphen The value for the {@code breakInsertsHyphen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBreakInsertsHyphen(int breakInsertsHyphen) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("break_inserts_hyphen"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), breakInsertsHyphen);
                return this;
            }
        }
        
        /**
         * when breaking lines before this char, remove the
         *   preceding char. Since 1.50
         * @param breakRemovesPreceding The value for the {@code breakRemovesPreceding} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBreakRemovesPreceding(int breakRemovesPreceding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("break_removes_preceding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), breakRemovesPreceding);
                return this;
            }
        }
        
        public Builder setReserved(int reserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), reserved);
                return this;
            }
        }
    }
}
