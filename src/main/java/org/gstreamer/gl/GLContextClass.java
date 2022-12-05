package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLContextClass extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLContextClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_current_context"),
        Interop.valueLayout.ADDRESS.withName("get_gl_context"),
        Interop.valueLayout.ADDRESS.withName("get_gl_api"),
        Interop.valueLayout.ADDRESS.withName("get_gl_platform"),
        Interop.valueLayout.ADDRESS.withName("get_proc_address"),
        Interop.valueLayout.ADDRESS.withName("activate"),
        Interop.valueLayout.ADDRESS.withName("choose_format"),
        Interop.valueLayout.ADDRESS.withName("create_context"),
        Interop.valueLayout.ADDRESS.withName("destroy_context"),
        Interop.valueLayout.ADDRESS.withName("swap_buffers"),
        Interop.valueLayout.ADDRESS.withName("check_feature"),
        Interop.valueLayout.ADDRESS.withName("get_gl_platform_version"),
        Interop.valueLayout.ADDRESS.withName("get_config"),
        Interop.valueLayout.ADDRESS.withName("request_config"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLContextClass}
     * @return A new, uninitialized @{link GLContextClass}
     */
    public static GLContextClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLContextClass newInstance = new GLContextClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a GLContextClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLContextClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLContextClass struct;
        
         /**
         * A {@link GLContextClass.Build} object constructs a {@link GLContextClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLContextClass.allocate();
        }
        
         /**
         * Finish building the {@link GLContextClass} struct.
         * @return A new instance of {@code GLContextClass} with the fields 
         *         that were set in the Build object.
         */
        public GLContextClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setGetCurrentContext(java.lang.foreign.MemoryAddress getCurrentContext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_current_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCurrentContext == null ? MemoryAddress.NULL : getCurrentContext));
            return this;
        }
        
        public Build setGetGlContext(java.lang.foreign.MemoryAddress getGlContext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_gl_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlContext == null ? MemoryAddress.NULL : getGlContext));
            return this;
        }
        
        public Build setGetGlApi(java.lang.foreign.MemoryAddress getGlApi) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_gl_api"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlApi == null ? MemoryAddress.NULL : getGlApi));
            return this;
        }
        
        public Build setGetGlPlatform(java.lang.foreign.MemoryAddress getGlPlatform) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_gl_platform"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlPlatform == null ? MemoryAddress.NULL : getGlPlatform));
            return this;
        }
        
        public Build setGetProcAddress(java.lang.foreign.MemoryAddress getProcAddress) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_proc_address"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getProcAddress == null ? MemoryAddress.NULL : getProcAddress));
            return this;
        }
        
        public Build setActivate(java.lang.foreign.MemoryAddress activate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate));
            return this;
        }
        
        public Build setChooseFormat(java.lang.foreign.MemoryAddress chooseFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("choose_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (chooseFormat == null ? MemoryAddress.NULL : chooseFormat));
            return this;
        }
        
        public Build setCreateContext(java.lang.foreign.MemoryAddress createContext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createContext == null ? MemoryAddress.NULL : createContext));
            return this;
        }
        
        public Build setDestroyContext(java.lang.foreign.MemoryAddress destroyContext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destroyContext == null ? MemoryAddress.NULL : destroyContext));
            return this;
        }
        
        public Build setSwapBuffers(java.lang.foreign.MemoryAddress swapBuffers) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("swap_buffers"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (swapBuffers == null ? MemoryAddress.NULL : swapBuffers));
            return this;
        }
        
        public Build setCheckFeature(java.lang.foreign.MemoryAddress checkFeature) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("check_feature"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (checkFeature == null ? MemoryAddress.NULL : checkFeature));
            return this;
        }
        
        public Build setGetGlPlatformVersion(java.lang.foreign.MemoryAddress getGlPlatformVersion) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_gl_platform_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlPlatformVersion == null ? MemoryAddress.NULL : getGlPlatformVersion));
            return this;
        }
        
        public Build setGetConfig(java.lang.foreign.MemoryAddress getConfig) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_config"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getConfig == null ? MemoryAddress.NULL : getConfig));
            return this;
        }
        
        public Build setRequestConfig(java.lang.foreign.MemoryAddress requestConfig) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_config"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requestConfig == null ? MemoryAddress.NULL : requestConfig));
            return this;
        }
        
        public Build setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false)));
            return this;
        }
    }
}
