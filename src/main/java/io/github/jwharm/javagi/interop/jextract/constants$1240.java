// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1240 {

    static final FunctionDescriptor pango_attr_list_insert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_insert$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_insert",
        constants$1240.pango_attr_list_insert$FUNC
    );
    static final FunctionDescriptor pango_attr_list_insert_before$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_insert_before$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_insert_before",
        constants$1240.pango_attr_list_insert_before$FUNC
    );
    static final FunctionDescriptor pango_attr_list_change$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_change$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_change",
        constants$1240.pango_attr_list_change$FUNC
    );
    static final FunctionDescriptor pango_attr_list_splice$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_attr_list_splice$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_splice",
        constants$1240.pango_attr_list_splice$FUNC
    );
    static final FunctionDescriptor pango_attr_list_update$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_attr_list_update$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_update",
        constants$1240.pango_attr_list_update$FUNC
    );
    static final FunctionDescriptor pango_attr_list_filter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_filter$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_filter",
        constants$1240.pango_attr_list_filter$FUNC
    );
}


