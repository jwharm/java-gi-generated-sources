// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2666 {

    static final FunctionDescriptor FT_Set_Pixel_Sizes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle FT_Set_Pixel_Sizes$MH = RuntimeHelper.downcallHandle(
        "FT_Set_Pixel_Sizes",
        constants$2666.FT_Set_Pixel_Sizes$FUNC
    );
    static final FunctionDescriptor FT_Load_Glyph$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle FT_Load_Glyph$MH = RuntimeHelper.downcallHandle(
        "FT_Load_Glyph",
        constants$2666.FT_Load_Glyph$FUNC
    );
    static final FunctionDescriptor FT_Load_Char$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle FT_Load_Char$MH = RuntimeHelper.downcallHandle(
        "FT_Load_Char",
        constants$2666.FT_Load_Char$FUNC
    );
    static final FunctionDescriptor FT_Set_Transform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FT_Set_Transform$MH = RuntimeHelper.downcallHandle(
        "FT_Set_Transform",
        constants$2666.FT_Set_Transform$FUNC
    );
    static final FunctionDescriptor FT_Get_Transform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FT_Get_Transform$MH = RuntimeHelper.downcallHandle(
        "FT_Get_Transform",
        constants$2666.FT_Get_Transform$FUNC
    );
    static final FunctionDescriptor FT_Render_Glyph$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle FT_Render_Glyph$MH = RuntimeHelper.downcallHandle(
        "FT_Render_Glyph",
        constants$2666.FT_Render_Glyph$FUNC
    );
}


