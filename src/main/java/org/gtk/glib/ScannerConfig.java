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
    public java.lang.String cset_skip_characters$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_skip_characters"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code cset_skip_characters}
     * @param cset_skip_characters The new value of the field {@code cset_skip_characters}
     */
    public void cset_skip_characters$set(java.lang.String cset_skip_characters) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_skip_characters"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(cset_skip_characters));
    }
    
    /**
     * Get the value of the field {@code cset_identifier_first}
     * @return The value of the field {@code cset_identifier_first}
     */
    public java.lang.String cset_identifier_first$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_first"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code cset_identifier_first}
     * @param cset_identifier_first The new value of the field {@code cset_identifier_first}
     */
    public void cset_identifier_first$set(java.lang.String cset_identifier_first) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_first"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(cset_identifier_first));
    }
    
    /**
     * Get the value of the field {@code cset_identifier_nth}
     * @return The value of the field {@code cset_identifier_nth}
     */
    public java.lang.String cset_identifier_nth$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_nth"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code cset_identifier_nth}
     * @param cset_identifier_nth The new value of the field {@code cset_identifier_nth}
     */
    public void cset_identifier_nth$set(java.lang.String cset_identifier_nth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_nth"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(cset_identifier_nth));
    }
    
    /**
     * Get the value of the field {@code cpair_comment_single}
     * @return The value of the field {@code cpair_comment_single}
     */
    public java.lang.String cpair_comment_single$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cpair_comment_single"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code cpair_comment_single}
     * @param cpair_comment_single The new value of the field {@code cpair_comment_single}
     */
    public void cpair_comment_single$set(java.lang.String cpair_comment_single) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cpair_comment_single"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(cpair_comment_single));
    }
    
    /**
     * Get the value of the field {@code case_sensitive}
     * @return The value of the field {@code case_sensitive}
     */
    public int case_sensitive$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("case_sensitive"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code case_sensitive}
     * @param case_sensitive The new value of the field {@code case_sensitive}
     */
    public void case_sensitive$set(int case_sensitive) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("case_sensitive"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), case_sensitive);
    }
    
    /**
     * Get the value of the field {@code skip_comment_multi}
     * @return The value of the field {@code skip_comment_multi}
     */
    public int skip_comment_multi$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_multi"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code skip_comment_multi}
     * @param skip_comment_multi The new value of the field {@code skip_comment_multi}
     */
    public void skip_comment_multi$set(int skip_comment_multi) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_multi"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), skip_comment_multi);
    }
    
    /**
     * Get the value of the field {@code skip_comment_single}
     * @return The value of the field {@code skip_comment_single}
     */
    public int skip_comment_single$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_single"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code skip_comment_single}
     * @param skip_comment_single The new value of the field {@code skip_comment_single}
     */
    public void skip_comment_single$set(int skip_comment_single) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_single"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), skip_comment_single);
    }
    
    /**
     * Get the value of the field {@code scan_comment_multi}
     * @return The value of the field {@code scan_comment_multi}
     */
    public int scan_comment_multi$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_comment_multi"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_comment_multi}
     * @param scan_comment_multi The new value of the field {@code scan_comment_multi}
     */
    public void scan_comment_multi$set(int scan_comment_multi) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_comment_multi"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_comment_multi);
    }
    
    /**
     * Get the value of the field {@code scan_identifier}
     * @return The value of the field {@code scan_identifier}
     */
    public int scan_identifier$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_identifier}
     * @param scan_identifier The new value of the field {@code scan_identifier}
     */
    public void scan_identifier$set(int scan_identifier) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_identifier);
    }
    
    /**
     * Get the value of the field {@code scan_identifier_1char}
     * @return The value of the field {@code scan_identifier_1char}
     */
    public int scan_identifier_1char$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_1char"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_identifier_1char}
     * @param scan_identifier_1char The new value of the field {@code scan_identifier_1char}
     */
    public void scan_identifier_1char$set(int scan_identifier_1char) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_1char"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_identifier_1char);
    }
    
    /**
     * Get the value of the field {@code scan_identifier_NULL}
     * @return The value of the field {@code scan_identifier_NULL}
     */
    public int scan_identifier_NULL$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_NULL"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_identifier_NULL}
     * @param scan_identifier_NULL The new value of the field {@code scan_identifier_NULL}
     */
    public void scan_identifier_NULL$set(int scan_identifier_NULL) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_NULL"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_identifier_NULL);
    }
    
    /**
     * Get the value of the field {@code scan_symbols}
     * @return The value of the field {@code scan_symbols}
     */
    public int scan_symbols$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_symbols"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_symbols}
     * @param scan_symbols The new value of the field {@code scan_symbols}
     */
    public void scan_symbols$set(int scan_symbols) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_symbols"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_symbols);
    }
    
    /**
     * Get the value of the field {@code scan_binary}
     * @return The value of the field {@code scan_binary}
     */
    public int scan_binary$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_binary"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_binary}
     * @param scan_binary The new value of the field {@code scan_binary}
     */
    public void scan_binary$set(int scan_binary) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_binary"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_binary);
    }
    
    /**
     * Get the value of the field {@code scan_octal}
     * @return The value of the field {@code scan_octal}
     */
    public int scan_octal$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_octal"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_octal}
     * @param scan_octal The new value of the field {@code scan_octal}
     */
    public void scan_octal$set(int scan_octal) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_octal"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_octal);
    }
    
    /**
     * Get the value of the field {@code scan_float}
     * @return The value of the field {@code scan_float}
     */
    public int scan_float$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_float"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_float}
     * @param scan_float The new value of the field {@code scan_float}
     */
    public void scan_float$set(int scan_float) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_float"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_float);
    }
    
    /**
     * Get the value of the field {@code scan_hex}
     * @return The value of the field {@code scan_hex}
     */
    public int scan_hex$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_hex"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_hex}
     * @param scan_hex The new value of the field {@code scan_hex}
     */
    public void scan_hex$set(int scan_hex) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_hex"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_hex);
    }
    
    /**
     * Get the value of the field {@code scan_hex_dollar}
     * @return The value of the field {@code scan_hex_dollar}
     */
    public int scan_hex_dollar$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_hex_dollar"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_hex_dollar}
     * @param scan_hex_dollar The new value of the field {@code scan_hex_dollar}
     */
    public void scan_hex_dollar$set(int scan_hex_dollar) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_hex_dollar"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_hex_dollar);
    }
    
    /**
     * Get the value of the field {@code scan_string_sq}
     * @return The value of the field {@code scan_string_sq}
     */
    public int scan_string_sq$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_string_sq"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_string_sq}
     * @param scan_string_sq The new value of the field {@code scan_string_sq}
     */
    public void scan_string_sq$set(int scan_string_sq) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_string_sq"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_string_sq);
    }
    
    /**
     * Get the value of the field {@code scan_string_dq}
     * @return The value of the field {@code scan_string_dq}
     */
    public int scan_string_dq$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_string_dq"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scan_string_dq}
     * @param scan_string_dq The new value of the field {@code scan_string_dq}
     */
    public void scan_string_dq$set(int scan_string_dq) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scan_string_dq"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_string_dq);
    }
    
    /**
     * Get the value of the field {@code numbers_2_int}
     * @return The value of the field {@code numbers_2_int}
     */
    public int numbers_2_int$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("numbers_2_int"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code numbers_2_int}
     * @param numbers_2_int The new value of the field {@code numbers_2_int}
     */
    public void numbers_2_int$set(int numbers_2_int) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("numbers_2_int"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), numbers_2_int);
    }
    
    /**
     * Get the value of the field {@code int_2_float}
     * @return The value of the field {@code int_2_float}
     */
    public int int_2_float$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("int_2_float"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code int_2_float}
     * @param int_2_float The new value of the field {@code int_2_float}
     */
    public void int_2_float$set(int int_2_float) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("int_2_float"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), int_2_float);
    }
    
    /**
     * Get the value of the field {@code identifier_2_string}
     * @return The value of the field {@code identifier_2_string}
     */
    public int identifier_2_string$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("identifier_2_string"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code identifier_2_string}
     * @param identifier_2_string The new value of the field {@code identifier_2_string}
     */
    public void identifier_2_string$set(int identifier_2_string) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("identifier_2_string"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), identifier_2_string);
    }
    
    /**
     * Get the value of the field {@code char_2_token}
     * @return The value of the field {@code char_2_token}
     */
    public int char_2_token$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("char_2_token"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code char_2_token}
     * @param char_2_token The new value of the field {@code char_2_token}
     */
    public void char_2_token$set(int char_2_token) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("char_2_token"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), char_2_token);
    }
    
    /**
     * Get the value of the field {@code symbol_2_token}
     * @return The value of the field {@code symbol_2_token}
     */
    public int symbol_2_token$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("symbol_2_token"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code symbol_2_token}
     * @param symbol_2_token The new value of the field {@code symbol_2_token}
     */
    public void symbol_2_token$set(int symbol_2_token) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("symbol_2_token"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), symbol_2_token);
    }
    
    /**
     * Get the value of the field {@code scope_0_fallback}
     * @return The value of the field {@code scope_0_fallback}
     */
    public int scope_0_fallback$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scope_0_fallback"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code scope_0_fallback}
     * @param scope_0_fallback The new value of the field {@code scope_0_fallback}
     */
    public void scope_0_fallback$set(int scope_0_fallback) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scope_0_fallback"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scope_0_fallback);
    }
    
    /**
     * Get the value of the field {@code store_int64}
     * @return The value of the field {@code store_int64}
     */
    public int store_int64$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("store_int64"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code store_int64}
     * @param store_int64 The new value of the field {@code store_int64}
     */
    public void store_int64$set(int store_int64) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("store_int64"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), store_int64);
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
         * @param cset_skip_characters The value for the {@code cset_skip_characters} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCsetSkipCharacters(java.lang.String cset_skip_characters) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cset_skip_characters"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cset_skip_characters == null ? MemoryAddress.NULL : Interop.allocateNativeString(cset_skip_characters)));
            return this;
        }
        
        /**
         * specifies the characters which can start
         *     identifiers (the default is {@code G_CSET_a_2_z}, "_", and {@code G_CSET_A_2_Z}).
         * @param cset_identifier_first The value for the {@code cset_identifier_first} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCsetIdentifierFirst(java.lang.String cset_identifier_first) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_first"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cset_identifier_first == null ? MemoryAddress.NULL : Interop.allocateNativeString(cset_identifier_first)));
            return this;
        }
        
        /**
         * specifies the characters which can be used
         *     in identifiers, after the first character (the default is
         *     {@code G_CSET_a_2_z}, "_0123456789", {@code G_CSET_A_2_Z}, {@code G_CSET_LATINS},
         *     {@code G_CSET_LATINC}).
         * @param cset_identifier_nth The value for the {@code cset_identifier_nth} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCsetIdentifierNth(java.lang.String cset_identifier_nth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_nth"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cset_identifier_nth == null ? MemoryAddress.NULL : Interop.allocateNativeString(cset_identifier_nth)));
            return this;
        }
        
        /**
         * specifies the characters at the start and
         *     end of single-line comments. The default is "{@code \\n}" which means
         *     that single-line comments start with a '{@code '} and continue until
         *     a '\\n' (end of line).
         * @param cpair_comment_single The value for the {@code cpair_comment_single} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCpairCommentSingle(java.lang.String cpair_comment_single) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cpair_comment_single"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cpair_comment_single == null ? MemoryAddress.NULL : Interop.allocateNativeString(cpair_comment_single)));
            return this;
        }
        
        /**
         * specifies if symbols are case sensitive (the
         *     default is {@code false}).
         * @param case_sensitive The value for the {@code case_sensitive} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCaseSensitive(int case_sensitive) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("case_sensitive"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), case_sensitive);
            return this;
        }
        
        /**
         * specifies if multi-line comments are skipped
         *     and not returned as tokens (the default is {@code true}).
         * @param skip_comment_multi The value for the {@code skip_comment_multi} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSkipCommentMulti(int skip_comment_multi) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_multi"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), skip_comment_multi);
            return this;
        }
        
        /**
         * specifies if single-line comments are skipped
         *     and not returned as tokens (the default is {@code true}).
         * @param skip_comment_single The value for the {@code skip_comment_single} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSkipCommentSingle(int skip_comment_single) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip_comment_single"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), skip_comment_single);
            return this;
        }
        
        /**
         * specifies if multi-line comments are recognized
         *     (the default is {@code true}).
         * @param scan_comment_multi The value for the {@code scan_comment_multi} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanCommentMulti(int scan_comment_multi) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_comment_multi"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_comment_multi);
            return this;
        }
        
        /**
         * specifies if identifiers are recognized (the
         *     default is {@code true}).
         * @param scan_identifier The value for the {@code scan_identifier} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanIdentifier(int scan_identifier) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_identifier);
            return this;
        }
        
        /**
         * specifies if single-character
         *     identifiers are recognized (the default is {@code false}).
         * @param scan_identifier_1char The value for the {@code scan_identifier_1char} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanIdentifier1char(int scan_identifier_1char) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_1char"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_identifier_1char);
            return this;
        }
        
        /**
         * specifies if {@code null} is reported as
         *     {@link TokenType#IDENTIFIER_NULL} (the default is {@code false}).
         * @param scan_identifier_NULL The value for the {@code scan_identifier_NULL} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanIdentifierNULL(int scan_identifier_NULL) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_identifier_NULL"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_identifier_NULL);
            return this;
        }
        
        /**
         * specifies if symbols are recognized (the default
         *     is {@code true}).
         * @param scan_symbols The value for the {@code scan_symbols} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanSymbols(int scan_symbols) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_symbols"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_symbols);
            return this;
        }
        
        /**
         * specifies if binary numbers are recognized (the
         *     default is {@code false}).
         * @param scan_binary The value for the {@code scan_binary} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanBinary(int scan_binary) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_binary"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_binary);
            return this;
        }
        
        /**
         * specifies if octal numbers are recognized (the
         *     default is {@code true}).
         * @param scan_octal The value for the {@code scan_octal} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanOctal(int scan_octal) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_octal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_octal);
            return this;
        }
        
        /**
         * specifies if floating point numbers are recognized
         *     (the default is {@code true}).
         * @param scan_float The value for the {@code scan_float} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanFloat(int scan_float) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_float"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_float);
            return this;
        }
        
        /**
         * specifies if hexadecimal numbers are recognized (the
         *     default is {@code true}).
         * @param scan_hex The value for the {@code scan_hex} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanHex(int scan_hex) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_hex"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_hex);
            return this;
        }
        
        /**
         * specifies if '$' is recognized as a prefix for
         *     hexadecimal numbers (the default is {@code false}).
         * @param scan_hex_dollar The value for the {@code scan_hex_dollar} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanHexDollar(int scan_hex_dollar) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_hex_dollar"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_hex_dollar);
            return this;
        }
        
        /**
         * specifies if strings can be enclosed in single
         *     quotes (the default is {@code true}).
         * @param scan_string_sq The value for the {@code scan_string_sq} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanStringSq(int scan_string_sq) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_string_sq"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_string_sq);
            return this;
        }
        
        /**
         * specifies if strings can be enclosed in double
         *     quotes (the default is {@code true}).
         * @param scan_string_dq The value for the {@code scan_string_dq} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScanStringDq(int scan_string_dq) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scan_string_dq"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scan_string_dq);
            return this;
        }
        
        /**
         * specifies if binary, octal and hexadecimal numbers
         *     are reported as {@link TokenType#INT} (the default is {@code true}).
         * @param numbers_2_int The value for the {@code numbers_2_int} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNumbers2Int(int numbers_2_int) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("numbers_2_int"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), numbers_2_int);
            return this;
        }
        
        /**
         * specifies if all numbers are reported as {@link TokenType#FLOAT}
         *     (the default is {@code false}).
         * @param int_2_float The value for the {@code int_2_float} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInt2Float(int int_2_float) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("int_2_float"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), int_2_float);
            return this;
        }
        
        /**
         * specifies if identifiers are reported as strings
         *     (the default is {@code false}).
         * @param identifier_2_string The value for the {@code identifier_2_string} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIdentifier2String(int identifier_2_string) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("identifier_2_string"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), identifier_2_string);
            return this;
        }
        
        /**
         * specifies if characters are reported by setting
         *     {@code token = ch} or as {@link TokenType#CHAR} (the default is {@code true}).
         * @param char_2_token The value for the {@code char_2_token} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChar2Token(int char_2_token) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("char_2_token"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), char_2_token);
            return this;
        }
        
        /**
         * specifies if symbols are reported by setting
         *     {@code token = v_symbol} or as {@link TokenType#SYMBOL} (the default is {@code false}).
         * @param symbol_2_token The value for the {@code symbol_2_token} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSymbol2Token(int symbol_2_token) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("symbol_2_token"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), symbol_2_token);
            return this;
        }
        
        /**
         * specifies if a symbol is searched for in the
         *     default scope in addition to the current scope (the default is {@code false}).
         * @param scope_0_fallback The value for the {@code scope_0_fallback} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScope0Fallback(int scope_0_fallback) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scope_0_fallback"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scope_0_fallback);
            return this;
        }
        
        /**
         * use value.v_int64 rather than v_int
         * @param store_int64 The value for the {@code store_int64} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStoreInt64(int store_int64) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("store_int64"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), store_int64);
            return this;
        }
        
        public Build setPaddingDummy(int padding_dummy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding_dummy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), padding_dummy);
            return this;
        }
    }
}
