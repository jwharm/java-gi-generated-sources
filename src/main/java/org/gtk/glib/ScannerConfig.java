package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the {@link Scanner} parser configuration. Most settings can
 * be changed during the parsing phase and will affect the lexical
 * parsing of the next unpeeked token.
 */
public class ScannerConfig extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GScannerConfig";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("cset_skip_characters"),
        Interop.valueLayout.ADDRESS.withName("cset_identifier_first"),
        Interop.valueLayout.ADDRESS.withName("cset_identifier_nth"),
        Interop.valueLayout.ADDRESS.withName("cpair_comment_single"),
        Interop.valueLayout.C_INT.withName("case_sensitive"),
        Interop.valueLayout.C_INT.withName("skip_comment_multi"),
        Interop.valueLayout.C_INT.withName("skip_comment_single"),
        Interop.valueLayout.C_INT.withName("scan_comment_multi"),
        Interop.valueLayout.C_INT.withName("scan_identifier"),
        Interop.valueLayout.C_INT.withName("scan_identifier_1char"),
        Interop.valueLayout.C_INT.withName("scan_identifier_NULL"),
        Interop.valueLayout.C_INT.withName("scan_symbols"),
        Interop.valueLayout.C_INT.withName("scan_binary"),
        Interop.valueLayout.C_INT.withName("scan_octal"),
        Interop.valueLayout.C_INT.withName("scan_float"),
        Interop.valueLayout.C_INT.withName("scan_hex"),
        Interop.valueLayout.C_INT.withName("scan_hex_dollar"),
        Interop.valueLayout.C_INT.withName("scan_string_sq"),
        Interop.valueLayout.C_INT.withName("scan_string_dq"),
        Interop.valueLayout.C_INT.withName("numbers_2_int"),
        Interop.valueLayout.C_INT.withName("int_2_float"),
        Interop.valueLayout.C_INT.withName("identifier_2_string"),
        Interop.valueLayout.C_INT.withName("char_2_token"),
        Interop.valueLayout.C_INT.withName("symbol_2_token"),
        Interop.valueLayout.C_INT.withName("scope_0_fallback"),
        Interop.valueLayout.C_INT.withName("store_int64"),
        Interop.valueLayout.C_INT.withName("padding_dummy")
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
     * Allocate a new {@link ScannerConfig}
     * @return A new, uninitialized @{link ScannerConfig}
     */
    public static ScannerConfig allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ScannerConfig newInstance = new ScannerConfig(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code cset_skip_characters}
     * @return The value of the field {@code cset_skip_characters}
     */
    public java.lang.String csetSkipCharacters$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_skip_characters"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code cset_skip_characters}
     * @param csetSkipCharacters The new value of the field {@code cset_skip_characters}
     */
    public void csetSkipCharacters$set(java.lang.String csetSkipCharacters) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_skip_characters"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(csetSkipCharacters));
    }
    
    /**
     * Get the value of the field {@code cset_identifier_first}
     * @return The value of the field {@code cset_identifier_first}
     */
    public java.lang.String csetIdentifierFirst$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_first"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code cset_identifier_first}
     * @param csetIdentifierFirst The new value of the field {@code cset_identifier_first}
     */
    public void csetIdentifierFirst$set(java.lang.String csetIdentifierFirst) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_first"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(csetIdentifierFirst));
    }
    
    /**
     * Get the value of the field {@code cset_identifier_nth}
     * @return The value of the field {@code cset_identifier_nth}
     */
    public java.lang.String csetIdentifierNth$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_nth"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code cset_identifier_nth}
     * @param csetIdentifierNth The new value of the field {@code cset_identifier_nth}
     */
    public void csetIdentifierNth$set(java.lang.String csetIdentifierNth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_nth"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(csetIdentifierNth));
    }
    
    /**
     * Get the value of the field {@code cpair_comment_single}
     * @return The value of the field {@code cpair_comment_single}
     */
    public java.lang.String cpairCommentSingle$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cpair_comment_single"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code cpair_comment_single}
     * @param cpairCommentSingle The new value of the field {@code cpair_comment_single}
     */
    public void cpairCommentSingle$set(java.lang.String cpairCommentSingle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cpair_comment_single"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(cpairCommentSingle));
    }
    
    /**
     * Get the value of the field {@code case_sensitive}
     * @return The value of the field {@code case_sensitive}
     */
    public int caseSensitive$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("case_sensitive"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code case_sensitive}
     * @param caseSensitive The new value of the field {@code case_sensitive}
     */
    public void caseSensitive$set(int caseSensitive) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("case_sensitive"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), caseSensitive);
    }
    
    /**
     * Get the value of the field {@code skip_comment_multi}
     * @return The value of the field {@code skip_comment_multi}
     */
    public int skipCommentMulti$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_multi"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code skip_comment_multi}
     * @param skipCommentMulti The new value of the field {@code skip_comment_multi}
     */
    public void skipCommentMulti$set(int skipCommentMulti) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_multi"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), skipCommentMulti);
    }
    
    /**
     * Get the value of the field {@code skip_comment_single}
     * @return The value of the field {@code skip_comment_single}
     */
    public int skipCommentSingle$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_single"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code skip_comment_single}
     * @param skipCommentSingle The new value of the field {@code skip_comment_single}
     */
    public void skipCommentSingle$set(int skipCommentSingle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_single"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), skipCommentSingle);
    }
    
    /**
     * Get the value of the field {@code scan_comment_multi}
     * @return The value of the field {@code scan_comment_multi}
     */
    public int scanCommentMulti$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_comment_multi"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_comment_multi}
     * @param scanCommentMulti The new value of the field {@code scan_comment_multi}
     */
    public void scanCommentMulti$set(int scanCommentMulti) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_comment_multi"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanCommentMulti);
    }
    
    /**
     * Get the value of the field {@code scan_identifier}
     * @return The value of the field {@code scan_identifier}
     */
    public int scanIdentifier$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_identifier}
     * @param scanIdentifier The new value of the field {@code scan_identifier}
     */
    public void scanIdentifier$set(int scanIdentifier) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanIdentifier);
    }
    
    /**
     * Get the value of the field {@code scan_identifier_1char}
     * @return The value of the field {@code scan_identifier_1char}
     */
    public int scanIdentifier1char$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_1char"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_identifier_1char}
     * @param scanIdentifier1char The new value of the field {@code scan_identifier_1char}
     */
    public void scanIdentifier1char$set(int scanIdentifier1char) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_1char"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanIdentifier1char);
    }
    
    /**
     * Get the value of the field {@code scan_identifier_NULL}
     * @return The value of the field {@code scan_identifier_NULL}
     */
    public int scanIdentifierNULL$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_NULL"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_identifier_NULL}
     * @param scanIdentifierNULL The new value of the field {@code scan_identifier_NULL}
     */
    public void scanIdentifierNULL$set(int scanIdentifierNULL) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_NULL"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanIdentifierNULL);
    }
    
    /**
     * Get the value of the field {@code scan_symbols}
     * @return The value of the field {@code scan_symbols}
     */
    public int scanSymbols$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_symbols"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_symbols}
     * @param scanSymbols The new value of the field {@code scan_symbols}
     */
    public void scanSymbols$set(int scanSymbols) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_symbols"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanSymbols);
    }
    
    /**
     * Get the value of the field {@code scan_binary}
     * @return The value of the field {@code scan_binary}
     */
    public int scanBinary$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_binary"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_binary}
     * @param scanBinary The new value of the field {@code scan_binary}
     */
    public void scanBinary$set(int scanBinary) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_binary"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanBinary);
    }
    
    /**
     * Get the value of the field {@code scan_octal}
     * @return The value of the field {@code scan_octal}
     */
    public int scanOctal$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_octal"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_octal}
     * @param scanOctal The new value of the field {@code scan_octal}
     */
    public void scanOctal$set(int scanOctal) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_octal"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanOctal);
    }
    
    /**
     * Get the value of the field {@code scan_float}
     * @return The value of the field {@code scan_float}
     */
    public int scanFloat$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_float"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_float}
     * @param scanFloat The new value of the field {@code scan_float}
     */
    public void scanFloat$set(int scanFloat) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_float"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanFloat);
    }
    
    /**
     * Get the value of the field {@code scan_hex}
     * @return The value of the field {@code scan_hex}
     */
    public int scanHex$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_hex"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_hex}
     * @param scanHex The new value of the field {@code scan_hex}
     */
    public void scanHex$set(int scanHex) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_hex"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanHex);
    }
    
    /**
     * Get the value of the field {@code scan_hex_dollar}
     * @return The value of the field {@code scan_hex_dollar}
     */
    public int scanHexDollar$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_hex_dollar"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_hex_dollar}
     * @param scanHexDollar The new value of the field {@code scan_hex_dollar}
     */
    public void scanHexDollar$set(int scanHexDollar) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_hex_dollar"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanHexDollar);
    }
    
    /**
     * Get the value of the field {@code scan_string_sq}
     * @return The value of the field {@code scan_string_sq}
     */
    public int scanStringSq$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_string_sq"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_string_sq}
     * @param scanStringSq The new value of the field {@code scan_string_sq}
     */
    public void scanStringSq$set(int scanStringSq) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_string_sq"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanStringSq);
    }
    
    /**
     * Get the value of the field {@code scan_string_dq}
     * @return The value of the field {@code scan_string_dq}
     */
    public int scanStringDq$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_string_dq"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_string_dq}
     * @param scanStringDq The new value of the field {@code scan_string_dq}
     */
    public void scanStringDq$set(int scanStringDq) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_string_dq"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanStringDq);
    }
    
    /**
     * Get the value of the field {@code numbers_2_int}
     * @return The value of the field {@code numbers_2_int}
     */
    public int numbers2Int$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("numbers_2_int"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code numbers_2_int}
     * @param numbers2Int The new value of the field {@code numbers_2_int}
     */
    public void numbers2Int$set(int numbers2Int) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("numbers_2_int"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), numbers2Int);
    }
    
    /**
     * Get the value of the field {@code int_2_float}
     * @return The value of the field {@code int_2_float}
     */
    public int int2Float$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("int_2_float"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code int_2_float}
     * @param int2Float The new value of the field {@code int_2_float}
     */
    public void int2Float$set(int int2Float) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("int_2_float"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), int2Float);
    }
    
    /**
     * Get the value of the field {@code identifier_2_string}
     * @return The value of the field {@code identifier_2_string}
     */
    public int identifier2String$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("identifier_2_string"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code identifier_2_string}
     * @param identifier2String The new value of the field {@code identifier_2_string}
     */
    public void identifier2String$set(int identifier2String) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("identifier_2_string"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), identifier2String);
    }
    
    /**
     * Get the value of the field {@code char_2_token}
     * @return The value of the field {@code char_2_token}
     */
    public int char2Token$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("char_2_token"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code char_2_token}
     * @param char2Token The new value of the field {@code char_2_token}
     */
    public void char2Token$set(int char2Token) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("char_2_token"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), char2Token);
    }
    
    /**
     * Get the value of the field {@code symbol_2_token}
     * @return The value of the field {@code symbol_2_token}
     */
    public int symbol2Token$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("symbol_2_token"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code symbol_2_token}
     * @param symbol2Token The new value of the field {@code symbol_2_token}
     */
    public void symbol2Token$set(int symbol2Token) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("symbol_2_token"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), symbol2Token);
    }
    
    /**
     * Get the value of the field {@code scope_0_fallback}
     * @return The value of the field {@code scope_0_fallback}
     */
    public int scope0Fallback$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scope_0_fallback"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scope_0_fallback}
     * @param scope0Fallback The new value of the field {@code scope_0_fallback}
     */
    public void scope0Fallback$set(int scope0Fallback) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scope_0_fallback"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scope0Fallback);
    }
    
    /**
     * Get the value of the field {@code store_int64}
     * @return The value of the field {@code store_int64}
     */
    public int storeInt64$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("store_int64"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code store_int64}
     * @param storeInt64 The new value of the field {@code store_int64}
     */
    public void storeInt64$set(int storeInt64) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("store_int64"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), storeInt64);
    }
    
    /**
     * Create a ScannerConfig proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ScannerConfig(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ScannerConfig struct;
        
         /**
         * A {@link ScannerConfig.Build} object constructs a {@link ScannerConfig} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ScannerConfig.allocate();
        }
        
         /**
         * Finish building the {@link ScannerConfig} struct.
         * @return A new instance of {@code ScannerConfig} with the fields 
         *         that were set in the Build object.
         */
        public ScannerConfig construct() {
            return struct;
        }
        
        /**
         * specifies which characters should be skipped
         *     by the scanner (the default is the whitespace characters: space,
         *     tab, carriage-return and line-feed).
         * @param csetSkipCharacters The value for the {@code csetSkipCharacters} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCsetSkipCharacters(java.lang.String csetSkipCharacters) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cset_skip_characters"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (csetSkipCharacters == null ? MemoryAddress.NULL : Interop.allocateNativeString(csetSkipCharacters)));
            return this;
        }
        
        /**
         * specifies the characters which can start
         *     identifiers (the default is {@code G_CSET_a_2_z}, "_", and {@code G_CSET_A_2_Z}).
         * @param csetIdentifierFirst The value for the {@code csetIdentifierFirst} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCsetIdentifierFirst(java.lang.String csetIdentifierFirst) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_first"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (csetIdentifierFirst == null ? MemoryAddress.NULL : Interop.allocateNativeString(csetIdentifierFirst)));
            return this;
        }
        
        /**
         * specifies the characters which can be used
         *     in identifiers, after the first character (the default is
         *     {@code G_CSET_a_2_z}, "_0123456789", {@code G_CSET_A_2_Z}, {@code G_CSET_LATINS},
         *     {@code G_CSET_LATINC}).
         * @param csetIdentifierNth The value for the {@code csetIdentifierNth} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCsetIdentifierNth(java.lang.String csetIdentifierNth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_nth"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (csetIdentifierNth == null ? MemoryAddress.NULL : Interop.allocateNativeString(csetIdentifierNth)));
            return this;
        }
        
        /**
         * specifies the characters at the start and
         *     end of single-line comments. The default is "{@code \\n}" which means
         *     that single-line comments start with a '{@code '} and continue until
         *     a '\\n' (end of line).
         * @param cpairCommentSingle The value for the {@code cpairCommentSingle} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCpairCommentSingle(java.lang.String cpairCommentSingle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cpair_comment_single"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cpairCommentSingle == null ? MemoryAddress.NULL : Interop.allocateNativeString(cpairCommentSingle)));
            return this;
        }
        
        /**
         * specifies if symbols are case sensitive (the
         *     default is {@code false}).
         * @param caseSensitive The value for the {@code caseSensitive} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCaseSensitive(int caseSensitive) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("case_sensitive"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), caseSensitive);
            return this;
        }
        
        /**
         * specifies if multi-line comments are skipped
         *     and not returned as tokens (the default is {@code true}).
         * @param skipCommentMulti The value for the {@code skipCommentMulti} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSkipCommentMulti(int skipCommentMulti) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_multi"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), skipCommentMulti);
            return this;
        }
        
        /**
         * specifies if single-line comments are skipped
         *     and not returned as tokens (the default is {@code true}).
         * @param skipCommentSingle The value for the {@code skipCommentSingle} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSkipCommentSingle(int skipCommentSingle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_single"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), skipCommentSingle);
            return this;
        }
        
        /**
         * specifies if multi-line comments are recognized
         *     (the default is {@code true}).
         * @param scanCommentMulti The value for the {@code scanCommentMulti} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanCommentMulti(int scanCommentMulti) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_comment_multi"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanCommentMulti);
            return this;
        }
        
        /**
         * specifies if identifiers are recognized (the
         *     default is {@code true}).
         * @param scanIdentifier The value for the {@code scanIdentifier} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanIdentifier(int scanIdentifier) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanIdentifier);
            return this;
        }
        
        /**
         * specifies if single-character
         *     identifiers are recognized (the default is {@code false}).
         * @param scanIdentifier1char The value for the {@code scanIdentifier1char} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanIdentifier1char(int scanIdentifier1char) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_1char"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanIdentifier1char);
            return this;
        }
        
        /**
         * specifies if {@code null} is reported as
         *     {@link TokenType#IDENTIFIER_NULL} (the default is {@code false}).
         * @param scanIdentifierNULL The value for the {@code scanIdentifierNULL} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanIdentifierNULL(int scanIdentifierNULL) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_NULL"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanIdentifierNULL);
            return this;
        }
        
        /**
         * specifies if symbols are recognized (the default
         *     is {@code true}).
         * @param scanSymbols The value for the {@code scanSymbols} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanSymbols(int scanSymbols) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_symbols"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanSymbols);
            return this;
        }
        
        /**
         * specifies if binary numbers are recognized (the
         *     default is {@code false}).
         * @param scanBinary The value for the {@code scanBinary} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanBinary(int scanBinary) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_binary"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanBinary);
            return this;
        }
        
        /**
         * specifies if octal numbers are recognized (the
         *     default is {@code true}).
         * @param scanOctal The value for the {@code scanOctal} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanOctal(int scanOctal) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_octal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanOctal);
            return this;
        }
        
        /**
         * specifies if floating point numbers are recognized
         *     (the default is {@code true}).
         * @param scanFloat The value for the {@code scanFloat} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanFloat(int scanFloat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_float"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanFloat);
            return this;
        }
        
        /**
         * specifies if hexadecimal numbers are recognized (the
         *     default is {@code true}).
         * @param scanHex The value for the {@code scanHex} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanHex(int scanHex) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_hex"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanHex);
            return this;
        }
        
        /**
         * specifies if '$' is recognized as a prefix for
         *     hexadecimal numbers (the default is {@code false}).
         * @param scanHexDollar The value for the {@code scanHexDollar} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanHexDollar(int scanHexDollar) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_hex_dollar"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanHexDollar);
            return this;
        }
        
        /**
         * specifies if strings can be enclosed in single
         *     quotes (the default is {@code true}).
         * @param scanStringSq The value for the {@code scanStringSq} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanStringSq(int scanStringSq) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_string_sq"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanStringSq);
            return this;
        }
        
        /**
         * specifies if strings can be enclosed in double
         *     quotes (the default is {@code true}).
         * @param scanStringDq The value for the {@code scanStringDq} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanStringDq(int scanStringDq) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_string_dq"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scanStringDq);
            return this;
        }
        
        /**
         * specifies if binary, octal and hexadecimal numbers
         *     are reported as {@link TokenType#INT} (the default is {@code true}).
         * @param numbers2Int The value for the {@code numbers2Int} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNumbers2Int(int numbers2Int) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("numbers_2_int"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), numbers2Int);
            return this;
        }
        
        /**
         * specifies if all numbers are reported as {@link TokenType#FLOAT}
         *     (the default is {@code false}).
         * @param int2Float The value for the {@code int2Float} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInt2Float(int int2Float) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("int_2_float"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), int2Float);
            return this;
        }
        
        /**
         * specifies if identifiers are reported as strings
         *     (the default is {@code false}).
         * @param identifier2String The value for the {@code identifier2String} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIdentifier2String(int identifier2String) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("identifier_2_string"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), identifier2String);
            return this;
        }
        
        /**
         * specifies if characters are reported by setting
         *     {@code token = ch} or as {@link TokenType#CHAR} (the default is {@code true}).
         * @param char2Token The value for the {@code char2Token} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChar2Token(int char2Token) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("char_2_token"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), char2Token);
            return this;
        }
        
        /**
         * specifies if symbols are reported by setting
         *     {@code token = v_symbol} or as {@link TokenType#SYMBOL} (the default is {@code false}).
         * @param symbol2Token The value for the {@code symbol2Token} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSymbol2Token(int symbol2Token) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("symbol_2_token"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), symbol2Token);
            return this;
        }
        
        /**
         * specifies if a symbol is searched for in the
         *     default scope in addition to the current scope (the default is {@code false}).
         * @param scope0Fallback The value for the {@code scope0Fallback} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScope0Fallback(int scope0Fallback) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scope_0_fallback"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scope0Fallback);
            return this;
        }
        
        /**
         * use value.v_int64 rather than v_int
         * @param storeInt64 The value for the {@code storeInt64} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStoreInt64(int storeInt64) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("store_int64"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), storeInt64);
            return this;
        }
        
        public Build setPaddingDummy(int paddingDummy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding_dummy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), paddingDummy);
            return this;
        }
    }
}
