// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1239 {

    static final FunctionDescriptor pango_attribute_as_font_features$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attribute_as_font_features$MH = RuntimeHelper.downcallHandle(
        "pango_attribute_as_font_features",
        constants$1239.pango_attribute_as_font_features$FUNC
    );
    static final FunctionDescriptor pango_attr_list_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_attr_list_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_get_type",
        constants$1239.pango_attr_list_get_type$FUNC
    );
    static final FunctionDescriptor pango_attr_list_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle pango_attr_list_new$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_new",
        constants$1239.pango_attr_list_new$FUNC
    );
    static final FunctionDescriptor pango_attr_list_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_ref$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_ref",
        constants$1239.pango_attr_list_ref$FUNC
    );
    static final FunctionDescriptor pango_attr_list_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_unref$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_unref",
        constants$1239.pango_attr_list_unref$FUNC
    );
    static final FunctionDescriptor pango_attr_list_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_copy$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_copy",
        constants$1239.pango_attr_list_copy$FUNC
    );
}


