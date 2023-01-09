package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class H265Dpb extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstH265Dpb";
    
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
     * Allocate a new {@link H265Dpb}
     * @return A new, uninitialized @{link H265Dpb}
     */
    public static H265Dpb allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        H265Dpb newInstance = new H265Dpb(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a H265Dpb proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected H265Dpb(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, H265Dpb> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new H265Dpb(input);
    
    /**
     * Store the {@code picture} and perform increase pic_latency_cnt as defined in
     * "C.5.2.3 Additional bumping" process
     * @param picture a {@link H265Picture}
     */
    public void add(org.gstreamer.codecs.H265Picture picture) {
        try {
            DowncallHandles.gst_h265_dpb_add.invokeExact(
                    handle(),
                    picture.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        picture.yieldOwnership();
    }
    
    /**
     * Perform bumping process as defined in C.5.2.4 "Bumping" process.
     * If {@code drain} is {@code true}, {@code dpb} will remove a {@link H265Picture} from internal array
     * so that returned {@link H265Picture} could hold the last reference of it
     * @param drain whether draining or not
     * @return a {@link H265Picture} which is needed to be
     * outputted
     */
    public @Nullable org.gstreamer.codecs.H265Picture bump(boolean drain) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h265_dpb_bump.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(drain, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.codecs.H265Picture.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Clear all stored {@link H265Picture}
     */
    public void clear() {
        try {
            DowncallHandles.gst_h265_dpb_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Delete not needed for output and not referenced all pictures from dpb
     */
    public void deleteUnused() {
        try {
            DowncallHandles.gst_h265_dpb_delete_unused.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Free the {@code dpb}
     */
    public void free() {
        try {
            DowncallHandles.gst_h265_dpb_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Find a long term reference picture which has matching poc
     * @param poc a picture order count
     * @return a {@link H265Picture}
     */
    public @Nullable org.gstreamer.codecs.H265Picture getLongRefByPoc(int poc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h265_dpb_get_long_ref_by_poc.invokeExact(
                    handle(),
                    poc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.codecs.H265Picture.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public int getMaxNumPics() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_h265_dpb_get_max_num_pics.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public org.gstreamer.codecs.H265Picture getPicture(int systemFrameNumber) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h265_dpb_get_picture.invokeExact(
                    handle(),
                    systemFrameNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.codecs.H265Picture.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public PointerProxy<org.gstreamer.codecs.H265Picture> getPicturesAll() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_h265_dpb_get_pictures_all.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerProxy<org.gstreamer.codecs.H265Picture>(RESULT, org.gstreamer.codecs.H265Picture.fromAddress);
        }
    }
    
    /**
     * Find a short or long term reference picture which has matching poc
     * @param poc a picture order count
     * @return a {@link H265Picture}
     */
    public @Nullable org.gstreamer.codecs.H265Picture getRefByPoc(int poc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h265_dpb_get_ref_by_poc.invokeExact(
                    handle(),
                    poc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.codecs.H265Picture.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Find a short or long term reference picture which has matching poc_lsb
     * @param pocLsb a picture order count lsb
     * @return a {@link H265Picture}
     */
    public @Nullable org.gstreamer.codecs.H265Picture getRefByPocLsb(int pocLsb) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h265_dpb_get_ref_by_poc_lsb.invokeExact(
                    handle(),
                    pocLsb);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.codecs.H265Picture.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Find a short term reference picture which has matching poc
     * @param poc a picture order count
     * @return a {@link H265Picture}
     */
    public @Nullable org.gstreamer.codecs.H265Picture getShortRefByPoc(int poc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h265_dpb_get_short_ref_by_poc.invokeExact(
                    handle(),
                    poc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.codecs.H265Picture.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_h265_dpb_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Mark all pictures are not referenced
     */
    public void markAllNonRef() {
        try {
            DowncallHandles.gst_h265_dpb_mark_all_non_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean needsBump(int maxNumReorderPics, int maxLatencyIncrease, int maxDecPicBuffering) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_h265_dpb_needs_bump.invokeExact(
                    handle(),
                    maxNumReorderPics,
                    maxLatencyIncrease,
                    maxDecPicBuffering);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public int numRefPictures() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_h265_dpb_num_ref_pictures.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Set the number of maximum allowed pictures to store
     * @param maxNumPics the maximum number of picture
     */
    public void setMaxNumPics(int maxNumPics) {
        try {
            DowncallHandles.gst_h265_dpb_set_max_num_pics.invokeExact(
                    handle(),
                    maxNumPics);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create new {@link H265Dpb}
     * @return a new {@link H265Dpb}
     */
    public static org.gstreamer.codecs.H265Dpb new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h265_dpb_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.codecs.H265Dpb.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_h265_dpb_add = Interop.downcallHandle(
                "gst_h265_dpb_add",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_bump = Interop.downcallHandle(
                "gst_h265_dpb_bump",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_clear = Interop.downcallHandle(
                "gst_h265_dpb_clear",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_delete_unused = Interop.downcallHandle(
                "gst_h265_dpb_delete_unused",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_free = Interop.downcallHandle(
                "gst_h265_dpb_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_get_long_ref_by_poc = Interop.downcallHandle(
                "gst_h265_dpb_get_long_ref_by_poc",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_get_max_num_pics = Interop.downcallHandle(
                "gst_h265_dpb_get_max_num_pics",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_get_picture = Interop.downcallHandle(
                "gst_h265_dpb_get_picture",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_get_pictures_all = Interop.downcallHandle(
                "gst_h265_dpb_get_pictures_all",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_get_ref_by_poc = Interop.downcallHandle(
                "gst_h265_dpb_get_ref_by_poc",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_get_ref_by_poc_lsb = Interop.downcallHandle(
                "gst_h265_dpb_get_ref_by_poc_lsb",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_get_short_ref_by_poc = Interop.downcallHandle(
                "gst_h265_dpb_get_short_ref_by_poc",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_get_size = Interop.downcallHandle(
                "gst_h265_dpb_get_size",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_mark_all_non_ref = Interop.downcallHandle(
                "gst_h265_dpb_mark_all_non_ref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_needs_bump = Interop.downcallHandle(
                "gst_h265_dpb_needs_bump",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_num_ref_pictures = Interop.downcallHandle(
                "gst_h265_dpb_num_ref_pictures",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_set_max_num_pics = Interop.downcallHandle(
                "gst_h265_dpb_set_max_num_pics",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_h265_dpb_new = Interop.downcallHandle(
                "gst_h265_dpb_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
}
