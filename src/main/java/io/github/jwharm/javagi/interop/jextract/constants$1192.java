// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1192 {

    static final FunctionDescriptor hb_buffer_add_latin1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_add_latin1$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_add_latin1",
        constants$1192.hb_buffer_add_latin1$FUNC
    );
    static final FunctionDescriptor hb_buffer_add_codepoints$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_add_codepoints$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_add_codepoints",
        constants$1192.hb_buffer_add_codepoints$FUNC
    );
    static final FunctionDescriptor hb_buffer_append$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_append$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_append",
        constants$1192.hb_buffer_append$FUNC
    );
    static final FunctionDescriptor hb_buffer_set_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_set_length$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_set_length",
        constants$1192.hb_buffer_set_length$FUNC
    );
    static final FunctionDescriptor hb_buffer_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_get_length$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_length",
        constants$1192.hb_buffer_get_length$FUNC
    );
    static final FunctionDescriptor hb_buffer_get_glyph_infos$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_get_glyph_infos$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_glyph_infos",
        constants$1192.hb_buffer_get_glyph_infos$FUNC
    );
}


