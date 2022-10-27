package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node using a GL shader when drawing its children nodes.
 */
public class GLShaderNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public GLShaderNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GLShaderNode */
    public static GLShaderNode castFrom(org.gtk.gobject.Object gobject) {
        return new GLShaderNode(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gsk.GLShader shader, @NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.glib.Bytes args, org.gtk.gsk.RenderNode[] children, int nChildren) {
        java.util.Objects.requireNonNull(shader, "Parameter 'shader' must not be null");
        java.util.Objects.requireNonNull(bounds, "Parameter 'bounds' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNullElse(children, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_gl_shader_node_new.invokeExact(shader.handle(), bounds.handle(), args.handle(), Interop.allocateNativeArray(children, false), nChildren), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will render the given {@code shader} into the
     * area given by {@code bounds}.
     * <p>
     * The {@code args} is a block of data to use for uniform input, as per types and
     * offsets defined by the {@code shader}. Normally this is generated by
     * {@link GLShader#formatArgs} or {@code Gsk.ShaderArgsBuilder}.
     * <p>
     * See {@link GLShader} for details about how the shader should be written.
     * <p>
     * All the children will be rendered into textures (if they aren't already
     * {@code GskTextureNodes}, which will be used directly). These textures will be
     * sent as input to the shader.
     * <p>
     * If the renderer doesn't support GL shaders, or if there is any problem
     * when compiling the shader, then the node will draw pink. You should use
     * {@link GLShader#compile} to ensure the {@code shader} will work for the
     * renderer before using it.
     * @param shader the {@code GskGLShader}
     * @param bounds the rectangle to render the shader into
     * @param args Arguments for the uniforms
     * @param children array of child nodes,
     *   these will be rendered to textures and used as input.
     * @param nChildren Length of {@code children} (currenly the GL backend supports
     *   up to 4 children)
     */
    public GLShaderNode(@NotNull org.gtk.gsk.GLShader shader, @NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.glib.Bytes args, org.gtk.gsk.RenderNode[] children, int nChildren) {
        super(constructNew(shader, bounds, args, children, nChildren));
    }
    
    /**
     * Gets args for the node.
     * @return A {@code GBytes} with the uniform arguments
     */
    public @NotNull org.gtk.glib.Bytes getArgs() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_gl_shader_node_get_args.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets one of the children.
     * @param idx the position of the child to get
     * @return the {@code idx}'th child of {@code node}
     */
    public @NotNull org.gtk.gsk.RenderNode getChild(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_gl_shader_node_get_child.invokeExact(handle(), idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the number of children
     * @return The number of children
     */
    public int getNChildren() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_gl_shader_node_get_n_children.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets shader code for the node.
     * @return the {@code GskGLShader} shader
     */
    public @NotNull org.gtk.gsk.GLShader getShader() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_gl_shader_node_get_shader.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.GLShader(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_gl_shader_node_new = Interop.downcallHandle(
            "gsk_gl_shader_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gsk_gl_shader_node_get_args = Interop.downcallHandle(
            "gsk_gl_shader_node_get_args",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_node_get_child = Interop.downcallHandle(
            "gsk_gl_shader_node_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gsk_gl_shader_node_get_n_children = Interop.downcallHandle(
            "gsk_gl_shader_node_get_n_children",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_gl_shader_node_get_shader = Interop.downcallHandle(
            "gsk_gl_shader_node_get_shader",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
