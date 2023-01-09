package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class H264Dpb extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstH264Dpb";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link H264Dpb}
     * @return A new, uninitialized @{link H264Dpb}
     */
    public static H264Dpb allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        H264Dpb newInstance = new H264Dpb(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a H264Dpb proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected H264Dpb(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, H264Dpb> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new H264Dpb(input);
    
    /**
     * Store the {@code picture}
     * @param picture a {@link H264Picture}
     */
    public void add(org.gstreamer.codecs.H264Picture picture) {
        try {
            DowncallHandles.gst_h264_dpb_add.invokeExact(
                    handle(),
                    picture.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        picture.yieldOwnership();
    }
    
    /**
     * Perform bumping process as defined in C.4.5.3 "Bumping" process.
     * If {@code drain} is {@code true}, {@code dpb} will remove a {@link H264Picture} from internal array
     * so that returned {@link H264Picture} could hold the last reference of it
     * @param drain whether draining or not
     * @return a {@link H264Picture} which is needed to be
     * outputted
     */
    public @Nullable org.gstreamer.codecs.H264Picture bump(boolean drain) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h264_dpb_bump.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(drain, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.codecs.H264Picture.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Clear all stored {@link H264Picture}
     */
    public void clear() {
        try {
            DowncallHandles.gst_h264_dpb_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Delete already outputted and not referenced all pictures from dpb
     */
    public void deleteUnused() {
        try {
            DowncallHandles.gst_h264_dpb_delete_unused.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Free the {@code dpb}
     */
    public void free() {
        try {
            DowncallHandles.gst_h264_dpb_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean getInterlaced() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_h264_dpb_get_interlaced.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Find a long term reference picture which has matching long term picture number
     * @param longTermPicNum a long term picture number
     * @return a {@link H264Picture}
     */
    public @Nullable org.gstreamer.codecs.H264Picture getLongRefByLongTermPicNum(int longTermPicNum) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h264_dpb_get_long_ref_by_long_term_pic_num.invokeExact(
                    handle(),
                    longTermPicNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.codecs.H264Picture.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Find a short term reference picture which has the lowest frame_num_wrap
     * @return a {@link H264Picture}
     */
    public org.gstreamer.codecs.H264Picture getLowestFrameNumShortRef() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h264_dpb_get_lowest_frame_num_short_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.codecs.H264Picture.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public int getMaxNumFrames() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_h264_dpb_get_max_num_frames.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public org.gstreamer.codecs.H264Picture getPicture(int systemFrameNumber) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h264_dpb_get_picture.invokeExact(
                    handle(),
                    systemFrameNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.codecs.H264Picture.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public PointerProxy<org.gstreamer.codecs.H264Picture> getPicturesAll() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_h264_dpb_get_pictures_all.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerProxy<org.gstreamer.codecs.H264Picture>(RESULT, org.gstreamer.codecs.H264Picture.fromAddress);
        }
    }
    
    /**
     * Retrieve all long-term reference pictures from {@code dpb}. The picture will be
     * appended to the array.
     * @param includeSecondField {@code true} if the second field pictures need to be included
     * @param out an array
     *   of {@link H264Picture} pointer
     */
    public void getPicturesLongTermRef(boolean includeSecondField, org.gstreamer.codecs.H264Picture[] out) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_h264_dpb_get_pictures_long_term_ref.invokeExact(
                        handle(),
                        Marshal.booleanToInteger.marshal(includeSecondField, null).intValue(),
                        Interop.allocateNativeArray(out, org.gstreamer.codecs.H264Picture.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Retrieve all short-term reference pictures from {@code dpb}. The picture will be
     * appended to the array.
     * @param includeNonExisting {@code true} if non-existing pictures need to be included
     * @param includeSecondField {@code true} if the second field pictures need to be included
     * @param out an array
     *   of {@link H264Picture} pointers
     */
    public void getPicturesShortTermRef(boolean includeNonExisting, boolean includeSecondField, org.gstreamer.codecs.H264Picture[] out) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_h264_dpb_get_pictures_short_term_ref.invokeExact(
                        handle(),
                        Marshal.booleanToInteger.marshal(includeNonExisting, null).intValue(),
                        Marshal.booleanToInteger.marshal(includeSecondField, null).intValue(),
                        Interop.allocateNativeArray(out, org.gstreamer.codecs.H264Picture.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Find a short term reference picture which has matching picture number
     * @param picNum a picture number
     * @return a {@link H264Picture}
     */
    public @Nullable org.gstreamer.codecs.H264Picture getShortRefByPicNum(int picNum) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h264_dpb_get_short_ref_by_pic_num.invokeExact(
                    handle(),
                    picNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.codecs.H264Picture.fromAddress.marshal(RESULT, null);
    }
    
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_h264_dpb_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public boolean hasEmptyFrameBuffer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_h264_dpb_has_empty_frame_buffer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Mark all pictures are not referenced
     */
    public void markAllNonRef() {
        try {
            DowncallHandles.gst_h264_dpb_mark_all_non_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean needsBump(org.gstreamer.codecs.H264Picture toInsert, org.gstreamer.codecs.H264DpbBumpMode latencyMode) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_h264_dpb_needs_bump.invokeExact(
                    handle(),
                    toInsert.handle(),
                    latencyMode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public int numRefFrames() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_h264_dpb_num_ref_frames.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Perform "8.2.5.4 Adaptive memory control decoded reference picture marking process"
     * @param refPicMarking a {@code GstH264RefPicMarking}
     * @param picture a {@link H264Picture}
     * @return {@code true} if successful
     */
    public boolean performMemoryManagementControlOperation(java.lang.foreign.MemoryAddress refPicMarking, org.gstreamer.codecs.H264Picture picture) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_h264_dpb_perform_memory_management_control_operation.invokeExact(
                    handle(),
                    (Addressable) refPicMarking,
                    picture.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public void setInterlaced(boolean interlaced) {
        try {
            DowncallHandles.gst_h264_dpb_set_interlaced.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(interlaced, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Notify the DPB that {@code picture} is output directly without storing
     * in the DPB.
     * @param picture a {@link H264Picture} of the last output.
     */
    public void setLastOutput(org.gstreamer.codecs.H264Picture picture) {
        try {
            DowncallHandles.gst_h264_dpb_set_last_output.invokeExact(
                    handle(),
                    picture.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the number of maximum allowed frames to store
     * @param maxNumFrames the maximum number of picture
     */
    public void setMaxNumFrames(int maxNumFrames) {
        try {
            DowncallHandles.gst_h264_dpb_set_max_num_frames.invokeExact(
                    handle(),
                    maxNumFrames);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void setMaxNumReorderFrames(int maxNumReorderFrames) {
        try {
            DowncallHandles.gst_h264_dpb_set_max_num_reorder_frames.invokeExact(
                    handle(),
                    maxNumReorderFrames);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create new {@link H264Dpb}
     * @return a new {@link H264Dpb}
     */
    public static org.gstreamer.codecs.H264Dpb new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h264_dpb_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.codecs.H264Dpb.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_h264_dpb_add = Interop.downcallHandle(
                "gst_h264_dpb_add",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_bump = Interop.downcallHandle(
                "gst_h264_dpb_bump",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_clear = Interop.downcallHandle(
                "gst_h264_dpb_clear",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_delete_unused = Interop.downcallHandle(
                "gst_h264_dpb_delete_unused",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_free = Interop.downcallHandle(
                "gst_h264_dpb_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_get_interlaced = Interop.downcallHandle(
                "gst_h264_dpb_get_interlaced",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_get_long_ref_by_long_term_pic_num = Interop.downcallHandle(
                "gst_h264_dpb_get_long_ref_by_long_term_pic_num",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_get_lowest_frame_num_short_ref = Interop.downcallHandle(
                "gst_h264_dpb_get_lowest_frame_num_short_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_get_max_num_frames = Interop.downcallHandle(
                "gst_h264_dpb_get_max_num_frames",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_get_picture = Interop.downcallHandle(
                "gst_h264_dpb_get_picture",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_get_pictures_all = Interop.downcallHandle(
                "gst_h264_dpb_get_pictures_all",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_get_pictures_long_term_ref = Interop.downcallHandle(
                "gst_h264_dpb_get_pictures_long_term_ref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_get_pictures_short_term_ref = Interop.downcallHandle(
                "gst_h264_dpb_get_pictures_short_term_ref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_get_short_ref_by_pic_num = Interop.downcallHandle(
                "gst_h264_dpb_get_short_ref_by_pic_num",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_get_size = Interop.downcallHandle(
                "gst_h264_dpb_get_size",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_has_empty_frame_buffer = Interop.downcallHandle(
                "gst_h264_dpb_has_empty_frame_buffer",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_mark_all_non_ref = Interop.downcallHandle(
                "gst_h264_dpb_mark_all_non_ref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_needs_bump = Interop.downcallHandle(
                "gst_h264_dpb_needs_bump",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_num_ref_frames = Interop.downcallHandle(
                "gst_h264_dpb_num_ref_frames",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_perform_memory_management_control_operation = Interop.downcallHandle(
                "gst_h264_dpb_perform_memory_management_control_operation",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_set_interlaced = Interop.downcallHandle(
                "gst_h264_dpb_set_interlaced",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_set_last_output = Interop.downcallHandle(
                "gst_h264_dpb_set_last_output",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_set_max_num_frames = Interop.downcallHandle(
                "gst_h264_dpb_set_max_num_frames",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_set_max_num_reorder_frames = Interop.downcallHandle(
                "gst_h264_dpb_set_max_num_reorder_frames",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h264_dpb_new = Interop.downcallHandle(
                "gst_h264_dpb_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
}
