package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The interface allows unified access to control flipping and autocenter
 * operation of video-sources or operators.
 */
public interface VideoOrientation extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoOrientationImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoOrientationImpl(input, ownership);
    
    /**
     * Get the horizontal centering offset from the given object.
     * @param center return location for the result
     * @return {@code true} in case the element supports centering
     */
    default boolean getHcenter(Out<Integer> center) {
        MemorySegment centerPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_orientation_get_hcenter.invokeExact(
                    handle(),
                    (Addressable) centerPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        center.set(centerPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the horizontal flipping state ({@code true} for flipped) from the given object.
     * @param flip return location for the result
     * @return {@code true} in case the element supports flipping
     */
    default boolean getHflip(Out<Boolean> flip) {
        MemorySegment flipPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_orientation_get_hflip.invokeExact(
                    handle(),
                    (Addressable) flipPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        flip.set(flipPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the vertical centering offset from the given object.
     * @param center return location for the result
     * @return {@code true} in case the element supports centering
     */
    default boolean getVcenter(Out<Integer> center) {
        MemorySegment centerPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_orientation_get_vcenter.invokeExact(
                    handle(),
                    (Addressable) centerPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        center.set(centerPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the vertical flipping state ({@code true} for flipped) from the given object.
     * @param flip return location for the result
     * @return {@code true} in case the element supports flipping
     */
    default boolean getVflip(Out<Boolean> flip) {
        MemorySegment flipPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_orientation_get_vflip.invokeExact(
                    handle(),
                    (Addressable) flipPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        flip.set(flipPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the horizontal centering offset for the given object.
     * @param center centering offset
     * @return {@code true} in case the element supports centering
     */
    default boolean setHcenter(int center) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_orientation_set_hcenter.invokeExact(
                    handle(),
                    center);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the horizontal flipping state ({@code true} for flipped) for the given object.
     * @param flip use flipping
     * @return {@code true} in case the element supports flipping
     */
    default boolean setHflip(boolean flip) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_orientation_set_hflip.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(flip, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the vertical centering offset for the given object.
     * @param center centering offset
     * @return {@code true} in case the element supports centering
     */
    default boolean setVcenter(int center) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_orientation_set_vcenter.invokeExact(
                    handle(),
                    center);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the vertical flipping state ({@code true} for flipped) for the given object.
     * @param flip use flipping
     * @return {@code true} in case the element supports flipping
     */
    default boolean setVflip(boolean flip) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_orientation_set_vflip.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(flip, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_orientation_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Parses the "image-orientation" tag and transforms it into the
     * {@link VideoOrientationMethod} enum.
     * @param taglist A {@link org.gstreamer.gst.TagList}
     * @param method The location where to return the orientation.
     * @return TRUE if there was a valid "image-orientation" tag in the taglist.
     */
    public static boolean fromTag(org.gstreamer.gst.TagList taglist, Out<org.gstreamer.video.VideoOrientationMethod> method) {
        MemorySegment methodPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_orientation_from_tag.invokeExact(
                    taglist.handle(),
                    (Addressable) methodPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        method.set(org.gstreamer.video.VideoOrientationMethod.of(methodPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_video_orientation_get_hcenter = Interop.downcallHandle(
            "gst_video_orientation_get_hcenter",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_video_orientation_get_hflip = Interop.downcallHandle(
            "gst_video_orientation_get_hflip",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_video_orientation_get_vcenter = Interop.downcallHandle(
            "gst_video_orientation_get_vcenter",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_video_orientation_get_vflip = Interop.downcallHandle(
            "gst_video_orientation_get_vflip",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_video_orientation_set_hcenter = Interop.downcallHandle(
            "gst_video_orientation_set_hcenter",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_video_orientation_set_hflip = Interop.downcallHandle(
            "gst_video_orientation_set_hflip",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_video_orientation_set_vcenter = Interop.downcallHandle(
            "gst_video_orientation_set_vcenter",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_video_orientation_set_vflip = Interop.downcallHandle(
            "gst_video_orientation_set_vflip",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_video_orientation_get_type = Interop.downcallHandle(
            "gst_video_orientation_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_video_orientation_from_tag = Interop.downcallHandle(
            "gst_video_orientation_from_tag",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
    
    class VideoOrientationImpl extends org.gtk.gobject.GObject implements VideoOrientation {
        
        static {
            GstVideo.javagi$ensureInitialized();
        }
        
        public VideoOrientationImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
