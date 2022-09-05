package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node using a GL shader when drawing its children nodes.
 */
public class GLShaderNode extends RenderNode {

    public GLShaderNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to GLShaderNode */
    public static GLShaderNode castFrom(org.gtk.gobject.Object gobject) {
        return new GLShaderNode(gobject.getProxy());
    }
    
    /**
     * Creates a `GskRenderNode` that will render the given @shader into the
     * area given by @bounds.
     * 
     * The @args is a block of data to use for uniform input, as per types and
     * offsets defined by the @shader. Normally this is generated by
     * [method@Gsk.GLShader.format_args] or [struct@Gsk.ShaderArgsBuilder].
     * 
     * See [class@Gsk.GLShader] for details about how the shader should be written.
     * 
     * All the children will be rendered into textures (if they aren't already
     * `GskTextureNodes`, which will be used directly). These textures will be
     * sent as input to the shader.
     * 
     * If the renderer doesn't support GL shaders, or if there is any problem
     * when compiling the shader, then the node will draw pink. You should use
     * [method@Gsk.GLShader.compile] to ensure the @shader will work for the
     * renderer before using it.
     */
    public GLShaderNode(GLShader shader, org.gtk.graphene.Rect bounds, org.gtk.glib.Bytes args, RenderNode[] children, int nChildren) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_node_new(shader.HANDLE(), bounds.HANDLE(), args.HANDLE(), Interop.allocateNativeArray(children), nChildren), true));
    }
    
    /**
     * Gets args for the node.
     */
    public org.gtk.glib.Bytes getArgs() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_node_get_args(HANDLE());
        return new org.gtk.glib.Bytes(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets one of the children.
     */
    public RenderNode getChild(int idx) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_node_get_child(HANDLE(), idx);
        return new RenderNode(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the number of children
     */
    public int getNChildren() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_node_get_n_children(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets shader code for the node.
     */
    public GLShader getShader() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_gl_shader_node_get_shader(HANDLE());
        return new GLShader(ProxyFactory.get(RESULT, false));
    }
    
}
