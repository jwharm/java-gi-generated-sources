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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ScannerConfig}
     * @return A new, uninitialized @{link ScannerConfig}
     */
    public static ScannerConfig allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ScannerConfig newInstance = new ScannerConfig(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code cset_skip_characters}
     * @return The value of the field {@code cset_skip_characters}
     */
    public java.lang.String getCsetSkipCharacters() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cset_skip_characters"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code cset_skip_characters}
     * @param csetSkipCharacters The new value of the field {@code cset_skip_characters}
     */
    public void setCsetSkipCharacters(java.lang.String csetSkipCharacters) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cset_skip_characters"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (csetSkipCharacters == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(csetSkipCharacters, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code cset_identifier_first}
     * @return The value of the field {@code cset_identifier_first}
     */
    public java.lang.String getCsetIdentifierFirst() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_first"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code cset_identifier_first}
     * @param csetIdentifierFirst The new value of the field {@code cset_identifier_first}
     */
    public void setCsetIdentifierFirst(java.lang.String csetIdentifierFirst) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_first"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (csetIdentifierFirst == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(csetIdentifierFirst, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code cset_identifier_nth}
     * @return The value of the field {@code cset_identifier_nth}
     */
    public java.lang.String getCsetIdentifierNth() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_nth"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code cset_identifier_nth}
     * @param csetIdentifierNth The new value of the field {@code cset_identifier_nth}
     */
    public void setCsetIdentifierNth(java.lang.String csetIdentifierNth) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_nth"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (csetIdentifierNth == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(csetIdentifierNth, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code cpair_comment_single}
     * @return The value of the field {@code cpair_comment_single}
     */
    public java.lang.String getCpairCommentSingle() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cpair_comment_single"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code cpair_comment_single}
     * @param cpairCommentSingle The new value of the field {@code cpair_comment_single}
     */
    public void setCpairCommentSingle(java.lang.String cpairCommentSingle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cpair_comment_single"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cpairCommentSingle == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(cpairCommentSingle, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code case_sensitive}
     * @return The value of the field {@code case_sensitive}
     */
    public int getCaseSensitive() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("case_sensitive"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code case_sensitive}
     * @param caseSensitive The new value of the field {@code case_sensitive}
     */
    public void setCaseSensitive(int caseSensitive) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("case_sensitive"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), caseSensitive);
        }
    }
    
    /**
     * Get the value of the field {@code skip_comment_multi}
     * @return The value of the field {@code skip_comment_multi}
     */
    public int getSkipCommentMulti() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_multi"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code skip_comment_multi}
     * @param skipCommentMulti The new value of the field {@code skip_comment_multi}
     */
    public void setSkipCommentMulti(int skipCommentMulti) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_multi"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), skipCommentMulti);
        }
    }
    
    /**
     * Get the value of the field {@code skip_comment_single}
     * @return The value of the field {@code skip_comment_single}
     */
    public int getSkipCommentSingle() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_single"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code skip_comment_single}
     * @param skipCommentSingle The new value of the field {@code skip_comment_single}
     */
    public void setSkipCommentSingle(int skipCommentSingle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_single"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), skipCommentSingle);
        }
    }
    
    /**
     * Get the value of the field {@code scan_comment_multi}
     * @return The value of the field {@code scan_comment_multi}
     */
    public int getScanCommentMulti() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_comment_multi"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code scan_comment_multi}
     * @param scanCommentMulti The new value of the field {@code scan_comment_multi}
     */
    public void setScanCommentMulti(int scanCommentMulti) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_comment_multi"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), scanCommentMulti);
        }
    }
    
    /**
     * Get the value of the field {@code scan_identifier}
     * @return The value of the field {@code scan_identifier}
     */
    public int getScanIdentifier() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code scan_identifier}
     * @param scanIdentifier The new value of the field {@code scan_identifier}
     */
    public void setScanIdentifier(int scanIdentifier) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), scanIdentifier);
        }
    }
    
    /**
     * Get the value of the field {@code scan_identifier_1char}
     * @return The value of the field {@code scan_identifier_1char}
     */
    public int getScanIdentifier1char() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_1char"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code scan_identifier_1char}
     * @param scanIdentifier1char The new value of the field {@code scan_identifier_1char}
     */
    public void setScanIdentifier1char(int scanIdentifier1char) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_1char"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), scanIdentifier1char);
        }
    }
    
    /**
     * Get the value of the field {@code scan_identifier_NULL}
     * @return The value of the field {@code scan_identifier_NULL}
     */
    public int getScanIdentifierNULL() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_NULL"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code scan_identifier_NULL}
     * @param scanIdentifierNULL The new value of the field {@code scan_identifier_NULL}
     */
    public void setScanIdentifierNULL(int scanIdentifierNULL) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_NULL"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), scanIdentifierNULL);
        }
    }
    
    /**
     * Get the value of the field {@code scan_symbols}
     * @return The value of the field {@code scan_symbols}
     */
    public int getScanSymbols() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_symbols"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code scan_symbols}
     * @param scanSymbols The new value of the field {@code scan_symbols}
     */
    public void setScanSymbols(int scanSymbols) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_symbols"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), scanSymbols);
        }
    }
    
    /**
     * Get the value of the field {@code scan_binary}
     * @return The value of the field {@code scan_binary}
     */
    public int getScanBinary() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_binary"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code scan_binary}
     * @param scanBinary The new value of the field {@code scan_binary}
     */
    public void setScanBinary(int scanBinary) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_binary"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), scanBinary);
        }
    }
    
    /**
     * Get the value of the field {@code scan_octal}
     * @return The value of the field {@code scan_octal}
     */
    public int getScanOctal() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_octal"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code scan_octal}
     * @param scanOctal The new value of the field {@code scan_octal}
     */
    public void setScanOctal(int scanOctal) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_octal"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), scanOctal);
        }
    }
    
    /**
     * Get the value of the field {@code scan_float}
     * @return The value of the field {@code scan_float}
     */
    public int getScanFloat() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_float"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code scan_float}
     * @param scanFloat The new value of the field {@code scan_float}
     */
    public void setScanFloat(int scanFloat) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_float"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), scanFloat);
        }
    }
    
    /**
     * Get the value of the field {@code scan_hex}
     * @return The value of the field {@code scan_hex}
     */
    public int getScanHex() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_hex"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code scan_hex}
     * @param scanHex The new value of the field {@code scan_hex}
     */
    public void setScanHex(int scanHex) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_hex"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), scanHex);
        }
    }
    
    /**
     * Get the value of the field {@code scan_hex_dollar}
     * @return The value of the field {@code scan_hex_dollar}
     */
    public int getScanHexDollar() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_hex_dollar"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code scan_hex_dollar}
     * @param scanHexDollar The new value of the field {@code scan_hex_dollar}
     */
    public void setScanHexDollar(int scanHexDollar) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_hex_dollar"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), scanHexDollar);
        }
    }
    
    /**
     * Get the value of the field {@code scan_string_sq}
     * @return The value of the field {@code scan_string_sq}
     */
    public int getScanStringSq() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_string_sq"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code scan_string_sq}
     * @param scanStringSq The new value of the field {@code scan_string_sq}
     */
    public void setScanStringSq(int scanStringSq) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_string_sq"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), scanStringSq);
        }
    }
    
    /**
     * Get the value of the field {@code scan_string_dq}
     * @return The value of the field {@code scan_string_dq}
     */
    public int getScanStringDq() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_string_dq"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code scan_string_dq}
     * @param scanStringDq The new value of the field {@code scan_string_dq}
     */
    public void setScanStringDq(int scanStringDq) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_string_dq"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), scanStringDq);
        }
    }
    
    /**
     * Get the value of the field {@code numbers_2_int}
     * @return The value of the field {@code numbers_2_int}
     */
    public int getNumbers2Int() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("numbers_2_int"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code numbers_2_int}
     * @param numbers2Int The new value of the field {@code numbers_2_int}
     */
    public void setNumbers2Int(int numbers2Int) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("numbers_2_int"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), numbers2Int);
        }
    }
    
    /**
     * Get the value of the field {@code int_2_float}
     * @return The value of the field {@code int_2_float}
     */
    public int getInt2Float() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("int_2_float"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code int_2_float}
     * @param int2Float The new value of the field {@code int_2_float}
     */
    public void setInt2Float(int int2Float) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("int_2_float"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), int2Float);
        }
    }
    
    /**
     * Get the value of the field {@code identifier_2_string}
     * @return The value of the field {@code identifier_2_string}
     */
    public int getIdentifier2String() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("identifier_2_string"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code identifier_2_string}
     * @param identifier2String The new value of the field {@code identifier_2_string}
     */
    public void setIdentifier2String(int identifier2String) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("identifier_2_string"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), identifier2String);
        }
    }
    
    /**
     * Get the value of the field {@code char_2_token}
     * @return The value of the field {@code char_2_token}
     */
    public int getChar2Token() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("char_2_token"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code char_2_token}
     * @param char2Token The new value of the field {@code char_2_token}
     */
    public void setChar2Token(int char2Token) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("char_2_token"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), char2Token);
        }
    }
    
    /**
     * Get the value of the field {@code symbol_2_token}
     * @return The value of the field {@code symbol_2_token}
     */
    public int getSymbol2Token() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("symbol_2_token"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code symbol_2_token}
     * @param symbol2Token The new value of the field {@code symbol_2_token}
     */
    public void setSymbol2Token(int symbol2Token) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("symbol_2_token"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), symbol2Token);
        }
    }
    
    /**
     * Get the value of the field {@code scope_0_fallback}
     * @return The value of the field {@code scope_0_fallback}
     */
    public int getScope0Fallback() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scope_0_fallback"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code scope_0_fallback}
     * @param scope0Fallback The new value of the field {@code scope_0_fallback}
     */
    public void setScope0Fallback(int scope0Fallback) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scope_0_fallback"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), scope0Fallback);
        }
    }
    
    /**
     * Get the value of the field {@code store_int64}
     * @return The value of the field {@code store_int64}
     */
    public int getStoreInt64() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("store_int64"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code store_int64}
     * @param storeInt64 The new value of the field {@code store_int64}
     */
    public void setStoreInt64(int storeInt64) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("store_int64"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), storeInt64);
        }
    }
    
    /**
     * Create a ScannerConfig proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ScannerConfig(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ScannerConfig> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ScannerConfig(input);
    
    /**
     * A {@link ScannerConfig.Builder} object constructs a {@link ScannerConfig} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ScannerConfig.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ScannerConfig struct;
        
        private Builder() {
            struct = ScannerConfig.allocate();
        }
        
        /**
         * Finish building the {@link ScannerConfig} struct.
         * @return A new instance of {@code ScannerConfig} with the fields 
         *         that were set in the Builder object.
         */
        public ScannerConfig build() {
            return struct;
        }
        
        /**
         * specifies which characters should be skipped
         *     by the scanner (the default is the whitespace characters: space,
         *     tab, carriage-return and line-feed).
         * @param csetSkipCharacters The value for the {@code csetSkipCharacters} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCsetSkipCharacters(java.lang.String csetSkipCharacters) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("cset_skip_characters"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (csetSkipCharacters == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(csetSkipCharacters, SCOPE)));
                return this;
            }
        }
        
        /**
         * specifies the characters which can start
         *     identifiers (the default is {@code G_CSET_a_2_z}, "_", and {@code G_CSET_A_2_Z}).
         * @param csetIdentifierFirst The value for the {@code csetIdentifierFirst} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCsetIdentifierFirst(java.lang.String csetIdentifierFirst) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_first"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (csetIdentifierFirst == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(csetIdentifierFirst, SCOPE)));
                return this;
            }
        }
        
        /**
         * specifies the characters which can be used
         *     in identifiers, after the first character (the default is
         *     {@code G_CSET_a_2_z}, "_0123456789", {@code G_CSET_A_2_Z}, {@code G_CSET_LATINS},
         *     {@code G_CSET_LATINC}).
         * @param csetIdentifierNth The value for the {@code csetIdentifierNth} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCsetIdentifierNth(java.lang.String csetIdentifierNth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_nth"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (csetIdentifierNth == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(csetIdentifierNth, SCOPE)));
                return this;
            }
        }
        
        /**
         * specifies the characters at the start and
         *     end of single-line comments. The default is "{@code \\n}" which means
         *     that single-line comments start with a '{@code '} and continue until
         *     a '\\n' (end of line).
         * @param cpairCommentSingle The value for the {@code cpairCommentSingle} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCpairCommentSingle(java.lang.String cpairCommentSingle) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("cpair_comment_single"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cpairCommentSingle == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(cpairCommentSingle, SCOPE)));
                return this;
            }
        }
        
        /**
         * specifies if symbols are case sensitive (the
         *     default is {@code false}).
         * @param caseSensitive The value for the {@code caseSensitive} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCaseSensitive(int caseSensitive) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("case_sensitive"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), caseSensitive);
                return this;
            }
        }
        
        /**
         * specifies if multi-line comments are skipped
         *     and not returned as tokens (the default is {@code true}).
         * @param skipCommentMulti The value for the {@code skipCommentMulti} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSkipCommentMulti(int skipCommentMulti) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_multi"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), skipCommentMulti);
                return this;
            }
        }
        
        /**
         * specifies if single-line comments are skipped
         *     and not returned as tokens (the default is {@code true}).
         * @param skipCommentSingle The value for the {@code skipCommentSingle} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSkipCommentSingle(int skipCommentSingle) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_single"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), skipCommentSingle);
                return this;
            }
        }
        
        /**
         * specifies if multi-line comments are recognized
         *     (the default is {@code true}).
         * @param scanCommentMulti The value for the {@code scanCommentMulti} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScanCommentMulti(int scanCommentMulti) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("scan_comment_multi"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), scanCommentMulti);
                return this;
            }
        }
        
        /**
         * specifies if identifiers are recognized (the
         *     default is {@code true}).
         * @param scanIdentifier The value for the {@code scanIdentifier} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScanIdentifier(int scanIdentifier) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), scanIdentifier);
                return this;
            }
        }
        
        /**
         * specifies if single-character
         *     identifiers are recognized (the default is {@code false}).
         * @param scanIdentifier1char The value for the {@code scanIdentifier1char} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScanIdentifier1char(int scanIdentifier1char) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_1char"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), scanIdentifier1char);
                return this;
            }
        }
        
        /**
         * specifies if {@code null} is reported as
         *     {@link TokenType#IDENTIFIER_NULL} (the default is {@code false}).
         * @param scanIdentifierNULL The value for the {@code scanIdentifierNULL} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScanIdentifierNULL(int scanIdentifierNULL) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_NULL"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), scanIdentifierNULL);
                return this;
            }
        }
        
        /**
         * specifies if symbols are recognized (the default
         *     is {@code true}).
         * @param scanSymbols The value for the {@code scanSymbols} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScanSymbols(int scanSymbols) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("scan_symbols"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), scanSymbols);
                return this;
            }
        }
        
        /**
         * specifies if binary numbers are recognized (the
         *     default is {@code false}).
         * @param scanBinary The value for the {@code scanBinary} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScanBinary(int scanBinary) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("scan_binary"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), scanBinary);
                return this;
            }
        }
        
        /**
         * specifies if octal numbers are recognized (the
         *     default is {@code true}).
         * @param scanOctal The value for the {@code scanOctal} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScanOctal(int scanOctal) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("scan_octal"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), scanOctal);
                return this;
            }
        }
        
        /**
         * specifies if floating point numbers are recognized
         *     (the default is {@code true}).
         * @param scanFloat The value for the {@code scanFloat} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScanFloat(int scanFloat) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("scan_float"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), scanFloat);
                return this;
            }
        }
        
        /**
         * specifies if hexadecimal numbers are recognized (the
         *     default is {@code true}).
         * @param scanHex The value for the {@code scanHex} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScanHex(int scanHex) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("scan_hex"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), scanHex);
                return this;
            }
        }
        
        /**
         * specifies if '$' is recognized as a prefix for
         *     hexadecimal numbers (the default is {@code false}).
         * @param scanHexDollar The value for the {@code scanHexDollar} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScanHexDollar(int scanHexDollar) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("scan_hex_dollar"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), scanHexDollar);
                return this;
            }
        }
        
        /**
         * specifies if strings can be enclosed in single
         *     quotes (the default is {@code true}).
         * @param scanStringSq The value for the {@code scanStringSq} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScanStringSq(int scanStringSq) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("scan_string_sq"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), scanStringSq);
                return this;
            }
        }
        
        /**
         * specifies if strings can be enclosed in double
         *     quotes (the default is {@code true}).
         * @param scanStringDq The value for the {@code scanStringDq} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScanStringDq(int scanStringDq) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("scan_string_dq"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), scanStringDq);
                return this;
            }
        }
        
        /**
         * specifies if binary, octal and hexadecimal numbers
         *     are reported as {@link TokenType#INT} (the default is {@code true}).
         * @param numbers2Int The value for the {@code numbers2Int} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNumbers2Int(int numbers2Int) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("numbers_2_int"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), numbers2Int);
                return this;
            }
        }
        
        /**
         * specifies if all numbers are reported as {@link TokenType#FLOAT}
         *     (the default is {@code false}).
         * @param int2Float The value for the {@code int2Float} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInt2Float(int int2Float) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("int_2_float"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), int2Float);
                return this;
            }
        }
        
        /**
         * specifies if identifiers are reported as strings
         *     (the default is {@code false}).
         * @param identifier2String The value for the {@code identifier2String} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIdentifier2String(int identifier2String) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("identifier_2_string"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), identifier2String);
                return this;
            }
        }
        
        /**
         * specifies if characters are reported by setting
         *     {@code token = ch} or as {@link TokenType#CHAR} (the default is {@code true}).
         * @param char2Token The value for the {@code char2Token} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChar2Token(int char2Token) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("char_2_token"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), char2Token);
                return this;
            }
        }
        
        /**
         * specifies if symbols are reported by setting
         *     {@code token = v_symbol} or as {@link TokenType#SYMBOL} (the default is {@code false}).
         * @param symbol2Token The value for the {@code symbol2Token} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSymbol2Token(int symbol2Token) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("symbol_2_token"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), symbol2Token);
                return this;
            }
        }
        
        /**
         * specifies if a symbol is searched for in the
         *     default scope in addition to the current scope (the default is {@code false}).
         * @param scope0Fallback The value for the {@code scope0Fallback} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScope0Fallback(int scope0Fallback) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("scope_0_fallback"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), scope0Fallback);
                return this;
            }
        }
        
        /**
         * use value.v_int64 rather than v_int
         * @param storeInt64 The value for the {@code storeInt64} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStoreInt64(int storeInt64) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("store_int64"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), storeInt64);
                return this;
            }
        }
        
        public Builder setPaddingDummy(int paddingDummy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding_dummy"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), paddingDummy);
                return this;
            }
        }
    }
}
