package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkGLAreaClass} structure contains only private data.
 */
public class GLAreaClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGLAreaClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("render"),
            Interop.valueLayout.ADDRESS.withName("resize"),
            Interop.valueLayout.ADDRESS.withName("create_context"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLAreaClass}
     * @return A new, uninitialized @{link GLAreaClass}
     */
    public static GLAreaClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLAreaClass newInstance = new GLAreaClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code RenderCallback} callback.
     */
    @FunctionalInterface
    public interface RenderCallback {
    
        boolean run(org.gtk.gtk.GLArea area, org.gtk.gdk.GLContext context);
        
        @ApiStatus.Internal default int upcall(MemoryAddress area, MemoryAddress context) {
            var RESULT = run((org.gtk.gtk.GLArea) Interop.register(area, org.gtk.gtk.GLArea.fromAddress).marshal(area, null), (org.gtk.gdk.GLContext) Interop.register(context, org.gtk.gdk.GLContext.fromAddress).marshal(context, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RenderCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code render}
     * @param render The new value of the field {@code render}
     */
    public void setRender(RenderCallback render) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (render == null ? MemoryAddress.NULL : render.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ResizeCallback} callback.
     */
    @FunctionalInterface
    public interface ResizeCallback {
    
        void run(org.gtk.gtk.GLArea area, int width, int height);
        
        @ApiStatus.Internal default void upcall(MemoryAddress area, int width, int height) {
            run((org.gtk.gtk.GLArea) Interop.register(area, org.gtk.gtk.GLArea.fromAddress).marshal(area, null), width, height);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ResizeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code resize}
     * @param resize The new value of the field {@code resize}
     */
    public void setResize(ResizeCallback resize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("resize"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (resize == null ? MemoryAddress.NULL : resize.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateContextCallback} callback.
     */
    @FunctionalInterface
    public interface CreateContextCallback {
    
        org.gtk.gdk.GLContext run(org.gtk.gtk.GLArea area);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress area) {
            var RESULT = run((org.gtk.gtk.GLArea) Interop.register(area, org.gtk.gtk.GLArea.fromAddress).marshal(area, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateContextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_context}
     * @param createContext The new value of the field {@code create_context}
     */
    public void setCreateContext(CreateContextCallback createContext) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createContext == null ? MemoryAddress.NULL : createContext.toCallback()));
        }
    }
    
    /**
     * Create a GLAreaClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLAreaClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLAreaClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLAreaClass(input);
    
    /**
     * A {@link GLAreaClass.Builder} object constructs a {@link GLAreaClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLAreaClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLAreaClass struct;
        
        private Builder() {
            struct = GLAreaClass.allocate();
        }
        
        /**
         * Finish building the {@link GLAreaClass} struct.
         * @return A new instance of {@code GLAreaClass} with the fields 
         *         that were set in the Builder object.
         */
        public GLAreaClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gtk.WidgetClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setRender(RenderCallback render) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("render"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (render == null ? MemoryAddress.NULL : render.toCallback()));
                return this;
            }
        }
        
        public Builder setResize(ResizeCallback resize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("resize"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (resize == null ? MemoryAddress.NULL : resize.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateContext(CreateContextCallback createContext) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_context"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createContext == null ? MemoryAddress.NULL : createContext.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false, SCOPE)));
                return this;
            }
        }
    }
}
