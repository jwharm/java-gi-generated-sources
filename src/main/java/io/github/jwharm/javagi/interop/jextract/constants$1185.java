// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1185 {

    static final FunctionDescriptor hb_segment_properties_overlay$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_segment_properties_overlay$MH = RuntimeHelper.downcallHandle(
        "hb_segment_properties_overlay",
        constants$1185.hb_segment_properties_overlay$FUNC
    );
    static final FunctionDescriptor hb_buffer_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle hb_buffer_create$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_create",
        constants$1185.hb_buffer_create$FUNC
    );
    static final FunctionDescriptor hb_buffer_create_similar$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_create_similar$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_create_similar",
        constants$1185.hb_buffer_create_similar$FUNC
    );
    static final FunctionDescriptor hb_buffer_reset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_reset$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_reset",
        constants$1185.hb_buffer_reset$FUNC
    );
    static final FunctionDescriptor hb_buffer_get_empty$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle hb_buffer_get_empty$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_empty",
        constants$1185.hb_buffer_get_empty$FUNC
    );
    static final FunctionDescriptor hb_buffer_reference$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_reference$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_reference",
        constants$1185.hb_buffer_reference$FUNC
    );
}


