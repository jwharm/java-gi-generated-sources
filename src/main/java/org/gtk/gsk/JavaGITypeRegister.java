package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(BlendNode.getType(), BlendNode.fromAddress);
        Interop.typeRegister.put(BlurNode.getType(), BlurNode.fromAddress);
        Interop.typeRegister.put(BorderNode.getType(), BorderNode.fromAddress);
        Interop.typeRegister.put(BroadwayRenderer.getType(), BroadwayRenderer.fromAddress);
        Interop.typeRegister.put(CairoNode.getType(), CairoNode.fromAddress);
        Interop.typeRegister.put(CairoRenderer.getType(), CairoRenderer.fromAddress);
        Interop.typeRegister.put(ClipNode.getType(), ClipNode.fromAddress);
        Interop.typeRegister.put(ColorMatrixNode.getType(), ColorMatrixNode.fromAddress);
        Interop.typeRegister.put(ColorNode.getType(), ColorNode.fromAddress);
        Interop.typeRegister.put(ConicGradientNode.getType(), ConicGradientNode.fromAddress);
        Interop.typeRegister.put(ContainerNode.getType(), ContainerNode.fromAddress);
        Interop.typeRegister.put(CrossFadeNode.getType(), CrossFadeNode.fromAddress);
        Interop.typeRegister.put(DebugNode.getType(), DebugNode.fromAddress);
        Interop.typeRegister.put(GLRenderer.getType(), GLRenderer.fromAddress);
        Interop.typeRegister.put(GLShader.getType(), GLShader.fromAddress);
        Interop.typeRegister.put(GLShaderNode.getType(), GLShaderNode.fromAddress);
        Interop.typeRegister.put(InsetShadowNode.getType(), InsetShadowNode.fromAddress);
        Interop.typeRegister.put(LinearGradientNode.getType(), LinearGradientNode.fromAddress);
        Interop.typeRegister.put(NglRenderer.getType(), NglRenderer.fromAddress);
        Interop.typeRegister.put(OpacityNode.getType(), OpacityNode.fromAddress);
        Interop.typeRegister.put(OutsetShadowNode.getType(), OutsetShadowNode.fromAddress);
        Interop.typeRegister.put(RadialGradientNode.getType(), RadialGradientNode.fromAddress);
        Interop.typeRegister.put(RenderNode.getType(), RenderNode.fromAddress);
        Interop.typeRegister.put(Renderer.getType(), Renderer.fromAddress);
        Interop.typeRegister.put(RepeatNode.getType(), RepeatNode.fromAddress);
        Interop.typeRegister.put(RepeatingLinearGradientNode.getType(), RepeatingLinearGradientNode.fromAddress);
        Interop.typeRegister.put(RepeatingRadialGradientNode.getType(), RepeatingRadialGradientNode.fromAddress);
        Interop.typeRegister.put(RoundedClipNode.getType(), RoundedClipNode.fromAddress);
        Interop.typeRegister.put(ShadowNode.getType(), ShadowNode.fromAddress);
        Interop.typeRegister.put(TextNode.getType(), TextNode.fromAddress);
        Interop.typeRegister.put(TextureNode.getType(), TextureNode.fromAddress);
        Interop.typeRegister.put(TransformNode.getType(), TransformNode.fromAddress);
    }
}
