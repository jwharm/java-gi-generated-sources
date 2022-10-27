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
public class ScannerConfig extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("cset_skip_characters"),
        Interop.valueLayout.ADDRESS.withName("cset_identifier_first"),
        Interop.valueLayout.ADDRESS.withName("cset_identifier_nth"),
        Interop.valueLayout.ADDRESS.withName("cpair_comment_single"),
        ValueLayout.JAVA_INT.withName("case_sensitive"),
        ValueLayout.JAVA_INT.withName("skip_comment_multi"),
        ValueLayout.JAVA_INT.withName("skip_comment_single"),
        ValueLayout.JAVA_INT.withName("scan_comment_multi"),
        ValueLayout.JAVA_INT.withName("scan_identifier"),
        ValueLayout.JAVA_INT.withName("scan_identifier_1char"),
        ValueLayout.JAVA_INT.withName("scan_identifier_NULL"),
        ValueLayout.JAVA_INT.withName("scan_symbols"),
        ValueLayout.JAVA_INT.withName("scan_binary"),
        ValueLayout.JAVA_INT.withName("scan_octal"),
        ValueLayout.JAVA_INT.withName("scan_float"),
        ValueLayout.JAVA_INT.withName("scan_hex"),
        ValueLayout.JAVA_INT.withName("scan_hex_dollar"),
        ValueLayout.JAVA_INT.withName("scan_string_sq"),
        ValueLayout.JAVA_INT.withName("scan_string_dq"),
        ValueLayout.JAVA_INT.withName("numbers_2_int"),
        ValueLayout.JAVA_INT.withName("int_2_float"),
        ValueLayout.JAVA_INT.withName("identifier_2_string"),
        ValueLayout.JAVA_INT.withName("char_2_token"),
        ValueLayout.JAVA_INT.withName("symbol_2_token"),
        ValueLayout.JAVA_INT.withName("scope_0_fallback"),
        ValueLayout.JAVA_INT.withName("store_int64"),
        ValueLayout.JAVA_INT.withName("padding_dummy")
    ).withName("GScannerConfig");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ScannerConfig(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
