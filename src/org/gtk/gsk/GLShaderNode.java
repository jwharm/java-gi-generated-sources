package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node using a GL shader when drawing its children nodes.
 */
public class GLShaderNode extends RenderNode {

    public GLShaderNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GLShaderNode */
    public static GLShaderNode castFrom(org.gtk.gobject.Object gobject) {
        return new GLShaderNode(gobject.getReference());
    }
    
    private static Reference constructNew(GLShader shader, org.gtk.graphene.Rect bounds, org.gtk.glib.Bytes args, RenderNode[] children, int nChildren) {
        Reference RESULT = References.get(gtk_h.gsk_gl_shader_node_new(shader.handle(), bounds.handle(), args.handle(), Interop.allocateNativeArray(children).handle(), nChildren), true);
        return RESULT;
    }
    
    /**
     * Creates a <code>GskRenderNode</code> that will render the given @shader into the
     * area given by @bounds.
     * <p>
     * The @args is a block of data to use for uniform input, as per types and
     * offsets defined by the @shader. Normally this is generated by
     * {@link org.gtk.gsk.GLShader<code>#formatArgs</code>  or {@link [struct@Gsk.ShaderArgsBuilder] (ref=struct)}.
     * <p>
     * See {@link org.gtk.gsk.GLShader} for details about how the shader should be written.
     * <p>
     * All the children will be rendered into textures (if they aren&<code>#39</code> t already<code>GskTextureNodes</code>, which will be used directly). These textures will be
     * sent as input to the shader.
     * 
     * If the renderer doesn&<code>#39</code> t support GL shaders, or if there is any problem
     * when compiling the shader, then the node will draw pink. You should use
     * {@link org.gtk.gsk.GLShader<code>#compile</code>  to ensure the @shader will work for the
     * renderer before using it.
     */
    public GLShaderNode(GLShader shader, org.gtk.graphene.Rect bounds, org.gtk.glib.Bytes args, RenderNode[] children, int nChildren) {
        super(constructNew(shader, bounds, args, children, nChildren));
    }
    
    /**
     * Gets args for the node.
     */
    public org.gtk.glib.Bytes getArgs() {
        var RESULT = gtk_h.gsk_gl_shader_node_get_args(handle());
        return new org.gtk.glib.Bytes(References.get(RESULT, false));
    }
    
    /**
     * Gets one of the children.
     */
    public RenderNode getChild(int idx) {
        var RESULT = gtk_h.gsk_gl_shader_node_get_child(handle(), idx);
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Returns the number of children
     */
    public int getNChildren() {
        var RESULT = gtk_h.gsk_gl_shader_node_get_n_children(handle());
        return RESULT;
    }
    
    /**
     * Gets shader code for the node.
     */
    public GLShader getShader() {
        var RESULT = gtk_h.gsk_gl_shader_node_get_shader(handle());
        return new GLShader(References.get(RESULT, false));
    }
    
}
