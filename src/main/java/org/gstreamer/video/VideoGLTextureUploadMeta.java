package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra buffer metadata for uploading a buffer to an OpenGL texture
 * ID. The caller of gst_video_gl_texture_upload_meta_upload() must
 * have OpenGL set up and call this from a thread where it is valid
 * to upload something to an OpenGL texture.
 */
public class VideoGLTextureUploadMeta extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoGLTextureUploadMeta";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
            Interop.valueLayout.C_INT.withName("texture_orientation"),
            Interop.valueLayout.C_INT.withName("n_textures"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_INT).withName("texture_type"),
            Interop.valueLayout.ADDRESS.withName("buffer"),
            Interop.valueLayout.ADDRESS.withName("upload"),
            Interop.valueLayout.ADDRESS.withName("user_data"),
            Interop.valueLayout.ADDRESS.withName("user_data_copy"),
            Interop.valueLayout.ADDRESS.withName("user_data_free")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoGLTextureUploadMeta}
     * @return A new, uninitialized @{link VideoGLTextureUploadMeta}
     */
    public static VideoGLTextureUploadMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoGLTextureUploadMeta newInstance = new VideoGLTextureUploadMeta(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code meta}
     * @return The value of the field {@code meta}
     */
    public org.gstreamer.gst.Meta getMeta() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("meta"));
        return org.gstreamer.gst.Meta.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code meta}
     * @param meta The new value of the field {@code meta}
     */
    public void setMeta(org.gstreamer.gst.Meta meta) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("meta"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
    }
    
    /**
     * Get the value of the field {@code texture_orientation}
     * @return The value of the field {@code texture_orientation}
     */
    public org.gstreamer.video.VideoGLTextureOrientation getTextureOrientation() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("texture_orientation"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoGLTextureOrientation.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code texture_orientation}
     * @param textureOrientation The new value of the field {@code texture_orientation}
     */
    public void setTextureOrientation(org.gstreamer.video.VideoGLTextureOrientation textureOrientation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("texture_orientation"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (textureOrientation == null ? MemoryAddress.NULL : textureOrientation.getValue()));
    }
    
    /**
     * Get the value of the field {@code n_textures}
     * @return The value of the field {@code n_textures}
     */
    public int getNTextures() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_textures"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_textures}
     * @param nTextures The new value of the field {@code n_textures}
     */
    public void setNTextures(int nTextures) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_textures"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nTextures);
    }
    
    /**
     * Get the value of the field {@code texture_type}
     * @return The value of the field {@code texture_type}
     */
    public org.gstreamer.video.VideoGLTextureType[] getTextureType() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("texture_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerEnumeration<org.gstreamer.video.VideoGLTextureType>(RESULT, org.gstreamer.video.VideoGLTextureType::of).toArray((int) 4, org.gstreamer.video.VideoGLTextureType.class);
    }
    
    /**
     * Change the value of the field {@code texture_type}
     * @param textureType The new value of the field {@code texture_type}
     */
    public void setTextureType(org.gstreamer.video.VideoGLTextureType[] textureType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("texture_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (textureType == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Enumeration.getValues(textureType), false)));
    }
    
    /**
     * Create a VideoGLTextureUploadMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoGLTextureUploadMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoGLTextureUploadMeta> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoGLTextureUploadMeta(input, ownership);
    
    /**
     * Uploads the buffer which owns the meta to a specific texture ID.
     * @param textureId the texture IDs to upload to
     * @return {@code true} if uploading succeeded, {@code false} otherwise.
     */
    public boolean upload(PointerInteger textureId) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_gl_texture_upload_meta_upload.invokeExact(
                    handle(),
                    textureId.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_gl_texture_upload_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_gl_texture_upload_meta_upload = Interop.downcallHandle(
            "gst_video_gl_texture_upload_meta_upload",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_gl_texture_upload_meta_get_info = Interop.downcallHandle(
            "gst_video_gl_texture_upload_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link VideoGLTextureUploadMeta.Builder} object constructs a {@link VideoGLTextureUploadMeta} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoGLTextureUploadMeta.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoGLTextureUploadMeta struct;
        
        private Builder() {
            struct = VideoGLTextureUploadMeta.allocate();
        }
        
         /**
         * Finish building the {@link VideoGLTextureUploadMeta} struct.
         * @return A new instance of {@code VideoGLTextureUploadMeta} with the fields 
         *         that were set in the Builder object.
         */
        public VideoGLTextureUploadMeta build() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Meta}
         * @param meta The value for the {@code meta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMeta(org.gstreamer.gst.Meta meta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
            return this;
        }
        
        /**
         * Orientation of the textures
         * @param textureOrientation The value for the {@code textureOrientation} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTextureOrientation(org.gstreamer.video.VideoGLTextureOrientation textureOrientation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("texture_orientation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (textureOrientation == null ? MemoryAddress.NULL : textureOrientation.getValue()));
            return this;
        }
        
        /**
         * Number of textures that are generated
         * @param nTextures The value for the {@code nTextures} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNTextures(int nTextures) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_textures"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nTextures);
            return this;
        }
        
        /**
         * Type of each texture
         * @param textureType The value for the {@code textureType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTextureType(org.gstreamer.video.VideoGLTextureType[] textureType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("texture_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (textureType == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Enumeration.getValues(textureType), false)));
            return this;
        }
        
        public Builder setBuffer(org.gstreamer.gst.Buffer buffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
            return this;
        }
        
        public Builder setUpload(org.gstreamer.video.VideoGLTextureUpload upload) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("upload"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (upload == null ? MemoryAddress.NULL : (Addressable) upload.toCallback()));
            return this;
        }
        
        public Builder setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        public Builder setUserDataCopy(org.gtk.gobject.BoxedCopyFunc userDataCopy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data_copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userDataCopy == null ? MemoryAddress.NULL : (Addressable) userDataCopy.toCallback()));
            return this;
        }
        
        public Builder setUserDataFree(org.gtk.gobject.BoxedFreeFunc userDataFree) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data_free"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userDataFree == null ? MemoryAddress.NULL : (Addressable) userDataFree.toCallback()));
            return this;
        }
    }
}
